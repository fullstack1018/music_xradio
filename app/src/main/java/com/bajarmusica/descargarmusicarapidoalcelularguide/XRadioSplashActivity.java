/*
 * Copyright (c) 2017. YPY Global - All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at.
 *
 *         http://ypyglobal.com/sourcecode/policy
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.bajarmusica.descargarmusicarapidoalcelularguide;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.bajarmusica.descargarmusicarapidoalcelularguide.constants.IXRadioConstants;
import com.bajarmusica.descargarmusicarapidoalcelularguide.dataMng.TotalDataManager;
import com.bajarmusica.descargarmusicarapidoalcelularguide.databinding.ActivitySplashBinding;
import com.bajarmusica.descargarmusicarapidoalcelularguide.gdpr.GDPRManager;
import com.bajarmusica.descargarmusicarapidoalcelularguide.model.ConfigureModel;
import com.bajarmusica.descargarmusicarapidoalcelularguide.model.RadioModel;
import com.bajarmusica.descargarmusicarapidoalcelularguide.setting.XRadioSettingManager;
import com.bajarmusica.descargarmusicarapidoalcelularguide.ypylibs.activity.YPYSplashActivity;
import com.bajarmusica.descargarmusicarapidoalcelularguide.ypylibs.ads.AdMobAdvertisement;
import com.bajarmusica.descargarmusicarapidoalcelularguide.ypylibs.ads.FBAdvertisement;
import com.bajarmusica.descargarmusicarapidoalcelularguide.ypylibs.ads.YPYAdvertisement;
import com.bajarmusica.descargarmusicarapidoalcelularguide.ypylibs.executor.YPYExecutorSupplier;
import com.bajarmusica.descargarmusicarapidoalcelularguide.ypylibs.task.IYPYCallback;
import com.bajarmusica.descargarmusicarapidoalcelularguide.ypylibs.utils.ApplicationUtils;
import com.bajarmusica.descargarmusicarapidoalcelularguide.ypylibs.utils.IOUtils;
import com.bajarmusica.descargarmusicarapidoalcelularguide.ypylibs.utils.YPYLog;

import java.io.File;


/**
 * @author:YPY Global
 * @Email: bl911vn@gmail.com
 * @Website: www.bajarmusica.com
 * @Date:Oct 20, 2017
 */

@SuppressLint("CustomSplashScreen")
public class XRadioSplashActivity extends YPYSplashActivity<ActivitySplashBinding> implements IXRadioConstants {

    private TotalDataManager mTotalMng;
    private boolean isAllowShowAdsWhenAskingTerm = true;
    private final Handler mHandler = new Handler();

    @Override
    protected ActivitySplashBinding getViewBinding() {
        return ActivitySplashBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpOverlayBackground(true);
        YPYLog.setDebug(DEBUG);
        mTotalMng = TotalDataManager.getInstance(getApplicationContext());
        setUpBackground(this.viewBinding.layoutBg);
    }

    @Override
    public void onInitData() {
        this.viewBinding.progressBar.setVisibility(View.VISIBLE);
        this.viewBinding.progressBar.show();
        //Delay 1500 milliseconds before doing any task to ensure privacy of admob
//        showDialogTerm(() -> mHandler.postDelayed(this::startLoad, 1500));
        mHandler.postDelayed(this::startLoad, 1500);

    }

    private void startLoad() {
        YPYExecutorSupplier.getInstance().forBackgroundTasks().execute(() -> {
            mTotalMng.readConfigure(this);
            runOnUiThread(() -> {
                setUpBackground(this.viewBinding.layoutBg);
                onStartCreateAds();
            });
            if (!SAVE_FAVORITE_SDCARD ) {
                mTotalMng.readAllCache();
            }
            runOnUiThread(this::checkGDPR);
        });
    }

    @Override
    public File getDirectoryCached() {
        return mTotalMng.getDirectoryCached(getApplicationContext());
    }

    @Override
    public String[] getListPermissionNeedGrant() {
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            return LIST_PERMISSIONS_13;
        }
        if (SAVE_FAVORITE_SDCARD && !IOUtils.hasAndroid10()) {
            return LIST_PERMISSIONS;
        }
        return null;
    }


    @Override
    public YPYAdvertisement createAds() {
        ConfigureModel model = mTotalMng.getConfigureModel();
        if (model != null) {
            String bannerId = getString(R.string.banner_id);
            String interstitialId = getString(R.string.interstitial_id);
            String appId = getString(R.string.admob_app_id);
            String adType = getString(R.string.ad_type);

            if (adType.equalsIgnoreCase(AdMobAdvertisement.ADMOB_ADS)) {
                AdMobAdvertisement mAdmob = new AdMobAdvertisement(this, bannerId, interstitialId, ADMOB_TEST_DEVICE);
                mAdmob.initAds();
                if (!TextUtils.isEmpty(appId) && (!TextUtils.isEmpty(bannerId) || !TextUtils.isEmpty(interstitialId))) {
                    GDPRManager.getInstance().init(appId, ADMOB_TEST_DEVICE);
                }
                return mAdmob;
            }
            else if (adType.equalsIgnoreCase(FBAdvertisement.FB_ADS)) {
                return new FBAdvertisement(this, bannerId, interstitialId, FACEBOOK_TEST_DEVICE);
            }
        }
        return null;

    }

    public void showDialogTerm(IYPYCallback mCallback) {
        if (!XRadioSettingManager.getAgreeTerm(this) && !TextUtils.isEmpty(URL_TERM_OF_USE) && !TextUtils.isEmpty(URL_PRIVACY_POLICY)) {
            try {
                View mView = LayoutInflater.from(this).inflate(R.layout.dialog_term_of_condition, null);
                TextView mTv = mView.findViewById(R.id.tv_term_info);

                String format = getString(R.string.format_term_and_conditional);
                String msg = String.format(format, getString(R.string.app_name), URL_TERM_OF_USE, URL_PRIVACY_POLICY);

                boolean isAndroidN = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N;
                Spanned result = isAndroidN ? Html.fromHtml(msg, Html.FROM_HTML_MODE_LEGACY) : Html.fromHtml(msg);
                mTv.setText(result);
                mTv.setMovementMethod(LinkMovementMethod.getInstance());
                MaterialDialog.Builder mBuilder = createBasicDialogBuilder(R.string.title_term_of_use, R.string.title_agree, R.string.title_no);
                mBuilder.canceledOnTouchOutside(false);
                mBuilder.titleGravity(GravityEnum.CENTER);
                mBuilder.customView(mView, true);
                boolean b = ApplicationUtils.isSupportRTL();
                if (b) {
                    mTv.setGravity(Gravity.END);
                }
                mBuilder.onPositive((dialog, which) -> {
                    XRadioSettingManager.setAgreeTerm(XRadioSplashActivity.this, true);
                    isAllowShowAdsWhenAskingTerm = false;
                    if (mCallback != null) {
                        mCallback.onAction();
                    }
                });
                mBuilder.onNegative((dialog, which) -> {
                    onDestroyData();
                    finish();
                });
                mBuilder.keyListener((dialogInterface, i, keyEvent) -> i == KeyEvent.KEYCODE_BACK);
                mBuilder.show();

            }
            catch (Exception e) {
                e.printStackTrace();
                XRadioSettingManager.setAgreeTerm(XRadioSplashActivity.this, true);
            }
            return;
        }
        if (mCallback != null) {
            mCallback.onAction();
        }
    }

    @Override
    public void onDestroyData() {
        super.onDestroyData();
        GDPRManager.getInstance().onDestroy();
    }

    @Override
    protected void onDestroy() {
        mHandler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    private void checkGDPR() {
        if (!SAVE_FAVORITE_SDCARD || isGrantAllPermission(getListPermissionNeedGrant())) {
            GDPRManager.getInstance().startCheck(this, mHandler, () -> goToMainActivity(isAllowShowAdsWhenAskingTerm));
        }
        else {
            goToMainActivity(isAllowShowAdsWhenAskingTerm);
        }
    }

    public void goToMainActivity(boolean isShowAds) {
        boolean isSingleRadio = mTotalMng.isSingleRadio();
        RadioModel mSingleRadio = mTotalMng.getSingRadioModel();
        if (isSingleRadio && mSingleRadio == null) {
            boolean isOnline = ApplicationUtils.isOnline(this);
            showToast(isOnline ? R.string.info_single_radio_error : R.string.info_connect_to_play);
            return;
        }
//        boolean isGrantPermission = isGrantAllPermission(getListPermissionNeedGrant());
        boolean isFinalCheckShowAds = SHOW_SPLASH_INTERSTITIAL_ADS && SHOW_ADS && isShowAds;
        if (!isSingleRadio) {
            isFinalCheckShowAds = isFinalCheckShowAds;
        }
        showInterstitialAd(isFinalCheckShowAds, () -> {
            try {
                this.viewBinding.progressBar.hide();
                this.viewBinding.progressBar.setVisibility(View.INVISIBLE);
                Intent mIntent = new Intent(this, MainView.class);
                startActivity(mIntent);
                finish();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        });

    }

    public boolean isGrantAllPermission(String[] permissions) {
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            return ApplicationUtils.isGrantAllPermission(this, permissions);
        }
        if (SAVE_FAVORITE_SDCARD && !IOUtils.hasAndroid10()) {
            return ApplicationUtils.isGrantAllPermission(this, permissions);
        }
        return true;
    }

//    showInterstitialAd(isFinalCheckShowAds, () -> {
//        try {
//            this.viewBinding.progressBar.hide();
//            this.viewBinding.progressBar.setVisibility(View.INVISIBLE);
//            Intent mIntent = null;
//            if (!isSingleRadio) {
//                mIntent = new Intent(this, isGrantPermission ? XMultiRadioMainActivity.class : XRadioGrantActivity.class);
//            }
//            else {
//                boolean isAndroid13 = android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU;
//                boolean isNotiGranted = true;
//                if (isAndroid13) {
//                    isNotiGranted = ApplicationUtils.isGrantAllPermission(this, getListPermissionNeedGrant());
//                }
//                mIntent = new Intent(this, isNotiGranted ? XSingleRadioMainActivity.class : XRadioGrantActivity.class);
//            }
//            startActivity(mIntent);
//            finish();
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    });
}

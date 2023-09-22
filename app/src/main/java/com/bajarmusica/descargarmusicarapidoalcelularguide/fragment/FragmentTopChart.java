/*
 * Copyright (c) 2018. YPY Global - All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at.
 *
 *         http://ypyglobal.com/sourcecode/policy
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bajarmusica.descargarmusicarapidoalcelularguide.fragment;

import android.util.Log;

import com.google.gson.reflect.TypeToken;
import com.bajarmusica.descargarmusicarapidoalcelularguide.adapter.RadioAdapter;
import com.bajarmusica.descargarmusicarapidoalcelularguide.dataMng.XRadioNetUtils;
import com.bajarmusica.descargarmusicarapidoalcelularguide.model.RadioModel;
import com.bajarmusica.descargarmusicarapidoalcelularguide.ypylibs.adapter.YPYRecyclerViewAdapter;
import com.bajarmusica.descargarmusicarapidoalcelularguide.ypylibs.model.ResultModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author:YPY Global
 * @Email: bl911vn@gmail.com
 * @Website: http://bajarmusica.com
 * Created by YPY Global on 4/20/18.
 */
public class FragmentTopChart extends XRadioListFragment<RadioModel> {

    private int mTypeUI;

    @Override
    public YPYRecyclerViewAdapter<RadioModel> createAdapter(ArrayList<RadioModel> listObjects) {
        RadioAdapter mRadioAdapter = new RadioAdapter(mContext, listObjects, mUrlHost, mSizeH, mTypeUI);

        Log.e("xxxxxxxx", String.valueOf(listObjects));

        mRadioAdapter.setListener(mObject -> mContext.startPlayingList(mObject, listObjects));
//        mRadioAdapter.setOnRadioListener((model, isFavorite) -> mContext.updateFavorite(model, TYPE_TAB_FAVORITE, isFavorite));
        return mRadioAdapter;
    }

    @Override
    public ResultModel<RadioModel> getListModelFromServer(int offset, int limit) {
        boolean isOnline = mConfigureMode != null && mConfigureMode.isOnlineApp();
        ResultModel<RadioModel> mResultModel;
        if (isOnline) {
            mResultModel = XRadioNetUtils.getListTopChartRadio(mUrlHost, mApiKey, offset, limit);
        }
        else {
            Type mTypeToken = new TypeToken<ResultModel<RadioModel>>() {}.getType();
            mResultModel = XRadioNetUtils.getListDataFromAssets(mContext, FILE_RADIOS, mTypeToken);
            if (mResultModel != null && mResultModel.isResultOk() && offset == 0) {
                ArrayList<RadioModel> mListModels = mResultModel.getListModels();
                if (mListModels != null && mListModels.size() > 0) {
                    Iterator<RadioModel> mIterator = mListModels.iterator();
                    while (mIterator.hasNext()) {
                        RadioModel model = mIterator.next();
                        if (model.getFeatured() != 1) {
                            mIterator.remove();
                        }
                    }
                }
            }
        }
        if (mResultModel != null && mResultModel.isResultOk()) {
            mContext.mTotalMng.updateFavoriteForList(mResultModel.getListModels(), TYPE_TAB_FAVORITE);
        }
        return mResultModel;
    }

    @Override
    public void setUpUI() {
        mTypeUI = mUIConfigureModel != null ? mUIConfigureModel.getUiTopChart() : UI_FLAT_LIST;
        setUpUIRecyclerView(mTypeUI);
    }
}

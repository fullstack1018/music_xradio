package com.bajarmusica.descargarmusicarapidoalcelularguide;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bajarmusica.descargarmusicarapidoalcelularguide.dataMng.TotalDataManager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.tabs.TabLayout;

public class MainView extends AppCompatActivity {

    private TotalDataManager mTotalMng;
    private Button descarge, tutorial, music, generos;
    public static TabLayout tabLayout;
    public static Toolbar toolbar;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_view);
        tabLayout=(TabLayout)findViewById(R.id.tabLayout1);
        tabLayout.addTab(tabLayout.newTab().setText("INICIO"));
        tabLayout.addTab(tabLayout.newTab().setText("MUSICA"));
        tabLayout.addTab(tabLayout.newTab().setText("GENEROS"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        String str1 = "Con las mejores melodías musicales en tu celular la vida te será más fácil llevar, la música nos alegra la vida hasta en los momentos más comprometedores, desde esta guía veras lo fácil que es poder bajar esas canciones que te encantan y colocarla en tu móvil.\n" +
                "No necesitas tener conocimientos sofisticados para descargar esas buenas canciones, solo con aprender el manejo de los programas que tienes acá, verás que lo demás es automático en el proceso de la descarga, así que a través de ellos te harás todo un experto para que tengas las mejores melodías musicales acompañándote a donde vayas.\n" +
                "Por ello en esta guía tienes la oportunidad de tener las mejores plataformas para bajar música a tu móvil, entre las que están";
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        Intent mIntent = new Intent(getApplicationContext(), DataShowPage.class);
                        mIntent.putExtra("str",str1);
                        mIntent.putExtra("name","INICIO");
                        if (mInterstitialAd != null) {
                            mInterstitialAd.show(MainView.this);
                            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                @Override
                                public void onAdDismissedFullScreenContent() {
                                    startActivity(mIntent);
                                    fullscreenAdmob();
                                }

                                @Override
                                public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                                    super.onAdFailedToShowFullScreenContent(adError);
                                    startActivity(mIntent);

                                }

                                @Override
                                public void onAdShowedFullScreenContent() {
                                    mInterstitialAd = null;
                                    Log.d("TAG", "The ad was shown.");
                                }
                            });
                        } else {
                            startActivity(mIntent);
                        }
                        break;
                    case 1:
                        Intent mIntent1 = new Intent(getApplicationContext(), XMultiRadioMainActivity.class);
                        if (mInterstitialAd != null) {
                            mInterstitialAd.show(MainView.this);
                            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                @Override
                                public void onAdDismissedFullScreenContent() {
                                    startActivity(mIntent1);
                                    fullscreenAdmob();
                                }

                                @Override
                                public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                                    super.onAdFailedToShowFullScreenContent(adError);
                                    startActivity(mIntent1);

                                }

                                @Override
                                public void onAdShowedFullScreenContent() {
                                    mInterstitialAd = null;
                                    Log.d("TAG", "The ad was shown.");
                                }
                            });
                        } else {
                            startActivity(mIntent1);
                        }
                        break;
                    case 2:
                        Intent mIntent2 = new Intent(getApplicationContext(), XMultiRadioMainActivity.class);
                        if (mInterstitialAd != null) {
                            mInterstitialAd.show(MainView.this);
                            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                @Override
                                public void onAdDismissedFullScreenContent() {
                                    startActivity(mIntent2);
                                    fullscreenAdmob();
                                }

                                @Override
                                public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                                    super.onAdFailedToShowFullScreenContent(adError);
                                    startActivity(mIntent2);

                                }

                                @Override
                                public void onAdShowedFullScreenContent() {
                                    mInterstitialAd = null;
                                    Log.d("TAG", "The ad was shown.");
                                }
                            });
                        } else {
                            startActivity(mIntent2);
                        }
                        break;
                    default:
                        return;
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        MobileAds.initialize(
                this,
                new OnInitializationCompleteListener() {
                    @Override
                    public void onInitializationComplete(InitializationStatus status) {}
                });

        mTotalMng = TotalDataManager.getInstance(getApplicationContext());

        descarge = findViewById(R.id.descargea);
        tutorial = findViewById(R.id.tutorial);
        music = findViewById(R.id.music);
//        generos = findViewById(R.id.generos);

        descarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), SubMainView.class);
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainView.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            startActivity(mIntent);
                            fullscreenAdmob();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                            super.onAdFailedToShowFullScreenContent(adError);
                            startActivity(mIntent);

                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            mInterstitialAd = null;
                            Log.d("TAG", "The ad was shown.");
                        }
                    });
                } else {
                    startActivity(mIntent);
                }
            }
        });
        tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), SubMainView1.class);
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainView.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            startActivity(mIntent);
                            fullscreenAdmob();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                            super.onAdFailedToShowFullScreenContent(adError);
                            startActivity(mIntent);

                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            mInterstitialAd = null;
                            Log.d("TAG", "The ad was shown.");
                        }
                    });
                } else {
                    startActivity(mIntent);
                }
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), XMultiRadioMainActivity.class);
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(MainView.this);
                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            startActivity(mIntent);
                            fullscreenAdmob();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                            super.onAdFailedToShowFullScreenContent(adError);
                            startActivity(mIntent);

                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            mInterstitialAd = null;
                            Log.d("TAG", "The ad was shown.");
                        }
                    });
                } else {
                    startActivity(mIntent);
                }
            }
        });
        fullscreenAdmob();
//        generos.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent mIntent = new Intent(getApplicationContext(), XMultiRadioMainActivity.class);
//                startActivity(mIntent);
//                finish();
//            }
//        });
    }

    private void fullscreenAdmob() {

        AdRequest adRequest = new AdRequest.Builder().build();
        com.google.android.gms.ads.interstitial.InterstitialAd.load(MainView.this, "ca-app-pub-3940256099942544/1033173712", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
                super.onAdLoaded(interstitialAd);
                mInterstitialAd = interstitialAd;
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                mInterstitialAd = null;
            }
        });
    }
}
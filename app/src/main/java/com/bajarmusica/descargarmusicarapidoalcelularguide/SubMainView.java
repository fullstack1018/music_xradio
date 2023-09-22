package com.bajarmusica.descargarmusicarapidoalcelularguide;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.appbar.MaterialToolbar;

public class SubMainView extends AppCompatActivity {
    Button inicio, filmmusic, freedownload, premium, jamendo;
    String str1, str2, str3, str4, str5;

    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_main_view);

        str1 = "Con las mejores melodías musicales en tu celular la vida te será más fácil llevar, la música nos alegra la vida hasta en los momentos más comprometedores, desde esta guía veras lo fácil que es poder bajar esas canciones que te encantan y colocarla en tu móvil.\n" +
                "No necesitas tener conocimientos sofisticados para descargar esas buenas canciones, solo con aprender el manejo de los programas que tienes acá, verás que lo demás es automático en el proceso de la descarga, así que a través de ellos te harás todo un experto para que tengas las mejores melodías musicales acompañándote a donde vayas.\n" +
                "Por ello en esta guía tienes la oportunidad de tener las mejores plataformas para bajar música a tu móvil, entre las que están";
        str2 = "Es una de las plataformas que contiene diversidad de géneros musicales y canciones que puedes usar de manera totalmente gratis, la única condición es que acredites la misma al autor de ella. Puedes proceder a descargarla sin problema alguno. \n" +
                "\n" +
                "Es uno de los portales de música más completo teniendo una modalidad pagada en donde no necesitas darle el crédito al autor.";
        str3 = "Es un programa apto para la personas que no puedes descargar música de las plataformas que son pagadas por lo costoso de ellas. \n" +
                "\n" +
                "Este programa toma la música de los servidores que se unen a ellas y la proporciona de manera totalmente gratis para que los amantes de la música la descarguen de forma totalmente gratis. Solo con tener el nombre de la canción o el autor de ella rápidamente la descarga.\n";
        str4 = "Este programa cuenta con una diversidad de canciones que amplia cada día la biblioteca donde se depositan esa música de uso libre. \n" +
                "\n" +
                "Si necesitas algún audio en específico que acompañe la producción que estas realizando desde acá lo puedes descargar sin problema alguno. \n" +
                "\n" +
                "Procede a suscribirte a esta plataforma y escoge el plan que más te convenga.";
        str5 = "Más que considerarse una aplicación se puede decir que es una agrupación de artistas que hacen toda una comunidad donde quieren dar a conocer su música pues la gran mayoría son artistas que están comenzando el mundo de la música. \n" +
                "\n" +
                "El banco de canciones presente en este programa es enorme desde donde puedes hacerle publicidad a las nuevas generaciones de cantantes de diversos géneros musicales que se reúnen acá.\n" +
                "Porque todo comienzo tiene sus contratiempos esto no te limita a que aprendas como descargar desde estos programas esas melodías musicales nuevas o viejas que encuentren en ellos.\n" +
                "Lo más seguro es que con esta guía veras lo fácil que es llevar la música de tu gusto en tu móvil y que te acompañe a donde vayas para que alegres ese camino que transitas. Tu puedes solo inténtalo!!!!\n";

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        MobileAds.initialize(
                this,
                new OnInitializationCompleteListener() {
                    @Override
                    public void onInitializationComplete(InitializationStatus status) {}
                });

        inicio = findViewById(R.id.inicio);
        filmmusic = findViewById(R.id.filmmusic);
        freedownload = findViewById(R.id.freedown);
        premium = findViewById(R.id.premium);
        jamendo = findViewById(R.id.jamendo);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), DataShowPage.class);
                mIntent.putExtra("str",str1);
                mIntent.putExtra("name","INICIO");
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(SubMainView.this);
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
        filmmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), DataShowPage.class);
                mIntent.putExtra("str",str2);
                mIntent.putExtra("name","Filmmusic.io");
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(SubMainView.this);
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
        freedownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), DataShowPage.class);
                mIntent.putExtra("str",str3);
                mIntent.putExtra("name","Free music Download");
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(SubMainView.this);
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
        premium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), DataShowPage.class);
                mIntent.putExtra("str",str4);
                mIntent.putExtra("name","Premium Best");
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(SubMainView.this);
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
        jamendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), DataShowPage.class);
                mIntent.putExtra("str",str5);
                mIntent.putExtra("name","Jamendo");
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(SubMainView.this);
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
    }
    private void fullscreenAdmob() {

        AdRequest adRequest = new AdRequest.Builder().build();
        com.google.android.gms.ads.interstitial.InterstitialAd.load(SubMainView.this, "ca-app-pub-3940256099942544/1033173712", adRequest, new InterstitialAdLoadCallback() {
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
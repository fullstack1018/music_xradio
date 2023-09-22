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

public class SubMainView1 extends AppCompatActivity {
    private Button guide1, guide2, final_guide, tutorial1;
    private String str1, str2, str3, str4;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_main_view1);

        str1 = "A partir de este momento no hay excusas para no tener las melodías musicales que te gustan en tu celular, desde este manual verás que es fácil el proceso de poder bajar esas canciones a tu móvil rápido y fácil.\n" +
                "Ya no tienes por qué andar pidiéndole prestado a tus amigos el celular para escuchar esa canción que tanto te gusta, a partir de este momento aprenderás la manera más fácil de proceder a llevarla a tu celular y colocar esas canciones cuando quieras y donde quieras desde tu android.\n" +
                "Aquí tienes los mejores programas para que procedas con la descarga de esa música que tanto te apasiona, solo procede a entrar en ellos y de una vez descarga esas melodías; entre estas plataformas tienes:\n";
        str2 = "\uF0A7\tBensound: es una de las mejores plataformas donde encontrarás un gran abanico de canciones de una gran gama de géneros musicales desde donde puedes descargarlos de manera gratuita siempre y cuando le des el crédito que le corresponde al autor de esa canción. Puedes usarlas en tus proyectos personales y comerciales por lo que tiene grandes beneficios.\n" +
                "\uF0A7\tSoundCloud: es una plataforma muy conocida pues tendrás la oportunidad de bajar canciones de famosos y de artistas que están emergiendo en el mundo de la música para dar a conocer su producción musical. Y lo más novedoso de esta plataforma es que puedes interactuar con esos nuevos artistas musicales para darle tu opinión con respecto a su trabajo. Excelente para que apoyes a los nuevos cantantes y productores musicales. Anímate a conocerla y has uso de ella. Apoya al talento nacional.\n";
        str3 = "\uF0A7\tEpidemic Sound: es una de las plataformas musicales que te brinda mayor seguridad en proporcionarte esas canciones libres de derecho que con toda confianza puedes descargar sin tener a posterior algún percance con ello. En la actualidad la búsqueda de canciones o sonidos especiales que están utilizando muchas personas para su creación comercial lo tienes acá pues su biblioteca además de ser amplia es selectiva lo que lleva al usuario hacer uso de una suscripción que vale la pena invertir por la alta calidad del material musical que posee.\n" +
                "\uF0A7\tChill Out Records: si lo que andas buscando son melodías musicales que te lleven a estar en un estado mental tranquilo, desde esta plataforma tienes una gran variedad de música con diversidad de estilos desde sonidos de agua, hasta los de diversidad de frecuencias sonoras que te permitirán no solo calmar tu mente, también para la práctica de la meditación, el yoga entre otros. Este estilo de melodías musicales está siendo muy usado en la actualidad.\n";
        str4 = "Aprovecha todos los grandes beneficios que a través de este manual, donde tienes conocimientos de varias plataformas, que van en consonancia con tus gustos te permitirán tener en tu móvil esas buenas melodías musicales que necesitas para cada ocasión en particular.\n" +
                "Atrévete a colocar en práctica lo que en esta guía se te proporciona y verás que puedes tener varias carpetas musicales en tu móvil con diversidad de canciones.\n";
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
        tutorial1 = findViewById(R.id.tutorial);
        guide1 = findViewById(R.id.guide1);
        guide2 = findViewById(R.id.guide2);
        final_guide = findViewById(R.id.final_guide);
        tutorial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), DataShowPage.class);
                mIntent.putExtra("str",str1);
                mIntent.putExtra("name","Tutorial");
                startActivity(mIntent);
            }
        });
        guide1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), DataShowPage.class);
                mIntent.putExtra("str",str2);
                mIntent.putExtra("name","Guide1");
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(SubMainView1.this);
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
        guide2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), DataShowPage.class);
                mIntent.putExtra("str",str3);
                mIntent.putExtra("name","Guide2");
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(SubMainView1.this);
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
        final_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), DataShowPage.class);
                mIntent.putExtra("str",str4);
                mIntent.putExtra("name","Final");
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(SubMainView1.this);
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
        com.google.android.gms.ads.interstitial.InterstitialAd.load(SubMainView1.this, "ca-app-pub-3940256099942544/1033173712", adRequest, new InterstitialAdLoadCallback() {
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
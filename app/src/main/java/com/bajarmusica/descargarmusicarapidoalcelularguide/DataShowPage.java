package com.bajarmusica.descargarmusicarapidoalcelularguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;

public class DataShowPage extends AppCompatActivity {

    private String str, name;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_show_page);

        Intent iin = getIntent();
        Bundle b = iin.getExtras();

        if (b != null) {
            str = (String) b.get("str");
            name = (String) b.get("name");
        }
        textView = findViewById(R.id.textView);
        textView.setText(str);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setTitle(name);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
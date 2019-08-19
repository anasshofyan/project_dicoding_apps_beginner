package com.google.hasan;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
    TextView titlePage, subTitle, userTitle, emailTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //font element
        titlePage = findViewById(R.id.titlePage);
        subTitle = findViewById(R.id.subTitle);
        userTitle = findViewById(R.id.userTitle);
        emailTitle = findViewById(R.id.emailTitle);

        //import font
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface MRegular = Typeface.createFromAsset(getAssets(), "fonts/MRegular.ttf");

        //set font
        titlePage.setTypeface(MRegular);
        subTitle.setTypeface(MLight);
        userTitle.setTypeface(MMedium);
        emailTitle.setTypeface(MLight);

    }

    public void btn_cancel(View view) {
        startActivity(new Intent(AboutActivity.this, MainActivity.class));
    }
}

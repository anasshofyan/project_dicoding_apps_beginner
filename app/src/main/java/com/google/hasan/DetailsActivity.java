package com.google.hasan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Toolbar toolbar = findViewById(R.id.toolbar_details);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView showGambar = (ImageView)findViewById(R.id.gambar);
        TextView showName = (TextView)findViewById(R.id.nama);
        TextView showDiskripsi = (TextView)findViewById(R.id.diskripsi);

        showGambar.setImageResource(getIntent().getIntExtra("gambar",0));
        showName.setText("" + getIntent().getStringExtra("data"));
        showDiskripsi.setText("" + getIntent().getStringExtra("diskripsi"));
    }
}

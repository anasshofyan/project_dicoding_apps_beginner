package com.google.hasan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    int[] isi_gambar = {R.drawable.robot0,R.drawable.robot1,R.drawable.robot2,R.drawable.robot3,R.drawable.robot4,R.drawable.robot5,R.drawable.robot6,R.drawable.robot7,R.drawable.robot8,R.drawable.robot9,R.drawable.robot4,R.drawable.robot6,R.drawable.robot2,R.drawable.robot1,R.drawable.robot3,R.drawable.robot9,R.drawable.robot7,R.drawable.robot7,R.drawable.robot4,R.drawable.robot5};

    String [] isi_nama = {"Line Tracer Mikro V.1","Line Tracer Mikro V.2","Line Tracer Mikro V.3","Line Tracer Mikro V.4","Line Tracer Mikro V.5","Line Tracer Mikro V.6","Line Tracer Mikro V.7","Line Tracer Mikro V.8","Line Tracer Mikro V.9","Line Tracer Mikro V.10","Line Tracer Mikro V.11","Line Tracer Mikro V.12","Line Tracer Mikro V.13","Line Tracer Mikro V.4","Line Tracer Mikro V.15","Line Tracer Mikro V.16","Line Tracer Mikro V.17","Line Tracer Mikro V.8","Line Tracer Mikro V.9","Line Tracer Mikro V.20"};

    String [] isi_Diskripsi = {"Robot adalah seperangkat alat mekanik yang bisa melakukan tugas fisik, baik dengan pengawasan dan kontrol manusia, ataupun menggunakan program yang telah didefinisikan terlebih dulu (kecerdasan buatan).","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar_main);

        setSupportActionBar(toolbar);

        listView = (ListView)findViewById(R.id.list_view);

        list_adaptor adapter = new list_adaptor(MainActivity.this, isi_gambar, isi_nama, isi_Diskripsi);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                Bundle b = new Bundle();
                intent.putExtra("key", i); //Your id
                intent.putExtra("gambar",isi_gambar[i]);
                intent.putExtra("data",isi_nama[i]);
                intent.putExtra("diskripsi",isi_Diskripsi[i]);
                startActivity(intent);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Membaca file menu dan menambahkan isinya ke action bar jika ada.
        getMenuInflater().inflate(R.menu.menu_icon, menu);
        return true;
    }

    public void pindahAbout (MenuItem about){
        startActivity(new Intent(MainActivity.this,AboutActivity.class));
    }

}
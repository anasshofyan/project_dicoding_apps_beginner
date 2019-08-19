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

    int[] isi_gambar = {R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user,R.drawable.ic_user};

    String [] isi_nama = {"Almas","Anas","Fanus","Sofyan","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas"};

    String [] isi_Diskripsi = {"Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas","Almas"};

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

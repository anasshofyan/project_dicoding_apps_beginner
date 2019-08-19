package com.google.hasan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class list_adaptor extends BaseAdapter {

    private final int[] isi_gambar;
    private final String[] isi_nama;
    private final String[] isi_diskripsi;
    private Context context;

    public list_adaptor(Context context, int[] isi_gambar, String[] isi_nama, String[] isi_diskripsi) {
        this.context=context;
        this.isi_gambar=isi_gambar;
        this.isi_nama=isi_nama;
        this.isi_diskripsi=isi_diskripsi;
    }

    @Override
    public int getCount() {
        return isi_nama.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_list_adaptor,null,true);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.listView_image);
        TextView namaView = (TextView) rowView.findViewById(R.id.listView_nama);
        TextView diskripsi = (TextView) rowView.findViewById(R.id.listView_diskripsi);
        imageView.setImageResource(isi_gambar[i]);
        namaView.setText(isi_nama[i]);
        diskripsi.setText(isi_diskripsi[i]);
        Log.d("settingup"," ");
        return rowView;
    }
}

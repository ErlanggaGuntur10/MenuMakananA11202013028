package com.example.menumakananbiasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail_makanan extends AppCompatActivity {

    TextView terimaMakanan, terimaDesc, terimaHarga;
    ImageView terimaIDGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        terimaMakanan= findViewById(R.id.makananDetail);
        terimaDesc=findViewById(R.id.deskripsiDetail);
        terimaHarga=findViewById(R.id.hargaDetail);
        terimaIDGambar= findViewById(R.id.imgDetail);

        String makanan="",shortdesc="",harga="";
        int img=0 ;

        Bundle extra=getIntent().getExtras();
        if (extra!=null){
            makanan=extra.getString("namaMasakan");
            shortdesc=extra.getString("deskripsi");
            harga= extra.getString("harga");
            img=getIntent().getIntExtra("gambar_id",0);


        }

        terimaMakanan.setText(makanan);
        terimaDesc.setText(shortdesc);
        terimaHarga.setText(harga);
        terimaIDGambar.setImageResource(img);
    }
}
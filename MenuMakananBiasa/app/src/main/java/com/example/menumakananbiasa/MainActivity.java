package com.example.menumakananbiasa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recViewKuliner;

    private ArrayList<Makanan> listMakanan;

    private MakananAdapter.RVMakananListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recViewKuliner = findViewById(R.id.RecyclerViewMakanan);

        isiData();

        setOnClickListener();

        recViewKuliner.setAdapter(new MakananAdapter(listMakanan, listener));

        recViewKuliner.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setOnClickListener() {
        listener = new MakananAdapter.RVMakananListener() {
            @Override
            public void onClick(View views, int position) {

                Intent intent = new Intent(getApplicationContext(), detail_makanan.class);
                intent.putExtra("namaMasakan", listMakanan.get(position).getNamaMakanan());
                intent.putExtra("deskripsi", listMakanan.get(position).getDescMakanan());
                intent.putExtra("harga", listMakanan.get(position).getHargaMakanan());
                intent.putExtra("gambar_id", listMakanan.get(position).getIdGambar());
                startActivity(intent);
            }
        };
    }

    private void isiData() {
        this.listMakanan = new ArrayList<>();
        //
        listMakanan.add(new Makanan(
                "Nasi Geprek Keju",
                "Nasi geprek keju merupakan salah satu menu yang paling banyak di beli.",
                "Rp. 25.000",
                R.drawable.nasigeprekkeju
        ));

        listMakanan.add(new Makanan(
                "Nasi Goreng Mercon",
                "Nasi goreng yang memiliki rasa pedas yang tinggi. ",
                "Rp. 35.000",
                R.drawable.nasigorengmercon
        ));

        listMakanan.add(new Makanan(
                "Pecel Lele",
                "Pecel lele atau pecek lele di Indonesia adalah nama sebuah makanan khas Jawa yang terdiri dari ikan lele dan sambal tomat.",
                "Rp. 30.000",
                R.drawable.pecellele
        ));

        listMakanan.add(new Makanan(
                "Salad Buah",
                "Salad buah ini terbuat dari buah-buahan yang segar dan biasanya di gunakan untuk seseorang yang ingin diet.",
                "Rp. 10.000",
                R.drawable.saladbuah
        ));

        listMakanan.add(new Makanan(
                "Es Teler",
                "Es teler merupakan minuman es berisi potongan buah alpukat, kelapa muda, nangka matang, dan santan kelapa encer dengan pemanis berupa sirup.",
                "Rp. 15.000",
                R.drawable.esteler
        ));


    }
}
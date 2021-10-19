package com.example.menumakananbiasa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolderMakanan> {

    private final ArrayList<Makanan> listMakanan;

    private final RVMakananListener listener;

    public MakananAdapter(ArrayList<Makanan> listMakanan, RVMakananListener listener) {
        this.listMakanan = listMakanan;
        this.listener = listener;
}
    public class ViewHolderMakanan extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtMakanan, txtDeskripsi, txtHarga;
        public ImageView imgviewMakanan;

        public RelativeLayout itemDetail;

        public ViewHolderMakanan(@NonNull View itemView) {
            super(itemView);

            txtMakanan = itemView.findViewById(R.id.textMakanan);
            txtDeskripsi = itemView.findViewById(R.id.textDeskripsi);
            txtHarga = itemView.findViewById(R.id.textHarga);
            imgviewMakanan = itemView.findViewById(R.id.imageMakanan);


            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());

        }
    }

    @NonNull
    @Override
    public MakananAdapter.ViewHolderMakanan onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context konteks = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(konteks);
        ViewHolderMakanan holder = new ViewHolderMakanan(inflater.inflate(R.layout.item_kuliner, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMakanan holder, int position) {
        Makanan ambilMakanan = listMakanan.get(position);
        holder.txtMakanan.setText(ambilMakanan.getNamaMakanan());
        holder.txtDeskripsi.setText(ambilMakanan.getDescMakanan());
        holder.txtHarga.setText(ambilMakanan.getHargaMakanan());
        holder.imgviewMakanan.setImageResource(ambilMakanan.getIdGambar());

    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public interface RVMakananListener {
        void onClick(View views, int position);
    }
}

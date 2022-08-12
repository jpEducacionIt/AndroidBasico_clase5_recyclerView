package com.example.androidbasico_clase5_recyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BandaRockAdapter extends RecyclerView.Adapter<BandaRockAdapter.BandaViewHolder> {

    private ArrayList<BandaRock> bandas;

    public static class BandaViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewImagen;
        TextView textViewNombre;
        TextView textViewAlbum;

        public BandaViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewImagen = itemView.findViewById(R.id.imageViewBandaImagen);
            textViewNombre = itemView.findViewById(R.id.textViewNombrebanda);
            textViewAlbum = itemView.findViewById(R.id.textViewAlbumPreferido);
        }
    }

    public BandaRockAdapter(ArrayList<BandaRock> _bandas) {
        bandas = _bandas;
    }

    @NonNull
    @Override
    public BandaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        BandaViewHolder bandaViewHolder = new BandaViewHolder(view);
        return bandaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BandaViewHolder holder, int position) {
        BandaRock banda = bandas.get(position);
        holder.imageViewImagen.setImageResource(banda.getImagenBanda());
        holder.textViewNombre.setText(banda.getNombrebanda());
        holder.textViewAlbum.setText(banda.getAlbumPreferido());
    }

    @Override
    public int getItemCount() {
        return bandas.size();
    }
}

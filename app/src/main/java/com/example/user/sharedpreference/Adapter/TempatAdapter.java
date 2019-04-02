package com.example.user.sharedpreference.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.sharedpreference.R;
import com.example.user.sharedpreference.Model.TempatModel;

import java.util.ArrayList;
import java.util.List;

public class TempatAdapter extends RecyclerView.Adapter<TempatAdapter.ViewHolder> {
    Context context;
    List<TempatModel> tempatModels = new ArrayList<>();

    public TempatAdapter(Context context, List<TempatModel> kampusModels) {
        this.context = context;
        this.tempatModels = kampusModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_view, viewGroup, false); // menghubungkan ke layout
        ViewHolder holder = new ViewHolder(view); // deklarasi class ViewHolder di baris 46
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tvNama.setText(tempatModels.get(i).getNamaKampus());
        viewHolder.ivFoto.setImageResource(tempatModels.get(i).getPicKampus());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(context, tempatModels.get(i).getNamaKampus(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return tempatModels.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvNama;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.pic);
            tvNama = itemView.findViewById(R.id.tv1);
        }
    }
}


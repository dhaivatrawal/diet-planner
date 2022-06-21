package com.zedr.dhaivat.dietcharts_weightgainandloose;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

class RecyclerViewAdapterGExe extends RecyclerView.Adapter<RecyclerViewAdapterGExe.ClubViewHolder>{


    List<GExercise.Club> clubs;

   public RecyclerViewAdapterGExe(List<GExercise.Club> clubs){
        this.clubs=clubs;
    }




    public static class ClubViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView clubNameone;
        TextView clubNametwo;
        ImageView clubLogo;


        public ClubViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.cardView);
            clubNameone = (TextView)itemView.findViewById(R.id.club_nameone);
            clubNametwo = (TextView)itemView.findViewById(R.id.club_nametwo);
            clubLogo = (ImageView)itemView.findViewById(R.id.logo);
        }
    }

    @NonNull
    @Override
    public RecyclerViewAdapterGExe.ClubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,parent,false);
        ClubViewHolder cvh = new ClubViewHolder(view);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterGExe.ClubViewHolder holder, int position) {

        holder.clubNameone.setText(clubs.get(position).nameone);
        holder.clubNametwo.setText(clubs.get(position).nametwo);
        holder.clubLogo.setImageResource(clubs.get(position).logoId);

    }

    @Override
    public int getItemCount() {
        return clubs.size();
    }
}

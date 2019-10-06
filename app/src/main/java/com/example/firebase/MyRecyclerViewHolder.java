package com.example.firebase;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.annotations.NotNull;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView txt_title,txt_comment;

    IItemClickListener iItemClickListener;

    public void setiItemClickListener(IItemClickListener iItemClickListener){
        this.iItemClickListener = iItemClickListener;
    }

    public MyRecyclerViewHolder(@NotNull View itemView){
        super(itemView);

        txt_comment = (TextView)itemView.findViewById(R.id.txt_content);
        txt_title = (TextView)itemView.findViewById(R.id.txt_title);

        itemView.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        iItemClickListener.onClick(view,getAdapterPosition());
    }
}

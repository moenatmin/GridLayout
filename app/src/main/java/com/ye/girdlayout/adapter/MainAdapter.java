package com.ye.girdlayout.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.ye.girdlayout.R;
import com.ye.girdlayout.model.Card;

import java.util.List;

/**
 * Created by ye on 6/4/16.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder>{

    Context context;
    List<Card> cards;

    public MainAdapter(Context context, List<Card> cards) {
        this.context = context;
        this.cards = cards;
    }
    // connent with view
    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_card, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        holder.textView.setText(cards.get(position).getTextCard());

        Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return cards.size();
    }
    // get data from view
    public class MainViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public MainViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.img_card);
            textView = (TextView) itemView.findViewById(R.id.text_card);

        }
    }

}

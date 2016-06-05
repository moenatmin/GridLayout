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
    MainItemClickListener mListener;

    public interface MainItemClickListener{
        public void OnItemClick(Card itemClicked);
    }

    public MainAdapter(Context context, List<Card> cards, MainItemClickListener mListener) {
        this.context = context;
        this.cards = cards;
        this.mListener = mListener;
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

        Picasso.with(context)
                .load(cards.get(position).getUrlImage())
                .placeholder(R.drawable.superman)
                .error(R.drawable.superman)
                .into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return cards.size();
    }
    // get data from view
    public class MainViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        TextView textView;

        public MainViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.img_card);
            textView = (TextView) itemView.findViewById(R.id.text_card);
            itemView.setOnClickListener(this);

        }

        public void onClick(View v) {
            mListener.OnItemClick(cards.get(getLayoutPosition()));
        }
    }



}

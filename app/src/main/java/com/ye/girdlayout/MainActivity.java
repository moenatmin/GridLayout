package com.ye.girdlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ye.girdlayout.adapter.MainAdapter;
import com.ye.girdlayout.model.Card;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<Card> cards = new ArrayList<>();
    MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.main_recycler);
        //mRecyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        CardDataLoading();

        mainAdapter = new MainAdapter(getApplicationContext(), cards);
        mRecyclerView.setAdapter(mainAdapter);
    }

    private void CardDataLoading(){
        cards.add(new Card("http://i.imgur.com/DvpvklR.png", "Moe Nat Min"));
        cards.add(new Card("http://i.imgur.com/DvpvklR.png", "Min Nat Moe"));
        cards.add(new Card("http://i.imgur.com/DvpvklR.png", "Nat Moe Min"));
        cards.add(new Card("http://i.imgur.com/DvpvklR.png", "Ye Wint Htat"));
        cards.add(new Card("http://i.imgur.com/DvpvklR.png", "Htat Wint Ye"));
        cards.add(new Card("http://i.imgur.com/DvpvklR.png", "Wint Ye Htat"));
        cards.add(new Card("http://i.imgur.com/DvpvklR.png", "Wint Htat Ye"));
       // mainAdapter.notifyDataSetChanged();


    }
}

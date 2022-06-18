package com.example.tvshowquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tvshowquiz.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    QuizAdapter adapter;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initAdapter();
    }

    private void initAdapter() {
        ArrayList<HeroModel> list = new ArrayList<>();
        list.add(new HeroModel("https://ae01.alicdn.com/kf/HTB1zo8dXLLsK1Rjy0Fbq6xSEXXah/Dean-Winchester-Supernatural-Poster-Fantasy-TV-Vintage-Retro-Decorative-DIY-Wall-Canvas-Stickers-Art-Home-Bar.jpg_Q90.jpg_.webp",
                "Dean", "Winchester", "Hunter"));
        list.add(new HeroModel("https://upload.wikimedia.org/wikipedia/en/d/db/Daryl_Dixon_Norman_Reedus.png",
                "Daryl", "Dixon", "Archer"));
        list.add(new HeroModel("https://www.peoples.ru/character/movie/darth_vader/darth_1.jpeg",
                "Darth", "Vader", "Antihero"));
        list.add(new HeroModel("https://static.wikia.nocookie.net/marvel-cinematic/images/3/32/Steve_Rogers_2.jpg/revision/latest?cb=20131025030358",
                "Steve", "Rogers", "Captain America"));
        adapter = new QuizAdapter(list);
        binding.recyclerView.setAdapter(adapter);
    }
}
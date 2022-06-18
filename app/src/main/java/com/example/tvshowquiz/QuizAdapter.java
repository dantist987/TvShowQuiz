package com.example.tvshowquiz;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tvshowquiz.databinding.ItemQuizBinding;

import java.util.ArrayList;

public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.QuizViewHolder> {

    ArrayList<HeroModel> list;

    public QuizAdapter(ArrayList<HeroModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public QuizViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemQuizBinding binding = ItemQuizBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new QuizViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull QuizViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class QuizViewHolder extends RecyclerView.ViewHolder {
        ItemQuizBinding binding;

        public QuizViewHolder(ItemQuizBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(HeroModel heroModel) {
            binding.tvName.setText(heroModel.name);
            binding.tvSurname.setText(heroModel.surname);
            binding.tvPost.setText(heroModel.post);
            Glide.with(binding.avatarImg).load(heroModel.avatar).circleCrop().into(binding.avatarImg);
        }
    }
}

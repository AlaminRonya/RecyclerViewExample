package com.example.day17pactice.adepter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day17pactice.R;
import com.example.day17pactice.pojo.Movie;

import java.util.List;

public class MoveAdapter extends RecyclerView.Adapter<MoveAdapter.MovieVewHolder>{
    private List<Movie> movieList ;

    public MoveAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MovieVewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row, parent, false);
        return new MovieVewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieVewHolder holder, int position) {
        final  Movie movie = movieList.get(position);
        holder.nameTV.setText(movie.getName());
        holder.ratingTV.setText(""+movie.getRating());
        holder.imageView.setImageResource(movie.getImg());



    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    class MovieVewHolder extends RecyclerView.ViewHolder{
        TextView nameTV,ratingTV;
        ImageView imageView;

        public MovieVewHolder(@NonNull View itemView) {
            super(itemView);
            nameTV = itemView.findViewById(R.id.textView);
            ratingTV = itemView.findViewById(R.id.ratingID);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }

}

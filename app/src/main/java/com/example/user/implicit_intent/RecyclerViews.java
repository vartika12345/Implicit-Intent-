package com.example.user.implicit_intent;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class RecyclerViews extends AbstractBaseActivity {
    private List<Movie> movieList = new ArrayList<>();
    private MovieAdapter movieAdapter;
    @BindView(R.id.rvList)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        prepareMovieData();
        movieAdapter = new MovieAdapter(movieList);
        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayout);
       // recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(movieAdapter);

    }

    private void prepareMovieData() {
                Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015");
                movieList.add(movie);
                movie = new Movie("Inside Out", "Animation, Kids & Family", "2015");
                movieList.add(movie);
                movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
                movieList.add(movie);
                movie = new Movie("Shaun the Sheep", "Animation", "2015");
                movieList.add(movie);
                movie = new Movie("The Martian", "Science Fiction & Fantasy", "2015");
                movieList.add(movie);
                movie = new Movie("Mission: Impossible Rogue Nation", "Action", "2015");
                movieList.add(movie);
                movie = new Movie("Up", "Animation", "2009");
                movieList.add(movie);
                movie = new Movie("Star Trek", "Science Fiction", "2009");
                movieList.add(movie);
                movie = new Movie("The LEGO Movie", "Animation", "2014");
                movieList.add(movie);
                movie = new Movie("Iron Man", "Action & Adventure", "2008");
                movieList.add(movie);
                movie = new Movie("Aliens", "Science Fiction", "1986");
                movieList.add(movie);
                movie = new Movie("Chicken Run", "Animation", "2000");
                movieList.add(movie);
                movie = new Movie("Back to the Future", "Science Fiction", "1985");
                movieList.add(movie);
                movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981");
                movieList.add(movie);
                movie = new Movie("Goldfinger", "Action & Adventure", "1965");
                movieList.add(movie);
                movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
                movieList.add(movie);

            }


        }


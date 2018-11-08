package com.example.fahad.movislists.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.fahad.movislists.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Movie> movie = new ArrayList<>() ;
    GridView gridView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.grid_view) ;

        Movie movie0 = new Movie() ;
        Movie movie1 = new Movie() ;
        Movie movie2 = new Movie() ;
        Movie movie3 = new Movie() ;
        Movie movie4 = new Movie() ;
        Movie movie5 = new Movie() ;
        Movie movie6 = new Movie() ;
        Movie movie7 = new Movie() ;
        Movie movie8 = new Movie() ;

        movie0.setName("The Nun");
        movie0.setGenere("Horror");
        movie0.setYear("2018");
        movie0.setPicture(R.drawable.nun);

        movie1.setName("The Immitation Game");
        movie1.setGenere("History");
        movie1.setYear("2014");
        movie1.setPicture(R.drawable.immi);

        movie2.setName("No Escape");
        movie2.setGenere("Action");
        movie2.setYear("2015");
        movie2.setPicture(R.drawable.escape);

        movie3.setName("Vikings");
        movie3.setGenere("War");
        movie3.setYear("2013-");
        movie3.setPicture(R.drawable.vikings);

        movie4.setName("Friends");
        movie4.setGenere("Comedy");
        movie4.setYear("1994-2004");
        movie4.setPicture(R.drawable.friends);

        movie5.setName("Oculus");
        movie5.setGenere("Horror");
        movie5.setYear("2015");
        movie5.setPicture(R.drawable.oculus);

        movie6.setName("Peaky Blinders");
        movie6.setGenere("Action");
        movie6.setYear("2013-");
        movie6.setPicture(R.drawable.peaky);

        movie7.setName("Ant-Man");
        movie7.setGenere("Action");
        movie7.setYear("2015");
        movie7.setPicture(R.drawable.antman);

        movie8.setName("Narcos");
        movie8.setGenere("Action");
        movie8.setYear("2013");
        movie8.setPicture(R.drawable.narcos);

        movie.add(movie0);
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);

        gridView.setAdapter(new MovieAdapter(movie,this));
    }
}

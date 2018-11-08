package com.example.fahad.movislists.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fahad.movislists.R;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {

    ArrayList<Movie> movie = new ArrayList<Movie>() ;
    Context context ;
    LayoutInflater inflator ;

    public MovieAdapter(ArrayList<Movie> movie, Context context) {
        this.movie = movie;
        this.context = context;
    }

    @Override
    public int getCount() {
        return movie.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView!=null){
            inflator = LayoutInflater.from(context) ;
            convertView = inflator.inflate(R.layout.movie_item,null) ;
        }

        ImageView image = convertView.findViewById(R.id.image_view) ;
        TextView txtName = convertView.findViewById(R.id.txt_name) ;
        TextView txtGenere = convertView.findViewById(R.id.txt_description) ;
        TextView txtYear = convertView.findViewById(R.id.txt_year) ;

        image.setImageResource(movie.get(position).getPicture());
        txtName.setText(movie.get(position).getName());
        txtGenere.setText(movie.get(position).getGenere());
        txtYear.setText(movie.get(position).getYear());

        return convertView ;
    }
}

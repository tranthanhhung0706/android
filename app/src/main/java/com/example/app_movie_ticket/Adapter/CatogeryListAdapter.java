package com.example.app_movie_ticket.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_movie_ticket.Model.Catogery;
import com.example.app_movie_ticket.Model.Movie;
import com.example.app_movie_ticket.R;

import java.util.ArrayList;
import java.util.List;

public class CatogeryListAdapter extends RecyclerView.Adapter<CatogeryListAdapter.ViewHolder> {
    List<Catogery> list;
    boolean check=true;
    boolean select=false;
    int row_index=-1;
    UpdateVerticalRec updateVerticalRec;
    public CatogeryListAdapter(List<Catogery> list,UpdateVerticalRec updateVerticalRec) {
        this.list = list;
        this.updateVerticalRec=updateVerticalRec;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.catogery_hor_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txt_catogery1.setText(list.get(position).getCatogery());
        if(check) {
            ArrayList<Movie> movies=new ArrayList<>();
            movies.add(new Movie(R.drawable.movie1,"Iron Man 1","16:40,Sun May 22","Action"));
            movies.add(new Movie(R.drawable.movie2,"Iron Man 2","13:40,Sun May 22","Action"));
            movies.add(new Movie(R.drawable.movie3,"Iron Man 3","15:40,Sun May 22","Action"));
            movies.add(new Movie(R.drawable.movie4,"Super Man","18:40,Sun May 22","Drama"));
            movies.add(new Movie(R.drawable.movie1,"The Spongebod","16:40,Sun May 22","Drama"));
            movies.add(new Movie(R.drawable.movie2,"Iron Man 6","13:40,Sun May 22","Comic"));
            movies.add(new Movie(R.drawable.movie3,"Onward","15:40,Sun May 22","Comic"));
            movies.add(new Movie(R.drawable.movie4,"Iron Man 8","18:40,Sun May 22","Horor"));
            updateVerticalRec.callBack(position,movies);
            check = false;
        }
        if (select){
            if (position==0){
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
                select=false;
            }
        }
        else {
            if (row_index==position){
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
            }else {
                holder.cardView.setBackgroundResource(R.drawable.default_bg);
            }
        }
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index=position;
                notifyDataSetChanged();
                if (position==0){
                    ArrayList<Movie> movies=new ArrayList<>();
                    movies.add(new Movie(R.drawable.movie1,"Iron Man 1","16:40,Sun May 22","Action"));
                    movies.add(new Movie(R.drawable.movie2,"Iron Man 2","13:40,Sun May 22","Action"));
                    movies.add(new Movie(R.drawable.movie3,"Iron Man 3","15:40,Sun May 22","Action"));
                    movies.add(new Movie(R.drawable.movie4,"Super Man","18:40,Sun May 22","Drama"));
                    movies.add(new Movie(R.drawable.movie1,"The Spongebod","16:40,Sun May 22","Drama"));
                    movies.add(new Movie(R.drawable.movie2,"Iron Man 6","13:40,Sun May 22","Comic"));
                    movies.add(new Movie(R.drawable.movie3,"Onward","15:40,Sun May 22","Comic"));
                    movies.add(new Movie(R.drawable.movie4,"Iron Man 8","18:40,Sun May 22","Horor"));
                   updateVerticalRec.callBack(position,movies);
                } else if (position==1) {
                    ArrayList<Movie> movies=new ArrayList<>();
                    movies.add(new Movie(R.drawable.movie1,"Iron Man 1","16:40,Sun May 22","Action"));
                    movies.add(new Movie(R.drawable.movie2,"Iron Man 2","13:40,Sun May 22","Action"));
                    movies.add(new Movie(R.drawable.movie3,"Iron Man 3","15:40,Sun May 22","Action"));
                    updateVerticalRec.callBack(position,movies);
                } else if (position==2) {
                    ArrayList<Movie> movies=new ArrayList<>();
                    movies.add(new Movie(R.drawable.movie4,"Super Man","18:40,Sun May 22","Drama"));
                    movies.add(new Movie(R.drawable.movie1,"The Spongebod","16:40,Sun May 22","Drama"));
                    updateVerticalRec.callBack(position,movies);
                } else if (position==3) {
                    ArrayList<Movie> movies=new ArrayList<>();
                    movies.add(new Movie(R.drawable.movie2,"Iron Man 6","13:40,Sun May 22","Comic"));
                    movies.add(new Movie(R.drawable.movie3,"Onward","15:40,Sun May 22","Comic"));
                    updateVerticalRec.callBack(position,movies);
                } else if (position==4) {
                    ArrayList<Movie> movies=new ArrayList<>();
                    movies.add(new Movie(R.drawable.movie4,"Iron Man 8","18:40,Sun May 22","Horor"));
                    updateVerticalRec.callBack(position,movies);
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        if (list!=null){
            return list.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_catogery1;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_catogery1=itemView.findViewById(R.id.txt_catogery1);
            cardView=itemView.findViewById(R.id.cardview_catogery);
        }
    }
}

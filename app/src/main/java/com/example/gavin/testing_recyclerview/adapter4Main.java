package com.example.gavin.testing_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;

public class adapter4Main extends RecyclerView.Adapter<adapter4Main.theViewHolder>{

    private ArrayList<String> List;

    public adapter4Main(ArrayList<String> dataFromMain){
        this.List = dataFromMain;
    }

    public class theViewHolder extends RecyclerView.ViewHolder{
        public ImageView theIcon,theBox;
        public TextView textView;

        public theViewHolder(View v){
            super(v);
            theIcon = v.findViewById(R.id.theIcon);
            theBox = v.findViewById(R.id.theBox);
            textView = v.findViewById(R.id.textView);
        }
    }

    @Override
    public theViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout,parent,false);

        theViewHolder vh = new theViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(theViewHolder holder, int position) {
        holder.textView.setText(List.get(position));

        //ClassCastException: android.widget.LinearLayout cannot be
        // cast to android.widget.TextView
        //android.support.constraint.ConstraintLayout cannot be cast to android.widget.TextView
    }

    @Override
    public int getItemCount() {
        return List.size();
    }
}

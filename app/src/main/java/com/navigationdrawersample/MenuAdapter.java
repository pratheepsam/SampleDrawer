package com.navigationdrawersample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sysadmin on 11/8/17.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder> {
    Context mContext;
    private LayoutInflater inflater;
    List<MenuNavItem> mNavItems = Collections.emptyList();

    public MenuAdapter(Context context, ArrayList<MenuNavItem> mNavItems){
        this.mContext = context;
        this.mNavItems = mNavItems;
        inflater = LayoutInflater.from(context);


    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.navdrawer_item,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        MenuNavItem current = mNavItems.get(position);
        holder.text.setText(current.getmTittle());
        holder.icons.setImageResource(current.getmIcon());

    }

    @Override
    public int getItemCount() {
        return mNavItems.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView text;
        ImageView icons;
        RelativeLayout relativeLayout;

        public MyViewHolder(View itemView){
            super(itemView);
            text =(TextView)itemView.findViewById(R.id.title);
            icons = (ImageView)itemView.findViewById(R.id.icon);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.r_layout);

        }


    }
}

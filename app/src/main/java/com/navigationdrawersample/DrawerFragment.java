package com.navigationdrawersample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by sysadmin on 10/8/17.
 */

public class DrawerFragment extends Fragment {
    private RecyclerView recyclerView;
    ArrayList<MenuNavItem> menu = new ArrayList<>();
    private MenuAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fr_drawer,container,false);
        adapter = new MenuAdapter(getActivity(),menu);
        recyclerView = (RecyclerView)layout.findViewById(R.id.drawerList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return layout;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        menu.add(new MenuNavItem("Home",R.drawable.ic_home));
        menu.add(new MenuNavItem("About",R.drawable.ic_about));
    }
    public static interface ClickListener{
        public void onClick(View view,int position);
        public void onLongClick(View view,int position);
    }
    
}

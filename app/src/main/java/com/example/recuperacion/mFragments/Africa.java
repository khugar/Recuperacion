package com.example.recuperacion.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recuperacion.R;
import com.example.recuperacion.mRecycler.MyAdapter;



/**
 Created by Oclemy on 9/18/2016.
 */
public class Africa extends Fragment {

    private RecyclerView rv;

    private  String[] paises;
    public static Africa newInstance()
    {
        return new Africa();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.africa,null);


        paises = rootView.getResources().getStringArray(R.array.Africa);
        //REFERENCE
        rv= (RecyclerView) rootView.findViewById(R.id.africa_RV);

        //LAYOUT MANAGER
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        //ADAPTER
        rv.setAdapter(new MyAdapter(getActivity(), paises));



        return rootView;
    }

    @Override
    public String toString() {
        return "InterUiniverse";
    }
}

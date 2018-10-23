package com.example.panzq.tablayout.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.panzq.tablayout.R;
import com.example.panzq.tablayout.adapters.CallAdapter;
import com.example.panzq.tablayout.bean.Call;

import java.util.ArrayList;

public class FavouriteCallFragment extends Fragment {
    public FavouriteCallFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favourite_call_list, container, false);

        ArrayList<Call> callArrayList = new ArrayList<>();
        Call call= new Call("Jane Doe", "12 mins", R.drawable.girl);
        callArrayList.add(call);
        call = new Call("Joe Doe", "23 mins", R.drawable.man);
        callArrayList.add(call);
        call = new Call("Gürkan Palamutsever", "8 mins", R.drawable.man);
        callArrayList.add(call);
        call = new Call("Dilara Rotbalansçıgil", "15 mins", R.drawable.girl);
        callArrayList.add(call);
        call = new Call("Cafer Dayakçıoğlu", "9 mins", R.drawable.man);
        callArrayList.add(call);


        RecyclerView recyclerView = view.findViewById(R.id.favouriteRecycler);
        CallAdapter callAdapter = new CallAdapter(callArrayList, view.getContext());
        recyclerView.setAdapter(callAdapter);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(view.getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

        return view;
    }
}

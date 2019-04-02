package com.example.user.sharedpreference.View;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.sharedpreference.Adapter.TempatAdapter;
import com.example.user.sharedpreference.Model.TempatModel;
import com.example.user.sharedpreference.Presenter.TempatPresenter;
import com.example.user.sharedpreference.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class WisataFragment extends Fragment implements MainView{
    List<TempatModel> tempatModels = new ArrayList<>();
    TempatAdapter adapter;

    public WisataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wisata, container, false);
        return view;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        adapter = new TempatAdapter(getContext(), tempatModels);
        recyclerView.setAdapter(adapter);
        TempatPresenter data = new TempatPresenter(this,getContext());
        data.setData();
    }

    public void onSuccess(List<TempatModel> kampusModels){
        this.tempatModels.clear();
        this.tempatModels.addAll(kampusModels);
        this.adapter.notifyDataSetChanged();
    }
}

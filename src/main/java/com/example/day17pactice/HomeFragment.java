package com.example.day17pactice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.day17pactice.adepter.MoveAdapter;
import com.example.day17pactice.databinding.FragmentHomeBinding;
import com.example.day17pactice.pojo.Movie;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater);
        final MoveAdapter employeeAdapter = new MoveAdapter(Movie.getAllMovie());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        binding.recyclerViewAction.setLayoutManager(linearLayoutManager);
//        binding.recyclerView_action.setLayoutManager(linearLayoutManager);
        binding.recyclerViewAction.setAdapter(employeeAdapter);
        return binding.getRoot();
    }
}
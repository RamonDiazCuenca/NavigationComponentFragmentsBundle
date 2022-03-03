package com.rdc.navigationcomponentfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rdc.navigationcomponentfragments.databinding.FragmentTercerBinding;

public class TercerFragment extends Fragment {

    private FragmentTercerBinding binding;

    public TercerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentTercerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);

        binding.btnAtras.setOnClickListener(view1 -> {

            navController.navigate(R.id.segundoFragment);
        });

        binding.btnHome.setOnClickListener(view1 -> {

            navController.navigate(R.id.inicioFragment);
        });
    }
}
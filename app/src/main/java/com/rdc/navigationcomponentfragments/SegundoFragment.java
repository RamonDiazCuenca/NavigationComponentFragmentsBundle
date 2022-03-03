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

import com.rdc.navigationcomponentfragments.databinding.FragmentSegundoBinding;


public class SegundoFragment extends Fragment {

    private FragmentSegundoBinding binding;

    public SegundoFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSegundoBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);


        binding.btnAtras.setOnClickListener(view1 -> {

            Navigation.findNavController(view1).navigate(R.id.inicioFragment);

        });

        binding.btnSiguiente.setOnClickListener(view1 -> {

            navController.navigate(R.id.tercerFragment);

        });
    }
}
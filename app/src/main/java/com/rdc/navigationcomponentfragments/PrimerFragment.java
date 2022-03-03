package com.rdc.navigationcomponentfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rdc.navigationcomponentfragments.databinding.FragmentPrimerBinding;

public class PrimerFragment extends Fragment {

    private FragmentPrimerBinding binding;


    public PrimerFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentPrimerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Recogemos los argumentos pasados por el bundle con su clave correspondiente	
        CharSequence user = getArguments().getCharSequence("user");
        CharSequence password = getArguments().getCharSequence("pass");

        binding.tvdatos.setText("Bienvenido " + user + "/" + password);


        binding.btnAtras.setOnClickListener(view1 -> {

            Navigation.findNavController(view1).navigate(R.id.inicioFragment);

        });

    }
}
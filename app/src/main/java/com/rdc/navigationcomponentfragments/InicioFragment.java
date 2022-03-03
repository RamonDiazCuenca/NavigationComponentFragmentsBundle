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

import com.rdc.navigationcomponentfragments.databinding.FragmentInicioBinding;


public class InicioFragment extends Fragment {

    private FragmentInicioBinding binding;


    public InicioFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentInicioBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        return view;
    }

    @Override /*Este método se llama siempre despues de que se inicio el onCreateView,
                se recomienda implementarlo para instancias de botones o llamados a nuevas pantallas,
                para referenciar los componentes mejor hacerlo aqui cuando sabemos que la vista fue creada
                correctamente*/
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //para cuando tienes varios llamados
        final NavController navController = Navigation.findNavController(view);
        //Instanciamos un Bundle para pasar datos a otro fragment	
        Bundle bundle = new Bundle();

        binding.btnfragment1.setOnClickListener(view1->{

            //Llamamos al primer fragmento de mi navegacion,
            // pasamos la vista que me llega y navega al fragmento indicado por su id
	// y le pasamos el bundle ("clave",valor) con los datos introducidos
            bundle.putString("user",binding.etuser.getText().toString());
            bundle.putString("pass",binding.etpassword.getText().toString());
            Navigation.findNavController(view1).navigate(R.id.primerFragment,bundle);

        });

        binding.btnfragment2.setOnClickListener(view1 -> {

            //Tambien se puede hacer así, al tener varios llamados en la misma pantalla
            navController.navigate(R.id.segundoFragment);

        });

    }
}
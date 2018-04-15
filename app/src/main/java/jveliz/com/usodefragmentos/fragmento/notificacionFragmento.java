package jveliz.com.usodefragmentos.fragmento;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jveliz.com.usodefragmentos.R;

/**
 * Created by veliz on 02/03/2018.
 */

public class notificacionFragmento extends Fragment {
    @Nullable


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState){
        View vista=inflater.inflate(R.layout.fragment_notificaciones,null);//incio de la vista

        return vista;
    }





}

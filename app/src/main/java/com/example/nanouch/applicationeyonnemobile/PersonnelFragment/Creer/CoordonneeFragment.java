package com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Creer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nanouch.applicationeyonnemobile.R;

public class CoordonneeFragment extends Fragment {


    public CoordonneeFragment() {
    }

    private Button sauvegarder,annuler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_coordonnee, container, false);

        sauvegarder = (Button) view.findViewById(R.id.btn_sauvegarder);
        annuler = (Button) view.findViewById(R.id.btn_annuler);

       /* sauvegarder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        annuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });*/

        return view;
    }

}

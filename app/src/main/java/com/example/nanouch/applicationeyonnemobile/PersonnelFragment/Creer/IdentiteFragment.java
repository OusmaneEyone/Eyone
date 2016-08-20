package com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Creer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.nanouch.applicationeyonnemobile.R;

public class IdentiteFragment extends Fragment {


    public IdentiteFragment() {
    }
    private Button sauvegarder,annuler;
    private Spinner sexe;
    private ArrayAdapter<CharSequence> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_identite, container, false);

        sauvegarder = (Button) view.findViewById(R.id.btn_sauvegarder);
        sexe = (Spinner) view.findViewById(R.id.spin_Sexe);  // On fixe un variable à notre spiner
        adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Sexes, android.R.layout.simple_spinner_item);  // Contexte, tableau, type d'adaptateur

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sexe.setAdapter(adapter);

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

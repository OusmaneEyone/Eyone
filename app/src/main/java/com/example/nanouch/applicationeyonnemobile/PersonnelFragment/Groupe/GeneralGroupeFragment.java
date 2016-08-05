package com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Groupe;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nanouch.applicationeyonnemobile.FragmentAdaptater.MainCreer;
import com.example.nanouch.applicationeyonnemobile.FragmentAdaptater.MainCreerOrga;
import com.example.nanouch.applicationeyonnemobile.R;

public class GeneralGroupeFragment extends Fragment {

    private EditText nom_groupe;
    private EditText description_groupe;
    private Button suivant_groupe;

    public GeneralGroupeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_general_groupe, container, false);

        nom_groupe = (EditText) view.findViewById(R.id.txt_nom_groupe);
        description_groupe= (EditText) view.findViewById(R.id.txt_description_groupe);
        suivant_groupe = (Button) view.findViewById(R.id.btn_suivant_general_groupe);

        suivant_groupe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(nom_groupe.getText().toString().isEmpty())// on recupere le texte avec toString et on verifie si il est vide

                {
                    Toast.makeText(getActivity(),"Remplir le champ Nom",Toast.LENGTH_LONG).show(); // message maxi 5 seconde et show pour montrer
                    onStop();
                }
                else {

                    ((MainCreer)getActivity()).setCurrentItem(4, true);   // c'est la position de personnel dans groupe

                }

            }
        });

        return view;
    }

}

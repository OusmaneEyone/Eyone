package com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Groupe.GroupeFragment1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.nanouch.applicationeyonnemobile.R;

public class PersonelGroupeFragment extends Fragment {

    private Button modifier, creer, rechercher;
    private TextView text;

    public PersonelGroupeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_personel_groupe, container, false);

        modifier = (Button) view.findViewById(R.id.btn_modifier_personnel_groupe);
        creer =(Button) view.findViewById(R.id.btn_creer_personnel_groupe);
        rechercher = (Button) view.findViewById(R.id.btn_rechercher_personnel_groupe);

        text = (TextView) view.findViewById(R.id.txt_personnelaffect_groupe);


        return view;
    }

}

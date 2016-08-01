package com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Groupe;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nanouch.applicationeyonnemobile.R;


public class RechercherGroupeFragment extends Fragment {


    public RechercherGroupeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rechercher_groupe, container, false);
    }

}

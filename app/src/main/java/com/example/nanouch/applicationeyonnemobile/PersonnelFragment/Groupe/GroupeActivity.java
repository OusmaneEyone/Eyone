package com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Groupe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Groupe.GeneralGroupeFragment;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Groupe.RechercherGroupeFragment;
import com.example.nanouch.applicationeyonnemobile.R;

public class GroupeActivity extends AppCompatActivity {

    private Button creer,rechercher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groupe);

        creer = (Button) findViewById(R.id.btn__click_creer_groupe);
        rechercher = (Button) findViewById(R.id.btn_click_rechercher_groupe);

        creer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GeneralGroupeFragment generalGroupeFragment =  new GeneralGroupeFragment(); //new tasks()
                generalGroupeFragment.setArguments(getIntent().getExtras());
                setFragment(generalGroupeFragment);

            }
        });

        rechercher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RechercherGroupeFragment rechercherGroupeFragment = new RechercherGroupeFragment();
                setFragment(rechercherGroupeFragment);

            }
        });
    }

    public void setFragment(Fragment frag) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //fragmentTransaction.add(frag.newInstance(),null);
        fragmentTransaction.replace(R.id.pagedaccueil, frag);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}

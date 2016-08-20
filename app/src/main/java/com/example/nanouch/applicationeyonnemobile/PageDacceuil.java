package com.example.nanouch.applicationeyonnemobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.app.FragmentManager;

import com.example.nanouch.applicationeyonnemobile.FragmentAdaptater.MainCreer;
import com.example.nanouch.applicationeyonnemobile.FragmentAdaptater.MainCreerOrga;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Annuaire.AnnuaireActivity;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Groupe.GroupeFragment1.GeneralGroupeFragment;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Groupe.GroupeFragment1.GroupeActivity;

public class PageDacceuil extends AppCompatActivity {

    private Button personnel,organisation;
    private android.support.v4.app.FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_dacceuil);

        personnel = (Button) findViewById(R.id.btn_personnel);
        organisation = (Button) findViewById(R.id.btn_organisation);



        personnel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showFilterPopup(view);

            }
        });

        organisation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showFilterPopup2(view);

            }
        });

    }

    private void showFilterPopup(View v) {   // Permet d'ajouter notre menu à une vue
        PopupMenu popup = new PopupMenu(this, v);
        popup.getMenuInflater().inflate(R.menu.menu_personnel, popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {


                switch (item.getItemId()) {

                    case R.id.item_annuaire:
                        Intent intent_annuaire = new Intent(getApplicationContext(), AnnuaireActivity.class);
                        startActivity(intent_annuaire);
                        break;
                    case R.id.item_creer:
                        Intent intent_creer = new Intent(getApplicationContext(), MainCreer.class);
                        startActivity(intent_creer);
                        break;
                    case R.id.item_groupe:
                        Intent intent_groupe = new Intent(getApplicationContext(), GroupeActivity.class);
                        startActivity(intent_groupe);

                        //GeneralGroupeFragment generalGroupeFragment =  new GeneralGroupeFragment(); //new tasks()
                        //generalGroupeFragment.setArguments(getIntent().getExtras());
                        //setFragment(generalGroupeFragment);
                        break;
                    case R.id.item_import:
                        break;
                }
                return false;
            }
        });
        popup.show();
    }

    public void setFragment(Fragment frag) {

        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //fragmentTransaction.add(frag.newInstance(),null);
        fragmentTransaction.replace(R.id.pagedaccueil, frag);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    private void showFilterPopup2(View v) {   // Permet d'ajouter notre menu à une vue
        PopupMenu popup = new PopupMenu(this, v);
        popup.getMenuInflater().inflate(R.menu.menu_organisation, popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.item_creerorg:
                        Intent intent_creerorg = new Intent(getApplicationContext(), MainCreerOrga.class);
                        startActivity(intent_creerorg);
                        break;
                    case R.id.item_rechercher:
                        break;
                    case R.id.item_organigramme:
                        break;
                    case R.id.item_typorganisation:
                        break;
                }
                return false;
            }
        });
        popup.show();
    }
}

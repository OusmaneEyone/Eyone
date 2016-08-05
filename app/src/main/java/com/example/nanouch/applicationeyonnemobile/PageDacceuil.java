package com.example.nanouch.applicationeyonnemobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.nanouch.applicationeyonnemobile.FragmentAdaptater.MainCreer;
import com.example.nanouch.applicationeyonnemobile.FragmentAdaptater.MainCreerOrga;
import com.example.nanouch.applicationeyonnemobile.OrganisationFragment.Creer.GeneralFragment;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Groupe.GeneralGroupeFragment;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Groupe.PersonelGroupeFragment;

public class PageDacceuil extends AppCompatActivity {

    Button personnel,organisation;

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
                        break;
                    case R.id.item_creer:
                        Intent intent_creer = new Intent(getApplicationContext(), MainCreer.class);
                        startActivity(intent_creer);
                        break;
                    case R.id.creer_groupe:
                        //(MainCreer)this.setCurrentItem(3, true);
                       
                        break;
                    case R.id.rechervher_groupe:
                        break;
                    case R.id.item_import:
                        break;
                }
                return false;
            }
        });
        popup.show();
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

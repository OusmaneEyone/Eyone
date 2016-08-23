package com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Annuaire;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.List;
import java.util.ArrayList;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View;
import android.widget.Toast;

import com.example.nanouch.applicationeyonnemobile.FragmentAdaptater.MainCreerOrga;
import com.example.nanouch.applicationeyonnemobile.Modele.Annuaire;
import com.example.nanouch.applicationeyonnemobile.R;

public class AnnuaireActivity extends AppCompatActivity {

    private ListView mlistview;
    Context context ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annuaire);

        mlistview = (ListView) findViewById(R.id.listView);
        setTitle("Annuaire");

        List<Annuaire> annuaire = genererTweets();

        AnnuaireAdapter adapter = new AnnuaireAdapter(AnnuaireActivity.this,0,annuaire);
        mlistview.setAdapter(adapter);

        mlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3) {
                Toast.makeText(getApplicationContext(),"Vous avez cliqué sur : " + position,Toast.LENGTH_SHORT).show();

                showFilterPopup3(v);

            }
        });

    }

    private void showFilterPopup3(View v) {   // Permet d'ajouter notre menu à une vue
        PopupMenu popup = new PopupMenu(this, v);
        popup.getMenuInflater().inflate(R.menu.menu_utilisateur_listview, popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.item_visualiser:
                        break;
                    case R.id.item_modifier:
                        break;
                    case R.id.item_contacter:
                        break;
                    case R.id.item_supprimer:
                        break;
                }
                return false;
            }
        });
        popup.show();
    }

    private List<Annuaire> genererTweets(){
        List<Annuaire> annuaire = new ArrayList<Annuaire>();
        annuaire.add(new Annuaire("ousmane","ba", "ousmane-diogo.ba2@eyone.net" ,"devellopeur"));
        annuaire.add(new Annuaire("ibrahim","balde", "ibrahim.balde@gmail.com" ,"direction"));
        annuaire.add(new Annuaire("Henri","Gueye", "henri.gueye@eyone.net" ,"Direction"));
        annuaire.add(new Annuaire("john-paul","diatta", "john-paul.diatta@eyone.net" ,"ADMIN_GENERAL"));
        annuaire.add(new Annuaire("joseph-michel","quenum", "joseph.quenum@eyone.net" ,"devellopeur"));
        annuaire.add(new Annuaire("alioune","ndiaye", "alioune.ndiaye@eyone.net" ,"direction"));

        return annuaire;
    }
}

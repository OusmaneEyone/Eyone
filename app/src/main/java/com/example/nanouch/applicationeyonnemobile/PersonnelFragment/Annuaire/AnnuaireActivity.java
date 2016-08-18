package com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Annuaire;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.List;
import java.util.ArrayList;

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


    }

    private List<Annuaire> genererTweets(){
        List<Annuaire> annuaire = new ArrayList<Annuaire>();
        annuaire.add(new Annuaire("florent","thiam", "florent.thiam@gmail.com" ,"devellopeur"));
        annuaire.add(new Annuaire("ibrahim","balde", "ibrahim.balde@gmail.com" ,"directeur"));
        annuaire.add(new Annuaire("florent","thiam", "florent.thiam@gmail.com" ,"devellopeur"));
        annuaire.add(new Annuaire("florent","thiam", "florent.thiam@gmail.com" ,"devellopeur"));
        annuaire.add(new Annuaire("florent","thiam", "florent.thiam@gmail.com" ,"devellopeur"));
        annuaire.add(new Annuaire("florent","thiam", "florent.thiam@gmail.com" ,"devellopeur"));

        return annuaire;
    }
}

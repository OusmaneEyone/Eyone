package com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Annuaire;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.List;
import java.util.ArrayList;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View;
import android.widget.Toast;

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

        mlistview.setOnItemClickListener(new OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "Vous avez cliquer sur : " + position, Toast.LENGTH_SHORT).show();
            }
        });

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

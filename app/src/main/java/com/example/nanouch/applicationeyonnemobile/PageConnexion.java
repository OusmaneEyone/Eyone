package com.example.nanouch.applicationeyonnemobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PageConnexion extends AppCompatActivity {

    private EditText identifiant,motdepasse;
    private Button connexion; // pour la connexion
    private static String mdp,id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_connexion);

        identifiant = (EditText) findViewById(R.id.input_identifiant);
        motdepasse = (EditText) findViewById(R.id.input_motdepasse);

        connexion = (Button) findViewById(R.id.btn_connexion);


        connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(identifiant.getText().toString().isEmpty() || motdepasse.getText().toString().isEmpty())// on recupere le texte avec toString et on verifie si il est vide

                {
                    Toast.makeText(getApplicationContext(),"Identifiant ou mot de passe incorrecte",Toast.LENGTH_LONG).show(); // message maxi 5 seconde et show pour montrer
                    onStop();
                }
                else {
                    Intent pagedaccueil = new Intent(getApplicationContext(), PageDacceuil.class); //lien entre les actvités

                    startActivity(pagedaccueil); // activité d'acceuil aprés la connexion
                }

            }
        });

    }
}

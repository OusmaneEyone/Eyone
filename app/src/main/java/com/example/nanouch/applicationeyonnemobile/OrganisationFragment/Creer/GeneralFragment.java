package com.example.nanouch.applicationeyonnemobile.OrganisationFragment.Creer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import com.example.nanouch.applicationeyonnemobile.PageDacceuil;
import com.example.nanouch.applicationeyonnemobile.R;

//NB: Partie Rattachement à faire aprés pour le layout fragment_general

public class GeneralFragment extends Fragment {

    private EditText denomination,telephone,fax,adresse,sigle,autrenum,mail,commentaire;
    private Switch gesdestock;
    private Spinner type,pays,device;
    private ArrayAdapter<CharSequence> adapter1,adapter2,adapter3;
    private Button suivant,annuler;

    public GeneralFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_general, container, false);

        // = (EditText) findViewById(R.id.input_identifiant);
        denomination = (EditText) view.findViewById(R.id.txt_denomination);
        telephone = (EditText) view.findViewById(R.id.txt_phone);
        fax = (EditText) view.findViewById(R.id.txt_fax);
        adresse = (EditText) view.findViewById(R.id.txt_adressentite);
        autrenum = (EditText) view.findViewById(R.id.txt_autrenum);
        sigle = (EditText) view.findViewById(R.id.txt_sigle);
        mail = (EditText) view.findViewById(R.id.txt_mailgeneral);
        commentaire = (EditText) view.findViewById(R.id.txt_commentairedegeneral);

        type = (Spinner) view.findViewById(R.id.spin_type_entite);  // On fixe un variable à notre spiner
        adapter1 = ArrayAdapter.createFromResource(getActivity(), R.array.Type, android.R.layout.simple_spinner_item);  // Contexte, tableau, type d'adaptateur
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        type.setAdapter(adapter1);


        pays = (Spinner) view.findViewById(R.id.spin_pays);  // On fixe un variable à notre spiner
        adapter2 = ArrayAdapter.createFromResource(getActivity(), R.array.Pays, android.R.layout.simple_spinner_item);  // Contexte, tableau, type d'adaptateur
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pays.setAdapter(adapter2);

        device = (Spinner) view.findViewById(R.id.spin_device);  // On fixe un variable à notre spiner
        adapter3 = ArrayAdapter.createFromResource(getActivity(), R.array.Device, android.R.layout.simple_spinner_item);  // Contexte, tableau, type d'adaptateur
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        device.setAdapter(adapter3);

        suivant = (Button) view.findViewById(R.id.btn_suivant);
        annuler = (Button) view.findViewById(R.id.btn_annuler);

        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(denomination.getText().toString().isEmpty() || type.getSelectedItem().toString().isEmpty()   || pays.getSelectedItem().toString().isEmpty()   || device.getSelectedItem().toString().isEmpty()   )// on recupere le texte et les spiner avec toString et on verifie si ils sont vide

                {
                    Toast.makeText(getActivity(),"Remplir les differents champs",Toast.LENGTH_LONG).show(); // message maxi 5 seconde et show pour montrer
                    onStop();
                }
                else {
                    Intent responsablesfragment = new Intent(getActivity(), ResponsablesFragment.class); //lien entre les actvités

                    startActivity(responsablesfragment); // activité d'acceuil aprés la connexion
                }

            }
        });

        return view;
    }

}

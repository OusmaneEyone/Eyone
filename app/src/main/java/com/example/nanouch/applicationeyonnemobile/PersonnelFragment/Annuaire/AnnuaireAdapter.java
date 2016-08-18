package com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Annuaire;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.nanouch.applicationeyonnemobile.R;

import com.example.nanouch.applicationeyonnemobile.Modele.Annuaire;

import org.w3c.dom.Text;

import java.util.List;


public class AnnuaireAdapter extends ArrayAdapter<Annuaire> {

    public AnnuaireAdapter(Context context, int resource, List<Annuaire> annuaire) {
        super(context,0,annuaire);

    }


    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_annuaire,parent, false);
        }

        AnnuaireViewHolder viewHolder = (AnnuaireViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new AnnuaireViewHolder();
            viewHolder.prenom = (TextView) convertView.findViewById(R.id.prenom);
            viewHolder.nom = (TextView) convertView.findViewById(R.id.nom);
            viewHolder.email = (TextView) convertView.findViewById(R.id.email);
            viewHolder.profil = (TextView) convertView.findViewById(R.id.profil);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Annuaire annuaire = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.prenom.setText(annuaire.getPrenom());
        viewHolder.nom.setText(annuaire.getNom());
        viewHolder.email.setText(annuaire.getEmail());
        viewHolder.profil.setText(annuaire.getProfil());


        return convertView;
    }

    private class AnnuaireViewHolder{

        public TextView prenom;
        public TextView nom;
        public TextView email;
        public TextView profil;
    }
}

package com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Annuaire;

import android.content.Context;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.nanouch.applicationeyonnemobile.R;
import android.widget.Toast;

import com.example.nanouch.applicationeyonnemobile.Modele.Annuaire;

import org.w3c.dom.Text;

import java.util.List;


public class AnnuaireAdapter extends ArrayAdapter<Annuaire> {

    List<Annuaire> mData;

    public AnnuaireAdapter(Context context, int resource, List<Annuaire> annuaire) {
        super(context,0,annuaire);

    }

    /*public int getCount()
    {
        return mData.size();
    }

    public Annuaire getItem(int position)
    {
        return mData.get(position);
    }
*/
    public long getItemId(int position)
    {

        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_annuaire,parent, false);
        }

        AnnuaireViewHolder viewHolder = (AnnuaireViewHolder) convertView.getTag();
        //comme nos vues sont réutilisées, notre cellule possède déjà un ViewHolder
        if(viewHolder == null){
            //si elle n'avait pas encore de ViewHolder
            viewHolder = new AnnuaireViewHolder();
            viewHolder.prenom = (TextView) convertView.findViewById(R.id.prenom);
            viewHolder.nom = (TextView) convertView.findViewById(R.id.nom);
            viewHolder.email = (TextView) convertView.findViewById(R.id.email);
            viewHolder.profil = (TextView) convertView.findViewById(R.id.profil);

            //puis on sauvegarde le mini-controlleur dans la vue
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

    //Notre Classe ViewHolder
    private class AnnuaireViewHolder{

        public TextView prenom;
        public TextView nom;
        public TextView email;
        public TextView profil;
    }
}

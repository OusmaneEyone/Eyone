package com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Creer;


import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.nanouch.applicationeyonnemobile.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhotoFragment extends Fragment {

    private Button telecharger;
    private ImageView photo;
    private static int codePhoto = 0;

    public PhotoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_photo, container, false);

        telecharger = (Button) view.findViewById(R.id.btn_telecharger);
        photo = (ImageView)view.findViewById(R.id.imag_photo);

        telecharger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentJD = new Intent();
                intentJD.setType("image/*");
                intentJD.setAction(Intent.ACTION_GET_CONTENT);
                intentJD.addCategory(Intent.CATEGORY_OPENABLE);

                startActivityForResult(intentJD, codePhoto);

            }
        });

        return view;

    }

    public String getPath(Uri uri) {   // le chemin de la photo
        String[] projection = { MediaStore.Images.Media.DATA };
        Cursor cursor = getActivity().managedQuery(uri, projection, null, null, null);
        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
        cursor.moveToFirst();
        return cursor.getString(column_index);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {  // le resultat quand on télécharge la photo
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == codePhoto && data != null) {   //Si la requete est égale à notre codePhoto et les données ne sont pas nulle
           Uri uri = data.getData();  //On recupere la photo
<<<<<<< HEAD
            photo.setImageURI(uri );
=======
            photo.setImageURI(uri);  //Permet d'afficher la photo
>>>>>>> 1fd82e81721342104e4920f9c097134c3002a5f4
            Log.e("tag","Photo télécharger"+ " " + getPath(uri)); //On recupere le chemin (conversion de l'objet en chemin
        }
    }
}

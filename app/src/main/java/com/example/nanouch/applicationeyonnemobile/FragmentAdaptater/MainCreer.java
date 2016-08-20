package com.example.nanouch.applicationeyonnemobile.FragmentAdaptater;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;


import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Creer.CoordonneeFragment;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Creer.IdentiteFragment;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Creer.PhotoFragment;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Groupe.GroupeFragment1.GeneralGroupeFragment;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Groupe.GroupeFragment1.PersonelGroupeFragment;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Groupe.RechercherGroupeFragment;
import com.example.nanouch.applicationeyonnemobile.R;

import java.util.ArrayList;
import java.util.List;

public class MainCreer extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_creer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new IdentiteFragment(), "Identité");
        adapter.addFragment(new PhotoFragment(), "Photo");
        adapter.addFragment(new CoordonneeFragment(), "Coordonnées");
        viewPager.setAdapter(adapter);
    }

    public void setCurrentItem(int position, boolean nextPage) {
        viewPager.setCurrentItem(position, nextPage);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                   CoordonneeFragment coordonneeFragment  = new CoordonneeFragment();
                    return coordonneeFragment;
                case 1:
                    IdentiteFragment identiteFragment =  new IdentiteFragment();
                    return identiteFragment;

                case  2:
                    PhotoFragment photoFragment =  new PhotoFragment();
                    return photoFragment;

                case 3:
                    GeneralGroupeFragment generalGroupeFragment = new GeneralGroupeFragment();
                    return generalGroupeFragment;

                case 4:
                    PersonelGroupeFragment personelGroupeFragment = new PersonelGroupeFragment();
                    return personelGroupeFragment;

                case 5:
                    RechercherGroupeFragment rechercherGroupeFragment = new RechercherGroupeFragment();
                    return rechercherGroupeFragment;

            }
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    private String getFragmentTag(int viewPagerId, int fragmentPosition)
    {
        return "android:switcher:" + viewPagerId + ":" + fragmentPosition;
    }

}

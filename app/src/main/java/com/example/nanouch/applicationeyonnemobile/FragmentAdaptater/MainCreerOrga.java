package com.example.nanouch.applicationeyonnemobile.FragmentAdaptater;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.nanouch.applicationeyonnemobile.OrganisationFragment.Creer.AutrePersonnelFragment;
import com.example.nanouch.applicationeyonnemobile.OrganisationFragment.Creer.GeneralFragment;
import com.example.nanouch.applicationeyonnemobile.OrganisationFragment.Creer.ResponsablesFragment;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Creer.CoordonneeFragment;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Creer.IdentiteFragment;
import com.example.nanouch.applicationeyonnemobile.PersonnelFragment.Creer.PhotoFragment;
import com.example.nanouch.applicationeyonnemobile.R;

import java.util.ArrayList;
import java.util.List;

public class MainCreerOrga extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_creer_orga);
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
        adapter.addFragment(new GeneralFragment(), "Général");
        adapter.addFragment(new ResponsablesFragment(), "Responsables");
        adapter.addFragment(new AutrePersonnelFragment(), "Autre Personnel");
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
                    GeneralFragment generalFragment = new GeneralFragment();
                    return generalFragment;
                case 1:
                    ResponsablesFragment responsablesFragment = new ResponsablesFragment();
                    return responsablesFragment;

                case  2:
                    AutrePersonnelFragment autrePersonnelFragment = new AutrePersonnelFragment();
                    return autrePersonnelFragment;

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

}

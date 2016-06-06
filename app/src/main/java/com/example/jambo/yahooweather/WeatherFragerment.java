package com.example.jambo.yahooweather;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jambo on 2016/6/6.
 */
public class WeatherFragerment extends Fragment implements NavigationView.OnNavigationItemSelectedListener{

    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.show_weather_fragment,container,false);
        initView(view);
        return view;
    }


    public void initView(View view){

        mToolbar = (Toolbar) view.findViewById(R.id.bar);
        mDrawerLayout = (DrawerLayout) view.findViewById(R.id.drawer_layout);
        mNavigationView = (NavigationView) view.findViewById(R.id.navigation_view);


        ActionBarDrawerToggle mActionBar = new ActionBarDrawerToggle(getActivity(),mDrawerLayout,mToolbar,R.string.open,R.string.close);
        mDrawerLayout.setDrawerListener(mActionBar);
        mActionBar.syncState();

    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.city_manager:

                break;
        }



        return false;
    }
}

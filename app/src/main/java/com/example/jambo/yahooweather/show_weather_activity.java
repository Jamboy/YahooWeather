package com.example.jambo.yahooweather;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class show_weather_activity extends AppCompatActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_weather_activity);
        initView();
        WeatherAdapter adapter = new WeatherAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);

    }


    private void initView(){
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
    }



    class WeatherAdapter extends FragmentPagerAdapter{
        public WeatherAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {
            return new WeatherFragerment();
        }

        @Override
        public int getCount() {
            return 3;
        }
    }


}

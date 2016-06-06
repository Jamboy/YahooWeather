package com.example.jambo.yahooweather;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jambo on 2016/6/6.
 */
public class AddCityActivity extends Activity implements View.OnClickListener{

    private Button mAddCityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_city_activity);
        mAddCityButton = (Button) findViewById(R.id.add_city_button);
        mAddCityButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.add_city_button:
//                添加View操作 或间接的发出消息添加View
                break;
        }
    }
}

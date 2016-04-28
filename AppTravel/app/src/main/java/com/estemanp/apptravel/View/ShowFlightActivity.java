package com.estemanp.apptravel.View;

import android.app.Activity;
import android.os.Bundle;

import com.estemanp.apptravel.R;

import butterknife.ButterKnife;

/**
 * Created by estemanp on 27/04/16.
 */
public class ShowFlightActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_flight);
        ButterKnife.bind(this);
    }
}

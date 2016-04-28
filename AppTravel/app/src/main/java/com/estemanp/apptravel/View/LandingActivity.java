package com.estemanp.apptravel.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.estemanp.apptravel.R;

import butterknife.ButterKnife;

/**
 * Created by estemanp on 27/04/16.
 */
public class LandingActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        ButterKnife.bind(this);
    }

    public void consult(View view) {
        Intent intent = new Intent(this, ConsultFlightActivity.class);
        startActivity(intent);
    }

    public void reservation(View view) {
        Intent intent = new Intent(this, ReservationFlightActivity.class);
        startActivity(intent);
    }

    public void consultByState(View view) {
        /*Intent intent = new Intent(this, DetailReservationActivity.class);
        startActivity(intent);*/
    }
}

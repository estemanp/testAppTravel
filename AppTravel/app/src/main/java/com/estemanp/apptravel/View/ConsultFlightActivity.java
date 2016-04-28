package com.estemanp.apptravel.View;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.estemanp.apptravel.Controller.AppController;
import com.estemanp.apptravel.R;

import butterknife.ButterKnife;

/**
 * Created by estemanp on 27/04/16.
 */
public class ConsultFlightActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult_flight);
        ButterKnife.bind(this);

        Spinner spinnerOrigen = (Spinner) findViewById(R.id.spinnerCityOrigin);
        Spinner spinnerDestino = (Spinner) findViewById(R.id.spinnerCityDestination);
        ArrayAdapter spinner_adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, AppController.getInstance().getCities());
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOrigen.setAdapter(spinner_adapter);
        spinnerDestino.setAdapter(spinner_adapter);
    }
}

package com.estemanp.apptravel.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.estemanp.apptravel.Controller.AppController;
import com.estemanp.apptravel.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by estemanp on 26/04/16.
 */
public class LoginActivity extends Activity {

    //@BindView(R.id.editUsername)
    EditText userName;
    //@BindView(R.id.editPassword)
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        userName=(android.widget.EditText) this.findViewById(R.id.editUsername);
        password=(android.widget.EditText) this.findViewById(R.id.editPassword);
    }

    public void login(View view) {
        if(AppController.getInstance().isValidUser(userName.getText().toString(),password.getText().toString())){
            Intent intent = new Intent(this, LandingActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "El usuario y contraseña no coinciden", Toast.LENGTH_SHORT).show();
        }
    }
}

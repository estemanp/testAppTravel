package com.estemanp.apptravel.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.estemanp.apptravel.Controller.AppController;
import com.estemanp.apptravel.Domain.Person;
import com.estemanp.apptravel.R;

/**
 * Created by estemanp on 26/04/16.
 */
public class AddPersonActivity extends Activity {

    EditText name;
    EditText lastName;
    EditText userName;
    EditText password;
    EditText age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);
        name=(android.widget.EditText) this.findViewById(R.id.editName);
        lastName=(android.widget.EditText) this.findViewById(R.id.editLastName);
        userName=(android.widget.EditText) this.findViewById(R.id.editUsername);
        password=(android.widget.EditText) this.findViewById(R.id.editPassword);
        age=(android.widget.EditText) this.findViewById(R.id.editAge);
    }

    public void addPerson(View view) {
        String auxName=name.getText().toString();
        String auxLastName=lastName.getText().toString();
        String auxUseName=userName.getText().toString();
        String auxPassword=password.getText().toString();
        int auxAge=Integer.parseInt(age.getText().toString());

        Person person=new Person(auxName,auxLastName,auxUseName,auxPassword,auxAge);
        if(AppController.getInstance().addPerson(person)){
            Toast.makeText(this, "Se agrego satisfactoriamente", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "No se pudo agregar el usuario, ya Existe!", Toast.LENGTH_SHORT).show();
        }

    }

}

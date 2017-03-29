package com.abinbev.android.tutorialdagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.abinbev.android.tutorialdagger2.infraestructure.MyApplication;
import com.abinbev.android.tutorialdagger2.model.PerfilFree;
import com.abinbev.android.tutorialdagger2.model.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject User user;
    @Inject PerfilFree perfilFree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApplication.getDIManager().inject(this);

        Toast.makeText(this, String.valueOf(user.getPerfil().getName()), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, String.valueOf(perfilFree.getName()), Toast.LENGTH_SHORT).show();
    }
}

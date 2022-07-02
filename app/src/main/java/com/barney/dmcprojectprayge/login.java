package com.barney.dmcprojectprayge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton btnlogin = (MaterialButton) findViewById(R.id.loginbtn);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    if (username.getText().toString().equals("admin") && password.getText().toString().equals("")){
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }else{
                            throw new Exception();
                    }

                }catch (Exception e){
                    Toast.makeText(login.this, "Username atau Password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    static boolean Check(String username, String password){
        if (username == "admin" && password == "password"){
            return true;
        }
        return false;
    }
}
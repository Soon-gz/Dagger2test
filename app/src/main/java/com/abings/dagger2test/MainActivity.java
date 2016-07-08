package com.abings.dagger2test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
    }

    public void login(View view){
        User user = new User();
        user.setName(username.getText().toString());
        user.setAvatar(pass.getText().toString());
        App.get(MainActivity.this).createUserComponent(user);
        startActivity(new Intent(this,AActivity.class));
    }
}

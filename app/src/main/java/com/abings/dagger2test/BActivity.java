package com.abings.dagger2test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

public class BActivity extends AppCompatActivity {

    @Inject
    User user;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        App.get(this).getUserComponent().plus(new BMoudel()).inject(this);
        textView = (TextView) findViewById(R.id.text);
        textView.setText(user.getName()+user.getAvatar()+user.toString());
    }

    public void toC(View view){
        startActivity(new Intent(this, CActivity.class));
    }
}

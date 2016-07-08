package com.abings.dagger2test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

public class AActivity extends AppCompatActivity {

    @Inject
    User user;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        textView = (TextView) findViewById(R.id.text);
        App.get(this).getUserComponent().plus(new AMoudel()).inject(this);
        textView.setText(user.getName()+user.getAvatar()+user.toString());
    }

    public void toB(View view){
        startActivity(new Intent(this,BActivity.class));
    }

}

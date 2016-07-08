package com.abings.dagger2test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

public class CActivity extends AppCompatActivity {

    @Inject
    User user;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        App.get(this).getUserComponent().plus(new CMoudel()).inject(this);
        textView = (TextView) findViewById(R.id.text);
        textView.setText(user.getName() + user.getAvatar()+user.toString());
    }
    public void release(View view){
        App.get(this).releaseUserComponent();
        startActivity(new Intent(CActivity.this, MainActivity.class));
        finish();
    }
}

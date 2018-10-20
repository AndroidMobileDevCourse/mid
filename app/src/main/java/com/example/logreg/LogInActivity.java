package com.example.loginaigulk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        LogInFragment login = new LogInFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.loginContainer, login).commit();
    }
}

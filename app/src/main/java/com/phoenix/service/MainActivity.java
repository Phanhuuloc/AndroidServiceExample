package com.phoenix.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.phoenix.service.bindservice.BindServiceActivity;
import com.phoenix.service.startsevice.DelayedMessageService;
import com.phoenix.service.startsevice.StartServiceActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.start_service: {
                Intent intent = new Intent(this, StartServiceActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.bind_service: {
                Intent intent = new Intent(this, BindServiceActivity.class);
                startActivity(intent);
                break;
            }
            default:
                break;
        }
    }
}

package com.example.chap3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(Intent.EXTRA_TEXT);
        TextView tv = findViewById(R.id.message1);
        tv.setText(messageText);
    }

    public void clickButton(View view) {

        onBackPressed();
    }
}

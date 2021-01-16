package com.example.android13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Button btnSendResult;
    public static final String RESULT_KEY = "resultKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        if (intent != null) {
            String text = intent.getStringExtra(MainActivity.INTENT_KEY);
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();

            setupUI();
        }
    }

    private void setupUI() {
        btnSendResult = findViewById(R.id.btnSendResult);
        btnSendResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(RESULT_KEY, "Hello from SecondActivity"); 
                setResult(RESULT_OK, intent);
                finish();
             }
        });
    }
}
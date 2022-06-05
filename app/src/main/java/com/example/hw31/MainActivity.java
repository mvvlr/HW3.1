package com.example.hw31;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.Intent;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private Button button;
private EditText gmail;
private EditText theme;
private EditText message;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.main_btn);
        gmail = findViewById(R.id.btn1);
        theme = findViewById(R.id.btn2);
        message = findViewById(R.id.btn3);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", gmail.getText().toString(), null));
            intent.putExtra(Intent.EXTRA_EMAIL, gmail.getText().toString());
            intent.putExtra(Intent.EXTRA_SUBJECT, theme.getText().toString());
            intent.putExtra(Intent.EXTRA_TEXT, message.getText().toString());
            startActivity(Intent.createChooser(intent, "send"));

        }
    });


    }


    }





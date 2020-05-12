package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecActivity extends AppCompatActivity {

    private Button Button;
    private EditText TextName;
    private EditText TextComment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Button = (Button) findViewById(R.id.button);
        TextName = (EditText) findViewById(R.id.TextName);
        TextComment = (EditText) findViewById(R.id.TextComment);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String X=TextName.getText().toString() ;
                String Y=TextComment.getText().toString() ;

                Intent returnIntent = new Intent();
                returnIntent.putExtra("TextName",X);
                returnIntent.putExtra("TextComment",Y);
                setResult(RESULT_OK,returnIntent);
                finish();
            }
        });
    }
        }

package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Move to the 1st activity
    public void moveTofrstAct(View V){

        Intent i = new Intent(getApplicationContext(),FirstActivity.class);
        startActivityForResult(i,1); // 1: an arbitrary value
    }
    //Move to the 2nd activity
    public void moveToSecAct(View V){

        Intent i = new Intent(getApplicationContext(),SecActivity.class);
        startActivityForResult(i,2); // 2: an arbitrary value
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        // output a toast notification showing what the order made by the user is
        if(resultCode == RESULT_OK && requestCode == 1){

            String order = "Order is: " + data.getStringExtra("coffee_Type") + data.getStringExtra("addTo_Coffee");
            Toast.makeText(
                    getApplicationContext(), // Context
                    order, // Message
                    Toast.LENGTH_SHORT // Short Duration
            ).show();
        }
        // HW: output a toast notification which shows the assessment levels
        // of the user's satisfaction
        else if(resultCode == RESULT_OK && requestCode == 2){

            //To be done as a part of the homework
            String order = "Thank you "+data.getStringExtra("TextName") + " For your comment ... " ;
            Toast.makeText(
                    getApplicationContext(), order, Toast.LENGTH_LONG )
                    .show();
        } }}

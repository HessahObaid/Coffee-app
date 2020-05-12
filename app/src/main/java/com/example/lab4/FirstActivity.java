package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
public class FirstActivity extends AppCompatActivity {

    private String coffeeType;
    private String addToCoffee;
    private CheckBox cre;
    private CheckBox sug;
    private Button btnOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    cre = (CheckBox) findViewById(R.id.creamChkBox);
    sug = (CheckBox) findViewById(R.id.sugarChkBox);
    btnOrder = (Button) findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            addToCoffee ="";
            if(cre.isChecked())
                addToCoffee = "....Cream added";

            if(sug.isChecked())
                addToCoffee += "....Sugar added";

            //returns a result in an Intent to the caller activity, Main Activity.
            //We can pass all sorts of information along with an Intent this way,
            // which is available in the target Activity that handles the Intent.
            Intent returnIntent = new Intent();
            returnIntent.putExtra("coffee_Type",coffeeType);
            returnIntent.putExtra("addTo_Coffee",addToCoffee);
            setResult(RESULT_OK,returnIntent);
            finish();
        }}); }
    public void selectCoffee(View V){
        switch(V.getId()){
            case R.id.radioDecaf:
                coffeeType = "Decaf";
                break;

            case R.id.radioExpresso:
                coffeeType = "Expressor";
                break;

            case R.id.radioColombian:
                coffeeType = "Colombian";
                break;
        } }}
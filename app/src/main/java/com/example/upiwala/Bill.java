package com.example.upiwala;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Bill extends AppCompatActivity {
    double total_price=89.78;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

    }
    public void pay(View view){   //this will be triggered when button is clicked
        Intent myIntent = new Intent(getApplicationContext(),UPI.class);
        //ADD the data into bundle and send

        Bundle bundle = new Bundle();  //create a bundle and send it to activity called upi class.
        bundle.putString("stuffs", Double.toString(total_price));
        myIntent.putExtras(bundle);
        startActivity(myIntent);      //for more details refer stackoverflow how to send data from one activity to other

    }


}
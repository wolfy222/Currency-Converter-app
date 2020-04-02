package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertCurrency(View view)
    {
        EditText editText= (EditText)findViewById(R.id.editText);
        String amountInDollar =editText.getText().toString();
        double amountDouble=Double.parseDouble(amountInDollar);
        double amountInRupees = amountDouble*76.06;
        String ans= String.format("%.2f",amountInRupees);  //Double.toString(amountInRupees);
        Toast.makeText(this, amountInDollar+"$ is "+ans+" Rupees.", Toast.LENGTH_LONG).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

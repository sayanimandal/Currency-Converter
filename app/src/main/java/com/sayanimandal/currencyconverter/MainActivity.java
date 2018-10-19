package com.sayanimandal.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.convertButton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText amount = (EditText) findViewById(R.id.amountDollarText);
                try {
                    Double amountNumber = Double.parseDouble(amount.getText().toString()) * 68.8;
                    //int amountNumber = Integer.parseInt(amount.getText().toString()) * 68.8;
                    Toast.makeText(MainActivity.this,
                            "Amount in RS : " + String.format("%.2f",amountNumber),
                            Toast.LENGTH_LONG).show();
                } catch (NumberFormatException nfe){
                    Log.i("Info","Conversion Error");
                }
            }
        });
    }
}

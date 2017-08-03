package com.kaleshsingh.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertDollarsToPounds(View view){

        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmountEditText);

        Double dollarAmount = Double.parseDouble(dollarAmountEditText.getText().toString());

        // NOTE 1 USD = 0.77 Pounds (British)
        Double poundAmount = dollarAmount * 0.77;

        Toast.makeText(this, "\u00A3"+ String.format("%.2f", poundAmount),
                Toast.LENGTH_LONG).show();

        Log.i("amount", dollarAmountEditText.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

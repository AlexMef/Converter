package com.niko.converter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Main extends Activity implements View.OnClickListener {


    RadioGroup convertFrom;
    RadioGroup convertTo;
    int rBtnConvertFrom = 0;
    int rBtnConvertTo = 0;
    Button btnConvert;
    EditText edText;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convertFrom = findViewById(R.id.radioConvertFrom);
        convertFrom.setOnCheckedChangeListener(listenerFrom);
        convertTo = findViewById(R.id.radioConvertTo);
        convertTo.setOnCheckedChangeListener(listenerTo);
        btnConvert = findViewById(R.id.convert);
        btnConvert.setOnClickListener(this);
        edText = findViewById(R.id.edText);
        result = findViewById(R.id.result);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.convert:
                double value = Double.parseDouble(edText.getText().toString());
                Converter converter = new Converter(rBtnConvertFrom, rBtnConvertTo, value);
                result.setText(String.format(Locale.getDefault(), "%.2f", converter.convert()));
                break;
        }
    }


    private RadioGroup.OnCheckedChangeListener listenerFrom = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch (i) {
                case R.id.rBtnFromEUR:
                    radioGroup.check(R.id.rBtnFromEUR);
                    break;
                case R.id.rBtnFromUSD:
                    radioGroup.check(R.id.rBtnFromUSD);
                    break;
                case R.id.rBtnFromUAH:
                    radioGroup.check(R.id.rBtnFromUAH);
                    break;
                case R.id.rBtnFromRUB:
                    radioGroup.check(R.id.rBtnFromRUB);
                    break;
            }
            rBtnConvertFrom = i;
        }
    };

    private RadioGroup.OnCheckedChangeListener listenerTo = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch (i) {
                case R.id.rBtnToEUR:
                    radioGroup.check(R.id.rBtnToEUR);
                    break;
                case R.id.rBtnToUSD:
                    radioGroup.check(R.id.rBtnToUSD);
                    break;
                case R.id.rBtnToUAH:
                    radioGroup.check(R.id.rBtnToUAH);
                    break;
                case R.id.rBtnToRUB:
                    radioGroup.check(R.id.rBtnToRUB);
                    break;
            }
            rBtnConvertTo = i;
        }
    };
}

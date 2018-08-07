package com.niko.converter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main extends Activity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {


    RadioGroup convertFrom;
    RadioGroup convertTo;
    int rBtnConvertFrom;
    int rBtnConvertTo;
    Button btnConvert;
    EditText edText;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convertFrom = findViewById(R.id.radioConvertFrom);
        convertTo = findViewById(R.id.radioConvertTo);
        btnConvert = findViewById(R.id.convert);
        btnConvert.setOnClickListener(this);
        edText = findViewById(R.id.edText);
        result = findViewById(R.id.result);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.convert:
                double value = Double.parseDouble(edText.getText().toString());
                Converter converter = new Converter(rBtnConvertFrom, rBtnConvertTo, value);
                result.setText(Double.toString(converter.convert()));
                break;
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        rBtnConvertFrom = convertFrom.getCheckedRadioButtonId();
        rBtnConvertTo = convertFrom.getCheckedRadioButtonId();
    }
}

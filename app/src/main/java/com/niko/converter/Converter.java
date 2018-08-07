package com.niko.converter;

import android.widget.EditText;
import android.widget.Toast;

public class Converter {
    private int rBtnConvertFrom;
    private int rBtnConvertTo;
    private double value;

    public Converter(int rBtnConvertFrom, int rBtnConvertTo, double value) {
        this.rBtnConvertFrom = rBtnConvertFrom;
        this.rBtnConvertTo = rBtnConvertTo;
        this.value = value;
    }

    public double convert(){
        double value = 5;
        if (this.rBtnConvertFrom == R.id.rBtnFromEUR && this.rBtnConvertTo == R.id.rBtnToEUR) {
            value = fromEURtoEUR();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromEUR && this.rBtnConvertTo == R.id.rBtnToUSD) {
            value = fromEURtoUSD();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromEUR && this.rBtnConvertTo == R.id.rBtnToUAH) {
            value = fromEURtoUAH();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromEUR && this.rBtnConvertTo == R.id.rBtnToRUB) {
            value = fromEURtoRUB();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromUSD && this.rBtnConvertTo == R.id.rBtnToEUR) {
            value = fromUSDtoEUR();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromUSD && this.rBtnConvertTo == R.id.rBtnToUSD) {
            value = fromUSDtoUSD();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromUSD && this.rBtnConvertTo == R.id.rBtnToUAH) {
            value = fromUSDtoUAH();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromUSD && this.rBtnConvertTo == R.id.rBtnToRUB) {
            value = fromUSDtoRUB();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromUAH && this.rBtnConvertTo == R.id.rBtnToEUR) {
            value = fromUAHtoEUR();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromUAH && this.rBtnConvertTo == R.id.rBtnToUSD) {
            value = fromUAHtoUSD();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromUAH && this.rBtnConvertTo == R.id.rBtnToUAH) {
            value = fromUAHtoUAH();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromUAH && this.rBtnConvertTo == R.id.rBtnToRUB) {
            value = fromUAHtoRUB();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromRUB && this.rBtnConvertTo == R.id.rBtnToEUR) {
            value = fromRUBtoEUR();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromRUB && this.rBtnConvertTo == R.id.rBtnToUSD) {
            value = fromRUBtoUSD();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromRUB && this.rBtnConvertTo == R.id.rBtnToUAH) {
            value = fromRUBtoUAH();
        } else if (this.rBtnConvertFrom == R.id.rBtnFromRUB && this.rBtnConvertTo == R.id.rBtnToRUB) {
            value = fromRUBtoRUB();
        }

        return value;
    }

    public double fromEURtoEUR() {
        return value;
    }

    public double fromEURtoUSD() {
        return value*1.16;
    }

    public double fromEURtoUAH() {
        return value*31.33;
    }

    public double fromEURtoRUB() {
        return value*73.64;
    }

    public double fromUSDtoEUR() {
        return value*0.86;
    }

    public double fromUSDtoUSD() {
        return value;
    }

    public double fromUSDtoUAH() {
        return value*27.02;
    }

    public double fromUSDtoRUB() {
        return value*63.05;
    }

    public double fromUAHtoEUR() {
        return value*0.032;
    }

    public double fromUAHtoUSD() {
        return value*0.037;
    }

    public double fromUAHtoUAH() {
        return value;
    }

    public double fromUAHtoRUB() {
        return value*2.35;
    }

    public double fromRUBtoEUR() {
        return value*0.014;
    }

    public double fromRUBtoUSD() {
        return value*0.016;
    }

    public double fromRUBtoUAH() {
        return value*0.43;
    }

    public double fromRUBtoRUB() {
        return value;
    }




}

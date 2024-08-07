package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText angka_pertama,angka_kedua;
        Button tambah,kurang,bagi,kali,bersih;
        TextView valueHasil;

        angka_pertama = (EditText) findViewById(R.id.angkapertama);
        angka_kedua = (EditText) findViewById(R.id.angkakedua);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);
        bersih = (Button) findViewById(R.id.btnBersih);
        valueHasil = (TextView) findViewById(R.id.valueHasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(angka_pertama.getText().length()>0&&angka_kedua.getText().length()>0){
                    double angka1,angka2,result;
                    angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    result = angka1+angka2;
                    valueHasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this,"Mohon masukkan angka pertama dan kedua",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(angka_pertama.getText().length()>0&&angka_kedua.getText().length()>0){
                    double angka1,angka2,result;
                    angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    result = angka1-angka2;
                    valueHasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this,"Mohon masukkan angka pertama dan kedua",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });


        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(angka_pertama.getText().length()>0&&angka_kedua.getText().length()>0){
                    double angka1,angka2,result;
                    angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    result = angka1*angka2;
                    valueHasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this,"Mohon masukkan angka pertama dan kedua",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });


        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(angka_pertama.getText().length()>0&&angka_kedua.getText().length()>0){
                    double angka1,angka2,result;
                    angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    result = angka1/angka2;
                    valueHasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this,"Mohon masukkan angka pertama dan kedua",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        bersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_pertama.setText("");
                angka_kedua.setText("");
                valueHasil.setText("0");
                angka_pertama.requestFocus();
            }
        });
    }
}
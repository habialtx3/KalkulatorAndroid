package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText angka_pertama,angka_kedua;
        Button tambah,kurang,bagi,kali;
        TextView valueHasil;

        angka_pertama = (EditText) findViewById(R.id.angkapertama);
        angka_kedua = (EditText) findViewById(R.id.angkakedua);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);

    }
}
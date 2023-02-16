package com.example.dns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Thread;

public class Glavnaya extends AppCompatActivity {

    int for_one_click = 7;
    int balance = 0;
    TextView bal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glavnaya);
    }

    public void Click(View view){
        bal = findViewById(R.id.balance);
        balance += for_one_click;
        Output_balance();
    }
    public void Output_balance(){
        bal = findViewById(R.id.balance);
        bal.setText("Ваш баланс: " + balance +"$");
    }
}
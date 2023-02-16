package com.example.dns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    User user = new User("12","12");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      

    }
    public void Sign_up(View view){
        EditText username = findViewById(R.id.username_edit_text);
        EditText password = findViewById(R.id.password_edit_text);
        Intent intent = new Intent(this,Glavnaya.class);
        String userName = username.getText().toString();
        String passWord = password.getText().toString();


        if(userName.equals(user.getUsername()) && passWord.equals(user.getPassword()) ){
            startActivity(intent);
        }
        else{
            Toast toast = Toast.makeText(this,"WRONG USERNAME OR PASSWORD !!!",Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}
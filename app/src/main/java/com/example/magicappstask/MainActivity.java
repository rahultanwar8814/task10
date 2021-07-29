package com.example.magicappstask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button savebt;
    EditText username1,userpass;
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        String text = sharedPreferences.getString(TEXT, "");
        if(text.isEmpty()){

        }else {
            Intent intent=new Intent(MainActivity.this,welcome.class);
            startActivity(intent);
        }



        savebt=(Button)findViewById(R.id.save);


        username1=(EditText)findViewById(R.id.username);
        userpass=(EditText)findViewById(R.id.pass);


        savebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int y=1;
                cheak();

                if(y==cheak()){

                    SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();

                    editor.putString(TEXT, username1.getText().toString());
                    editor.apply();
                    Intent intent=new Intent(MainActivity.this,welcome.class);
                    startActivity(intent);

                }






            }
        });









    }

    public int cheak(){
        int x=1;
        String username,pass;
        username=username1.getText().toString().trim();
        pass=userpass.getText().toString().trim();

        if(username.isEmpty()){
            username1.setError("It can't be Empty");
            username1.requestFocus();
            x=0;

        }else if(pass.isEmpty()){
            userpass.setError("It can't be Empty");
            userpass.requestFocus();
            x=0;

        }
        return x;



    }

}
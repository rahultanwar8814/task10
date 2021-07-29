package com.example.magicappstask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class welcome extends AppCompatActivity {
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";
    TextView tt1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        tt1=(TextView)findViewById(R.id.userget);



        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.lay,new firstfragment());
        fragmentTransaction.commit();




    }
    @Override
    public void onBackPressed() { }

}
package com.example.magicappstask;


import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;


public class firstfragment extends Fragment {
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";
    //private Context mContext;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.fragment_firstfragment,container,false);
        //this.mContext = context;


        Button bt1=(Button)view.findViewById(R.id.secfrag);
        TextView tt1;
        SharedPreferences sharedPreferences =this.getContext().getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        String text = sharedPreferences.getString(TEXT, "");


        tt1=(TextView)view.findViewById(R.id.userget);
        tt1.setText("Welcome "+text);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.lay,new mytaskfragment());
                fr.commit();
            }
        });
         return view;
    }
}
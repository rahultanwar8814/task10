package com.example.magicappstask;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Arrays;


public class mytaskfragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_mytaskfragment,container,false);
        RecyclerView recyclerView;
        recyclerView=(RecyclerView)view.findViewById(R.id.rylview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ImageButton bt1=(ImageButton)view.findViewById(R.id.imageButton);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.lay,new firstfragment());
                fr.commit();
            }
        });

         String imageurl[]={"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7HRe1t4hy4NZQgflXSYs5ucrjNrOEA-JVhw&usqp=CAU",
         "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAdfpdxU6Qkxrczy4GJQY2vdDC12yzqaKU0g&usqp=CAU",
         "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTXBSZnm7vxzggBFcci9F4HM9vHbDe1mpl6A&usqp=CAU",
         "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3j-t1Ucm6QbX2nGwXirDPXTw0n6cza2iu3A&usqp=CAU",
         "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSw8_TWxeHBvh7xlY5jv4EG9KcIArgKIKKgcA&usqp=CAU",
         "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTLu9PRnyiOHrxI10o0AZx3RN7ubIfIMjsl4w&usqp=CAU",
         "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQp7YPVBFha2T6MWCTyTr5vql7UEQu4a32Nyg&usqp=CAU",
         "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSibmmagpLz48kcifCgGEQaRgn80wJsQ0FCzg&usqp=CAU",
         "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8us7Dnj-boKsrCJ1B9xA2K3liHuM6Nu3-LQ&usqp=CAU",
         "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQESxlZ_YtXiLT3ZXI5XmIeh41nTyqxRSbcVA&usqp=CAU"};
        String[] arrayfromxml=getResources().getStringArray(R.array.taskname);

        recyclerView.setAdapter(new Recylerviewadaptor(this.getContext(),arrayfromxml,imageurl));







        return view;
    }


}
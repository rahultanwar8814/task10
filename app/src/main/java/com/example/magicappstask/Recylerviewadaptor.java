package com.example.magicappstask;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class Recylerviewadaptor extends RecyclerView.Adapter{
    private String[] taskn;
    private String[] imgl;
    Context mcontext;

    public Recylerviewadaptor(Context mcontext,String[] taskn, String[] imgl) {
        this.mcontext=mcontext;
        this.taskn = taskn;
        this.imgl = imgl;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.card1,parent,false);

        return new ProgramingViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final Recylerviewadaptor.ProgramingViewHolder card11=(Recylerviewadaptor.ProgramingViewHolder)holder;
        Picasso.get().load(imgl[position]).into(card11.image);
        card11.likee.setText(taskn[position]);
        card11.lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(mcontext);
                builder.setTitle("Welcome Magicapps").setMessage("TaskName:- "+taskn[position]).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                }).show();

            }
        });


    }

    @Override
    public int getItemCount() {
        return 10;
    }
    public static void opendialog(){

        
    }
    public static class ProgramingViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView likee;
        LinearLayout lc;
        public ProgramingViewHolder(@NonNull View itemView) {

            super(itemView);
            image=(ImageView)itemView.findViewById(R.id.urlimage);
            lc=(LinearLayout)itemView.findViewById(R.id.linearlayout);

            likee=(TextView)itemView.findViewById(R.id.taskname);




        }
    }
}

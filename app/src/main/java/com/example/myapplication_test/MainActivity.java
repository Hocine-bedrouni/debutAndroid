package com.example.myapplication_test;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
////        Ressources res = getResources();
////        String hw = res.getString(R.string.hello);
//        String machin = "niktamer";
////        AlertDialog.Builder builder = new AlertDialog.Builder(this);
////        builder.setTitle(R.string.hello);
////        builder.setTitle(R.string.bite);
////        builder.setTitle(R.string.hello);
////        Ressources ress = getResources();
//        String machine = getResources().getString(R.string.hello);
        Button biteuhn = findViewById(R.id.biteuhn);
        biteuhn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(R.string.bite)
                        .setMessage(R.string.hello)
                        .setPositiveButton(R.string.ok, ((dialogInterface, i) -> {
                dialogInterface.dismiss();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                }))
                        .show();
            }
        });
    }

//    public void bite()
//    {
//        AlertDialog.Builder nomdetonalerte = new AlertDialog.Builder(CONTEXTE.this);// nomdetaclasseoutes.this
//        nomdetonalerte.setTitle().setMessage().setPositiveButton(nomdetonbouton,(dialogInterface,i)->{code a executer}).setCancelable().show();
//    }


}
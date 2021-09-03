package com.example.myapplication_test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

   private TextView result;
   private EditText edd;
   private Button btnn;
   private ImageView digit;
   private ImageView applelogo;
   private TextView pol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



    result = findViewById(R.id.result);
    edd = findViewById(R.id.edd);
    btnn = findViewById(R.id.btnn);
    digit = findViewById(R.id.digit);
    applelogo = findViewById(R.id.applelogo);
    pol = findViewById(R.id.pol);

    digit.setVisibility(View.INVISIBLE);
    applelogo.setVisibility(View.INVISIBLE);
    pol.setVisibility(View.INVISIBLE);

    btnn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       AlertDialog.Builder alertt = new AlertDialog.Builder(MainActivity2.this);// nomdetaclasseoutes.this
               alertt.setTitle("Comment va")
                       .setMessage("Comment ca marche")
                       .setPositiveButton("non me click pas",(dialogInterface,i)->{dialogInterface.dismiss();
                       applelogo.setVisibility(View.VISIBLE);
                       pol.setVisibility(View.VISIBLE);})
                       .setNegativeButton("enfonce moi", (dialogInterface, i)->{dialogInterface.dismiss();
                           AlertDialog.Builder al2 = new AlertDialog.Builder(MainActivity2.this);// nomdetaclasseoutes.this
                           ImageView ima = new ImageView(MainActivity2.this);
//                            ima = ima.findViewById(R.id.digit);
                           ima.setImageResource(R.drawable.applelogo);
                           al2.setView(ima);
                           al2.setNeutralButton("click-me", new DialogInterface.OnClickListener() {
                               @Override
                               public void onClick(DialogInterface dialogInterface, int i) {

                               }
                           });  al2.show();
                           digit.setVisibility(View.VISIBLE);

//        if (v == btn) {
//            result.setText(edd.getText());
//        }
    }).show();

    }
    });}}
package com.example.karaens.paythepiper;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainPay extends AppCompatActivity {


    int amt1,amt2=0;
    TextView due_amount,amount_paid;
    Button buttonOne,buttonTwo,buttonFive,buttonTen,buttonReset;
    LinearLayout bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pay);
        due_amount = findViewById(R.id.due_amount);
        amount_paid = findViewById(R.id.amount_paid);
        buttonOne=findViewById(R.id.button_one);
        buttonTwo=findViewById(R.id.button_two);
        buttonFive=findViewById(R.id.button_five);
        buttonTen=findViewById(R.id.button_ten);
        buttonReset=findViewById(R.id.button_reset);
        bg=findViewById(R.id.background);
        Random random = new Random();
        amt1 = random.nextInt(500) + 1;
        due_amount.setText(String.valueOf(amt1));
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               amt2+=1;
               amount_paid.setText(String.valueOf(amt2));
               if(amt1==amt2)
                   bg.setBackgroundResource(R.drawable.green_diamonds_detail);
               else
                   bg.setBackgroundResource(R.drawable.red_diamond_detail);
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amt2+=2;
                amount_paid.setText(String.valueOf(amt2));
                if(amt1==amt2)
                    bg.setBackgroundResource(R.drawable.green_diamonds_detail);
                else
                    bg.setBackgroundResource(R.drawable.red_diamond_detail);
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amt2+=5;
                amount_paid.setText(String.valueOf(amt2));
                if(amt1==amt2)
                    bg.setBackgroundResource(R.drawable.green_diamonds_detail);
                else
                    bg.setBackgroundResource(R.drawable.red_diamond_detail);
            }
        });
        buttonTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amt2+=10;
                amount_paid.setText(String.valueOf(amt2));
                if(amt1==amt2)
                    bg.setBackgroundResource(R.drawable.green_diamonds_detail);
                else
                    bg.setBackgroundResource(R.drawable.red_diamond_detail);
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amt2=0;
                amount_paid.setText(String.valueOf(amt2));
                if(amt1==amt2)
                    bg.setBackgroundResource(R.drawable.green_diamonds_detail);
                else
                    bg.setBackgroundResource(R.drawable.red_diamond_detail);
            }
        });

    }

}

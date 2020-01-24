package com.example.kresticnolic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textPlayer;
    private TextView textFinish;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private int count = 2;
    private String sostoynie = "X";
    public String[] mas = new String[9];
    Validaciy validaciy = new Validaciy();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textPlayer = findViewById(R.id.textPlayer);
        textFinish = findViewById(R.id.textFinish);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        for (int i = 0; i < mas.length; i++) {
                mas[i] = "1";

        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                functionOnClick(0, button1);
                break;
            case R.id.button2:
                functionOnClick(1, button2);
                break;
            case R.id.button3:
                functionOnClick(2, button3);
                break;
            case R.id.button4:
                functionOnClick(3, button4);
                break;
            case R.id.button5:
                functionOnClick(4, button5);
                break;
            case R.id.button6:
                functionOnClick(5, button6);
                break;
            case R.id.button7:
                functionOnClick(6, button7);
                break;
            case R.id.button8:
                functionOnClick(7, button8);
                break;
            case R.id.button9:
                functionOnClick(8, button9);
                break;
        }
    }

    private void functionOnClick(int index, Button button) {
        button.setText(returnXandO());
        textName(sostoynie);
        mas[index] = sostoynie;
        textFinish.setText(validaciy.valid(mas));
        button.setClickable(false);
    }

    private String returnXandO(){
        if (count % 2 == 0){
            count++;
            sostoynie = "X";
            return sostoynie;
        } else {
            count++;
            sostoynie = "O";
            return sostoynie;
        }
    }

    private void textName(String file){
        if (file.equals("X")){
            textPlayer.setText(R.string.playerO);
        } else {
            textPlayer.setText(R.string.playerX);
        }
    }
}

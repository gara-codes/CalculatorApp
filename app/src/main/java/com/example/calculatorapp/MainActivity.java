package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);


            return insets;


        });
        ;
        //call method to set up on click listeners
        setUpListeners();
    }

    ArrayList<String>numbers = new ArrayList<>();
    //array to store numbers and operators
    String currNumber = "";

    boolean flag = false;
    //used to check if there is already a number on the screen
    int equalPressCount = 0;
    double currTotal = 0;

    //method to set up on click listeners for buttons
    private void setUpListeners(){
        TextView t = (TextView) findViewById(R.id.display);

        Button btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if the number on the screen is currently a running total to be used in a following calculation and an operator is clicked, continue running the total
                if(flag && (numbers.contains("+") || numbers.contains("-") || numbers.contains("x") || numbers.contains("÷"))){
                    t.setText(t.getText()+"0");
                    currNumber+="0";


                    //if number on screen wont be used in next calculation, button press should clear screen and start new running total
                }else if(flag){
                    t.setText("");
                    flag = false;

                }else {
                    //if there are numbers and operators on the screen already, add this digit to calculation by setting it as the current number.
                    t.setText(t.getText() + "0");
                    currNumber += "0";
                }
            }
        });
        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t.getText().toString();
                if(flag && (numbers.contains("+") || numbers.contains("-") || numbers.contains("x") || numbers.contains("÷"))){
                    t.setText(t.getText()+"1");
                    currNumber+="1";


                }else if(flag){
                    t.setText("");
                    flag = false;
                }else {
                    t.setText(t.getText() + "1");
                    currNumber += "1";
                }
            }
        });
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t.getText().toString();
                if(flag && (numbers.contains("+") || numbers.contains("-") || numbers.contains("x") || numbers.contains("÷"))){
                    t.setText(t.getText()+"2");
                    currNumber+="2";


                }else if(flag){
                    t.setText("");
                    flag = false;
                }else {
                    t.setText(t.getText() + "2");
                    currNumber += "2";
                }
            }
        });
        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t.getText().toString();
                if(flag && (numbers.contains("+") || numbers.contains("-") || numbers.contains("x") || numbers.contains("÷"))){
                    t.setText(t.getText()+"3");
                    currNumber+="3";


                }else if(flag){
                    t.setText("");
                    flag = false;
                }else {
                    t.setText(t.getText() + "3");
                    currNumber += "3";
                }
            }
        });
        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t.getText().toString();
                if(flag && (numbers.contains("+") || numbers.contains("-") || numbers.contains("x") || numbers.contains("÷"))){
                    t.setText(t.getText()+"4");
                    currNumber+="4";


                }else if(flag){
                    t.setText("");
                    flag = false;
                }else {
                    t.setText(t.getText() + "4");
                    currNumber += "4";
                }
            }
        });
        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t.getText().toString();
                if(flag && (numbers.contains("+") || numbers.contains("-") || numbers.contains("x") || numbers.contains("÷"))){
                    t.setText(t.getText()+"5");
                    currNumber+="5";


                }else if(flag){
                    t.setText("");
                    flag = false;
                }else {
                    t.setText(t.getText() + "5");
                    currNumber += "5";
                }
            }
        });

        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t.getText().toString();
                if(flag && (numbers.contains("+") || numbers.contains("-") || numbers.contains("x") || numbers.contains("÷"))){
                    t.setText(t.getText()+"6");
                    currNumber+="6";


                }else if(flag){
                    t.setText("");
                    flag = false;
                }else {
                    t.setText(t.getText() + "6");
                    currNumber += "6";
                }
            }
        });
        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag && (numbers.contains("+") || numbers.contains("-") || numbers.contains("x") || numbers.contains("÷"))){
                    t.setText(t.getText()+"7");
                    currNumber+="7";


                }else if(flag){
                    t.setText("");
                    flag = false;
                }else {
                    t.setText(t.getText() + "7");
                    currNumber += "7";
                }
            }
        });
        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t.getText().toString();
                if(flag && (numbers.contains("+") || numbers.contains("-") || numbers.contains("x") || numbers.contains("÷"))){
                    t.setText(t.getText()+"8");
                    currNumber+="8";


                }else if(flag){
                    t.setText("");
                    flag = false;
                }else {
                    t.setText(t.getText() + "8");
                    currNumber += "8";
                }

            }
        });
        Button btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = t.getText().toString();
                if(flag && (numbers.contains("+") || numbers.contains("-") || numbers.contains("x") || numbers.contains("÷"))){
                    t.setText(t.getText()+"9");
                    currNumber+="9";


                }else if(flag){
                    t.setText("");
                    flag = false;
                }else {
                    t.setText(t.getText() + "9");
                    currNumber += "9";
                }
            }
        });
        Button btnPlus = findViewById(R.id.btnAdd);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //display operator on screen. if there is a current number(number before this operator), add it to array and prepare for next current number. Also add operator to array.
                t.setText(t.getText()+"+");
                if(!currNumber.isEmpty()){
                    numbers.add(currNumber);
                    currNumber = "";
                }

                numbers.add("+");
            }
        });
        Button btnMinus= findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!currNumber.isEmpty()){
                    numbers.add(currNumber);
                    currNumber = "";
                }
                t.setText(t.getText()+"-");
                numbers.add("-");
            }
        });

        Button btnDiv = findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!currNumber.isEmpty()){
                    numbers.add(currNumber);
                    currNumber = "";
                }
                t.setText(t.getText()+"÷");
                numbers.add("÷");
            }
        });
        Button btnTimes = findViewById(R.id.btnTimes);
        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!currNumber.isEmpty()){
                    numbers.add(currNumber);
                    currNumber = "";
                }
                t.setText(t.getText()+"x");
                numbers.add("x");
            }
        });


        Button btnAC = findViewById(R.id.btnAC);
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear everything and prepare for new calculation
                equalPressCount = 0;
                currTotal = 0;
                t.setText("");
                numbers.clear();
            }
        });





        Button btnEquals = findViewById(R.id.btnEqual);
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add last number to array
                equalPressCount++;
                if (!currNumber.isEmpty()) {
                    numbers.add(currNumber);
                    currNumber = "";
                }
                //Use calculation method created in Calc Functions class.
                double total = CalcFunctions.equals(numbers);
                String Total = String.valueOf(total);
                //if total is integer, remove .0 from end of number since it would be first considered double
                if(total == (int)total){
                    Total = String.valueOf((int) total);
                }
                t.setText(Total);
                numbers.clear();
                numbers.add(Total);
                flag = true;
            }
        });

    }








}
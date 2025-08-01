package com.example.calculatorapp;

import java.util.ArrayList;

//class to handle logic of operator
public class CalcFunctions {


    //method to handle arithmetic logic in numbers array
    public static double equals(ArrayList<String>numbers){

        for (int i = 0; i < numbers.size(); i++) {
            String token = numbers.get(i);
            //gets the operator from array
            if (token.equals("x") || token.equals("÷")) {
                double left = Double.parseDouble(numbers.get(i - 1));
                double right = Double.parseDouble(numbers.get(i + 1));
                double result = token.equals("x") ? left * right : left / right;
                //gets the numbers on the left and right of operator and either multiplies them or divides them

                numbers.set(i - 1, String.valueOf(result));//adds total to the left hand side of the operator,
                numbers.remove(i); //removes operator and previous numbers and keeps total.
                numbers.remove(i);
                i--; //check if there are any more numbers to multiply or divide



            }
        }
    //same logic as above but with addition and subtraction
        for (int i = 0; i < numbers.size(); i++) {
            String token = numbers.get(i);
            if (token.equals("+") || token.equals("-")) {
                double left = Double.parseDouble(numbers.get(i - 1));
                double right = Double.parseDouble(numbers.get(i + 1));
                double result = token.equals("+") ? left + right : left - right;

                numbers.set(i - 1, String.valueOf(result));
                numbers.remove(i);
                numbers.remove(i);
                i--;

            }
        }

        double result = Double.parseDouble(numbers.get(0));//because of continously moving the result to the left of the operator, result will be first value in array.
        return result;



    }
}

package com.example.expertcalculator_mvvm;

import android.widget.TextView;

public class ApplicationData {
    private int result;

    private ApplicationData() {
    }

    private static ApplicationData INSTANCE = null;

    public static ApplicationData getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApplicationData();
        }
        return INSTANCE;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


    public void calcul(String editOperation, String operator ){
       String str =editOperation;
        if(str.contains("+")){
            operator="\\+";
            String[] tableNumbers = str.split(operator);
             result = Integer.valueOf(tableNumbers[0])+Integer.valueOf(tableNumbers[1]);

            if(editOperation!=null){
                //editOperation.setText(String.valueOf(result));
                ApplicationData.getInstance().setResult(result);

            }
        }

        if(str.toLowerCase().contains("/")){
            operator="/";
            String[] tableNumbers = str.split(operator);
            if(editOperation!=null){
               // editOperation.setText(String.valueOf(result));
            } if(tableNumbers[1].equals("0")){
           // editOperation.setText("ERROR");
             }else if(!tableNumbers[1].equals("0")){
                result = Integer.valueOf(tableNumbers[0])/Integer.valueOf(tableNumbers[1]);
                //editOperation.setText(String.valueOf(result));
                ApplicationData.getInstance().setResult((int) result);
                //(double)Math.round(0.912385 * 100000) / 100000 //Le nombre sera arrondi à 0,91239.
            }
        }

        if(str.contains("*")){
            operator= "\\*";
            String[] tableNumbers = str.split(operator);
             result =Integer.valueOf(tableNumbers[0])*Integer.valueOf(tableNumbers[1]);

            if(editOperation!=null){
                //editOperation.setText(String.valueOf(result));
                ApplicationData.getInstance().setResult(result);
            }
        }

        if(str.contains("-")){
            operator= "-";
            String[] tableNumbers = str.split(operator);
             result =Integer.valueOf(tableNumbers[0])-Integer.valueOf(tableNumbers[1]);

            if(editOperation!=null){
                //editOperation.setText(String.valueOf(result));
                ApplicationData.getInstance().setResult(result);
            }
        }
    }








}

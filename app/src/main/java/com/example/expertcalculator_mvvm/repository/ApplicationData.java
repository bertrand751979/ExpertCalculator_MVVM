package com.example.expertcalculator_mvvm.repository;

import android.util.Log;

public class ApplicationData {
    private double result;
     private double total=0;
     private boolean error =false;

    private ApplicationData() {
    }

    private static ApplicationData INSTANCE = null;

    public static ApplicationData getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApplicationData();
        }
        return INSTANCE;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }


    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public void calcul(String editOperation, String operator ){
        setError(false);
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
                setError(true);
                // editOperation.setText("ERROR);
            }else if(!tableNumbers[1].equals("0")){
                result = Double.valueOf(tableNumbers[0])/Double.valueOf(tableNumbers[1]);
                //editOperation.setText(String.valueOf(result));
                ApplicationData.getInstance().setResult(result);
                 total=result;
                Log.d("resultat", String.valueOf(result));
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
                ApplicationData.getInstance().setResult(result);
            }
        }
    }








}

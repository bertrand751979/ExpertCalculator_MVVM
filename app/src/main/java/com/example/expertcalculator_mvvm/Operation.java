package com.example.expertcalculator_mvvm;

public class Operation {

    private int number;
    private String operator;
    private int operationResult;


    private int numberLeft;
    private int numbreRight;

    public Operation(int number, String operator, int operationResult, int numberLeft, int numbreRight) {
        this.number = number;
        this.operator = operator;
        this.operationResult = operationResult;
        this.numberLeft = numberLeft;
        this.numbreRight = numbreRight;
    }

    public Operation(){

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getOperationResult() {
        return operationResult;
    }


    public int getNumberLeft() {
        return numberLeft;
    }

    public void setNumberLeft(int numberLeft) {
        this.numberLeft = numberLeft;
    }

    public int getNumbreRight() {
        return numbreRight;
    }

    public void setNumbreRight(int numbreRight) {
        this.numbreRight = numbreRight;
    }

    public void setOperationResult(int operationResult) {
        this.operationResult = operationResult;
    }
}

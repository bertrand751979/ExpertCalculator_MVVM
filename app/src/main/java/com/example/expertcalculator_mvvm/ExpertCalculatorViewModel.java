package com.example.expertcalculator_mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ExpertCalculatorViewModel extends ViewModel {
    private MutableLiveData<Integer> operationResult = new MutableLiveData<>();
    public LiveData<Integer> operationResultLiveData = operationResult;

    public void toPostResult(){
        operationResult.postValue(ApplicationData.getInstance().getResult());
    }

    public void totCalcul(String editOperation,String operator){
        ApplicationData.getInstance().calcul(editOperation,operator);
        toPostResult();

    }
}

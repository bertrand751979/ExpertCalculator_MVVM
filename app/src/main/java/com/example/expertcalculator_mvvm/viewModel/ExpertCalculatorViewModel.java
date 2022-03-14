package com.example.expertcalculator_mvvm.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.expertcalculator_mvvm.repository.ApplicationData;

public class ExpertCalculatorViewModel extends ViewModel {
    private MutableLiveData<Double> operationResult = new MutableLiveData<>();
    public LiveData<Double> operationResultLiveData = operationResult;

    private MutableLiveData<Boolean>errorMessage = new MutableLiveData<>();
    public LiveData<Boolean> errorMessageLiveData = errorMessage;

    public void toPostResult(){
        operationResult.postValue(ApplicationData.getInstance().getResult());
    }

    public void toPostErrorMessage(){
        errorMessage.postValue(ApplicationData.getInstance().isError());
    }

    public void totCalcul(String editOperation,String operator){
        ApplicationData.getInstance().calcul(editOperation,operator);
        toPostResult();

    }
}

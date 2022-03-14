package com.example.expertcalculator_mvvm.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.expertcalculator_mvvm.viewModel.ExpertCalculatorViewModel;
import com.example.expertcalculator_mvvm.model.Operation;
import com.example.expertcalculator_mvvm.R;
import com.google.android.material.card.MaterialCardView;

public class CalculatorFragment extends Fragment {
    private TextView editOperation;
    private MaterialCardView reset;
    private MaterialCardView mat0;
    private MaterialCardView mat1;
    private MaterialCardView mat2;
    private MaterialCardView mat3;
    private MaterialCardView mat4;
    private MaterialCardView mat5;
    private MaterialCardView mat6;
    private MaterialCardView mat7;
    private MaterialCardView mat8;
    private MaterialCardView mat9;
    private MaterialCardView matAdd;
    private MaterialCardView matDivid;
    private MaterialCardView matMulti;
    private MaterialCardView matMin;
    private MaterialCardView matEquals;
    private String number;
    private String numberSecond;
    private String numberFirst;
    private String operator;
    private Operation operation;
    private int sum=0;
    private int sumsoustraction=0;
    private int result=0;
    private ExpertCalculatorViewModel viewModelExpertCalculator;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModelExpertCalculator = new ViewModelProvider(this).get(ExpertCalculatorViewModel.class);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calculator,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mat0 = view.findViewById(R.id.mat_card_zero);
        mat1 = view.findViewById(R.id.mat_card_one);
        mat2 = view.findViewById(R.id.mat_card_two);
        mat3 = view.findViewById(R.id.mat_card_three);
        mat4 = view.findViewById(R.id.mat_card_four);
        mat5 = view.findViewById(R.id.mat_card_five);
        mat6 = view.findViewById(R.id.mat_card_six);
        mat7 = view.findViewById(R.id.mat_card_seven);
        mat8 = view.findViewById(R.id.mat_card_eight);
        mat9 = view.findViewById(R.id.mat_card_nine);
        matAdd = view.findViewById(R.id.mat_card_plus);
        matDivid = view.findViewById(R.id.mat_card_divided);
        matMulti = view.findViewById(R.id.mat_card_multiplication);
        matMin = view.findViewById(R.id.mat_card_minus);
        matEquals = view.findViewById(R.id.mat_card_equals);
        editOperation = view.findViewById(R.id.amount);
        matEquals = view.findViewById(R.id.mat_card_equals);
        reset = view.findViewById(R.id.mat_card_reset);
        mat0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(number==null){
                        number="0";
                        editOperation.setText(number);
                    }else{
                    number+="0";
                        editOperation.setText(number);
                    }
            }
        });
        mat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number==null){
                    number="1";
                    editOperation.setText(number);
                }else{
                    number+="1";
                    editOperation.setText(number);
                }
            }
        });
        mat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number==null){
                    number="2";
                    editOperation.setText(number);
                }else{
                    number+="2";
                    editOperation.setText(number);
                }
            }
        });
        mat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number==null){
                    number="3";
                    editOperation.setText(number);
                }else{
                    number+="3";
                    editOperation.setText(number);
                }
            }
        });
        mat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number==null){
                    number="4";
                    editOperation.setText(number);
                }else{
                    number+="4";
                    editOperation.setText(number);
                }
            }
        });
        mat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number==null){
                    number="5";
                    editOperation.setText(number);
                }else{
                    number+="5";
                    editOperation.setText(number);
                }
            }
        });
        mat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number==null){
                    number="6";
                    editOperation.setText(number);
                }else{
                    number+="6";
                    editOperation.setText(number);
                }
            }
        });
        mat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number==null){
                    number="7";
                    editOperation.setText(number);
                }else{
                    number+="7";
                    editOperation.setText(number);
                }
            }
        });
        mat8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number==null){
                    number="8";
                    editOperation.setText(number);
                }else{
                    number+="8";
                    editOperation.setText(number);
                }
            }
        });
        mat9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number==null){
                    number="9";
                    editOperation.setText(number);
                }else{
                    number+="9";
                    editOperation.setText(number);
                }
            }
        });
        matDivid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(matDivid==view){
                   Toast.makeText(CalculatorFragment.this.getContext(),number, Toast.LENGTH_SHORT).show();
                   operator="/";
                   operator=number+operator;
                   editOperation.setText(operator);
                   if(number!=null){
                       number="";
                       number=operator+number;
                       editOperation.setText(number);
                   }
               }
            }
        });
        matMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matMulti==view){
                    operator="*";
                    operator=number+operator;
                    editOperation.setText(operator);
                if(number!=null) {
                    number = "";
                    number = operator + number;
                    editOperation.setText(number);
                    }
                }
            }
        });
        matAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matAdd==view){
                    operator="+";
                    operator=number+operator;
                    editOperation.setText(operator);
                }
                if(number!=null){
                    number="";
                    number = operator + number;
                    editOperation.setText(number);
                }
            }
        });
        matMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(matMin==view){
                    operator="-";
                    operator=number+operator;
                    editOperation.setText(operator);
                }
                if(number!=null){
                    number="";
                    number = operator + number;
                    editOperation.setText(number);
                }
            }
        });
        matEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModelExpertCalculator.totCalcul(editOperation.getText().toString(),operator);
                viewModelExpertCalculator.toPostErrorMessage();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(reset==view){
                    reset();
                }
            }
        });
        setViewResult();
    }

    private void reset(){
        editOperation.setText(null);
        number=null;
        operator=null;
        sum=0;
    }

    private void setViewResult(){
        viewModelExpertCalculator.operationResultLiveData.observe(getViewLifecycleOwner(), new Observer<Double>() {
            @Override
            public void onChanged(Double res) {
                editOperation.setText(String.valueOf(res));
            }
        });

        viewModelExpertCalculator.errorMessageLiveData.observe(getViewLifecycleOwner(), new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                    if(aBoolean==true){
                        editOperation.setText("ERROR");
                    }else{
                    }
                }

        });
    }


}

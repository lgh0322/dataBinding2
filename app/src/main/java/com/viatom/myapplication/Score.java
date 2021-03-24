package com.viatom.myapplication;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Score extends ViewModel {
    MutableLiveData<Integer> a;
    MutableLiveData<Integer> b;
    public MutableLiveData<Integer> getA() {
        if( a == null ){
            a = new MutableLiveData<>();
            a.setValue(0);
        }
        return a;
    }

    public MutableLiveData<Integer> getB() {
        if(b == null){
            b = new MutableLiveData<>();
            b.setValue(0);
        }
        return b;
    }

    public void addA(int p){
        a.setValue( a.getValue() + p );
    }

    public void addB(int p){
        b.setValue( b.getValue() + p );
    }
}


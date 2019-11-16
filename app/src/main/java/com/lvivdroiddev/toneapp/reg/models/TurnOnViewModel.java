package com.lvivdroiddev.toneapp.reg.models;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.lvivdroiddev.toneapp.R;

public class TurnOnViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TurnOnViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(String.valueOf(R.string.turn_on_device));
    }

    public LiveData<String> getText() {
        return mText;
    }

}

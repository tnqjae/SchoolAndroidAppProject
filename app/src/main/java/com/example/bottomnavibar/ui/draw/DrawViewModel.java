package com.example.bottomnavibar.ui.draw;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DrawViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DrawViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Drawing Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
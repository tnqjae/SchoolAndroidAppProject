package com.example.bottomnavibar.ui.Images;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ImageViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ImageViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Image Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
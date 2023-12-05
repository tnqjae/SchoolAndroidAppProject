package com.example.bottomnavibar.ui.booklist;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BooklistViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BooklistViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("booklist");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
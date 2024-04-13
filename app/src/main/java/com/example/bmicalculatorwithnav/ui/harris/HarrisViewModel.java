package com.example.bmicalculatorwithnav.ui.harris;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HarrisViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HarrisViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is harris fragment");
    }
    public  LiveData<String> getText() {
        return mText;
    }
}

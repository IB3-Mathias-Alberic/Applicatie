package com.example.omnirobot.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("test knoppen in lijst hallo");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
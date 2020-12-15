package com.ebc.learningnav.ui.inbox;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InboxViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InboxViewModel() {
        this.mText = new MutableLiveData<String>();
        this.mText.setValue("This is inbox fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}

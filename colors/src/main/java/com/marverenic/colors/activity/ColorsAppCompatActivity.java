package com.marverenic.colors.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class ColorsAppCompatActivity extends AppCompatActivity {

    private ColorsActivityDelegate mDelegate;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDelegate = new ColorsActivityDelegate(this, getTaskName(), getTaskIcon());
        mDelegate.onCreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mDelegate.onResume();
    }

    @Nullable
    protected String getTaskName() {
        return null;
    }

    @Nullable
    protected Bitmap getTaskIcon() {
        return null;
    }

}

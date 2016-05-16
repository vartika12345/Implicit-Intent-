package com.example.user.implicit_intent;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by USER on 16-05-2016.
 */
public abstract class AbstractBaseActivity  extends AppCompatActivity{
    private static final String TAG = "AbstractBaseActivity";

    protected Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;

    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }



}

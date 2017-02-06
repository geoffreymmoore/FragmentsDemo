package com.moore.fragmentsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
implements TopSectionFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String bottom){
        BottomPhotoFragment bottomPhotoFragment = (BottomPhotoFragment) getSupportFragmentManager().findFragmentById(R.id.picFragment);
        bottomPhotoFragment.setMemeText(top,bottom);
    }
}

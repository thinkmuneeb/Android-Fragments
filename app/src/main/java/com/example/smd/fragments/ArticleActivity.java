package com.example.smd.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;


public class ArticleActivity extends Activity
{
    String text = "";

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_activity);
        text = getIntent().getStringExtra("text");
        ArticleFragment fragment = (ArticleFragment) getFragmentManager().findFragmentById(R.id.article);
        if (fragment != null){
           fragment.setText(text);
        }
    }
}

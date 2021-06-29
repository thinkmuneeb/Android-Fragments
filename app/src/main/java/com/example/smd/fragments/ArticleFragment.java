package com.example.smd.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.*;



public class ArticleFragment extends Fragment
{
    String text;
    TextView view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
   
        view = (TextView) inflater.inflate(R.layout.article_view, container, false);
        setText(text);

        return view;
    }

    public void setText(String text){
       this.text = text;

       if (view != null){
          view.setText(text);
       }
    }

}

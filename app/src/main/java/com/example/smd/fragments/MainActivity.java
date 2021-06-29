package com.example.smd.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.content.*;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Display;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity implements TitleFragment.TitleFragmentListener {
    /**
     * Called when the activity is first created.
     */
    //   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public void onTitleFragmentItemClick(String selectedArticle) {
        ArticleFragment articleFragment = (ArticleFragment) getFragmentManager().findFragmentById(R.id.article);

        if (articleFragment != null && articleFragment.isVisible()) {     // dual pane
            articleFragment.setText(selectedArticle);
        } else {
            // single pane
            // launch new activity or replace fragment

            Intent intent = new Intent(this, ArticleActivity.class);
            intent.putExtra("text", selectedArticle);
            startActivity(intent);
        }
    }
}

package com.example.smd.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.*;



public class TitleFragment extends Fragment
{

    TitleFragmentListener listener;

    String [] array = {"one","two","three","four","five"};

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
    
        listener = (TitleFragmentListener) getActivity();

        return createUi();
    }

    private View createUi(){

       ListView view = new ListView(getActivity());
       view.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
       ArrayAdapter adapter = new ArrayAdapter(getActivity(),R.layout.title_view,array);
       view.setAdapter(adapter); 
       view.setOnItemClickListener(new AdapterView.OnItemClickListener(){

          public void onItemClick(AdapterView<?> parent, View view, int position,long id){

             listener.onTitleFragmentItemClick(array[position]);

          }

       });   	
       return view;
    }



    public interface TitleFragmentListener {

       public void onTitleFragmentItemClick(String selectedArticle);

    }

}

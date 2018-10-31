package com.example.administrator.mobileshopheshuang;

import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

public class PersonFragment extends BaseFragment {

    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.personal_fragment,container,false);
        return view;
    }
}
package com.pratiksymz.android.prospectscalendarnew.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pratiksymz.android.prospectscalendarnew.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MonthFragment extends Fragment {


    public MonthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_month, container, false);
    }

}

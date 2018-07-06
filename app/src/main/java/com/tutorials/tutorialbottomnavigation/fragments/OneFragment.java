package com.tutorials.tutorialbottomnavigation.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.tutorialbottomnavigation.R;

/**
 * Created by Emre.Karatas on 2.07.2018.
 */

public class OneFragment extends Fragment {

    public static OneFragment newInstance(){
        OneFragment oneFragment = new OneFragment();
        return oneFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_one, container, false);

        return v;
    }
}

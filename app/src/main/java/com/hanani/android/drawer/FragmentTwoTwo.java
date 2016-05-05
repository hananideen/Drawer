package com.hanani.android.drawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hanani on 5/5/2016.
 */
public class FragmentTwoTwo extends Fragment {

    public FragmentTwoTwo() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two_two, container, false);
        return rootView;
    }

    public static FragmentTwoTwo newInstance(int sectionNumber) {
        FragmentTwoTwo fragment = new FragmentTwoTwo();
        Bundle args = new Bundle();
        args.putInt(Constant.ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
}
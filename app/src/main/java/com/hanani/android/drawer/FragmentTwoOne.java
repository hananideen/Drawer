package com.hanani.android.drawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hanani on 5/5/2016.
 */
public class FragmentTwoOne extends Fragment{

    public FragmentTwoOne() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two_one, container, false);
        return rootView;
    }

    public static FragmentTwoOne newInstance(int sectionNumber) {
        FragmentTwoOne fragment = new FragmentTwoOne();
        Bundle args = new Bundle();
        args.putInt(Constant.ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
}

package com.hanani.android.drawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hanani on 5/5/2016.
 */
public class FragmentFourTwo extends Fragment {

    public FragmentFourTwo() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_four_two, container, false);
        return rootView;
    }

    public static FragmentFourTwo newInstance(int sectionNumber) {
        FragmentFourTwo fragment = new FragmentFourTwo();
        Bundle args = new Bundle();
        args.putInt(FragmentFour.ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
}

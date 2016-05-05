package com.hanani.android.drawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hanani on 5/5/2016.
 */
public class FragmentFourOne extends Fragment {

    public FragmentFourOne() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_four_one, container, false);
        return rootView;
    }

    public static FragmentFourOne newInstance(int sectionNumber) {
        FragmentFourOne fragment = new FragmentFourOne();
        Bundle args = new Bundle();
        args.putInt(FragmentFour.ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
}

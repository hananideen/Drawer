package com.hanani.android.drawer;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hanani on 4/5/2016.
 */
public class FragmentOne extends Fragment {

    public FragmentOne() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        // setup toolbar if found in layout
        if(toolbar!=null){
            toolbar.setTitle(Constant.FRAGMENT_ONE);
            // link toolbar to drawer
            try {((MainActivity) getActivity()).linkToolbar(toolbar);
            } catch (Exception e) { e.printStackTrace(); }
        }

        return rootView;
    }
}

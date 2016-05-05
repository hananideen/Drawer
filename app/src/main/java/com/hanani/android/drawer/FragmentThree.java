package com.hanani.android.drawer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hanani on 4/5/2016.
 */
public class FragmentThree extends Fragment {

    public FragmentThree() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);

        Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        // setup toolbar if found in layout
        if(toolbar!=null){
            toolbar.setTitle(Constant.FRAGMENT_THREE);
            // link toolbar to drawer
            try {((MainActivity) getActivity()).linkToolbar(toolbar);
            } catch (Exception e) { e.printStackTrace(); }
        }

        FloatingActionButton fab = (FloatingActionButton) rootView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Floating Action Button", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        return rootView;
    }
}

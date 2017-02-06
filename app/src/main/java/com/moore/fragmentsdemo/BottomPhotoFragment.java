package com.moore.fragmentsdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomPhotoFragment extends Fragment {

    private static TextView topTV;
    private static TextView bottomTV;


    public BottomPhotoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom_photo, container, false);

        topTV = (TextView) view.findViewById(R.id.topTV);
        bottomTV = (TextView) view.findViewById(R.id.bottomTV);

        return view;
    }

    public void setMemeText(String top, String bottom){
        topTV.setText(top);
        bottomTV.setText(bottom);
    }

}

package com.moore.fragmentsdemo;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopSectionFragment extends Fragment {

    //define widget
    private static EditText topET;
    private static EditText bottomET;

    TopSectionListener activityCommander;

    public interface TopSectionListener {
        public void createMeme(String top,String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{
            activityCommander = (TopSectionListener) context;
        } catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    public TopSectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top_section, container, false);

        // get reference to the widget
        topET = (EditText) view.findViewById(R.id.topET);
        bottomET = (EditText) view.findViewById(R.id.bottomET);
        final Button memeButton = (Button) view.findViewById(R.id.memeButton);

        memeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(v);
            }
        });

        return view;
    }

    public void buttonClick(View view) {

        activityCommander.createMeme(topET.getText().toString(),bottomET.getText().toString());
    }
}

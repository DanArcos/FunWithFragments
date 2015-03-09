package com.cornbread.android.funwithfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MultiFragment1 extends Fragment{
    Button mFragmentTransition;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_multi1, container, false);

        mFragmentTransition = (Button) v.findViewById(R.id.fragment_transition_button);
        mFragmentTransition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "CLICK CLICK", Toast.LENGTH_SHORT).show();

                //Transition to another fragment
                getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentContainer, new MultiFragment2())
                    .commit();
            }
        });

        return v;
    }
}

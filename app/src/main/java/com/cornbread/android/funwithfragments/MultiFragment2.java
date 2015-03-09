package com.cornbread.android.funwithfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MultiFragment2 extends Fragment{
    Button mGoBackButton;
    Button mShowActivity2Button;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_multi2, container, false);

        mGoBackButton = (Button) v.findViewById(R.id.go_back_button);
        mGoBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(), "CLICK CLICK", Toast.LENGTH_SHORT).show();
                // Go back to previous fragment
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentContainer, new MultiFragment1())
                        .commit();
            }
        });

        //Log.d("TAG", getActivity().getClass().getSimpleName());
        mShowActivity2Button = (Button) v.findViewById(R.id.show_activity2);
        mShowActivity2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), getActivity().getClass().getSimpleName(), Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }
}

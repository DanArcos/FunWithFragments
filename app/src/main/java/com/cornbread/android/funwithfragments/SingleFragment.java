package com.cornbread.android.funwithfragments;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.NavUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SingleFragment extends Fragment{
    Button mToastButton;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_single, container, false);

        mToastButton = (Button)v.findViewById(R.id.singleFragmentToast);
        mToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), getActivity().getClass().getSimpleName(), Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }
}

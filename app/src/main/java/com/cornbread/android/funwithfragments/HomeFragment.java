package com.cornbread.android.funwithfragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class HomeFragment extends Fragment{
    Button mSingleFragmentButton;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        mSingleFragmentButton = (Button)v.findViewById(R.id.singleFragmentButton);
        mSingleFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(), "click", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(getActivity(), SingleFragmentActivity.class));
            }
        });

        return v;
    }
}

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
    Button mShowActivityButton;
    Button mSingleFragmentButton;
    Button mMultiFragmentButton;
    Button mPagerFragmentButton;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        mShowActivityButton = (Button)v.findViewById(R.id.show_activity_home);
        mShowActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Show Activity Name when clicked
                Toast.makeText(getActivity(), getActivity().getClass().getSimpleName(), Toast.LENGTH_LONG).show();
            }
        });

        mSingleFragmentButton = (Button)v.findViewById(R.id.singleFragmentButton);
        mSingleFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SingleFragmentActivity.class));
            }
        });

        mMultiFragmentButton = (Button)v.findViewById(R.id.MultiFragmentButton);
        mMultiFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MultiFragmentActivity.class));
            }
        });

        mPagerFragmentButton = (Button)v.findViewById(R.id.PagerFragmentButton);
        mPagerFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ViewPagerActivity.class));
            }
        });

        return v;
    }
}

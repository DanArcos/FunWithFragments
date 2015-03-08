package com.cornbread.android.funwithfragments;


import android.app.Activity;
import android.os.Bundle;

public class SingleFragmentActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_single);
    }
}

package com.cornbread.android.funwithfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class ViewPagerActivity extends FragmentActivity{
    private ViewPager mViewPager; //Declare ViewPager object
    private Fragment mSingleFragment;
    private Fragment mMultiFragment1;
    private Fragment mMultiFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSingleFragment = new SingleFragment();
        mMultiFragment1 = new MultiFragment1();
        mMultiFragment2 = new MultiFragment2();

        mViewPager = new ViewPager(this); //Instantiate Viewpager
        mViewPager.setId(R.id.viewPager); //Set ID
        setContentView(mViewPager);


        FragmentManager fragmentManager = getSupportFragmentManager(); //Get Instance of fragmentManager

        mViewPager.setAdapter(new FragmentPagerAdapter(fragmentManager) {
            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public Fragment getItem(int position) {
                switch (position){
                    case 0:
                        return mSingleFragment;
                    case 1:
                        return mMultiFragment1;
                    case 2:
                        return mMultiFragment2;
                    default:
                        return null;

                }
            }
        });
    }
}

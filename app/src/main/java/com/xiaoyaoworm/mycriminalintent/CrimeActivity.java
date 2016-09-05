package com.xiaoyaoworm.mycriminalintent;

import android.support.v4.app.Fragment;

import layout.CrimeFragment;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}

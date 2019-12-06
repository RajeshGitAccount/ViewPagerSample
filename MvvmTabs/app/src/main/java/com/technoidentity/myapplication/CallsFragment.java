package com.technoidentity.myapplication;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.technoidentity.myapplication.databinding.FragmentCallsBinding;


public class CallsFragment extends Fragment {

    FragmentCallsBinding fragmentCallsBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_calls, container, false);
        fragmentCallsBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_calls,container,false);
        return fragmentCallsBinding.getRoot();
    }



}

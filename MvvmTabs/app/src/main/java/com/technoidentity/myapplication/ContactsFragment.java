package com.technoidentity.myapplication;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.technoidentity.myapplication.databinding.FragmentContactsBinding;


public class ContactsFragment extends Fragment {

    private FragmentContactsBinding fragmentContactsBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_contacts, container, false);
        fragmentContactsBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_contacts,container,false);
        return fragmentContactsBinding.getRoot();
    }

}

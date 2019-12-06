package com.technoidentity.myapplication;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.technoidentity.myapplication.databinding.FragmentChatsBinding;


public class ChatsFragment extends Fragment {


    FragmentChatsBinding fragmentChatsBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_chats, container, false);

        fragmentChatsBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_chats,container,false);
        return fragmentChatsBinding.getRoot();
    }



}

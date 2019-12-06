package com.technoidentity.myapplication;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainSectionsAdapter extends FragmentPagerAdapter {

    private static final int CONTACTS = 0;
    private static final int CALLS = 1;
    private static final int CHATS = 2;

    private static final int[] TABS = new int[]{CONTACTS, CALLS, CHATS};


    private Context mContext;

    public MainSectionsAdapter(final Context context, final FragmentManager fm)
    {
        super(fm);
        mContext = context.getApplicationContext();
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (TABS[position])
        {
            case CONTACTS:
                return new ContactsFragment();
            case CALLS:
                return new CallsFragment();
            case CHATS:
                return new ChatsFragment();
        }
        return null;
    }

    @Override
    public int getCount()
    {
        return TABS.length;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (TABS[position])
        {
            case CONTACTS:
                return mContext.getResources().getString(R.string.contacts);
            case CALLS:
                return mContext.getResources().getString(R.string.calls);
            case CHATS:
                return mContext.getResources().getString(R.string.chats);
        }
        return null;
    }

}

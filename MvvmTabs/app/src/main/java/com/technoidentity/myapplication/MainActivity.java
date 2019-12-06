package com.technoidentity.myapplication;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.technoidentity.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setHandler(this);
        binding.setManager(getSupportFragmentManager());

    }


    @BindingAdapter({"bind:handler"})
    public static void bindViewPagerAdapter(final ViewPager view, final MainActivity activity)
    {
        final MainSectionsAdapter adapter = new MainSectionsAdapter(view.getContext(), activity.getSupportFragmentManager());
        view.setAdapter(adapter);
    }

    @BindingAdapter({"bind:pager"})
    public static void bindViewPagerTabs(final TabLayout view, final ViewPager pagerView)
    {
        view.setupWithViewPager(pagerView, true);
    }
}

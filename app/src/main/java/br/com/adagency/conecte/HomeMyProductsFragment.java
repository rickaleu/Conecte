package br.com.adagency.conecte;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rsousa on 12/11/2015.
 */
public class HomeMyProductsFragment extends Fragment{

    private ViewPager pagerView;
    private TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home_my_products, container, false);

        tabLayout = (TabLayout) v.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("MEUS PRODUTOS"));
        tabLayout.addTab(tabLayout.newTab().setText("MEDALHAS"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        pagerView = (ViewPager) v.findViewById(R.id.homne_my_products_view_pager);
        pagerView.setAdapter(new MyPagerAdapter(getChildFragmentManager()));

        pagerView.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pagerView.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });

        return v;
    }

    public static HomeMyProductsFragment newInstance(String text) {

        HomeMyProductsFragment f = new HomeMyProductsFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0: return HomeMyProductsFragmentTab1.newInstance("HomeMyProductsFragmentTab1, Instance 0");
                case 1: return HomeMyProductsFragmentTab2.newInstance("HomeMyProductsFragmentTab2, Instance 1");
                default: return HomeMyProductsFragmentTab1.newInstance("HomeMyProductsFragmentTab1, Default");

            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}

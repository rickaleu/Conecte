package br.com.adagency.conecte;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class LoginMainView extends FragmentActivity {

    private Context context;
    private ViewPager pagerView;
    private Button buttonRegister;
    private Button buttonSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);

        context = this;

        pagerView = (ViewPager) findViewById(R.id.login_view_pager);
        buttonRegister = (Button) findViewById(R.id.login_main_register);
        buttonSignIn = (Button) findViewById(R.id.login_main_signin);


        pagerView.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        final RadioGroup radioGroup = (RadioGroup)findViewById(R.id.login_radiogroup);
        pagerView.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        radioGroup.check(R.id.radioButton1);
                        break;
                    case 1:
                        radioGroup.check(R.id.radioButton2);
                        break;
                    case 2:
                        radioGroup.check(R.id.radioButton3);
                        break;
                    case 3:
                        radioGroup.check(R.id.radioButton4);
                        break;
                    case 4:
                        radioGroup.check(R.id.radioButton5);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, LoginRegisterView.class);
                startActivity(intent);
            }
        });

        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, LoginSignInView.class);
                startActivity(intent);

            }
        });

    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0: return LoginFirstFragment.newInstance("FirstFragment, Instance 0");
                case 1: return LoginSecondFragment.newInstance("SecondFragment, Instance 1");
                case 2: return LoginThirdFragment.newInstance("ThirdFragment, Instance 2");
                case 3: return LoginFourthFragment.newInstance("FourthFragment, Instance 3");
                case 4: return LoginFifthFragment.newInstance("FifthFragment, Instance 4");
                default: return LoginFirstFragment.newInstance("FirstFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }

}


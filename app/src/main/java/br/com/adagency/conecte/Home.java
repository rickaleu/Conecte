package br.com.adagency.conecte;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private ImageView imageLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imageLogo = (ImageView) findViewById(R.id.home_icon_logo);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Class fragmentClass = HomeHighlightsFragment.class;
        android.support.v4.app.Fragment fragment = null;
        try {
            fragment = (android.support.v4.app.Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.home_content, fragment).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.home, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//
//            Intent intent = new Intent(getBaseContext(), Settings.class);
//            startActivity(intent);
//
//            return true;
//
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        android.support.v4.app.Fragment fragment = null;

        Class fragmentClass = null;
        int id = item.getItemId();

        if (id == R.id.nav_highlights) {

            fragmentClass = HomeHighlightsFragment.class;
            toolbar.setTitle(R.string.title_fragment_highlights);
            imageLogo.setVisibility(View.VISIBLE);

        }else if (id == R.id.nav_my_products) {

            fragmentClass = HomeMyProductsFragment.class;
            toolbar.setTitle(R.string.title_fragment_my_products);
            imageLogo.setVisibility(View.INVISIBLE);

        }else if (id == R.id.nav_benefics) {

            fragmentClass = HomeBenefitsFragment.class;
            toolbar.setTitle(R.string.title_fragment_benefits);
            imageLogo.setVisibility(View.INVISIBLE);

//        } else if (id == R.id.nav_leaderboards) {
//
//            fragmentClass = HomeLeaderboradsFragment.class;
//            toolbar.setTitle(R.string.title_fragment_leaderboards);

//        } else if (id == R.id.nav_vip_experience) {
//
//            fragmentClass = HomeVipExperienceFragment.class;
//            toolbar.setTitle(R.string.title_fragment_vip_experience);

//        } else if (id == R.id.nav_upgrade_samsung) {
//
//            fragmentClass = HomeUpgradeMySamsungFragment.class;
//            toolbar.setTitle(R.string.title_fragment_upgrade_my_samsung);

//        } else if (id == R.id.nav_share_play) {
//
//            fragmentClass = HomeSharePlayFragment.class;
//            toolbar.setTitle(R.string.title_fragment_share_and_play);

        } else if (id == R.id.nav_live_assistance) {

            fragmentClass = HomeLiveAssistanceFragment.class;
            toolbar.setTitle(R.string.title_fragment_live_assistance);
            imageLogo.setVisibility(View.INVISIBLE);

        } else if (id == R.id.nav_samsung_store) {

            fragmentClass = HomeSamsungStoresFragment.class;
            toolbar.setTitle(R.string.title_fragment_samsung_stores);
            imageLogo.setVisibility(View.INVISIBLE);

        } else if (id == R.id.nav_account) {

            fragmentClass = HomeAccountFragment.class;
            toolbar.setTitle(R.string.title_fragment_account);
            imageLogo.setVisibility(View.INVISIBLE);

        } else if (id == R.id.nav_settings) {

            fragmentClass = HomeSettingsFragment.class;
            toolbar.setTitle(R.string.title_fragment_settings);
            imageLogo.setVisibility(View.INVISIBLE);

        }


        try {
            fragment = (android.support.v4.app.Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.home_content, fragment).commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

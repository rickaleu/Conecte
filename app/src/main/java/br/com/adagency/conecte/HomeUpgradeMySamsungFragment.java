package br.com.adagency.conecte;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rsousa on 12/11/2015.
 */
public class HomeUpgradeMySamsungFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home_upgrade_my_samsung, container, false);

        return v;
    }

    public static HomeUpgradeMySamsungFragment newInstance(String text) {

        HomeUpgradeMySamsungFragment f = new HomeUpgradeMySamsungFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}

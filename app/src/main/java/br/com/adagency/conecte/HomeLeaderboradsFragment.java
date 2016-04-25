package br.com.adagency.conecte;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rsousa on 12/11/2015.
 */
public class HomeLeaderboradsFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home_leaderboards, container, false);

        return v;
    }

    public static HomeLeaderboradsFragment newInstance(String text) {

        HomeLeaderboradsFragment f = new HomeLeaderboradsFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}

package br.com.adagency.conecte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rsousa on 12/11/2015.
 */
public class HomeSettingsFragment extends Fragment{

    private TextView textExit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home_settings, container, false);

        textExit = (TextView) v.findViewById(R.id.home_fragment_settings_exit);

        textExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), LoginMainView.class);
                startActivity(intent);
            }
        });

        return v;
    }

    public static HomeSettingsFragment newInstance(String text) {

        HomeSettingsFragment f = new HomeSettingsFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}

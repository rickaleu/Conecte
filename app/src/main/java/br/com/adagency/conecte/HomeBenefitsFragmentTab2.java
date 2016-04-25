package br.com.adagency.conecte;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rsousa on 12/11/2015.
 */
public class HomeBenefitsFragmentTab2 extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home_benefits_page_two, container, false);

        return v;
    }

    public static HomeBenefitsFragmentTab2 newInstance(String text) {

        HomeBenefitsFragmentTab2 f = new HomeBenefitsFragmentTab2();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}

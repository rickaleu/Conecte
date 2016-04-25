package br.com.adagency.conecte;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rsousa on 12/11/2015.
 */
public class HomeBenefitsFragmentTab1 extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home_benefits_page_one, container, false);

        return v;
    }

    public static HomeBenefitsFragmentTab1 newInstance(String text) {

        HomeBenefitsFragmentTab1 f = new HomeBenefitsFragmentTab1();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}

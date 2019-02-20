package com.example.t14_fragment_example_2;


import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DispFragment extends Fragment {

    private static final String[] WORDS ={"Tiger","Lion","Snow Leopard"};
    String word ="";
    View myView;
    ImageView imv;

    public DispFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_disp, container, false);
        imv= (ImageView) myView.findViewById(R.id.myimg);

        //setImage("Lion");
        //imv.setImageResource(R.drawable.snowleopard);
        return myView;
    }

    void setImage(String word){

        if (word.equals(WORDS[0])) {
            imv.setImageResource(R.drawable.tiger);
        }

        if (word.equals(WORDS[1])) {
            imv.setImageResource(R.drawable.lion);
        }

        if (word.equals(WORDS[2])) {
            imv.setImageResource(R.drawable.snowleopard);
        }

    }
}

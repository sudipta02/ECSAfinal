package com.Sudipta.android.ecsa;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by Sudipta on 23-07-2016.
 */
public class ecsaV2 extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.credits, container, false);
        TextView txt1 = (TextView) rootview.findViewById(R.id.developedBy);
        Typeface font1 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Strato-unlinked.ttf");
        txt1.setTypeface(font1);

        TextView txt2 = (TextView) rootview.findViewById(R.id.ecsav2);
        Typeface font2 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/ufonts.com_baskerville-old-face.ttf");
        txt2.setTypeface(font2);

        TextView txt3 = (TextView) rootview.findViewById(R.id.bimaleshSahoo);
        Typeface font3 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Sofia-Regular.ttf");
        txt3.setTypeface(font3);
        TextView txt4 = (TextView) rootview.findViewById(R.id.appDeveloper1);
        Typeface font4 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Sofia-Regular.ttf");
        txt4.setTypeface(font4);
        TextView txt5 = (TextView) rootview.findViewById(R.id.wiproInfotech);
        Typeface font5 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Sofia-Regular.ttf");
        txt5.setTypeface(font5);
        TextView txt6 = (TextView) rootview.findViewById(R.id.sudiptaSundarSahoo);
        Typeface font6 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Sofia-Regular.ttf");
        txt6.setTypeface(font6);
        TextView txt7 = (TextView) rootview.findViewById(R.id.appDeveloper2);
        Typeface font7 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Sofia-Regular.ttf");
        txt7.setTypeface(font7);
        TextView txt8 = (TextView) rootview.findViewById(R.id.nitr);
        Typeface font8 = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Sofia-Regular.ttf");
        txt8.setTypeface(font8);

        return  rootview;
    }


}

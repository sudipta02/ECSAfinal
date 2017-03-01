package com.Sudipta.android.ecsa;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Sudipta on 15-07-2016.
 */
public class studentList extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       final View rootView = inflater.inflate(R.layout.student_list, container, false);

//        Button button1 = (Button) rootView.findViewById(R.id.button2A);
//        Button button2 = (Button) rootView.findViewById(R.id.button2B);
        Button button3 = (Button) rootView.findViewById(R.id.button3A);
        Button button4 = (Button) rootView.findViewById(R.id.button3B);
        Button button5 = (Button) rootView.findViewById(R.id.button4A);
        Button button6 = (Button) rootView.findViewById(R.id.button4B);
//        button1.setOnClickListener(new View.OnClickListener() {
//                                       @Override
//                                       public void onClick(View v) {
//
//                                           IIndYearA frag = new IIndYearA();
//                                           FragmentManager manager = getFragmentManager();
//                                           manager.beginTransaction().replace(R.id.student_list_content, frag).addToBackStack(null).commit();
//                                       }
//                                   }
//
//        );
//        button2.setOnClickListener(new View.OnClickListener() {
//                                       @Override
//                                       public void onClick(View v) {
//
//                                           IIndYearA frag = new IIndYearA();
//                                           FragmentManager manager = getFragmentManager();
//                                           manager.beginTransaction().replace(R.id.student_list_content, frag).addToBackStack(null).commit();
//                                       }
//                                   }
//
//        );
        button3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {

                                           IIIrdYearA frag = new IIIrdYearA();
                                           FragmentManager manager = getFragmentManager();
                                           manager.beginTransaction().replace(R.id.student_list_content, frag).addToBackStack(null).commit();
                                       }
                                   }

        );
        button4.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {

                                           IIIrdYearB frag = new IIIrdYearB();
                                           FragmentManager manager = getFragmentManager();
                                           manager.beginTransaction().replace(R.id.student_list_content, frag).addToBackStack(null).commit();
                                       }
                                   }

        );
        button5.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {

                                           IVYearA frag = new IVYearA();
                                           FragmentManager manager = getFragmentManager();
                                           manager.beginTransaction().replace(R.id.student_list_content, frag).addToBackStack(null).commit();
                                       }
                                   }

        );
        button6.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {

                                           IVYearB frag = new IVYearB();
                                           FragmentManager manager = getFragmentManager();
                                           manager.beginTransaction().replace(R.id.student_list_content, frag).addToBackStack(null).commit();
                                       }
                                   }

        );

        return  rootView;
    }


}

package com.Sudipta.android.ecsa;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sudipta on 13-07-2016.
 */
public class studentCouncil extends Fragment {
    HashMap<String, List<String>> councilCategory;
    List<String> student_List;
    ExpandableListView Exp_list;
    studentCouncilAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.expandable_listview_layout, container, false);
        Exp_list = (ExpandableListView) rootView.findViewById(R.id.exp_list);
        councilCategory = dataProviderOfStudentCouncil.getInfo();
        student_List = new ArrayList<>(councilCategory.keySet());
        adapter = new studentCouncilAdapter(this.getActivity(), councilCategory, student_List);
        Exp_list.setAdapter(adapter);

        Exp_list.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                if (groupPosition == 0) {
                    if (childPosition == 0) {
                        ANKESH();
                    } else {
                        SHADAAB();
                    }
                } else if (groupPosition == 1) {
                    if (childPosition == 0) {
                        RISHANSHI();
                    } else if (childPosition == 1) {
                        VINEET();
                    } else if (childPosition == 2) {
                        KAVYA();
                    } else if (childPosition == 3) {
                        PUSHPAK();
                    } else if (childPosition == 4) {
                        UTKARSH();
                    } else if (childPosition == 5) {
                        KRISHANGI();
                    } else {
                        ARKA();
                    }
                } else if (groupPosition == 2) {
                    if (childPosition == 0) {
                        SUBHASHREE();
                    } else {
                        ROHAN();
                    }

                } else if (groupPosition == 3) {
                    if (childPosition == 0) {
                        ABHIROOP();
                    } else {
                        PAMOLI();
                    }
                } else if (groupPosition == 4) {
                    if (childPosition == 0) {
                        PRADUMN();
                    } else if (childPosition == 1) {
                        KANIGIRI();
                    } else if (childPosition == 2) {
                        ADUTTA();
                    } else {
                        SIDHANT();
                    }
                } else if (groupPosition == 5) {
                    TARINI();
                } else if (groupPosition == 6) {
                    if (childPosition == 0) {
                        SABYASACHI();
                    } else if (childPosition == 1) {
                        PRAGYA();
                    } else {
                        ARADHANA();
                    }
                } else if (groupPosition == 7) {
                    if (childPosition == 0) {
                        RAHUL();
                    } else {
                        SHIVJI();
                    }
                } else if (groupPosition == 8) {
                    if (childPosition == 0) {
                        MANISHA();
                    } else {
                        JAI();
                    }
                } else if (groupPosition == 9) {
                    if (childPosition == 0) {
                        SAGARIKA();
                    } else {
                        PRATIK();
                    }
                } else if (groupPosition == 10) {
                    SHAILESH();
                }

                return false;
            }
            private void RISHANSHI() {
                Intent myIntent = new Intent(getActivity(), rishanshi.class);
                startActivity(myIntent);
            }

            private void VINEET() {
                Intent myIntent = new Intent(getActivity(), vvineet.class);
                startActivity(myIntent);
            }

            private void KAVYA() {
                Intent myIntent = new Intent(getActivity(), sama.class);
                startActivity(myIntent);
            }

            private void PUSHPAK() {
                Intent myIntent = new Intent(getActivity(), pushpak.class);
                startActivity(myIntent);
            }

            private void UTKARSH() {
                Intent myIntent = new Intent(getActivity(), utkarsh.class);
                startActivity(myIntent);
            }

            private void KRISHANGI() {
                Intent myIntent = new Intent(getActivity(), krishangi.class);
                startActivity(myIntent);
            }

            private void ARKA() {
                Intent myIntent = new Intent(getActivity(), arka.class);
                startActivity(myIntent);
            }


            private void ANKESH() {
                Intent myIntent = new Intent(getActivity(), ankesh.class);
                startActivity(myIntent);
            }

            private void SHADAAB() {
                Intent myIntent = new Intent(getActivity(), shadaab.class);
                startActivity(myIntent);
            }



            private void SHAILESH() {
                Intent myIntent = new Intent(getActivity(), shailesh.class);
                startActivity(myIntent);
            }

            private void SUBHASHREE() {
                Intent myIntent = new Intent(getActivity(), subhashree.class);
                startActivity(myIntent);
            }

            private void ROHAN() {
                Intent myIntent = new Intent(getActivity(), rohan.class);
                startActivity(myIntent);
            }

            private void ABHIROOP() {
                Intent myIntent = new Intent(getActivity(), abhiroop.class);
                startActivity(myIntent);
            }

            private void PAMOLI() {
                Intent myIntent = new Intent(getActivity(), pamoli.class);
                startActivity(myIntent);
            }

            private void PRADUMN() {
                Intent myIntent = new Intent(getActivity(), pradumn.class);
                startActivity(myIntent);
            }

            private void KANIGIRI() {
                Intent myIntent = new Intent(getActivity(), kanigiri.class);
                startActivity(myIntent);
            }

            private void ADUTTA() {
                Intent myIntent = new Intent(getActivity(), adutta.class);
                startActivity(myIntent);
            }

            private void SIDHANT() {
                Intent myIntent = new Intent(getActivity(), sidhant.class);
                startActivity(myIntent);
            }

            private void TARINI() {
                Intent myIntent = new Intent(getActivity(), tarini.class);
                startActivity(myIntent);
            }

            private void SABYASACHI() {
                Intent myIntent = new Intent(getActivity(), sabya.class);
                startActivity(myIntent);
            }

            private void PRAGYA() {
                Intent myIntent = new Intent(getActivity(), pragya.class);
                startActivity(myIntent);
            }

            private void ARADHANA() {
                Intent myIntent = new Intent(getActivity(), aradhana.class);
                startActivity(myIntent);
            }

            private void RAHUL() {
                Intent myIntent = new Intent(getActivity(), rahul.class);
                startActivity(myIntent);
            }

            private void SHIVJI() {
                Intent myIntent = new Intent(getActivity(), shivji.class);
                startActivity(myIntent);
            }

            private void MANISHA() {
                Intent myIntent = new Intent(getActivity(), manisha.class);
                startActivity(myIntent);
            }

            private void JAI() {
                Intent myIntent = new Intent(getActivity(), jai.class);
                startActivity(myIntent);
            }

            private void SAGARIKA() {
                Intent myIntent = new Intent(getActivity(), saga.class);
                startActivity(myIntent);
            }

            private void PRATIK() {
                Intent myIntent = new Intent(getActivity(), pratik.class);
                startActivity(myIntent);
            }

        });



        return rootView;
    }
}

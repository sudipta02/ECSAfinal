package com.Sudipta.android.ecsa;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ListView listView;
    private ActionBarDrawerToggle drawerListener;
    private MyAdapter myAdapter;
    public Button faculty_list;
    public Button student_council;
    public Button subject_notes;

    public void facultyList(){
        faculty_list = (Button) findViewById(R.id.faculty_list);
        faculty_list.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                facultyList frag = new facultyList();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.mainContent, frag).addToBackStack(null).commit();
            }
        });
    }

    public void studentCouncil(){
        student_council = (Button) findViewById(R.id.student_council);
        student_council.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentCouncil frag = new studentCouncil();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.mainContent, frag).addToBackStack(null).commit();
            }
        });
    }


    public void subject_notes_call(){
        subject_notes= (Button)findViewById(R.id.subject_notes);
        subject_notes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                /** Intent toy = new Intent(MainActivity.this,second.class);
                 startActivity(toy);
                 *
                 * */

                subjectNotes frag = new subjectNotes();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.mainContent, frag).addToBackStack(null).commit();
            }
        });


    }

    /** navigate back to the activity from fragment **/
    @Override
    public void onBackPressed() {
        if(this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START);

        }else {
            if (getFragmentManager().getBackStackEntryCount() == 0) {
                this.finish();
            } else {
                getFragmentManager().popBackStack();
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.drawerList);
        myAdapter = new MyAdapter(this);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new DrawerItemClickListener());
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawerListener = new ActionBarDrawerToggle(this, drawerLayout,
                R.string.drawer_open, R.string.drawer_close) {

            @Override
            public void onDrawerClosed(View drawerView) {
            }

            @Override
            public void onDrawerOpened(View drawerView) {
            }
        };

        drawerListener.setDrawerIndicatorEnabled(true);
        drawerLayout.setDrawerListener(drawerListener);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }

        facultyList();
        studentCouncil();
        subject_notes_call();
    }

    /** public void faculty(View view){
     WebView webview = (WebView) findViewById(R.id.webview);
     webview.loadUrl("http://www.ecsa.co.in");
     }
     */

    /**
     * opens website on click About Department
     *
     *
     */

    public void about_dept(View view) {
        goToUrl("http://ecsa.co.in/");
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerListener.onOptionsItemSelected(item)) {

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerListener.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerListener.syncState();
    }


    private class DrawerItemClickListener implements ListView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }

    public void selectItem(int position) {

        if(position == 0){
            Intent a = new Intent(MainActivity.this, MainActivity.class);
            startActivity(a);

        }

        else if(position == 1) {
            inSemMarks frag = new inSemMarks();
            FragmentManager manager = getFragmentManager();
            manager.beginTransaction().replace(R.id.mainContent, frag).addToBackStack(null).commit();

        }

        else if (position == 2){
            studentList frag = new studentList();
            FragmentManager manager = getFragmentManager();
            manager.beginTransaction().replace(R.id.mainContent, frag).addToBackStack(null).commit();
        }

        else if (position == 3){
            reachUs frag = new reachUs();
            FragmentManager manager = getFragmentManager();
            manager.beginTransaction().replace(R.id.mainContent, frag).addToBackStack(null).commit();
        }
        else{
           ecsaV2 frag = new ecsaV2();
            FragmentManager manager = getFragmentManager();
            manager.beginTransaction().replace(R.id.mainContent,frag).addToBackStack(null).commit();
        }


        listView.setItemChecked(position, true);
        drawerLayout.closeDrawer(listView);

    }


    class MyAdapter extends BaseAdapter {

        private Context context;

        int[] images = {R.drawable.home_filled, R.drawable.agreement_filled, R.drawable.student,
                R.drawable.faq_filled, R.drawable.ecsa_black};

        String[] ecsa2;

        public MyAdapter(Context context) {
            this.context = context;
            ecsa2 = context.getResources().getStringArray(R.array.ecsa);
        }

        @Override
        public int getCount() {
            return ecsa2.length;
        }

        @Override
        public Object getItem(int position) {
            return ecsa2[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View row;

            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(R.layout.custom_view, parent, false);

            } else {
                row = convertView;

            }
            TextView titleTextView = (TextView) row.findViewById(R.id.textView);
            ImageView titleImageView = (ImageView) row.findViewById(R.id.imageView);
            titleTextView.setText(ecsa2[position]);
            titleImageView.setImageResource(images[position]);
            return row;
        }
    }
}
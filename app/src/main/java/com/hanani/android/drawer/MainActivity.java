package com.hanani.android.drawer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Floating Action Button", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //set default fragment
        FragmentTransaction fragment = getSupportFragmentManager().beginTransaction();
        fragment.replace(R.id.container, new FragmentOne());
        fragment.commit();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            setContentFragment(new FragmentOne());
            fab.setVisibility(View.VISIBLE);
        } else if (id == R.id.nav_gallery) {
            setContentFragment(new FragmentTwo());
            fab.setVisibility(View.VISIBLE);
        } else if (id == R.id.nav_slideshow) {
            setContentFragment(new FragmentThree());
            fab.setVisibility(View.GONE);
        } else if (id == R.id.nav_manage) {
            setContentFragment(new FragmentFour());
            fab.setVisibility(View.GONE);
        } else if (id == R.id.nav_share) {
            Snackbar.make(drawer, "Share!", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        } else if (id == R.id.nav_send) {
            Snackbar.make(drawer, "Send!", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void setContentFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.container, fragment,"current_fragment")
                .commit();
    }

    /**
     * link toolbar home button with drawer.
     * @param toolbar toolbar to be used.
     */
    public void linkToolbar(Toolbar toolbar){
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
    }
}

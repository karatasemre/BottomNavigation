package com.tutorials.tutorialbottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.tutorials.tutorialbottomnavigation.fragments.OneFragment;
import com.tutorials.tutorialbottomnavigation.fragments.ThreeFragment;
import com.tutorials.tutorialbottomnavigation.fragments.TwoFragment;
import com.tutorials.tutorialbottomnavigation.utils.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);


        navigation.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.action_one:
                                selectedFragment = OneFragment.newInstance();
                                break;
                            case R.id.action_two:
                                selectedFragment = TwoFragment.newInstance();
                                break;
                            case R.id.action_three:
                                selectedFragment = ThreeFragment.newInstance();
                                break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });

        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, OneFragment.newInstance());
        transaction.commit();

        //Used to select an item programmatically
        navigation.getMenu().getItem(0).setChecked(true);
    }
}

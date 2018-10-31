package com.example.administrator.mobileshopheshuang;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.administrator.mobileshopheshuang.NavigationFragment;

public class MainActivity extends BaseActivity {
    private NavigationFragment navigationFragment;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationFragment = new NavigationFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_frame,navigationFragment ).commit();
    }

}

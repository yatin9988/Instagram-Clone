package com.example.instagram.Share;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.instagram.R;
import com.example.instagram.Utils.BottomNavigationHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ShareActivity extends AppCompatActivity {

    private static final String TAG = ShareActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem item = menu.findItem(R.id.ic_circle);
        item.setChecked(true);
        BottomNavigationHelper.enableNavigation(this,bottomNavigationView);
    }
}

package com.abyx.noticer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Pieter on 30-7-2015.
 */
public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment()).commit();

    }
}

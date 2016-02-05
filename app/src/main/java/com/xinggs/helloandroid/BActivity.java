package com.xinggs.helloandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        System.out.println("===on create B==");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("====on start B=====");
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("===on resume B===");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("===on pause B====");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("====on stop B====");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.println("====on restart B====");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("=====on destory B=====");
    }

}

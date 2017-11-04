package com.fukaimei.tabbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_tab_button).setOnClickListener(this);
        findViewById(R.id.btn_tab_host).setOnClickListener(this);
        findViewById(R.id.btn_tab_group).setOnClickListener(this);
        findViewById(R.id.btn_tab_fragment).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_tab_button) {
            Intent intent = new Intent(this, TabButtonActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_tab_host) {
            Intent intent = new Intent(this, TabHostActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_tab_group) {
            Intent intent = new Intent(this, TabGroupActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_tab_fragment) {
            Intent intent = new Intent(this, TabFragmentActivity.class);
            startActivity(intent);
        }
    }
}

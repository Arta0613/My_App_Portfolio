package com.rushlimit.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonMessage(View v) {
        Toast.makeText(this,
                "This button will launch my app: " + ((Button) v).getText() + "!",
                Toast.LENGTH_SHORT).show();
    }
}

package org.institutoserpis.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("Texto en el textView");
        layout.addView(textView);
        getIntent().getStringExtra("MESSAGE");
    }
}

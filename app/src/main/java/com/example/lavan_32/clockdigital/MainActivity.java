package com.example.lavan_32.clockdigital;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface d=Typeface.createFromAsset(getAssets(),"fonts/segment7.otf");
        TextView t1=(TextView) findViewById(R.id.mm);
        TextView t2=(TextView) findViewById(R.id.mn);
        TextView t3=(TextView) findViewById(R.id.mz);

        t1.setTypeface(d);
        t2.setTypeface(d);
        t3.setTypeface(d);


    }
}

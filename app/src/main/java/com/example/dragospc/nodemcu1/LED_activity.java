package com.example.dragospc.nodemcu1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LED_activity extends AppCompatActivity {
    private static Button on1,on2,off1,off2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led_activity);

        on1=(Button) findViewById(R.id.but1on);
        off1=(Button) findViewById(R.id.but1off);
        on2=(Button) findViewById(R.id.but2on);
        off2=(Button) findViewById(R.id.but2off);

        on1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                on1 process1 = new on1();
                process1.execute();

            }
        });

        on2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                on2 process1 = new on2();
                process1.execute();

            }
        });

        off1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                off1 process1 = new off1();
                process1.execute();

            }
        });

        off2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                off2 process1 = new off2();
                process1.execute();

            }
        });
    }
}

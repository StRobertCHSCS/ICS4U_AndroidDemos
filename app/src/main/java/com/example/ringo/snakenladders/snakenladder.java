package com.example.ringo.snakenladders;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class snakenladder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snakenladder);

        ArrayList<Integer> start = new ArrayList<Integer>();




    }

    private int progress = 1;

    public void dice(View v) {
        EditText number = (EditText)findViewById(R.id.number_input);
        String num = number.getText().toString();
        int intNum = Integer.parseInt(num);

        TextView results = (TextView)findViewById(R.id.results);
        results.setText(getPosition(intNum));

    }

    private String getPosition(int steps){

        if (steps == 0) {
            System.out.print("You Quit!");
        }

        else if (steps >= 2 && steps <= 12) {
            progress += steps;
            if (progress == 54 || progress == 90 || progress == 99 || progress == 9 || progress == 40 || progress == 67) {
                for (int j = 0; j < 6; j++) {
                    if (progress == )
                    }
                }
            }
        }

    }
}

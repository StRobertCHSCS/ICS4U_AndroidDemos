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
    private int[] start = {54, 90, 99, 9, 40 ,67};
    private int[] end = {19, 48, 77, 34, 64, 66};


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
                    if (progress == start[j]) {
                        progress = end[j];
                        System.out.print("You are now on square" + "" + progress);
                    }
                }
            }

            else if (progress < 100) {
                System.out.print("You are now on square" + "" + progress);
            }

            else {
                System.out.print("You are now on square 100");
                System.out.print("You Win!");
            }
        }

        else {
            System.out.print("You have to pick a number between 2 and 12");
        }
    }
}

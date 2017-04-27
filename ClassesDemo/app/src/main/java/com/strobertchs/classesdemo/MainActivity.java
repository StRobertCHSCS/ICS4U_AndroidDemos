package com.strobertchs.classesdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Ranger player1;
    private Ranger player2;

    private TextView txtPlayer1Health;
    private TextView txtPlayer2Health;
    private TextView txtPlayer1Ammo;
    private TextView txtPlayer2Ammo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize players
        player1 = new Ranger("Red");
        player2 = new Ranger("Blue");

        txtPlayer1Health = (TextView) findViewById(R.id.player1Health);
        txtPlayer1Ammo = (TextView) findViewById(R.id.player1Ammo);

        txtPlayer2Health = (TextView) findViewById(R.id.player2Health);
        txtPlayer2Ammo = (TextView) findViewById(R.id.player2Ammo);

        update();

    }

    public void player1ShootClick(View v){
        player1.shoot(player2);
        update();
    }


    public void player2ShootClick(View v){
        player2.shoot(player1);
        update();
    }

    public void update(){

        txtPlayer1Health.setText(Integer.toString(player1.getHealth()));
        txtPlayer1Ammo.setText(Integer.toString(player1.getAmmo()));

        txtPlayer2Health.setText(Integer.toString(player2.getHealth()));
        txtPlayer2Ammo.setText(Integer.toString(player2.getAmmo()));

    }


}

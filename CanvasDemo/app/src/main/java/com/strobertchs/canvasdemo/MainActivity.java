package com.strobertchs.canvasdemo;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ourFrame = (ImageView) findViewById(R.id.imageView);

        //Create a bitmap object to use as our canvas
        Bitmap ourBitmap = Bitmap.createBitmap(1200,2400, Bitmap.Config.ARGB_8888);
  

        Canvas ourCanvas = new Canvas(ourBitmap);

        //A paint object that does our drawing, on our canvas
        Paint paint = new Paint();

        //Set the background color
        ourCanvas.drawColor(Color.BLACK);

        //Change the color of the virtual paint brush
        paint.setColor(Color.argb(255, 255, 255, 255));
        paint.setTextSize(50f);


        //Now draw a load of stuff on our canvas
        ourCanvas.drawText("Score: 42 Lives: 3 Hi: 97", 30, 80, paint);
        ourCanvas.drawLine(0, 110, 1200, 110, paint);
        ourCanvas.drawCircle(500, 400, 200, paint);
        ourCanvas.drawPoint(10, 260, paint);


        //Now put the canvas in the frame
        ourFrame.setImageBitmap(ourBitmap);


    }

    @Override
    public boolean onTouch(View v,MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        //do something with the x and y values
        return false;
    }
}

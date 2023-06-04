package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bg= Bitmap.createBitmap(720,1200,Bitmap.Config.ARGB_4444);

        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setImageBitmap(bg);

        Canvas canvas = new Canvas(bg);

        Paint paint = new Paint();

        paint.setColor(Color.BLUE);
        paint.setTextSize(50);

        canvas.drawText("Circle",170,600,paint);
        canvas.drawCircle(225,450,180,paint);

        paint.setColor(Color.MAGENTA);
        canvas.drawText("Rectangle",490,450,paint);
        canvas.drawRect(380,550,680,720,paint);

        paint.setColor(Color.GRAY);
        canvas.drawText("Square",170,800,paint);
        canvas.drawRect(150,850,350,1050,paint);

        paint.setColor(Color.RED);
        canvas.drawText("Line",489,889,paint);
        canvas.drawLine(550,850,550,1150,paint);

        paint.setColor(Color.DKGRAY);
        canvas.drawText("Arc and Face",70,200,paint);
        RectF rectF= new RectF(150,200,309,450);
        canvas.drawArc(rectF,180,180, false,paint);
        paint.setColor(Color.YELLOW);

        canvas.drawCircle(190,290,10,paint);
        canvas.drawCircle(260,290,10,paint);

        canvas.drawRect(220,300,230,370,paint);
        canvas.drawLine(180,370,270,370,paint);

        paint.setColor(Color.BLUE);
        canvas.rotate(-50);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("Rotate Text",10,550,paint);
    }
}
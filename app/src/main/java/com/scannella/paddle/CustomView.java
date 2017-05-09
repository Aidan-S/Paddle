package com.scannella.paddle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class CustomView extends View {

    private Rect rectangle;
    private Paint paint;
    float screenX = getResources().getDisplayMetrics().widthPixels;
    float screenY = getResources().getDisplayMetrics().heightPixels;


    public CustomView(Context context) {
        super(context);

        int sideLength = 30;
        int widthLength = 400;

        // create a rectangle that we'll draw later
        rectangle = new Rect(widthLength, sideLength, Math.round(screenX)/2, Math.round(screenY)-60);
        //rectangle = new Rect(Math.round(screenX)/2, Math.round(screenY)-60, widthLength, sideLength);

        // create the Paint and set its color
        paint = new Paint();
        paint.setColor(Color.GRAY);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);
        canvas.drawRect(rectangle, paint);
    }

}
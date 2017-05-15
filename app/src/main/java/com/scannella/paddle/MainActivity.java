package com.scannella.paddle;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    float screenX = getResources().getDisplayMetrics().widthPixels;
    float screenY = getResources().getDisplayMetrics().heightPixels;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Paint paint = new Paint();
        paint.setColor(Color.GRAY);

        Bitmap bg = Bitmap.createBitmap(Math.round(screenX), Math.round(screenY), Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(bg);




        /*Point racketPosition = new Point();
        racketPosition.x = Math.round(screenX) / 2;
        racketPosition.y = Math.round(screenY) - 520;
        int racketWidth = Math.round(screenX) / 8;
        int racketHeight = 10;

        canvas.drawRect(
                racketPosition.x - (racketWidth / 2),
                racketPosition.y - (racketHeight / 2),
                racketPosition.x + (racketWidth / 2),
                racketPosition.y + racketHeight, paint);

    }*/

}
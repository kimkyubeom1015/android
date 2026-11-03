package com.example.chapter09;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class Self0901 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));
    }

    private static class MyGraphicView extends View {
        public MyGraphicView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setAntiAlias(true);

            paint.setStrokeWidth(30);
            paint.setColor(Color.RED);
            canvas.drawLine(50, 50, 900, 900, paint);

            paint.setStrokeWidth(30);
            paint.setColor(Color.GREEN);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawLine(50, 900, 900, 50, paint);

            paint.setColor(Color.BLACK);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(10);

            RectF rectF = new RectF();

            rectF.set(50, 900, 50 + 900, 900 + 300);
            canvas.drawOval(rectF, paint);

            paint.setColor(Color.BLACK);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(10);
            rectF.set(475, 950, 475 + 100, 950 + 100);
            canvas.drawArc(rectF, 40, 110, true, paint);

            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.BLACK);
            rectF.set(100, 375, 100 + 200, 375 + 200);
            canvas.drawRect(rectF, paint);

            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(10);
            rectF.set(425, 200, 425 + 100, 200 + 100);
            canvas.drawRect(rectF, paint);

            paint.setColor(Color.LTGRAY);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(2);
            RectF rect3 = new RectF(650, 375, 650 + 200, 375 + 200);
            canvas.drawRoundRect(rect3,40, 40, paint);

            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(10);
            rectF.set(425, 700, 425 + 100, 700 + 100);
            canvas.drawRect(rectF, paint);


        }
    }

}

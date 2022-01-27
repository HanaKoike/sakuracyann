package com.example.sakuracyann;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class SubActivity extends View {
    public final int FIRST = 1; //状態を表す定数 1
    public final int SECOND = 2; //状態を表す定数 2
    public final int Third = 3; //状態を表す定数 2
    public final int Forth = 4; //状態を表す定数 2

    private Paint mPaint = new Paint(); //描画用のスタイル設定など
    private Bitmap mBmp1 = null; //表示用の Bitmap
    private Bitmap mBmp2 = null; //表示用の Bitmap
    private Bitmap mBmp3 = null; //表示用の Bitmap
    private Bitmap mBmp4 = null; //表示用の Bitmap
    private int mTop, mLeft;
    private int mW1, mH1; //画像の幅と高さ
    private int mW2, mH2; //画像の幅と高さ
    private int mW3, mH3; //画像の幅と高さ
    private int mW4, mH4; //画像の幅と高さ

    int state; //状態を表す変数

    /**
     * コンストラクタ
     *
     * @param context
     * @param attrs
     */
    public SubActivity(Context context, AttributeSet attrs) {
        super(context, attrs);
        state = FIRST; //はじめは状態1
        Resources rs = this.getResources(); //リソースを取得 (R クラスから取得)
        mBmp1 = BitmapFactory.decodeResource(rs, R.mipmap.okujyou); //リソースから画像を取得
        mBmp2 = BitmapFactory.decodeResource(rs, R.mipmap.tosyokann); //リソースから画像を取得
        mBmp3 = BitmapFactory.decodeResource(rs, R.mipmap.tosyokann2); //リソースから画像を取得
        mBmp4 = BitmapFactory.decodeResource(rs, R.mipmap.otameshi); //リソースから画像を取得
        mTop = 0;
        mLeft = 0;
        mW1 = mBmp1.getWidth();
        mH1= mBmp1.getHeight();
        mW2 = mBmp2.getWidth();
        mH2 = mBmp2.getHeight();
        mW3 = mBmp3.getWidth();
        mH3 = mBmp3.getHeight();
        mW3 = mBmp4.getWidth();
        mH3 = mBmp4.getHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();

        if (state == FIRST) { //状態 1 の場合の描画
            canvas.drawBitmap(mBmp1, mLeft, mTop, mPaint);
            //canvas.drawARGB(255, 255, 255, 255);
            //canvas.drawRect(100, 100, 300, 200, p);
        } else if (state == SECOND) { //状態 2 の場合の描画
            canvas.drawBitmap(mBmp2, mLeft, mTop, mPaint);
        } else if (state == Third) { //状態 2 の場合の描画
            canvas.drawBitmap(mBmp3, mLeft, mTop, mPaint);
        } else if (state == Forth) { //状態 2 の場合の描画
            canvas.drawBitmap(mBmp4, mLeft, mTop, mPaint);
        } else { //それ以外の場合は,Log にエラーを吐き出す
            Log.d("error", "never come here");
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int x = (int) event.getX();
        int y = (int) event.getY();

//長方形の内部で
        if (x > 0 && x < 100000000 && y > 0 && y < 10000000) {
            if (state == FIRST) { //状態1だったら状態2へ
                state = SECOND;
            } else if (state == SECOND) { //状態 2 だったら状態 3 へ
                state = Third;
            } else if(state == Third) {
                state = Forth;
            } else if(state == Forth) {
                state = Forth;
            }else {
                Log.d("error", "never come here");
            }
        }

        invalidate(); //再描画
        return super.onTouchEvent(event);
    }

}

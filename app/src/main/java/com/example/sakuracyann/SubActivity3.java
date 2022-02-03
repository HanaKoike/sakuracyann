package com.example.sakuracyann;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class SubActivity3 extends View {
    public final int First = 1; //状態を表す定数
    public final int Second = 2;
    public final int Third = 3;
    public final int Forth = 4;
    public final int Fifth = 5;
    public final int Sixth = 6;
    public final int Seventh = 7;
    public final int Eighth = 8;
    public final int Ninth = 9;
    public final int Tenth = 10;
    public final int Eleventh = 11;
    public final int Twelfth = 12;
    public final int Thirteenth = 13;
    public final int Fourteenth = 14;
    public final int Fifteenth = 15;
    public final int Sixteenth = 16;

    private Paint mPaint = new Paint(); //描画用のスタイル設定など
    private Bitmap mBmp1 = null; //表示用の Bitmap
    private Bitmap mBmp2 = null;
    private Bitmap mBmp3 = null;
    private Bitmap mBmp4 = null;
    private Bitmap mBmp5 = null;
    private Bitmap mBmp6 = null;
    private Bitmap mBmp7 = null;
    private Bitmap mBmp8 = null;
    private Bitmap mBmp9 = null;
    private Bitmap mBmp10 = null;
    private Bitmap mBmp11 = null;
    private Bitmap mBmp12 = null;
    private Bitmap mBmp13 = null;
    private Bitmap mBmp14 = null;
    private Bitmap mBmp15 = null;
    private Bitmap mBmp16 = null;

    private int mTop, mLeft;
    private int mW1, mH1; //画像の幅と高さ

    int state; //状態を表す変数

    /**
     * コンストラクタ
     *
     * @param context
     * @param attrs
     */
    public SubActivity3(Context context, AttributeSet attrs) {
        super(context, attrs);
        state = First; //はじめは状態1
        Resources rs = this.getResources(); //リソースを取得 (R クラスから取得)
        mBmp1 = BitmapFactory.decodeResource(rs, R.mipmap.kore1); //リソースから画像を取得
        mBmp2 = BitmapFactory.decodeResource(rs, R.mipmap.kore2); //リソースから画像を取得
        mBmp3 = BitmapFactory.decodeResource(rs, R.mipmap.kore3); //リソースから画像を取得
        mBmp4 = BitmapFactory.decodeResource(rs, R.mipmap.kore4); //リソースから画像を取得
        mBmp5 = BitmapFactory.decodeResource(rs, R.mipmap.kore5); //リソースから画像を取得
        mBmp6 = BitmapFactory.decodeResource(rs, R.mipmap.kore6); //リソースから画像を取得
        mBmp7 = BitmapFactory.decodeResource(rs, R.mipmap.kore7); //リソースから画像を取得
        mBmp8 = BitmapFactory.decodeResource(rs, R.mipmap.kore8); //リソースから画像を取得
        mBmp9 = BitmapFactory.decodeResource(rs, R.mipmap.kore9); //リソースから画像を取得
        mBmp10 = BitmapFactory.decodeResource(rs, R.mipmap.kore10); //リソースから画像を取得
        mBmp11 = BitmapFactory.decodeResource(rs, R.mipmap.kore11); //リソースから画像を取得
        mBmp12 = BitmapFactory.decodeResource(rs, R.mipmap.kore12); //リソースから画像を取得
        mBmp13 = BitmapFactory.decodeResource(rs, R.mipmap.kore13); //リソースから画像を取得
        mBmp14 = BitmapFactory.decodeResource(rs, R.mipmap.kore14); //リソースから画像を取得
        mBmp15 = BitmapFactory.decodeResource(rs, R.mipmap.kore15); //リソースから画像を取得
        mBmp16 = BitmapFactory.decodeResource(rs, R.mipmap.kore16); //リソースから画像を取得

        mTop = 0;
        mLeft = 0;
        mW1 = mBmp1.getWidth();
        mH1 = mBmp1.getHeight();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();

        if (state == First) { //状態 1 の場合の描画
            canvas.drawBitmap(mBmp1, mLeft, mTop, mPaint);
        } else if (state == Second) { //状態 2 の場合の描画
            canvas.drawBitmap(mBmp2, mLeft, mTop, mPaint);
        } else if (state == Third) {
            canvas.drawBitmap(mBmp3, mLeft, mTop, mPaint);
        } else if (state == Forth) {
            canvas.drawBitmap(mBmp4, mLeft, mTop, mPaint);
        } else if (state == Fifth) {
            canvas.drawBitmap(mBmp5, mLeft, mTop, mPaint);
        } else if (state == Sixth) {
            canvas.drawBitmap(mBmp6, mLeft, mTop, mPaint);
        } else if (state == Seventh) {
            canvas.drawBitmap(mBmp7, mLeft, mTop, mPaint);
        } else if (state == Eighth) {
            canvas.drawBitmap(mBmp8, mLeft, mTop, mPaint);
        } else if (state == Ninth) {
            canvas.drawBitmap(mBmp9, mLeft, mTop, mPaint);
        } else if (state == Tenth) {
            canvas.drawBitmap(mBmp10, mLeft, mTop, mPaint);
        } else if (state == Eleventh) {
            canvas.drawBitmap(mBmp11, mLeft, mTop, mPaint);
        } else if (state == Twelfth) {
            canvas.drawBitmap(mBmp12, mLeft, mTop, mPaint);
        } else if (state == Thirteenth) {
            canvas.drawBitmap(mBmp13, mLeft, mTop, mPaint);
        } else if (state == Fourteenth) {
            canvas.drawBitmap(mBmp14, mLeft, mTop, mPaint);
        } else if (state == Fifteenth) {
            canvas.drawBitmap(mBmp15, mLeft, mTop, mPaint);
        } else if (state == Sixteenth) {
            canvas.drawBitmap(mBmp16, mLeft, mTop, mPaint);
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
            if (state == First) { //状態1だったら状態2へ
                state = Second;
            } else if (state == Second) { //状態2だったら状態3へ
                state = Third;
            } else if(state == Third) {
                state = Forth;
            } else if(state == Forth) {
                state = Fifth;
            } else if(state == Fifth) {
                state = Sixth;
            } else if(state == Sixth) {
                state = Seventh;
            } else if(state == Seventh) {
                state = Eighth;
            } else if(state == Eighth) {
                state = Ninth;
            } else if(state == Ninth) {
                state = Tenth;
            } else if(state == Tenth) {
                state = Eleventh;
            } else if(state == Eleventh) {
                state = Twelfth;
            } else if(state == Twelfth) {
                state = Thirteenth;
            } else if(state == Thirteenth) {
                state = Fourteenth;
            } else if(state == Fourteenth) {
                state = Fifteenth;
            } else if(state == Fifteenth) {
                state = Sixteenth;
            }else {
                Log.d("error", "never come here");
            }
        }

        invalidate(); //再描画
        return super.onTouchEvent(event);
    }

}


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

    public final int ichi = 17;
    public final int ni = 18;
    public final int sann = 19;
    public final int yonn = 20;
    public final int go = 21;
    public final int roku = 22;

    public final int owari = 23;
    public final int yokattane = 24;

    public final int wann = 25;
    public final int tuu = 26;
    public final int surii = 27;
    public final int foo = 28;
    public final int faibu = 29;
    public final int shikkusu = 30;
    public final int sebunn = 31;
    public final int eito = 32;
    public final int nainn = 33;
    public final int tenn = 34;
    public final int irebunn = 35;
    public final int tluwelubu = 36;
    public final int saathiinn = 37;
    public final int foothiinn = 38;
    public final int fifuthiinn = 39;

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

    private Bitmap mBmp17 = null;
    private Bitmap mBmp18 = null;
    private Bitmap mBmp19 = null;
    private Bitmap mBmp20 = null;
    private Bitmap mBmp21 = null;
    private Bitmap mBmp22 = null;

    private Bitmap mBmp23 = null;
    private Bitmap mBmp24 = null;

    private Bitmap mBmp25 = null;
    private Bitmap mBmp26 = null;
    private Bitmap mBmp27 = null;
    private Bitmap mBmp28 = null;
    private Bitmap mBmp29 = null;
    private Bitmap mBmp30 = null;
    private Bitmap mBmp31 = null;
    private Bitmap mBmp32 = null;
    private Bitmap mBmp33 = null;
    private Bitmap mBmp34 = null;
    private Bitmap mBmp35 = null;
    private Bitmap mBmp36 = null;
    private Bitmap mBmp37 = null;
    private Bitmap mBmp38 = null;
    private Bitmap mBmp39 = null;



    private int mTop, mLeft;
    private int mW1, mH1;

    int count; //正答数をカウント

    int state; //状態を表す変数

    /**
     * コンストラクタ
     *
     * @param context
     * @param attrs
     */
    public SubActivity(Context context, AttributeSet attrs) {
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

        mBmp17 = BitmapFactory.decodeResource(rs, R.mipmap.korera1); //リソースから画像を取得
        mBmp18 = BitmapFactory.decodeResource(rs, R.mipmap.korera2); //リソースから画像を取得
        mBmp19 = BitmapFactory.decodeResource(rs, R.mipmap.korera3); //リソースから画像を取得
        mBmp20 = BitmapFactory.decodeResource(rs, R.mipmap.korera4); //リソースから画像を取得
        mBmp21 = BitmapFactory.decodeResource(rs, R.mipmap.korera5); //リソースから画像を取得
        mBmp22 = BitmapFactory.decodeResource(rs, R.mipmap.korera6); //リソースから画像を取得

        mBmp23 = BitmapFactory.decodeResource(rs, R.mipmap.normalend); //リソースから画像を取得
        mBmp24 = BitmapFactory.decodeResource(rs, R.mipmap.happyend); //リソースから画像を取得

        mBmp25 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu1); //リソースから画像を取得
        mBmp26 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu2); //リソースから画像を取得
        mBmp27 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu3); //リソースから画像を取得
        mBmp28 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu4); //リソースから画像を取得
        mBmp29 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu5); //リソースから画像を取得
        mBmp30 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu6); //リソースから画像を取得
        mBmp31 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu7); //リソースから画像を取得
        mBmp32 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu8); //リソースから画像を取得
        mBmp33 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu9); //リソースから画像を取得
        mBmp34 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu10); //リソースから画像を取得
        mBmp35 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu11); //リソースから画像を取得
        mBmp36 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu12); //リソースから画像を取得
        mBmp37 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu13); //リソースから画像を取得
        mBmp38 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu14); //リソースから画像を取得
        mBmp39 = BitmapFactory.decodeResource(rs, R.mipmap.tokubetu15); //リソースから画像を取得

        mTop = 0;
        mLeft = 0;
        mW1 = mBmp1.getWidth();
        mH1 = mBmp1.getHeight();

    }

    //画面の表示
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
        } else if (state == ichi) {
            canvas.drawBitmap(mBmp17, mLeft, mTop, mPaint);
        } else if (state == Forth) {
            canvas.drawBitmap(mBmp4, mLeft, mTop, mPaint);
        } else if (state == ni) {
            canvas.drawBitmap(mBmp18, mLeft, mTop, mPaint);
        } else if (state == Fifth) {
            canvas.drawBitmap(mBmp5, mLeft, mTop, mPaint);
        } else if (state == sann) {
            canvas.drawBitmap(mBmp19, mLeft, mTop, mPaint);
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
        } else if (state == yonn) {
            canvas.drawBitmap(mBmp20, mLeft, mTop, mPaint);
        } else if (state == Twelfth) {
            canvas.drawBitmap(mBmp12, mLeft, mTop, mPaint);
        } else if (state == Thirteenth) {
            canvas.drawBitmap(mBmp13, mLeft, mTop, mPaint);
        } else if (state == Fourteenth) {
            canvas.drawBitmap(mBmp14, mLeft, mTop, mPaint);
        } else if (state == Fifteenth) {
            canvas.drawBitmap(mBmp15, mLeft, mTop, mPaint);
        } else if (state == go) {
            canvas.drawBitmap(mBmp21, mLeft, mTop, mPaint);
        } else if (state == Sixteenth) {
            canvas.drawBitmap(mBmp16, mLeft, mTop, mPaint);
        } else if (state == roku) {
            canvas.drawBitmap(mBmp22, mLeft, mTop, mPaint);
        } else if (state == owari) {
            canvas.drawBitmap(mBmp23, mLeft, mTop, mPaint);
        } else if (state == yokattane) {
            canvas.drawBitmap(mBmp24, mLeft, mTop, mPaint);
        } else if (state == wann) {
            canvas.drawBitmap(mBmp25, mLeft, mTop, mPaint);
        } else if (state == tuu) {
            canvas.drawBitmap(mBmp26, mLeft, mTop, mPaint);
        } else if (state == surii) {
            canvas.drawBitmap(mBmp27, mLeft, mTop, mPaint);
        } else if (state == foo) {
            canvas.drawBitmap(mBmp28, mLeft, mTop, mPaint);
        } else if (state == faibu) {
            canvas.drawBitmap(mBmp29, mLeft, mTop, mPaint);
        } else if (state == shikkusu) {
            canvas.drawBitmap(mBmp30, mLeft, mTop, mPaint);
        } else if (state == sebunn) {
            canvas.drawBitmap(mBmp31, mLeft, mTop, mPaint);
        } else if (state == eito) {
            canvas.drawBitmap(mBmp32, mLeft, mTop, mPaint);
        } else if (state == nainn) {
            canvas.drawBitmap(mBmp33, mLeft, mTop, mPaint);
        } else if (state == tenn) {
            canvas.drawBitmap(mBmp34, mLeft, mTop, mPaint);
        } else if (state == irebunn) {
            canvas.drawBitmap(mBmp35, mLeft, mTop, mPaint);
        } else if (state == tluwelubu) {
            canvas.drawBitmap(mBmp36, mLeft, mTop, mPaint);
        } else if (state == saathiinn) {
            canvas.drawBitmap(mBmp37, mLeft, mTop, mPaint);
        } else if (state == foothiinn) {
            canvas.drawBitmap(mBmp38, mLeft, mTop, mPaint);
        } else if (state == fifuthiinn) {
            canvas.drawBitmap(mBmp39, mLeft, mTop, mPaint);
        } else {
            Log.d("error", "never come here");
        }
    }

    //タップの処理
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int x = (int) event.getX();
        int y = (int) event.getY();
        count  = 0;
        Log.d("SubActivity","変数 count は「" + count + "」");

        if (x > 0 && x < 100000000 && y > 0 && y < 10000000) {
            if (state == First) { //状態1だったら状態2へ
                state = Second;
            } else if (state == Second) { //状態2だったら状態3へ
                state = Third;
            } else if (state == Third) {
                state = ichi;
            } else if (state == ichi) {
                //上の方を選んだらHappyEndに近づく
                if (x > 0 && x < 100000 && y > 600 && y < 800) {
                    count++;
                    state = Forth;
                } else if (x > 0 && x < 100000 && y > 900 && y < 1100) {
                    state = Forth;
                }
            } else if (state == Forth) {
                state = ni;
            } else if (state == ni) {
                //下の方を選んだらHappyEndに近づく
                if (x > 0 && x < 100000 && y > 600 && y < 800) {
                    state = Fifth;
                } else if (x > 0 && x < 100000 && y > 900 && y < 1100) {
                    count++;
                    state = Fifth;
                }
            } else if (state == Fifth) {
                state = sann;
            } else if (state == sann) {
                //上の方を選んだらHappyEndに近づく
                if (x > 0 && x < 100000 && y > 600 && y < 800) {
                    count++;
                    state = Sixth;
                } else if (x > 0 && x < 100000 && y > 900 && y < 1100) {
                    state = Sixth;
                }
            } else if (state == Sixth) {
                state = Seventh;
            } else if (state == Seventh) {
                state = Eighth;
            } else if (state == Eighth) {
                state = Ninth;
            } else if (state == Ninth) {
                state = Tenth;
            } else if (state == Tenth) {
                state = Eleventh;
            } else if (state == Eleventh) {
                state = yonn;
            } else if (state == yonn) {
                //下の方を選んだらHappyEndに近づく
                if (x > 0 && x < 100000 && y > 600 && y < 800) {
                    state = Twelfth;
                } else if (x > 0 && x < 100000 && y > 900 && y < 1100) {
                    count++;
                    state = Twelfth;
                }
            }else if (state == Twelfth) {
                    state = Thirteenth;
            } else if (state == Thirteenth) {
                    state = Fourteenth;
            } else if (state == Fourteenth) {
                    state = Fifteenth;
            } else if (state == Fifteenth) {
                    state = go;
            } else if (state == go) {
                    //下の方を選んだらHappyEndに近づく
                    if (x > 0 && x < 100000 && y > 600 && y < 800) {
                        state = Sixteenth;
                    } else if (x > 0 && x < 100000 && y > 850 && y < 1100) {
                        count++;
                        state = Sixteenth;
                    }
            } else if (state == Sixteenth) {
                    state = roku;
            } else if (state == roku) {
                    //上の方を選んだらHappyEndに近づく
                    if (x > 0 && x < 100000 && y > 600 && y < 800) {
                        count++;
                        if (count == 6) {
                            state = wann;
                        } else {
                            state = owari;
                        }
                    } else if (x > 0 && x < 100000 && y > 900 && y < 1100) {
                        state = owari;
                    }
                } else if (state == wann) {
                   state = tuu;
                } else if (state == tuu) {
                   state = surii;
                } else if (state == surii) {
                   state = foo;
                } else if (state == foo) {
                   state = faibu;
                } else if (state == faibu) {
                   state = shikkusu;
                } else if (state == shikkusu) {
                   state = sebunn;
                } else if (state == sebunn) {
                   state = eito;
                } else if (state == eito) {
                   state = nainn;
                } else if (state == nainn) {
                   state = tenn;
                } else if (state == tenn) {
                   state = irebunn;
                } else if (state == irebunn) {
                   state = tluwelubu;
                } else if (state == tluwelubu) {
                   state = saathiinn;
                } else if (state == saathiinn) {
                   state = foothiinn;
                } else if (state == foothiinn) {
                   state = fifuthiinn;
                } else if (state == fifuthiinn) {
                   state = yokattane;
                }else {
                    Log.d("error", "never come here");
                }
        }
        invalidate(); //再描画
        return super.onTouchEvent(event);
    }
 }

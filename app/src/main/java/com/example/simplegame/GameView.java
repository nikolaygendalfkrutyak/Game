package com.example.simplegame;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class GameView extends SurfaceView implements Runnable {
    private Context mContext;

    @Override
    public void run() {

    }
    public GameView (Context context){
        super(context);
        init(context);
    }
    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }
    public GameView(Context context, AttributeSet attrs, int
            defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void pause (){}
    public void resume(){}
    private void init(Context context) {
        mContext = context;
    }
}

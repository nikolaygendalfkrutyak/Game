package com.example.simplegame;

public class FlashLightCone {
    private int mX;
    private int mY;
    private int mRadius;

    public int getmX() {
        return mX;
    }


    public int getmY() {
        return mY;
    }

    public int getmRadius() {
        return mRadius;
    }
    public void update (int newX, int newY){
        mX= newX;
        mY= newY;
    }
    public FlashLightCone (int viewWidth, int viewHeight){
        mX = viewWidth/2;
        mY = viewHeight/2;
        mRadius = ((viewWidth<=viewHeight)? mX/3 : mY/3);
    }
}

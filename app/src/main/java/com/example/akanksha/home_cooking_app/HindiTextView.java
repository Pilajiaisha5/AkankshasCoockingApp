package com.example.akanksha.home_cooking_app;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class HindiTextView extends android.support.v7.widget.AppCompatTextView {


    public HindiTextView(Context context) {
        super(context);
    }

    public HindiTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HindiTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void initTypeface(Context context){
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "Kruti_Dev_080_Condensed.ttf");
        this.setTypeface(typeface);
    }
}

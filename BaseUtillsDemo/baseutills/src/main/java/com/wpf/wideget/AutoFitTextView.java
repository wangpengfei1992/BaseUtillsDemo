package com.wpf.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;


/**
 * Author: feipeng.wang
 * Time:   2022/5/24
 * Description : 自定义TextView，文本内容自动调整字体大小以适应TextView的大小
 */
public class AutoFitTextView extends androidx.appcompat.widget.AppCompatTextView {
    private Paint mTextPaint;
    private float mTextSize;
    public AutoFitTextView(Context context) {
        super(context);
    }
    public AutoFitTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    /**
     * Re size the font so the specified text fits in the text box assuming the
     * text box is the specified width.
     */
    private void refitText(String text, int textViewWidth) {
        if (text == null || textViewWidth <= 0)
            return;
        mTextPaint = new Paint();
        mTextPaint.set(this.getPaint());
        int availableTextViewWidth = getWidth() - getPaddingLeft() - getPaddingRight();
        float[] charsWidthArr = new float[text.length()];
        Rect boundsRect = new Rect();
        mTextPaint.getTextBounds(text, 0, text.length(), boundsRect);
        int textWidth = boundsRect.width();
        mTextSize = getTextSize();
        while (textWidth > availableTextViewWidth) {
            mTextSize -= 1;
            mTextPaint.setTextSize(mTextSize);
            textWidth = mTextPaint.getTextWidths(text, charsWidthArr);
        }
        this.setTextSize(TypedValue.COMPLEX_UNIT_PX, mTextSize);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        refitText(this.getText().toString(), this.getMaxWidth());
    }
}


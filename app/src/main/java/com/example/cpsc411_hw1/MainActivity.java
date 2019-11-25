package com.example.cpsc411_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HorizontalScrollView hsv = new HorizontalScrollView(this);
        HorizontalScrollView.LayoutParams scParams = new HorizontalScrollView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        hsv.setLayoutParams(scParams);

        GridLayout gl = new GridLayout(this);
        gl.setRowCount(12);
        gl.setColumnCount(5);

        TextView tv;
        GridLayout.LayoutParams tempParams;

        for(int i = 0; i < 11; i++){
            tempParams = new GridLayout.LayoutParams(GridLayout.spec(i),GridLayout.spec(0));
            tempParams.setGravity(Gravity.FILL_HORIZONTAL);
            tv = tv = createTV((i+1)+"", tempParams, "gray", true);

            gl.addView(tv);
        }

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(0),GridLayout.spec(1,4));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("\"Rules void hello1(int hour)\"", tempParams, "black", true);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(1,2),GridLayout.spec(1));
        tempParams.setGravity(Gravity.CENTER);
        tv = createTV("properties", tempParams, "none", true);
        tv.setPadding((int)(getResources().getDisplayMetrics().density * 16 + 0.5f),0,(int)(getResources().getDisplayMetrics().density * 16 + 0.5f),0);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(1),GridLayout.spec(2,2));
        tempParams.setGravity(Gravity.CENTER);
        tv = createTV("name", tempParams, "none", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(2),GridLayout.spec(2,2));
        tempParams.setGravity(Gravity.CENTER);
        tv = createTV("catagory", tempParams, "none", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(1),GridLayout.spec(4));
        tempParams.setGravity(Gravity.LEFT);
        tv = createTV("Day Hour Classification", tempParams, "none", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(2),GridLayout.spec(4));
        tempParams.setGravity(Gravity.LEFT);
        tv = createTV("Day and Time", tempParams, "none", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(3),GridLayout.spec(1));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("Rule", tempParams, "blue", true);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(3),GridLayout.spec(2,2));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("C1", tempParams, "blue", true);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(3),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("A1", tempParams, "blue", true);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(4),GridLayout.spec(1));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("", tempParams, "blue", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(4),GridLayout.spec(2,2));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("min <= hour && hour <= max", tempParams, "blue", true);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(4),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("System.out.println(greeting + \\\", World!\\\")\"", tempParams, "blue", true);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(5),GridLayout.spec(1));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("", tempParams, "blue", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(5),GridLayout.spec(2));
        tv = createTV("      int min      ", tempParams, "blue", true);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(5),GridLayout.spec(3));
        tv = createTV("       int max       ", tempParams, "blue", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(5),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("String greeting!", tempParams, "blue", true);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(6),GridLayout.spec(1));
        tv = createTV("Rule", tempParams, "none", false);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(6),GridLayout.spec(2));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("From", tempParams, "yellow", false);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(6),GridLayout.spec(3));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("To", tempParams, "yellow", false);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(6),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("Greeting!", tempParams, "orange", false);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        gl.addView(tv);

        //Setting Bottom Content
        tempParams = new GridLayout.LayoutParams(GridLayout.spec(7),GridLayout.spec(1));
        tv = createTV("R10", tempParams, "none", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(7),GridLayout.spec(2));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("0", tempParams, "yellow", false);
        tv.setGravity(Gravity.RIGHT);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(7),GridLayout.spec(3));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("11", tempParams, "yellow", false);
        tv.setGravity(Gravity.RIGHT);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(7),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("Good Morning", tempParams, "orange", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(8),GridLayout.spec(1));
        tv = createTV("R20", tempParams, "none", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(8),GridLayout.spec(2));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("12", tempParams, "yellow", false);
        tv.setGravity(Gravity.RIGHT);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(8),GridLayout.spec(3));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("17", tempParams, "yellow", false);
        tv.setGravity(Gravity.RIGHT);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(8),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("Good Afternoon", tempParams, "orange", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(9),GridLayout.spec(1));
        tv = createTV("R30", tempParams, "none", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(9),GridLayout.spec(2));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("18", tempParams, "yellow", false);
        tv.setGravity(Gravity.RIGHT);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(9),GridLayout.spec(3));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("21", tempParams, "yellow", false);
        tv.setGravity(Gravity.RIGHT);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(9),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("Good Evening", tempParams, "orange", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(10),GridLayout.spec(1));
        tv = createTV("R40", tempParams, "none", false);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(10),GridLayout.spec(2));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("22", tempParams, "yellow", false);
        tv.setGravity(Gravity.RIGHT);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(10),GridLayout.spec(3));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("23", tempParams, "yellow", false);
        tv.setGravity(Gravity.RIGHT);
        gl.addView(tv);

        tempParams = new GridLayout.LayoutParams(GridLayout.spec(10),GridLayout.spec(4));
        tempParams.setGravity(Gravity.FILL);
        tv = createTV("Good Night", tempParams, "orange", false);
        gl.addView(tv);

        hsv.addView(gl);
        setContentView(hsv);
    }
    
    public TextView createTV(String txt, GridLayout.LayoutParams pram, String color, boolean center) {
        TextView tv;
        tv = new TextView(this);
        tv.setText(txt);
        tv.setLayoutParams(pram);

        if (center) {
            tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        }

        if (color == "yellow") {
            tv.setBackgroundColor(Color.parseColor("#ffff66"));
        }
        else if (color == "orange") {
            tv.setBackgroundColor(Color.parseColor("#ffcc99"));
        }
        else if (color == "blue") {
            tv.setBackgroundColor(Color.parseColor("#66b2ff"));
        }
        else if (color == "black") {
            tv.setBackgroundColor(Color.parseColor("#000000"));
            tv.setTextColor(Color.parseColor("#FFFFFF"));
        }
        else if (color == "gray") {
            tv.setBackgroundColor(Color.parseColor("#808080"));
        }

        return tv;
    }
}


package org.maktab.homework7_maktab37;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mRed;
    private TextView mOrange;
    private TextView mYellow;
    private TextView mGreen;
    private TextView mBlue;
    private TextView mIndigo;
    private TextView mViolet;
    private int color;

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        clickListeners();
    }

    private void findViews() {
        mRed = findViewById(R.id.red_txt);
        mOrange = findViewById(R.id.orange_txt);
        mYellow = findViewById(R.id.yellow_txt);
        mGreen = findViewById(R.id.green_txt);
        mBlue = findViewById(R.id.blue_txt);
        mIndigo = findViewById(R.id.indigo_txt);
        mViolet = findViewById(R.id.violet_txt);
    }

    private void clickListeners() {
        mRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRed.setVisibility(View.GONE);
                color = getColor(R.color.red);
                setColors(color);
                mHandler.postDelayed(myRunnable,5000);

            }
        });
        mOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOrange.setVisibility(View.GONE);
                color = getColor(R.color.orange);
                setColors(color);
                mHandler.postDelayed(myRunnable,5000);

            }
        });
        mYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mYellow.setVisibility(View.GONE);
                color = getColor(R.color.yellow);
                setColors(color);
                mHandler.postDelayed(myRunnable,5000);

            }
        });
        mGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mGreen.setVisibility(View.GONE);
                color = getColor(R.color.green);
                setColors(color);
                mHandler.postDelayed(myRunnable,5000);

            }
        });mBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBlue.setVisibility(View.GONE);
                color = getColor(R.color.blue);
                setColors(color);
                mHandler.postDelayed(myRunnable,5000);

            }
        });mIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIndigo.setVisibility(View.GONE);
                color = getColor(R.color.indigo);
                setColors(color);
                mHandler.postDelayed(myRunnable,5000);

            }
        });
        mViolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViolet.setVisibility(View.GONE);
                color = getColor(R.color.violet);
                setColors(color);
                mHandler.postDelayed(myRunnable,5000);

            }
        });

    }

    public void defaultColor() {
        mRed.setBackgroundColor(getColor(R.color.red));
        mOrange.setBackgroundColor(getColor(R.color.orange));
        mYellow.setBackgroundColor(getColor(R.color.yellow));
        mGreen.setBackgroundColor(getColor(R.color.green));
        mBlue.setBackgroundColor(getColor(R.color.blue));
        mIndigo.setBackgroundColor(getColor(R.color.indigo));
        mViolet.setBackgroundColor(getColor(R.color.violet));
    }

    public void setColors(int color) {
        mRed.setBackgroundColor(color);
        mOrange.setBackgroundColor(color);
        mYellow.setBackgroundColor(color);
        mGreen.setBackgroundColor(color);
        mBlue.setBackgroundColor(color);
        mIndigo.setBackgroundColor(color);
        mViolet.setBackgroundColor(color);
    }

    Runnable myRunnable = new  Runnable() {
        @Override
        public void run() {
            defaultColor();

        }
    }

    ;
}
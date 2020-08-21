package org.maktab.homework7_maktab37;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView[] views;

    int[] mViewIds = {R.id.red_txt, R.id.orange_txt, R.id.yellow_txt, R.id.green_txt, R.id.blue_txt, R.id.indigo_txt, R.id.violet_txt};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        views = new TextView[7];
        findViews();
        clickListeners();
    }

    private void findViews() {
        views[0] = findViewById(R.id.red_txt);
        views[1] = findViewById(R.id.orange_txt);
        views[2] = findViewById(R.id.yellow_txt);
        views[3] = findViewById(R.id.green_txt);
        views[4] = findViewById(R.id.blue_txt);
        views[5] = findViewById(R.id.indigo_txt);
        views[6] = findViewById(R.id.violet_txt);
    }

    private void clickListeners() {
        for (int id : mViewIds) {
            final TextView textView = findViewById(id);

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    for (TextView txt : views) {
                        textView.setVisibility(View.GONE);
                        txt.setText(textView.getText());
                        view.postDelayed(myRunnable, 5000);
                    }

                }
            });
        }
    }

    public void defaultText() {
        views[0].setText(R.string.red_txt_name);
        views[1].setText(R.string.orange_txt_name);
        views[2].setText(R.string.yellow_txt_name);
        views[3].setText(R.string.green_txt_name);
        views[4].setText(R.string.blue_txt_name);
        views[5].setText(R.string.indigo_txt_name);
        views[6].setText(R.string.violet_txt_name);
    }

    Runnable myRunnable = new Runnable() {
        @Override
        public void run() {
            defaultText();

        }
    };
}
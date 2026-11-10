package com.example.chapter10;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class SecondActivity1001 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second1001_main);

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        RadioButton rdoSecond = (RadioButton) findViewById(R.id.rdoSecond);
        RadioButton rdoThird = (RadioButton) findViewById(R.id.rdoThird);
        RadioButton rdoFour = (RadioButton) findViewById(R.id.rdoFour);
        RadioButton rdoFive = (RadioButton) findViewById(R.id.rdoFive);
        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);
        TextView tvResult = (TextView) findViewById(R.id.tvResult);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (rdoSecond.isChecked()) {
                    tvResult.setText("결과: " + rdoSecond.getText().toString());
                } else if (rdoThird.isChecked()) {
                    tvResult.setText("결과: " + rdoThird.getText().toString());
                } else if (rdoFour.isChecked()) {
                    tvResult.setText("결과: " + rdoFour.getText().toString());
                } else if (rdoFive.isChecked()) {
                    tvResult.setText("결과: " + rdoFive.getText().toString());
                }
            }
        });

    }

}
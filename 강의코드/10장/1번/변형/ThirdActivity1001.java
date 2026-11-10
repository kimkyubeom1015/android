package com.example.chapter10;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity1001 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.third1001_main);

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
        final Button ok2 = (Button) findViewById(R.id.ok2);
        ok2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast tMsg = Toast.makeText(ThirdActivity1001.this,
                        "버튼 눌렸습니다.", Toast.LENGTH_SHORT);
                tMsg.show();
            }

        });

    }
}

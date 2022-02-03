package com.example.sakuracyann;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setScreenMain();
    }

    //setContentView レイアウトファイルの呼び出し
    private void setScreenMain(){
        setContentView(R.layout.activity_main);
        Button sendButton = findViewById(R.id.send_button);
        sendButton.setOnClickListener(v -> setScreenSub());
    }

    private void setScreenSub(){
        setContentView(R.layout.activity_sub2);

    }
}
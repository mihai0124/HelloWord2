package io.designcoder.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //look this is a MLU comment
        setContentView(R.layout.activity_my);
    }
}

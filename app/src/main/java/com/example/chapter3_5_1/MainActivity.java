package com.example.chapter3_5_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onClick(View v)
    {
        if(v.getId()==R.id.button1)
            Toast.makeText(MainActivity.this,"单击了按钮"+v.getId(),Toast.LENGTH_SHORT).show();
    }
}

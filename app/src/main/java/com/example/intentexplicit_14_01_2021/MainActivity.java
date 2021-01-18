package com.example.intentexplicit_14_01_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendString(View view) {
        Intent intent = new Intent(MainActivity.this , MainActivity2.class);
        intent.putExtra(AppConstant.KEY_CHUOI, "hello");
        startActivity(intent);
    }

    public void sendIntArray(View view) {
        int[] arrNums = {1,2,3,4,5,6,7,8,9,10};
        Intent intent = new Intent(MainActivity.this , MainActivity2.class);
        intent.putExtra(AppConstant.KEY_MANG_SO, arrNums);
        startActivity(intent);
    }

    public void sendObject(View view) {

        Student student = new Student("Nguyen Van Teo", 10);
        Intent intent = new Intent(MainActivity.this , MainActivity2.class);
        intent.putExtra(AppConstant.KEY_OBJECT , student);
        startActivity(intent);
    }
}

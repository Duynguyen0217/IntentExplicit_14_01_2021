package com.example.intentexplicit_14_01_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //1: nhận dữ liệu dạng String

       /* Intent intent = getIntent();
        if(intent != null){
            String chuoi = intent.getStringExtra(AppConstant.KEY_CHUOI);
            Toast.makeText(this, chuoi, Toast.LENGTH_SHORT).show();
        }*/
       
       //2: nhận dữ liệu mảng số

      /* Intent intent = getIntent();
       if(intent != null ){
           int[] arrNums = intent.getIntArrayExtra(AppConstant.KEY_MANG_SO);
           Toast.makeText(this, arrNums.length + " " , Toast.LENGTH_SHORT).show();

       }*/

      //3: Nhận dữ liệu dạng object
      Intent intent = getIntent();
      if(intent != null){
          {
              Student student;
              student = intent.getParcelableExtra(AppConstant.KEY_OBJECT);
              Toast.makeText(this, student.name + "", Toast.LENGTH_SHORT).show();
          }
      }
    }
}

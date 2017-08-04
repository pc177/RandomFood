package com.example.a1.teamproject2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class subActivity3  extends AppCompatActivity {
    Button b3;
    ImageButton b1,b2;
    Random randomize;
    Intent in1;

    int Array[] = {
            R.drawable.a03,R.drawable.a04,R.drawable.a06,R.drawable.a07,R.drawable.a08,R.drawable.a09,
            R.drawable.a10,R.drawable.a11,R.drawable.a14, R.drawable.a15,R.drawable.a17,R.drawable.a19, R.drawable.a18,R.drawable.a20,
            R.drawable.d01,R.drawable.d02,R.drawable.d03,R.drawable.d04,R.drawable.d05,R.drawable.d06,R.drawable.d07,R.drawable.d08,R.drawable.d09,
            R.drawable.d10,R.drawable.d13,R.drawable.d14, R.drawable.d15,R.drawable.d16,R.drawable.d17, R.drawable.d19,R.drawable.d21,R.drawable.d23,
    };
    int Brray[] = {
            R.drawable.b01,R.drawable.b02,R.drawable.b03,R.drawable.b04,R.drawable.b06,R.drawable.b07,R.drawable.b08,R.drawable.b09,
            R.drawable.b10,R.drawable.b11,R.drawable.b13, R.drawable.b15,R.drawable.b16,R.drawable.b17, R.drawable.b18,R.drawable.b20,R.drawable.b21,R.drawable.b22,
            R.drawable.c01,R.drawable.c02,R.drawable.c03,R.drawable.c04,R.drawable.c05,R.drawable.c06,R.drawable.c07,R.drawable.c08,R.drawable.c09,
            R.drawable.c10,R.drawable.c11,R.drawable.c12, R.drawable.c13,R.drawable.c14,R.drawable.c15, R.drawable.c16,R.drawable.c17,R.drawable.c20,
            R.drawable.d10,R.drawable.e01,R.drawable.e02,R.drawable.e03,R.drawable.e04,R.drawable.e05,R.drawable.e06,R.drawable.e07,R.drawable.e08,R.drawable.e09,
            R.drawable.e10,R.drawable.e12};

    int i,j=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity3);
        b1=(ImageButton)findViewById(R.id.imageButton);
        b2=(ImageButton)findViewById(R.id.imageButton2);
        in1 = new Intent(this, subActivity2.class);
        randomize=new Random();
        b3=(Button)findViewById(R.id.button3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {       //버튼클릭시 초기화면으로 돌아간다.
                Intent intent = null;
                intent = new Intent(subActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void on(View v){

        switch (v.getId())
        {
            case R.id.imageButton:          //이미지버튼 클릭시 이벤트 처리 열번선택이 완료되었으면 해당이미지를 제외한 나머지 이미지버튼을 화면에서
                //비활성화시킨다.
                b2.setImageResource(Array[randomize.nextInt(32)]);
                if(i==10) {
                    b2.setVisibility(View.INVISIBLE);
                    b3.setVisibility(View.VISIBLE);
                }
                else
                    i++;
                break;

            case R.id.imageButton2:
                b1.setImageResource(Brray[randomize.nextInt(48)]);
                if(j==10) {
                    b1.setVisibility(View.INVISIBLE);
                    b3.setVisibility(View.VISIBLE);
                }
                else
                    j++;
                break;
        }


    }
}
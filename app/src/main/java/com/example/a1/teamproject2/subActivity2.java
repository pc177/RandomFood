package com.example.a1.teamproject2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class subActivity2 extends AppCompatActivity {

    Button b1;
    ImageView im;
    Intent in1;
    Random randomize;

    int Array1[] = {R.drawable.a03,R.drawable.a04,R.drawable.a06,R.drawable.a07,R.drawable.a08,R.drawable.a09,
            R.drawable.a10,R.drawable.a11,R.drawable.a14, R.drawable.a15,R.drawable.a17,R.drawable.a19, R.drawable.a18,R.drawable.a20 } ;

    int Array2[] = {R.drawable.b01,R.drawable.b02,R.drawable.b03,R.drawable.b04,R.drawable.b06,R.drawable.b07,R.drawable.b08,R.drawable.b09,
            R.drawable.b10,R.drawable.b11,R.drawable.b13, R.drawable.b15,R.drawable.b16,R.drawable.b17, R.drawable.b18,R.drawable.b20,R.drawable.b21,R.drawable.b22};

    int Array3[] = {R.drawable.c01,R.drawable.c02,R.drawable.c03,R.drawable.c04,R.drawable.c05,R.drawable.c06,R.drawable.c07,R.drawable.c08,R.drawable.c09,
            R.drawable.c10,R.drawable.c11,R.drawable.c12, R.drawable.c13,R.drawable.c14,R.drawable.c15, R.drawable.c16,R.drawable.c17,R.drawable.c20};

    int Array4[] = {R.drawable.d01,R.drawable.d02,R.drawable.d03,R.drawable.d04,R.drawable.d05,R.drawable.d06,R.drawable.d07,R.drawable.d08,R.drawable.d09,
            R.drawable.d10,R.drawable.d13,R.drawable.d14, R.drawable.d15,R.drawable.d16,R.drawable.d17, R.drawable.d19,R.drawable.d21,R.drawable.d23 };

    int Array5[] = {R.drawable.e01,R.drawable.e02,R.drawable.e03,R.drawable.e04,R.drawable.e05,R.drawable.e06,R.drawable.e07,R.drawable.e08,R.drawable.e09,
            R.drawable.e10,R.drawable.e12};

    int Array7[] ={R.drawable.e01,R.drawable.e03,R.drawable.e06,R.drawable.e07,R.drawable.e08,R.drawable.e09,R.drawable.e10,R.drawable.e11,R.drawable.a05,
            R.drawable.a15,R.drawable.b18,R.drawable.d02,R.drawable.d06,R.drawable.d16,R.drawable.d17,R.drawable.d19};

    int Array8[] ={R.drawable.a07,R.drawable.a12,R.drawable.b13,R.drawable.b17,R.drawable.b22,R.drawable.c01,R.drawable.c02,
            R.drawable.c03,R.drawable.c09,R.drawable.c15,R.drawable.d15,R.drawable.d10,R.drawable.d13,R.drawable.d14,R.drawable.d21};

    int Array9[] ={R.drawable.a03,R.drawable.a06,R.drawable.a08,R.drawable.a09,R.drawable.a10,R.drawable.a11,R.drawable.a17,
            R.drawable.b01,R.drawable.b02,R.drawable.b03,R.drawable.b04,R.drawable.b09,R.drawable.b10,R.drawable.b11,
            R.drawable.b15,R.drawable.b16,R.drawable.b20,R.drawable.b21,R.drawable.c05,R.drawable.c06,R.drawable.c07,R.drawable.c08
            ,R.drawable.c10,R.drawable.c12,R.drawable.c13,R.drawable.c14,R.drawable.d01,R.drawable.d03,R.drawable.d04,R.drawable.d05
            ,R.drawable.d08,R.drawable.d09};

    int Array10[] ={R.drawable.a04,R.drawable.a14,R.drawable.a18,R.drawable.a19,R.drawable.a20};

    int Array11[] ={R.drawable.b06,R.drawable.b07,R.drawable.b08,R.drawable.c11,R.drawable.d07,R.drawable.c16};


    int Array6[] = {
            R.drawable.a03,R.drawable.a04,R.drawable.a06,R.drawable.a07,R.drawable.a08,R.drawable.a09,
            R.drawable.a10,R.drawable.a11,R.drawable.a14, R.drawable.a15,R.drawable.a17,R.drawable.a19, R.drawable.a18,R.drawable.a20,
            R.drawable.b01,R.drawable.b02,R.drawable.b03,R.drawable.b04,R.drawable.b06,R.drawable.b07,R.drawable.b08,R.drawable.b09,
            R.drawable.b10,R.drawable.b11,R.drawable.b13, R.drawable.b15,R.drawable.b16,R.drawable.b17, R.drawable.b18,R.drawable.b20,R.drawable.b21,R.drawable.b22,
            R.drawable.c01,R.drawable.c02,R.drawable.c03,R.drawable.c04,R.drawable.c05,R.drawable.c06,R.drawable.c07,R.drawable.c08,R.drawable.c09,
            R.drawable.c10,R.drawable.c11,R.drawable.c12, R.drawable.c13,R.drawable.c14,R.drawable.c15, R.drawable.c16,R.drawable.c17,R.drawable.c20,
            R.drawable.d01,R.drawable.d02,R.drawable.d03,R.drawable.d04,R.drawable.d05,R.drawable.d06,R.drawable.d07,R.drawable.d08,R.drawable.d09,
            R.drawable.d10,R.drawable.d13,R.drawable.d14, R.drawable.d15,R.drawable.d16,R.drawable.d17, R.drawable.d19,R.drawable.d21,R.drawable.d23,
            R.drawable.e01,R.drawable.e02,R.drawable.e03,R.drawable.e04,R.drawable.e05,R.drawable.e06,R.drawable.e07,R.drawable.e08,R.drawable.e09,
            R.drawable.e10,R.drawable.e12};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity2);
        b1 = (Button) findViewById(R.id.button);
        im = (ImageView) findViewById(R.id.foodimage);
        in1=getIntent();
        randomize=new Random();     //랜덤객체 생성


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //버튼클릭시 초기화면으로 되돌아간다.
                Intent intent = null;
                intent = new Intent(subActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        switch(in1.getStringExtra("index"))     //인텐트객체에 있는 키값을 바탕으로 메뉴를 랜덤으로 돌려 나온 인덱스에 저장된
        //이미지로 이미지뷰의 이미지를 바꿔서 결과창에 출력한다.
        {
            case "unine":
                im.setImageResource(Array1[randomize.nextInt(17)]);
                break;
            case "hans":
                im.setImageResource(Array2[randomize.nextInt(19)]);
                break;
            case "manri":
                im.setImageResource(Array3[randomize.nextInt(18)]);
                break;
            case "kimbob":
                im.setImageResource(Array4[randomize.nextInt(18)]);
                break;
            case "ddook":
                im.setImageResource(Array5[randomize.nextInt(18)]);
                break;
            case "bob":
                im.setImageResource(Array7[randomize.nextInt(16)]);
                break;
            case "men":
                im.setImageResource(Array8[randomize.nextInt(15)]);
                break;
            case "dubob":
                im.setImageResource(Array9[randomize.nextInt(32)]);
                break;
            case "don":
                im.setImageResource(Array10[randomize.nextInt(5)]);
                break;
            case "bokbob":
                im.setImageResource(Array11[randomize.nextInt(6)]);
                break;
            case "random" :
                im.setImageResource(Array6[randomize.nextInt(90)]);
                break;
        }
    }

}
package com.example.a1.teamproject2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button b1,  b2, b3;//버튼을 처리하기 위한 변수선언


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//레이아웃에 있는 버튼과 위에 선언된 변수를 연동시킨다.
        b1=(Button)findViewById(R.id.menubutton);
        b2=(Button)findViewById(R.id.todaymenubutton);
        b3=(Button)findViewById(R.id.randonbutton);
    }

    public void onClick(View v){//버튼을 눌렀을때의 이벤트처리
        Intent intent =null;//인텐트 변수생성
        switch(v.getId()) {
            case R.id.menubutton://메뉴선택화면으로 넘어간다.
                intent = new Intent(getApplicationContext(), subActivity1.class);
                break;
            case R.id.todaymenubutton://오늘의 메뉴가 있는 홈페이지로 이동한다.
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kpu.ac.kr/contents/main/cor/menu.html"));//암시적인텐트생성
                break;
            case R.id.randonbutton://결과창으로 바로 랜덤선택하여 이동한다.
                intent = new Intent(getApplicationContext(), subActivity2.class);
                intent.putExtra("index","random");//key값과 value값을 설정.
                break;
            case R.id.to:
                intent = new Intent(getApplicationContext(), subActivity3.class); //토너먼트창으로 이동
                break;
        }
        if(intent != null) {
            startActivity(intent);
        }
    }
}

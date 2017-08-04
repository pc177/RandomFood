package com.example.a1.teamproject2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class subActivity1 extends AppCompatActivity {

    Button b1;//결과 버튼 변수
    RadioGroup RG1, RG2;//라디오 그룹 설정
    Intent in;
    Switch sw;//스위치버튼 변수
    int i;
    boolean key;//default처리를 위한 key 변수선언
    ImageView image;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity1);
        b1 = (Button) findViewById(R.id.resultbutton);
        in = new Intent(this, subActivity2.class);
        RG1 = (RadioGroup) findViewById(R.id.RG1);
        RG2 = (RadioGroup) findViewById(R.id.RG2);
        sw = (Switch) findViewById((R.id.swich));

        image = (ImageView)findViewById((R.id.imageView));
        key = true;
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) { //스위치버튼 이벤트리스너 등록 라디오버튼을 구분한다.
                if (isChecked == true) {
                    RG1.setVisibility(View.INVISIBLE);
                    RG2.setVisibility(View.VISIBLE);
                    sw.setText("종류별");
                } else {
                    RG2.setVisibility(View.INVISIBLE);
                    RG1.setVisibility(View.VISIBLE);
                    sw.setText("업체별");
                }
            }
        });
    }

    public void menuselect(View v) { //라디오버튼이벤트 처리 선택시 인텐트객체에 정보저장

        switch (v.getId()) {
            case R.id.A:
                key=false;
                image.setImageResource(R.drawable.yello);
                in.putExtra("index", "unine");
                break;
            case R.id.B:
                key=false;
                image.setImageResource(R.drawable.yello);
                in.putExtra("index", "hans");
                break;
            case R.id.C:
                key=false;
                image.setImageResource(R.drawable.yello);
                in.putExtra("index", "manri");
                break;
            case R.id.D:
                key=false;
                image.setImageResource(R.drawable.yello);
                in.putExtra("index", "kimbob");
                break;
            case R.id.E:
                key=false;
                image.setImageResource(R.drawable.yello);
                in.putExtra("index", "ddook");
                break;
            case R.id.F:
                key=false;
                image.setImageResource(R.drawable.bab);
                in.putExtra("index", "Bob");
                break;
            case R.id.G:
                key=false;
                image.setImageResource(R.drawable.men);
                in.putExtra("index", "men");
                break;
            case R.id.H:
                key=false;
                image.setImageResource(R.drawable.dub);
                in.putExtra("index", "dubob");
                break;
            case R.id.I:
                key=false;
                image.setImageResource(R.drawable.don);
                in.putExtra("index", "don");
                break;
            case R.id.J:
                key=false;
                image.setImageResource(R.drawable.bok);
                in.putExtra("index", "bokbob");
                break;
            default:
                key = true;
                break;

        }
    }

    public void ll2(View v) {
        if (key == true){           //아무 선택없이 버튼을 눌렀을때에 예외 처리를 하기위한 문장

            Toast.makeText(getApplicationContext(),"랜덤선택할 메뉴를 골라주세요",Toast.LENGTH_SHORT).show();
        }
        else
            startActivity(in);      //라디오버튼 선택후 버튼클릭시 정보가 저장되어있는 인텐트를 이용해 결과창으로 넘어간다.

    }
}



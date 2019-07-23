package com.sup3rd3v3l0p3r.teamvetor.namegenerator;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String one = "", two = "", three = "", four = "";
    Switch sw1, sw2, sw3;
    TextView nameView;
    int choose;

    class MyCheckedListener implements Switch.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (sw1.isChecked() == false && sw2.isChecked() == false && sw3.isChecked() == false) {
                sw3.setChecked(true);
                nameView.setText("아무 것도 선택하지 않을 수는 없습니다.");
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw1 = findViewById(R.id.swone);
        sw2 = findViewById(R.id.swtwo);
        sw3 = findViewById(R.id.swthree);
        nameView = findViewById(R.id.showName);
        MyCheckedListener myCheckedListener = new MyCheckedListener();
        sw1.setOnCheckedChangeListener(myCheckedListener);
        sw2.setOnCheckedChangeListener(myCheckedListener);
        sw3.setOnCheckedChangeListener(myCheckedListener);

    }

    public void copyButton(View v) {
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clipData = ClipData.newPlainText("label", one + two + three + four);
        clipboardManager.setPrimaryClip(clipData);
        Toast.makeText(getApplication(), "복사되었습니다.", Toast.LENGTH_LONG).show();
    }

    public void swBtn(View v) {
        Switch aSwitch = findViewById(R.id.swtwo);
        switch (v.getId()) {
            case R.id.swOne:
                aSwitch = findViewById(R.id.swone);
                break;

            case R.id.swTwo:
                aSwitch = findViewById(R.id.swtwo);
                break;

            case R.id.swThree:
                aSwitch = findViewById(R.id.swthree);
                break;
        }
        if (aSwitch.isChecked() == true)
            aSwitch.setChecked(false);
        else
            aSwitch.setChecked(true);
    }
    public void generateButton(View v) {
        ArrayList<Switch> switches = new ArrayList<>();
        Switch choosenSwitch;
        if(sw1.isChecked()){
            switches.add(sw1);
        }
        if(sw2.isChecked()){
            switches.add(sw2);
        }
        if(sw3.isChecked()){
            switches.add(sw3);
        }
        choosenSwitch = switches.get((int) (Math.random() * switches.size()));
        if(choosenSwitch.getId() == R.id.swone){
            int[] arr = {1,2,4};
            choose = arr[((int) (Math.random() * arr.length))];
        }else if(choosenSwitch.getId() == R.id.swtwo){
            int[] arr = {3,5,6};
            choose = arr[((int) (Math.random() * arr.length))];
        }else if(choosenSwitch.getId() == R.id.swthree){
            choose = 7;
        }

        Log.d("asdfasdf",choose+"");

        String[] first = {
                "물구나무 서기 하는 ", "전율하는 ", "절규하는 ", "사랑하는 ",
                "게임하는 ", "상처받는 ", "휴지 뽑는 ", "프로그래밍하는 ",
                "배구하는 ", "축구하는 ", "행복해하는 ", "필기하는 ", "약속하는 ",
                "달리는 ", "깨부수는 ", "산책하는 ", "심심해하는 ", "할거없는 ",
                "과자 먹는 ", "사랑중인 ", "발차기하는 ", "상처받은 ", "애교떠는 ",
                "시계 보는 ", "추워하는 ", "충전중인 ", "진정한 ", "완벽한 ", "완전한 ",
                "영원한 "

        };
        String[] second = {
                "감염된 ", "전염된 ", "충전된 ", "변화된 ", "감전된 ", "인증된 ",
                "정리정돈된 ", "안정된 ", "폭발한 ", "파괴된 ", "사망한 ", "무참히살해된 ",
                "무력화된 ", "잉여가된 ", "봉인된 ", "기계화된 ", "자동화된 ", "구속된 ",
                "포박된 ", "단련된 ", "파멸한 ", "부활한 ", "진화한 ", "속박된 ", "변화된 ",
                "변신한 ", "폐기된 ", "착취당한 ", "거래된 ", "이상한 "
        };
        String[] third = {
                "암흑의 ", "전율의 ", "지옥의 ", "고통의 ", "절망의 ", "대죄의 ", "강철의 ", "불꽃의 ",
                "고양이 차림의 ", "메이드복 차림의 ", "파멸의 ", "희망의 ", "역습의 ", "역전의 ", "연속 처치의 ",
                "치유의 ", "심쿵사의 ", "암살자의 ", "소환수의 ", "바보의 ", "분신술의 ", "전설의 ",
                "전설은 아니고 레전드의", "세번 째", "다섯 번째 ", "일렉트로닉 마스터의 ", "초전자포의 ",
                "마법의 ", "게임의 ", "마왕의 "
        };

        String[] fourth = {
                "바나나", "악당", "천재", "말미잘", "바보", "TV", "줄자", "스님", "목사님",
                "휴대폰", "지갑", "두꺼운책", "빠삐코", "볼펜", "오른팔", "왼팔", "새끼손가락",
                "어둠", "희망", "절망", "로켓", "복사기", "한약", "두루마리 휴지", "노트북",
                "시계", "자동차", "고양이", "암살자", "컴퓨터", "노트북", "코카콜라"
        };
        if (choose == 4 || choose == 5 || choose == 6 || choose == 7) { // -는
            one = first[((int) (Math.random() * first.length))];
        }
        if (choose == 2 || choose == 3 || choose == 6 || choose == 7) { // -된
            two = second[((int) (Math.random() * second.length))];
        }
        if (choose == 1 || choose == 3 || choose == 5 || choose == 7) { //-의
            three = third[((int) (Math.random() * third.length))];
        }
        //주어
        four = fourth[((int) (Math.random() * fourth.length))];


        Log.w("LOG", one + two + three + four + choose);
        nameView.setText(one + two + three + four);

        one = two = three = "";
    }
}

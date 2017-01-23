package com.sup3rd3v3l0p3r.teamvetor.namegenerator;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num;
    String one = "";
    String two = "";
    String three = "";
    String four = "";
    int choose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void copyButton(View v) {
        ClipboardManager clipboardManager =  (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clipData = ClipData.newPlainText("label", one+two+three+four);
        clipboardManager.setPrimaryClip(clipData);
        Toast.makeText(getApplication(), "복사되었습니다.",Toast.LENGTH_LONG).show();
    }

    public void generateButton(View v) {
        TextView nameView = (TextView) findViewById(R.id.showName);
        choose = ((int) (Math.random() * 7));
        choose++;

        one = "";
        two = "";
        three = "";
        four = "";

        if (choose == 4 || choose == 5 || choose == 6 || choose == 7) { //-는
            num = ((int) (Math.random() * 31));
            num++;
            switch (num) {
                case 1:
                    one = "물구나무서기하는 ";
                    break;
                case 2:
                    one = "전율하는 ";
                    break;
                case 3:
                    one = "절규하는 ";
                    break;
                case 4:
                    one = "사랑하는 ";
                    break;
                case 5:
                    one = "게임하는 ";
                    break;
                case 6:
                    one = "상처받는 ";
                    break;
                case 7:
                    one = "휴지뽑는 ";
                    break;
                case 8:
                    one = "프로그래밍하는 ";
                    break;
                case 9:
                    one = "배구하는 ";
                    break;
                case 10:
                    one = "축구하는 ";
                    break;
                case 11:
                    one = "행복해하는 ";
                    break;
                case 12:
                    one = "필기하는 ";
                    break;
                case 13:
                    one = "약속하는 ";
                    break;
                case 14:
                    one = "달리는 ";
                    break;
                case 15:
                    one = "깨부수는 ";
                    break;
                case 16:
                    one = "산책하는 ";
                    break;
                case 17:
                    one = "심심해하는 ";
                    break;
                case 18:
                    one = "할거없는 ";
                    break;
                case 19:
                    one = "까까먹는 ";
                    break;
                case 20:
                    one = "충전중인 ";
                    break;
                case 21:
                    one = "사랑중인 ";
                    break;
                case 22:
                    one = "발차기하는 ";
                    break;
                case 23:
                    one = "상처받은 ";
                    break;
                case 24:
                    one = "애교떠는 ";
                    break;
                case 25:
                    one = "시계보는 ";
                    break;
                case 26:
                    one = "추워하는 ";
                    break;
                case 27:
                    one = "충전중인 ";
                    break;
                case 28:
                    one = "진정한 ";
                    break;
                case 29:
                    one = "완벽히 ";
                    break;
                case 30:
                    one = "완전히 ";
                    break;
                case 31:
                    one = "영원한 ";
                    break;
            }
        }
        if (choose == 2 || choose == 3 || choose == 6 || choose == 7) { //-된
            num = ((int) (Math.random() * 30));
            num++;
            switch (num) {
                case 1:
                    two = "감염된 ";
                    break;
                case 2:
                    two = "전염된 ";
                    break;
                case 3:
                    two = "충전된 ";
                    break;
                case 4:
                    two = "변화된 ";
                    break;
                case 5:
                    two = "감전된 ";
                    break;
                case 6:
                    two = "인증된 ";
                    break;
                case 7:
                    two = "정리정돈된 ";
                    break;
                case 8:
                    two = "안정된 ";
                    break;
                case 9:
                    two = "폭발한 ";
                    break;
                case 10:
                    two = "파괴된 ";
                    break;
                case 11:
                    two = "사망한 ";
                    break;
                case 12:
                    two = "무참히살해된 ";
                    break;
                case 13:
                    two = "무력화된 ";
                    break;
                case 14:
                    two = "잉여가된 ";
                    break;
                case 15:
                    two = "봉인된 ";
                    break;
                case 16:
                    two = "기계화된 ";
                    break;
                case 17:
                    two = "자동화된 ";
                    break;
                case 18:
                    two = "구속된 ";
                    break;
                case 19:
                    two = "포박된 ";
                    break;
                case 20:
                    two = "단련된 ";
                    break;
                case 21:
                    two = "파멸한 ";
                    break;
                case 22:
                    two = "부활한 ";
                    break;
                case 23:
                    two = "진화한 ";
                    break;
                case 24:
                    two = "속박된 ";
                    break;
                case 25:
                    two = "변화된 ";
                    break;
                case 26:
                    two = "변신한 ";
                    break;
                case 27:
                    two = "폐기된 ";
                    break;
                case 28:
                    two = "착취당한 ";
                    break;
                case 29:
                    two = "거래된 ";
                    break;
                case 30:
                    two = "이상한 ";
                    break;
            }
        }
        if (choose == 1 || choose == 3 || choose == 5 || choose == 7) { //-의
            num = ((int) (Math.random() * 30));
            num++;
            switch (num) {
                case 1:
                    three = "암흑의 ";
                    break;
                case 2:
                    three = "전율의 ";
                    break;
                case 3:
                    three = "지옥의 ";
                    break;
                case 4:
                    three = "고통의 ";
                    break;
                case 5:
                    three = "절망의 ";
                    break;
                case 6:
                    three = "대죄의 ";
                    break;
                case 7:
                    three = "강철의 ";
                    break;
                case 8:
                    three = "불꽃의 ";
                    break;
                case 9:
                    three = "고양이차림의 ";
                    break;
                case 10:
                    three = "메이드복차림의 ";
                    break;
                case 11:
                    three = "파멸의 ";
                    break;
                case 12:
                    three = "희망의 ";
                    break;
                case 13:
                    three = "역습의 ";
                    break;
                case 14:
                    three = "역전의 ";
                    break;
                case 15:
                    three = "연속처치의 ";
                    break;
                case 16:
                    three = "치유의 ";
                    break;
                case 17:
                    three = "심쿵사의 ";
                    break;
                case 18:
                    three = "암살자의 ";
                    break;
                case 19:
                    three = "소환수의 ";
                    break;
                case 20:
                    three = "바보의 ";
                    break;
                case 21:
                    three = "분신술의 ";
                    break;
                case 22:
                    three = "전설의 ";
                    break;
                case 23:
                    three = "전설은아니고레전드의 ";
                    break;
                case 24:
                    three = "세번째 ";
                    break;
                case 25:
                    three = "다섯번째 ";
                    break;
                case 26:
                    three = "일렉트로닉마스터의 ";
                    break;
                case 27:
                    three = "초전자포의 ";
                    break;
                case 28:
                    three = "금서목록의 ";
                    break;
                case 29:
                    three = "게임의 ";
                    break;
                case 30:
                    three = "마왕의 ";
                    break;
            }
        }
        //주어
        num = ((int) (Math.random() * 29));
        num++;
        switch (num) {
            case 1:
                four = "바나나";
                break;
            case 2:
                four = "악당";
                break;
            case 3:
                four = "천재";
                break;
            case 4:
                four = "말미잘";
                break;
            case 5:
                four = "바보";
                break;
            case 6:
                four = "TV";
                break;
            case 7:
                four = "줄자";
                break;
            case 8:
                four = "스님";
                break;
            case 9:
                four = "목사님";
                break;
            case 10:
                four = "휴대폰";
                break;
            case 11:
                four = "지갑";
                break;
            case 12:
                four = "두꺼운책";
                break;
            case 13:
                four = "빠삐코";
                break;
            case 14:
                four = "볼펜";
                break;
            case 15:
                four = "오른팔";
                break;
            case 16:
                four = "왼팔";
                break;
            case 17:
                four = "새끼손가락";
                break;
            case 18:
                four = "어둠";
                break;
            case 19:
                four = "희망";
                break;
            case 20:
                four = "절망";
                break;
            case 21:
                four = "로켓";
                break;
            case 22:
                four = "복사기";
                break;
            case 23:
                four = "한약";
                break;
            case 24:
                four = "두루마리휴지";
                break;
            case 25:
                four = "노트북";
                break;
            case 26:
                four = "시계";
                break;
            case 27:
                four = "자동차";
                break;
            case 28:
                four = "고양이";
                break;
            case 29:
                four = "암살자";
                break;
        }


        Log.w("LOG", one + two + three + four + choose);
        nameView.setText(one + two + three + four);
    }
}

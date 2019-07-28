package com.sup3rd3v3l0p3r.teamvetor.namegenerator;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String one = "", two = "", three = "", four = "";
    Switch sw1, sw2, sw3;
    TextView nameViewOne, nameViewTwo;
    int choose;
    String[] first = {//-는, -한(현재), -운, -은
            "물구나무 서기 하는 ", "전율하는 ", "절규하는 ", "사랑하는 ",
            "게임하는 ", "상처받은 ", "휴지 뽑는 ", "코딩하는 ",
            "배구하는 ", "축구하는 ", "행복해하는 ", "필기하는 ",
            "달리는 ", "깨부수는 ", "산책하는 ", "심심한 ", "할거없는 ",
            "과자 먹는 ", "사랑중인 ", "발차기하는 ", "애교떠는 ",
            "시계 보는 ", "추워하는 ", "충전중인 ", "진정한 ", "완벽한 ", "완전한 ",
            "영원한 ", "춤추는 ", "등이 간지러운 ", "공부하는 ", "뜨거운 ", "차가운 ",
            "맛있는 ", "심심한 ", "모두에게 사랑받는 ", "쓰레기같은 ", "무서운 ", "봉인당한 ", "지루한 ",
            "피곤한 ", "점성있는 ", "평범한 ", "허리가 아픈 ", "우아한 ", "어정쩡한 ", "적절한 ",
            "멋있는 ", "반성하는 ", "나쁜 ", "똑똑한 ", "그리운 ", "튼튼한 ", "단순한 ", "특이한 ",
            "전설적인 "

    };
    String[] second = {// -된, -한(과거)
            "감염된 ", "전염된 ", "충전된 ", "변화된 ", "감전된 ", "인증된 ",
            "정리정돈된 ", "안정된 ", "폭발한 ", "파괴된 ", "사망한 ",
            "무력화된 ", "잉여가된 ", "봉인된 ", "기계화된 ", "자동화된 ", "구속된 ",
            "포박된 ", "단련된 ", "파멸한 ", "부활한 ", "진화한 ", "속박된 ", "변화된 ",
            "변신한 ", "폐기된 ", "착취당한 ", "거래된 ", "이상한 ", "변화된 ", "암호화된 ",
            "검은색 ", "푸른색 ", "노란색 ", "무지개색 ", "하얀색 ", "핑크색 ", "신고당한 ", "방치된 ",
            "녹슨 ", "나무젓가락으로 만든 ", "약속된 ", "파산한 ", "무색 ", "숨겨진 ", "바나나로 만든 "
    };
    String[] third = {//-의
            "암흑의 ", "전율의 ", "지옥의 ", "고통의 ", "절망의 ", "대죄의 ", "강철의 ", "불꽃의 ",
            "고양이 차림의 ", "메이드복 차림의 ", "파멸의 ", "희망의 ", "역습의 ", "역전의 ",
            "치유의 ", "암살자의 ", "소환수의 ", "바보의 ", "분신술의 ", "전설의 ",
            "전설은 아니고 레전드의 ", "세 번째 ", "다섯 번째 ", "일렉트로닉 마스터의 ", "초전자포의 ",
            "마법의 ", "게임의 ", "마왕의 ", "마법사의 ", "의문의 ", "심연의 ", "임시의 ", "임의의 ",
            "사냥꾼의 ", "고룡사냥꾼의 ", "예술가의 ", "공포의 ", "의외의 ", "특급 ", "여신의 ", "나의 ",
            "절대자의 "
    };

    String[] fourth = {
            "바나나", "악당", "천재", "말미잘", "바보", "TV", "줄자", "스님", "목사님",
            "휴대폰", "지갑", "두꺼운 책", "빠삐코", "볼펜", "오른팔", "왼팔", "새끼손가락",
            "어둠", "희망", "절망", "로켓", "복사기", "한약", "두루마리 휴지", "노트북",
            "시계", "자동차", "고양이", "암살자", "컴퓨터", "노트북", "코카콜라", "마추픽추", "초코파이",
            "이어폰", "우유", "학생", "소녀", "소년", "마왕", "용사", "엑스트라", "코끼리", "그것", "인간",
            "강아지", "너굴맨", "대머리", "학교", "경찰", "손님", "손", "생명", "남편", "아내", "민족",
            "하늘", "커피", "음악", "종교", "동생", "짜파게티", "요리사", "하키선수", "축구선수", "키위새",
            "쓰래기", "대학생", "돼지", "심장", "혈액", "화살", "직장인", "계산기", "죄수", "버섯", "로봇",
            "고춧가루", "고추참치", "머리카락", "용액", "슬라임", "닉네임", "게임기", "노예", "두루마리", "형제들", "박격포",
            "챔피언", "영웅", "아이언맨", "개발자", "잠수함", "나무", "축구공", "아빠", "범죄자", "흑형",
            "마법서", "의술사", "가수", "일기장", "아이스크림"
    };

    class MyCheckedListener implements Switch.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (sw1.isChecked() == false && sw2.isChecked() == false && sw3.isChecked() == false) {
                sw3.setChecked(true);
                nameViewOne.setText("아무 것도 선택하지 않을 수는 없습니다.");
                nameViewTwo.setText("아무 것도 선택하지 않을 수는 없습니다.");
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
        nameViewOne = findViewById(R.id.showNameOne);
        nameViewTwo = findViewById(R.id.showNameTwo);
        MyCheckedListener myCheckedListener = new MyCheckedListener();
        sw1.setOnCheckedChangeListener(myCheckedListener);
        sw2.setOnCheckedChangeListener(myCheckedListener);
        sw3.setOnCheckedChangeListener(myCheckedListener);
        CheckBox checkBox = findViewById(R.id.shake);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    nameViewOne.setVisibility(View.GONE);
                    nameViewTwo.setVisibility(View.VISIBLE);
                } else {
                    nameViewOne.setVisibility(View.VISIBLE);
                    nameViewTwo.setVisibility(View.GONE);

                }
            }
        });

        adMob();
    }

    private void adMob() {
        MobileAds.initialize(this, getString(R.string.banner_ad_unit_id));
        AdView mAdView = findViewById(R.id.adView);
        Bundle extras = new Bundle();
//        extras.putString("max_ad_content_rating", "G"); // 앱이 3세 이상 사용가능이라면 광고레벨을 설정해줘야 한다
        AdRequest adRequest = new AdRequest.Builder()
                .addNetworkExtrasBundle(AdMobAdapter.class, extras)
                .build();
        mAdView.loadAd(adRequest);
    }

    public void copyButton(View v) {
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clipData = ClipData.newPlainText("label", one + two + three + four);
        clipboardManager.setPrimaryClip(clipData);
        Toast.makeText(getApplication(), "복사되었습니다.", Toast.LENGTH_LONG).show();
    }

//    public void swBtn(View v) {
//        Switch aSwitch = findViewById(R.id.swtwo);
//        switch (v.getId()) {
//            case R.id.swOne:
//                aSwitch = findViewById(R.id.swone);
//                break;
//
//            case R.id.swTwo:
//                aSwitch = findViewById(R.id.swtwo);
//                break;
//
//            case R.id.swThree:
//                aSwitch = findViewById(R.id.swthree);
//                break;
//        }
//        if (aSwitch.isChecked() == true)
//            aSwitch.setChecked(false);
//        else
//            aSwitch.setChecked(true);
//    }

    public void generateButton(View v) {
        one = two = three = "";
        ArrayList<Switch> switches = new ArrayList<>();
        Switch choosenSwitch;
        if (sw1.isChecked()) {
            switches.add(sw1);
        }
        if (sw2.isChecked()) {
            switches.add(sw2);
        }
        if (sw3.isChecked()) {
            switches.add(sw3);
        }
        choosenSwitch = switches.get((int) (Math.random() * switches.size()));
        if (choosenSwitch.getId() == R.id.swone) {
            int[] arr = {1, 2, 4};
            choose = arr[((int) (Math.random() * arr.length))];
        } else if (choosenSwitch.getId() == R.id.swtwo) {
            int[] arr = {3, 5, 6};
            choose = arr[((int) (Math.random() * arr.length))];
        } else if (choosenSwitch.getId() == R.id.swthree) {
            choose = 7;
        }

        Log.d("asdfasdf", choose + "");


        Log.d("asdf", first.length + " " + second.length + " " + third.length + " " + fourth.length);
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
        nameViewOne.setText(one + two + three + four);
        int i = 0;
        if (one.equals("")) i++;
        if (two.equals("")) i++;
        if (three.equals("")) i++;
        if (i == 2)
            nameViewTwo.setText(one + two + three + four);
        else if (i == 1) {
            if (one.equals("")) {
                nameViewTwo.setText(two + three + four + "\n" + three + two + four);
            } else if (two.equals("")) {
                nameViewTwo.setText(one + three + four + "\n" + three + one + four);
            } else if (three.equals("")) {
                nameViewTwo.setText(one + two + four + "\n" + two + one + four);
            }
        } else { // i==0
            nameViewTwo.setText(
                    one + two + three + four + "\n"
                            + one + three + two + four + "\n"
                            + two + one + three + four + "\n"
                            + two + three + one + four + "\n"
                            + three + two + one + four + "\n"
                            + three + one + two + four);
        }


//        nameViewOne.setText(one + two + three + four);
//        nameViewOne.setText(one + three + two + four);
//        nameViewOne.setText(two + one + three + four);
//        nameViewOne.setText(two + three + one + four);
//        nameViewOne.setText(three + two + one + four);
//        nameViewOne.setText(three + one + two + four);

    }
}

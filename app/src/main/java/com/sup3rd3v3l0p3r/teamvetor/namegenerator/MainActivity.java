package com.sup3rd3v3l0p3r.teamvetor.namegenerator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int num;
    String first="0";
    String second="0";
    int choose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateButton (View v){
        TextView nameView = (TextView) findViewById(R.id.showName);
        choose = ((int) (Math.random() * 8));
        choose++;

        num = ((int) (Math.random() * 4));
        num++;
        switch (num){
            case 1 :
                first = "암흑의";
                break;
            case 2 :
                first = "봉인된";
                break;
            case 3 :
                first = "귀여운";
                break;
            case 4 :
                first = "잉여로운";
                break;
        }
        num = ((int) (Math.random() * 4));
        num++;
        switch (num) {
            case 1:
                second = "바나나";
                break;
            case 2:
                second = "괴수";
                break;
            case 3:
                second = "천재";
                break;
            case 4:
                second = "말미잘";
                break;
        }
        Log.w("LOG",first+second);
        nameView.setText(first+second);
    }
}

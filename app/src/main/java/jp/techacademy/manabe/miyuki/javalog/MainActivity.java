package jp.techacademy.manabe.miyuki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("太郎",10 , "野球");     // 名前を太郎、年齢10歳、趣味野球で、Humanのインスタンスを作る

        human.say();
        human.think();

        Human human2 = new Human("花子", 20, "料理");

        human2.say();
        human2.think();
    }
}

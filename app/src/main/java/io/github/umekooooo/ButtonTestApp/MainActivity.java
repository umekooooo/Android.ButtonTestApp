package io.github.umekooooo.ButtonTestApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    // UIコンポーネント
    private Button changeButton;
    private TextView displayTextView;

    // そのほかのフィールド
    private boolean isMorning;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // xmlで定義したコンポーネントとの対応付け
        changeButton = findViewById(R.id.changeButton);
        displayTextView = findViewById(R.id.displayTextBox);

        // イベントリスナ登録
        changeButton.setOnClickListener( v ->
        {
            // 昼夜反転させる
            isMorning = !isMorning;

            // 表示を更新する
            if(isMorning)
            {
                // 朝だったら"おはよう"と表示し、ボタンには"夜にする"と表示
                displayTextView.setText("おはよう");
                changeButton.setText("夜にする");
            }
            else
            {
                // 朝じゃなかったら"こんばんは"と表示し、ボタンには"朝にする"と表示
                displayTextView.setText("こんばんは");
                changeButton.setText("朝にする");
            }
        });

        // 今は朝だよ！という体でいろいろ初期化
        displayTextView.setText("おはよう");
        changeButton.setText("夜にする");
        isMorning = true;
    }
}
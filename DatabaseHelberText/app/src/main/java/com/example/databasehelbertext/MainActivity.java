package com.example.databasehelbertext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {
private Button bt_input;
private Button bt_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_input = (Button) this.findViewById(R.id.button);
        bt_output = (Button) this.findViewById(R.id.button2);

        bt_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        bt_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent2);
            }
        });
    }

    /*private void findViews() {
        //根据控件ID得到控件
        bt_input = (Button) this.findViewById(R.id.button);
        bt_output = (Button) this.findViewById(R.id.button2);

        //添加监听器
        bt_output.setOnClickListener(this);
        bt_input.setOnClickListener(this);

    }*/




/*    @Override
    public void onClick(View v) {
switch (v.getId()){
    //跳转到数据导入的页面
    case R.id.button:
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
        break;
    case  R.id.button2:
        Intent intent2=new Intent(MainActivity.this,Main3Activity.class);
        startActivity(intent2);
        break;

}

    }*/
}

package com.example.databasehelbertext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button bt_input=findViewById(R.id.button3);
        final EditText et_id=findViewById(R.id.editText);
        final EditText et_name=findViewById(R.id.editText2);
        bt_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建一个DatabaseHelper对象
                DatabaseHelber dbHelper1 = new DatabaseHelber(Main2Activity.this, "test_db",null,1);
                //取得一个只读的数据库对象
                SQLiteDatabase db1 = dbHelper1.getWritableDatabase();

                //创建存放数据的ContentValues对象
                ContentValues values = new ContentValues();
                //像ContentValues中存放数据
                values.put("id", Integer.parseInt(et_id.getText().toString(),10));
                values.put("name",et_name.getText().toString());
                //数据库执行插入命令
                db1.insert("user", null, values);


            }
        });
    }
}

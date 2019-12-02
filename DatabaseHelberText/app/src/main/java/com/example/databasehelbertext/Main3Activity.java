package com.example.databasehelbertext;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button bt_output=findViewById(R.id.button4);
        final TextView tv_id=findViewById(R.id.textView3);
        final TextView tv_name=findViewById(R.id.textView4);

        bt_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=null;
                 String id=null;
                DatabaseHelber dbHelper5 = new DatabaseHelber(Main3Activity.this, "test_db",null,1);
                SQLiteDatabase db5 = dbHelper5.getReadableDatabase();
                //创建游标对象
                Cursor cursor = db5.query("user", new String[]{"id","name"}, "id=?", new String[]{"1"}, null, null, null, null);
                //利用游标遍历所有数据对象
                while(cursor.moveToNext()){
                  name = cursor.getString(cursor.getColumnIndex("name"));
                  id=cursor.getString(cursor.getColumnIndex("id"));
                }
                tv_id.setText(id);
                tv_name.setText(name);
            }
        });
    }
}

package com.linhphan.phannhatlinhcoffeemanager.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.linhphan.phannhatlinhcoffeemanager.R;
import com.linhphan.phannhatlinhcoffeemanager.adapters.TableAdapter;
import com.linhphan.phannhatlinhcoffeemanager.models.Table;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvTable;
    ArrayList<Table> listTable;
    TableAdapter adapterTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addControls() {
        lvTable=findViewById(R.id.activity_main_lv_table);
        listTable=new ArrayList<>();
        listTable.add(new Table(001,"Table No.1","Empty"));
        listTable.add(new Table(002,"Table No.2","Cleaning"));
        listTable.add(new Table(003,"Table No.3","Reserved"));
        listTable.add(new Table(004,"Table No.4","Having Guest"));
        listTable.add(new Table(005,"Table No.5","Ordering"));
        //Phần add dữ liệu giả em viết riêng một method ở model rồi gọi nó ra ở đây nhé, không được viết trong activity
        adapterTable=new TableAdapter(MainActivity.this,R.layout.items,listTable);
        lvTable.setAdapter(adapterTable);
    }

    private void addEvents() {

    }
}

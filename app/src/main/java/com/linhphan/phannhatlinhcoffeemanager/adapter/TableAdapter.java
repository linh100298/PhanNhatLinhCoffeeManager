package com.linhphan.phannhatlinhcoffeemanager.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.linhphan.phannhatlinhcoffeemanager.R;
import com.linhphan.phannhatlinhcoffeemanager.model.Table;

import java.util.List;

/**
 * Created by Linh Phan on 10-Dec-17.
 */

public class TableAdapter extends ArrayAdapter<Table> {
    Activity context;
    int resource;
    List<Table> objects;

    public TableAdapter(@NonNull Activity context, int resource, @NonNull List<Table> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row= inflater.inflate(this.resource,null);
        TextView txtTable=row.findViewById(R.id.items_txt_table);
        ImageButton btnPay=row.findViewById(R.id.items_btn_pay);
        ImageButton btnMenu=row.findViewById(R.id.items_btn_menu);
        ImageButton btnDetails=row.findViewById(R.id.items_btn_details);
        final Table table=this.objects.get(position);
        txtTable.setText(table.getTableName());
        btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doDetails(table);
            }
        });
        return row;
    }

    private void doDetails(Table table) {
        Toast.makeText(this.context,table.getTableName()+" "+table.getTableStatus(),Toast.LENGTH_SHORT).show();
    }
}

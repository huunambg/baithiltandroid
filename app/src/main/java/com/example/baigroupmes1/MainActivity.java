package com.example.baigroupmes1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     EditText nhaptennuocl,nhapthanhpho;
     Button them,sua,xoa;
     Integer anh;
     ListView lv;
     String Tennuoc,Tenthanhpho;
     ArrayList<Nation> Nation  = new ArrayList<>();
     Adapter adt = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        xuly();
    }

    public void anhxa(){
        nhaptennuocl = findViewById(R.id.etnhaptennuoc);
        nhapthanhpho = findViewById(R.id.etnhapthanhpho);
        them = findViewById(R.id.btthem);
        sua = findViewById(R.id.btsua);
        xoa = findViewById(R.id.btxoa);
        lv = findViewById(R.id.lv);
    }
    public void xuly(){
        adt = new Adapter(MainActivity.this,R.layout.layoutcustom,Nation);
        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Tennuoc = nhaptennuocl.getText().toString();
             Tenthanhpho = nhapthanhpho.getText().toString();
             if (Tennuoc.equals("Viet Nam")){
                 anh = R.drawable.vietnam;
             }
             Nation ns = new Nation(anh,Tennuoc,Tenthanhpho);
             Nation.add(ns);
                lv.setAdapter(adt);
            }
        });

    }

}
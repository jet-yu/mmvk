package com.leon.mmvk;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.tencent.mmkv.MMKV;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MMKV kv = MMKV.defaultMMKV();

//        kv.encode("bool", true);
        boolean bValue = kv.decodeBool("bool");

//        kv.encode("int", Integer.MIN_VALUE);
        int iValue = kv.decodeInt("int");

//        kv.encode("string", "Hello from mmkv");
        String str = kv.decodeString("string");

        Log.e(this.getClass().getName(), bValue + "-" + iValue + "-" + str);
    }
}
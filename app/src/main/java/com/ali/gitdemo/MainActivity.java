package com.ali.gitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

//大驼峰 每一个单词首字母都是大写   这是一个git的demo    小B是猪一样的队友 ////dfkdofkdofd
public class MainActivity extends AppCompatActivity {

    //小驼峰  第一个单词首字母小写  如果是成员变量命名可以以m开头
    private TextView mLoginTv;
    //静态的成员变量，用s开头
    private static String sName;
    //如果是全局的可以用g开头
    public static int gAge;
    //常量的命名是全部大写，单词之间用下划线分割
    public static final int MAX_AGE = 100;

    //wo shi dev 分支 开发的功能


    //没有add 和commit 直接切换分支

    /**
     * 这是入口,是activity的入口
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoginTv = findViewById(R.id.tv_login);
    }
}

package com.chenmo.zhichitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sobot.chat.SobotApi;
import com.sobot.chat.api.model.Information;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v){
        Information info = new Information();

        //用户编号

        //注意：uid为用户唯一标识，不能传入一样的值

        info.setUid("222");

        //用户昵称，选填

        info.setUname("222");

        //用户姓名，选填

        info.setRealname("222");

        //用户电话，选填

        info.setTel("18511215644");

        //用户邮箱，选填

        info.setEmail("");

        //自定义头像，选填

        info.setFace("");

        //用户QQ，选填

        info.setQq("");

        //用户微信，选填

        info.setWeixin("");

        //用户微博，选填

        info.setWeibo("");

        //用户性别 0.男，1.女，3.未知

        info.setSex("1");

        //用户生日，选填

        info.setBirthday("");

        //用户备注，选填

        info.setRemark("");

        //对话页标题，选填

        info.setVisitTitle("");

        //对话页路径，选填

        info.setVisitUrl("");

        Map<String,String> customInfo = new HashMap<String, String>();

        customInfo.put("gg", "shuai");


        //自定义用户资料

        info.setCustomInfo(customInfo);

        info.setAppkey("251d927a3a9147ed93840279b234de59");

        /**

         * @param context 上下文对象

         * @param information 初始化参数

         */

        SobotApi.startSobotChat(MainActivity.this, info);
    }
}

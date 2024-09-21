package com.example.eduworldskilld25;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.Until;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import kotlin.jvm.internal.Ref;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    Context appContex;
    UiDevice uiDevice;
    @Before
    public void start(){
        appContex=InstrumentationRegistry.getInstrumentation().getTargetContext();
        uiDevice=UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        Intent intent=appContex.getPackageManager().getLaunchIntentForPackage("com.example.eduworldskilld25");
        appContex.startActivity(intent);
        Log.i("log", "进入app");
    }

    @Test
        public void Test()throws InterruptedException{
        UiObject2 name=uiDevice.wait(Until.findObject(By.res("com.example.eduworldskilld25","username")),10000);
        name.setText("admin");
        Log.i("log", "输入用户名admin");
        Thread.sleep(2000);
        UiObject2 youxiang=uiDevice.findObject(By.res("com.example.eduworldskilld25","youxiang"));
        youxiang.setText("123@qq.com");
        Log.i("log", "输入邮箱");
        Thread.sleep(2000);
        UiObject2 phone=uiDevice.findObject(By.res("com.example.eduworldskilld25","phone"));
        phone.setText("14514444");
        Log.i("log","输入手机号");
        Thread.sleep(2000);
        UiObject2 password=uiDevice.findObject(By.res("com.example.eduworldskilld25","password"));
        password.setText("123");
        Log.i("log", "输入密码");
        Thread.sleep(2000);
        UiObject2 password2=uiDevice.findObject(By.res("com.example.eduworldskilld25","password2"));
        password2.setText("123");
        Log.i("log","再次确认密码");
        Thread.sleep(2000);
        UiObject2 zhuce=uiDevice.findObject(By.res("com.example.eduworldskilld25","zhuce_button"));
        zhuce.click();
        Log.i("log","点击注册");
        Thread.sleep(2000);
        UiObject2 username=uiDevice.findObject(By.res("com.example.eduworldskilld25","username"));
        username.setText("admin");
        Log.i("log","输入用户名");
        Thread.sleep(2000);
        UiObject2 password0=uiDevice.findObject(By.res("com.example.eduworldskilld25","password"));
        password0.setText("123");
        Log.i("log", "输入密码");
        Thread.sleep(2000);
        UiObject2 denglu=uiDevice.findObject(By.res("com.example.eduworldskilld25","login_button"));
        denglu.click();
        Log.i("log","点击登录");


    }
}
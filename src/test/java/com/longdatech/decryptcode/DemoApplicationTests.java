package com.longdatech.decryptcode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

    public static void main(String[] args){

        Map map = new HashMap();
        map.put(null,null);


        System.out.println("开始===>");
        AutomaticDemo automaticDemo = new AutomaticDemo();
        for (int i = 0; i < 10; i++){
            new Thread(automaticDemo).start();
        }
    }

}


class AutomaticDemo implements Runnable{
    private int temp = 0;

    @Override
    public void run() {
        try{
            Thread.sleep(200);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":" + getTemp());
    }

    public int getTemp() {
        return temp++;
    }
}

package com.imooc.Java.ThreadUse.synchronization.case1;

/**
 * @version 1.0
 * @Author 旺
 * @Date 2021/2/28 17:32
 * @注释： 线程同步：银行存取款问题
 */
public class Test {
    public static void main(String[] args) {
        // 创建帐户，给定余额为1000
        Bank bank = new Bank("1001", 1000);
        //创建线程对象
        SaveAccount sa = new SaveAccount(bank);
        DrawAccount da = new DrawAccount(bank);
        Thread save = new Thread(sa);
        Thread draw = new Thread(da);
        save.start();
        draw.start();
        try {
            draw.join();
            save.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(bank);
    }
}


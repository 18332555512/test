package com.zhaozy.test.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaozy
 * @date 2019/12/1 10:10 上午
 * @email 1991005001@qq.com
 */
public class MyThread implements Runnable{
    private static final Logger LOGGER = LoggerFactory.getLogger(MyThread.class);

    @Override
    public void run() {

        for(int i = 0; i<5;i++){
            try {
                Thread.sleep(1000);
                LOGGER.info("次线程 执行次数" + i);
            } catch (InterruptedException e) {
                LOGGER.info("mythread is Interrupted");
            }
        }
        LOGGER.info("次线程 finish");
    }
}

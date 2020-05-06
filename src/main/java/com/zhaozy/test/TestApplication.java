package com.zhaozy.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.UnknownHostException;

@SpringBootApplication
public class TestApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestApplication.class);

    public static void main(String[] args) throws UnknownHostException {
//        new Student();
        SpringApplication.run(TestApplication.class, args);
//        Student student = new Student();
//        LOGGER.info("boot-hello : 启动成功！");
//        LOGGER.info("boot-hello : master！");
//        LOGGER.info("boot-hello : pre！");
//        //MyThread myThread = new MyThread();
//        //Thread thread1 = new Thread(myThread);
//        //thread1.start();
//        //try {
//        //    thread1.join();
//        //} catch (InterruptedException e) {
//        //    e.printStackTrace();
//        //}
//        char[] a = {'J', 'A', 'V', 'A'};
//        String a1 = new String(a);
//        String a2 = new String(a1);
//        String a3 = "JAVA";
//        String b = "JA";
//        String b1 = "VA";
//        String a4 = b + b1;
//        String a5 = "JAVA";
//        String a6 = a5;
//        String a7 = a1;
//        if (a3 == a5) {
//            LOGGER.info("a3 == a5");
//        } else {
//            LOGGER.info("a3 != a5");
//        }
//        if (a6 == a5) {
//            LOGGER.info("a6 == a5");
//        } else {
//            LOGGER.info("a6!= a5");
//        }
//        if (a1 == a7) {
//            LOGGER.info("a1 == a7");
//        } else {
//            LOGGER.info("a1 != a7");
//        }
//        int i = 0;
//        String s = String.valueOf(i);
//        LOGGER.info(s);
//        if (a1 == a2) {
//            LOGGER.info("a1 == a2");
//        } else {
//            LOGGER.info("a1 != a2");
//        }
//        if (a1 == a3) {
//            LOGGER.info("a1 == a3");
//        } else {
//            LOGGER.info("a1 != a3");
//        }
//        if (a1 == a4) {
//            LOGGER.info("a1 == a4");
//        } else {
//            LOGGER.info("a1 != a4");
//        }
//        if (a2 == a3) {
//            LOGGER.info("a2 == a3");
//        } else {
//            LOGGER.info("a2 != a3");
//        }
//        if (a2 == a4) {
//            LOGGER.info("a2 == a4");
//        } else {
//            LOGGER.info("a2 != a4");
//        }
//        if (a3 == a4) {
//            LOGGER.info("a3 == a4");
//        } else {
//            LOGGER.info("a3 != a4");
//        }
//        byte[] bytes = a1.getBytes();
//        LOGGER.info("主线程结束");
//        LOGGER.info("freeMemory：" + Runtime.getRuntime().freeMemory());
//        LOGGER.info("totalMemory：" + Runtime.getRuntime().totalMemory());
//        HashMap<String, String> map = new HashMap<>();
//        map.put("name", "heihei");
//        Set<Map.Entry<String, String>> set = map.entrySet();
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry entry = (Map.Entry) iterator.next();
//            String key = (String) entry.getKey();
//            String value = (String) entry.getValue();
//            LOGGER.info("map的key：" + key + " map的value：" + value);
//        }
//        InetAddress localHost = InetAddress.getLocalHost();
//        LOGGER.info("localHost:" + localHost);
//        String hostName = localHost.getHostName();
//        LOGGER.info("hostname:" + hostName);
//
//
//        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
//        scheduledExecutorService.schedule(new Runnable() {
//            @Override
//            public void run() {
//                LOGGER.info("每3秒");
//            }
//        }, 3, TimeUnit.SECONDS);
//        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                LOGGER.info("每3秒");
//            }
//        }, 1, 1, TimeUnit.SECONDS);

    }

}

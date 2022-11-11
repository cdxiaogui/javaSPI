package com.syw.cd.spi;

import com.syw.cd.spi.test.SpiServiceDemo;

/**
 * todo
 *
 * @author sunyawei3
 * 创建时间 2022/11/11 3:48 下午
 */
public class SpiProviderDemo implements SpiServiceDemo {

    @Override
    public void doThing() {
        System.out.println("又又又开始卷起来");
    }
}

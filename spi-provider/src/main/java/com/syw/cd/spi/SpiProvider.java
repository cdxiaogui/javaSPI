package com.syw.cd.spi;

import com.syw.cd.spi.SpiService;

/**
 * todo
 *
 * @author sunyawei3
 * 创建时间 2022/11/11 3:48 下午
 */
public class SpiProvider implements SpiService {


    @Override
    public void doSomeThing() {
        System.out.println("开始卷起来");
    }
}

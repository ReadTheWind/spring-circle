package com.example.demo.service.impl;

import com.example.demo.service.AService;
import com.example.demo.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author: wolfly
 * @CreateDate: 2021/7/7 9:26
 * @ClassName: BServiceImpl
 * @Description:
 */
@Service
public class BServiceImpl implements BService {

    @Autowired
    AService aService;

    @Lazy
    @Autowired
    BService self;

    @Async
    @Override
    public void b() {
        aService.a();
        self.b();
    }
}

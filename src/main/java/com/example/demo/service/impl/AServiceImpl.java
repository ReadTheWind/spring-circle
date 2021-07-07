package com.example.demo.service.impl;

import com.example.demo.service.AService;
import com.example.demo.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author: wolfly
 * @CreateDate: 2021/7/7 9:26
 * @ClassName: AServiceImpl
 * @Description:
 */
@Service
public class AServiceImpl implements AService {


    @Autowired
    BService bService;

    @Override
    public void a() {
        bService.b();
    }
}

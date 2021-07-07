package com.example.demo.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author: wolfly
 * @CreateDate: 2021/7/7 10:38
 * @ClassName: MyBeanFactoryPostProcessor
 * @Description:
 */
//@Component
public class MyBeanFactoryPostProcessor  implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        ((AbstractAutowireCapableBeanFactory) beanFactory).setAllowRawInjectionDespiteWrapping(true);
    }
}

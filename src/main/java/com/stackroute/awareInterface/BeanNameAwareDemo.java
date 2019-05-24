package com.stackroute.awareInterface;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareDemo implements BeanNameAware {

    @Override
    public void setBeanName(String s) {
        s="Ganga";
        System.out.println("Here is your BeanName:"+s);
    }
}

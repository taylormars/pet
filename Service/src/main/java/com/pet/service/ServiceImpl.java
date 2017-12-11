package com.pet.service;

import com.pet.interfaces.*;
import org.springframework.stereotype.Service;

/**
 * Created by liyut on 2017-12-11.
 */
@Service
public class ServiceImpl implements IService{


    public String hello() {
        return "hello world";
    }
}

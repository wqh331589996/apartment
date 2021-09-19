package com.link.service;

import com.link.api.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestServiceImpl implements TestService {

    @Override
    public void test() {
        System.out.println("test");
    }
}

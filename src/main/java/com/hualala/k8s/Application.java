package com.hualala.k8s;

import com.hualala.k8s.utils.ProperUtil;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    protected static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ProperUtil.SetConfInfo();
        SpringApplication.run(Application.class, args);
    }
}

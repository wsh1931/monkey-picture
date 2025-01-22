package com.wusihao.monkeypicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com/wusihao/monkeypicturebackend/mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class MonkeyPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonkeyPictureBackendApplication.class, args);
    }

}

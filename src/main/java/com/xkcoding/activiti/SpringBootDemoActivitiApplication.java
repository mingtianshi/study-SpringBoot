package com.xkcoding.activiti;

import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * <p>
 * 启动器
 * </p>
 *
 * @author PaiGu
 * @date Created in 2019-03-31 22:24
 */
@SpringBootApplication
public class SpringBootDemoActivitiApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringBootDemoActivitiApplication.class, args);
        new SpringApplicationBuilder()
                .sources(Parent.class)
                .child(SpringBootDemoActivitiApplication.class)
                .run(args);

     /*   SpringApplication springApplication = new SpringApplication(SpringBootDemoActivitiApplication.class);
        springApplication.run();
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);*/
    }

}


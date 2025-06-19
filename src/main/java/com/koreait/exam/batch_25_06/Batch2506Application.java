package com.koreait.exam.batch_25_06;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing  // 어노테이션을 설정하면 알아서 자동으로 테이블 생성해줌
public class Batch2506Application {

    public static void main(String[] args) {
        SpringApplication.run(Batch2506Application.class, args);
    }

}

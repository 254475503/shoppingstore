package cn.edu.jxufe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 程 on 2018/8/3.
 */
@SpringBootApplication
@MapperScan("cn.edu.jxufe.dao")
public class StartBoot {
    public static void main(String[] args) {
        System.out.println("服务器启动！");
        SpringApplication.run(StartBoot.class);
    }
}

package login;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author peng.liu
 * @data 2019/12/9 16:14
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("login.mapper")
public class LoginStart {
    public static void main(String[] args) {
        SpringApplication.run(LoginStart.class,args);
    }
}

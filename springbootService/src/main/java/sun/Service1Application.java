package sun;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
/**
 * 
 * @author Faye
 *
 */
@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
@RefreshScope   //开启配置更新功能
public class Service1Application {
 
    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
    }
}
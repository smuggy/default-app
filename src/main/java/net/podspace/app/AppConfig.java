package net.podspace.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    private static final Logger logger = LoggerFactory.getLogger(AppConfig.class.getName());

    @Value("${myapp.value}")
    private String val;

    @Bean
    public MyBean beanInstance() {
        logger.info("==> Creating bean instance with {}", val);

        MyBean m = new MyBean();
        m.setValue(val);
        return m;
    }
}

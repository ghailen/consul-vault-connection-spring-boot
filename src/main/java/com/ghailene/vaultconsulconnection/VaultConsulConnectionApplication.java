package com.ghailene.vaultconsulconnection;

import com.ghailene.vaultconsulconnection.configuration.ConsulConfig;
import com.ghailene.vaultconsulconnection.configuration.VaultConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(value = ConsulConfig.class)

public class VaultConsulConnectionApplication {
    private static Logger log = LoggerFactory.getLogger(VaultConsulConnectionApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(VaultConsulConnectionApplication.class, args);
        VaultConfig vaultConfig = context.getBean(VaultConfig.class);
        log.info("login " + vaultConfig.getLogin());
        log.info("password " + vaultConfig.getPassword());
    }


}

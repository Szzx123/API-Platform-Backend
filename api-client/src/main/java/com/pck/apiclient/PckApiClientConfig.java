package com.pck.apiclient;

import com.pck.apiclient.client.PckClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("pck.client")
@Data
@ComponentScan
public class PckApiClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public PckClient pckClient(){
        return new PckClient(accessKey, secretKey);
    }

}

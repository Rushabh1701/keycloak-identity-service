/**
 * 
 */
package com.baeldung.auth.provider.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Philippe
 *
 */
@Configuration
public class TestClientConfiguration {
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

package org.mhacioglu.edgeservice.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;

import static org.mockito.Mockito.mock;

@TestConfiguration
public class TestSecurityConfig {

    @Bean
    public ReactiveClientRegistrationRepository clientRegistrationRepository() {
        return mock(ReactiveClientRegistrationRepository.class);
    }
}

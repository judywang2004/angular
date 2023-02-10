package demo.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * SpringSecurity Config
 * 
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
         http.authorizeHttpRequests().requestMatchers("/oauth/**", "/login/**", "/logout/**").hasRole("USER").and().formLogin();
         http.csrf().disable();
         return http.build();
     }

    // @Override
    // public void configure(HttpSecurity http) throws Exception {
    //     http.csrf()
    //             .disable()
    //             .authorizeRequests()
    //             .requestMatchers("/oauth/**", "/login/**", "/logout/**")
    //             .permitAll()
    //             .anyRequest()
    //             .authenticated()
    //             .and()
    //             .formLogin()
    //             .permitAll();
    // }
}

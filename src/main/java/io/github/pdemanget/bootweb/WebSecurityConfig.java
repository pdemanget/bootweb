package io.github.pdemanget.bootweb;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


/**
 * https://dzone.com/articles/securing-urls-using-springnbspsecurity
 * @author fil
 *
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
    .authorizeRequests()
       .anyRequest().permitAll();

    
//    http
//      .authorizeRequests()
//         .antMatchers("/static","/register").permitAll()
//         //.and()
//         .antMatchers("/user/**").hasAnyRole("USER", "ADMIN") // can pass multiple roles
//         .antMatchers("/admin/**").access("hasRole('ADMIN') and hasIpAddress('123.123.123.123')") // pass SPEL using access method
//         .anyRequest().authenticated()
//         .and()
//     .formLogin()
//         .loginPage("/login")
//         .permitAll();
  }

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("user").password("{noop}password").roles("USER").build());
        return manager;
    }
}
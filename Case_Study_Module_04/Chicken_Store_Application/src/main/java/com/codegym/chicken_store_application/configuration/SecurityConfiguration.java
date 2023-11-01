package com.codegym.chicken_store_application.configuration;

import com.codegym.chicken_store_application.repository.UserRepository;
import com.codegym.chicken_store_application.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@EnableAutoConfiguration
@EnableWebSecurity
@ComponentScan(basePackageClasses = {UserDetailsServiceImpl.class, UserRepository.class})
public class SecurityConfiguration {

    private final UserDetailsServiceImpl userDetailsService;


    public SecurityConfiguration(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//        return (web) -> web.ignoring().antMatchers("/static/**");
//    }


    // search cors là gì ? csrf là gì
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable();

        //Pages not require login
        http.authorizeHttpRequests()
                .antMatchers("/static/**", "/css/**", "/js/**", "/static/img/**",
                        "/login", "/logout")
                .permitAll();

        // Pages require login with roles: ALL_ROLE
        // If not login yet, redirect to /login
        http.authorizeHttpRequests()
                .antMatchers("/home", "/check-email",
                        "/product/search/**", "product/list", "product/detail/**",
                        "/category/list",
                        "/user/list", "/user/detail/**",
                        "/user/search/**","/user/reset-password",
                        "user/principal/**", "/user/remove/**")
                .hasAnyRole("MANAGER", "SALE", "HR", "WAREHOUSE");


        // Pages require login with role: ROLE_ADMIN, ROLE_HR
        // If not login at admin role yet, redirect to /login
        http.authorizeHttpRequests()
                .antMatchers("/user/create", "/user/edit/**", "/user/layoff/**", "user/update-role/**")
                .hasAnyRole("MANAGER", "HR");


        // Pages require login with role: ROLE_ADMIN, ROLE_WAREHOUSE
        http.authorizeHttpRequests()
                .antMatchers("/product/create", "/product/edit/**", "/product/remove/**",
                        "/category/create", "/category/edit/**", "/category/remove/**")
                .hasAnyRole("MANAGER", "WAREHOUSE");


        // When user login with ROLE_USER, but try to
        // access pages require ROLE_ADMIN, redirect to /error-403
        http.authorizeHttpRequests().and().exceptionHandling()
                .accessDeniedPage("/access-denied");

        // Configure login page (check login by spring security)
        http.authorizeHttpRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginProcessingUrl("/j_spring_security_check")
                .loginPage("/login")
                .defaultSuccessUrl("/home")

                .failureUrl("/login?error=true")
                .usernameParameter("username")
                .passwordParameter("password")
                .and()

                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout=true");

        return http.build();
    }


}

package com.kcfinance.loans.authentication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class AdminSecurityConfiguration extends WebSecurityConfigurerAdapter {

	/*@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("user")
		.password("{noop}password1")
		.roles("USER")
		.and()
		.withUser("admin")
		.password("{noop}password")
		.roles("USER", "ADMIN");
	}*/
		
	@Bean    
	public UserDetailsService userDetailsService() {    
	    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();    
	    manager.createUser(User.withDefaultPasswordEncoder()  
	    .username("admin").password("password1").roles("ADMIN").build());    
	    return manager;    
	}    
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http
    	.csrf()
    	.disable()
    	.authorizeRequests()
    		.antMatchers("/fonts/**","/css/**","/images/**","/vendor/**","/js/**", "/leads/**","/users/**")
    		.permitAll()
    		.anyRequest()
    		.authenticated()
    	.and()
    		.formLogin()
    		.defaultSuccessUrl("/index")
    		.failureForwardUrl("/login?error")
    		.loginPage("/login")
    		.permitAll()
    	.and()
    		.logout()
    		.permitAll();
    	
    }
	
	/*protected void configure(HttpSecurity http) throws Exception {
	    http.authorizeRequests()
	      .antMatchers("/**")
	      .permitAll();
	}*/
}

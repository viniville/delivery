package com.coderef.delivery.security;

//@Configuration
//@EnableResourceServer
public class SecurityConfiguration /*extends ResourceServerConfigurerAdapter*/ {

    private final static String resourceId = "resources";

    /*
    @Override
    public void configure(HttpSecurity http) throws Exception {
    	
    	//http.requestMatchers()
	    //    .antMatchers("/**")
	    //    .and()
	    //    .authorizeRequests()
	    //    .anyRequest()
	    //    .permitAll();
        
    	http.requestMatchers()
                .antMatchers("/**")
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .antMatchers(HttpMethod.GET, "/**").access("#oauth2.hasScope('read')")
                .antMatchers(HttpMethod.OPTIONS, "/**").access("#oauth2.hasScope('read')")
                .antMatchers(HttpMethod.POST, "/**").access("#oauth2.hasScope('write')")
                .antMatchers(HttpMethod.PUT, "/**").access("#oauth2.hasScope('write')")
                .antMatchers(HttpMethod.PATCH, "/**").access("#oauth2.hasScope('write')")
                .antMatchers(HttpMethod.DELETE, "/**").access("#oauth2.hasScope('write')");

    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources){
        resources.resourceId(resourceId);
    }
    */
}

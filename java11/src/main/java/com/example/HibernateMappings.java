package com.example;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.ldap.authentication.ad.ActiveDirectoryLdapAuthenticationProvider;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

public class HibernateMappings {
    
    @OneToMany(mappedBy="cart1")
	private Set<Items1> items1;
    
    @ManyToOne
	@JoinColumn(name="cart_id", nullable=false)
	private Cart1 cart1;
    
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Employee_Project", 
        joinColumns = { @JoinColumn(name = "employee_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "project_id") }
    )
    Set<Project> projects = new HashSet<>();
    
    
    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees = new HashSet<>();
    
    // standard constructors/getters/setters   
}
// oauth @EnableResourceServer,ResourceServerConfigurerAdapter ,, HttpSecurity

// basic auth  @EnableWebSecurity WebSecurityConfigurerAdapter, AuthenticationManagerBuilder --> inMemoryAuthentication 
//and set authenticationProvider ldap ActiveDirectoryLdapAuthenticationProvider

    public HibernateMappings() {
	// TODO Auto-generated constructor stub
    }

}

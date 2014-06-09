package com.bling;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer{

    public void onStartup(ServletContext servletContext) throws ServletException {  
        AnnotationConfigWebApplicationContext webApplicationContext =  
                new AnnotationConfigWebApplicationContext();  
        webApplicationContext.register(AppConfig.class);  
  
  
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);  
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcherServlet", dispatcherServlet);  
        dynamic.addMapping("/");  
  
    }  

}

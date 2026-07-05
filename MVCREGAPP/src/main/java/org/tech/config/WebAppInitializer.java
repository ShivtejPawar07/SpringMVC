package org.tech.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext context =
                new AnnotationConfigWebApplicationContext();

        context.register(MVCConfig.class);

        DispatcherServlet dispatcherServlet =
                new DispatcherServlet(context);

        ServletRegistration.Dynamic servlet =
                servletContext.addServlet("dispatcher", dispatcherServlet);

        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}
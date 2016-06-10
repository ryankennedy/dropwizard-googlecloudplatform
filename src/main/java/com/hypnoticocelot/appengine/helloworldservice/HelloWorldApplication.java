package com.hypnoticocelot.appengine.helloworldservice;

import com.codahale.metrics.servlets.HealthCheckServlet;
import com.hypnoticocelot.appengine.helloworldservice.resources.HomeResource;
import io.dropwizard.Application;
import io.dropwizard.configuration.ResourceConfigurationSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "HelloWorld";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        bootstrap.setConfigurationSourceProvider(new ResourceConfigurationSourceProvider());
    }

    public void run(HelloWorldConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new HomeResource());
        environment.servlets().addServlet("healthcheck", new HealthCheckServlet(environment.healthChecks()))
                .addMapping("/_ah/health");
    }
}

package io.mikecroft.demo;

import io.quarkus.vertx.web.Param;
import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RoutingExchange;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloResource {

    @Route(path = "/greetings/:name", methods = Route.HttpMethod.GET) 
    void greetingsPathParam(@Param String name, RoutingExchange ex) {
        ex.ok("hello " + name);
    }
}

package verticles;

import io.vertx.lang.groovy.GroovyVerticle;

public class HelloWorldHttpVerticle extends GroovyVerticle {

  public void start() {    
    println("Starting")
    println vertx.getOrCreateContext().config()
  }

  public void stop() {
    println("Stopping")
  }
}
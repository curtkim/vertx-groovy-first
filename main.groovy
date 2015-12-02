println("Main verticle has started, let's deploy some others...")

def adder = new Adder()
println "sum=${adder.add(1,2)}" 
// Different ways of deploying verticles

//def verticle = new verticles.HelloWorldHttpVerticle()
//verticle.start()
//vertx.deployVerticle(verticle)
// Deploy a verticle and don't wait for it to start

def config = [
  name: "tim",
  directory: "/blah"
]
def options = [ config: config ]
vertx.deployVerticle("verticles/HelloWorldHttpVerticle.groovy", options)
//vertx.deployVerticle("server")
vertx.deployVerticle("eb.groovy")
vertx.deployVerticle("shared.groovy")

vertx.deployVerticle("maven:io.vertx:vertx-shell:3.1.0", [
  config:[
    telnetOptions:[
      host:"localhost",
      port:4000
    ]
  ]
])
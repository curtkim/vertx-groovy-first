import io.vertx.core.json.JsonObject

def sd = vertx.sharedData()

def mymap = sd.getLocalMap('mymap')
def a = new JsonObject("{\"foo\":\"bar\"}")
println a.getClass()
mymap.put("foo", a)


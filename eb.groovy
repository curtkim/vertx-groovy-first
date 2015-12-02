def eb = vertx.eventBus()

eb.consumer("news.uk.sport", { message ->
  println("I have received a message: ${message.body()}")
})


def sd = vertx.sharedData()
def mymap = sd.getLocalMap('mymap')

def timerID = vertx.setPeriodic(1000, { id ->
  eb.send("news.uk.sport", "Yay! Someone kicked a ball ${new Date()}")
  def a = mymap.get('foo')
  println a
  println a.getClass()
})
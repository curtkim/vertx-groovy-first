import io.vertx.groovy.ext.unit.TestSuite
def suite = TestSuite.create("the_test_suite")
suite.test("my_test_case", { context ->
  def s = "value"
  context.assertEquals("value", s)
})
suite.run()
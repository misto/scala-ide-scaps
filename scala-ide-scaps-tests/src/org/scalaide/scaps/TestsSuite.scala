package org.scalaide.scaps

import org.junit.runner.RunWith
import org.junit.runners.Suite


@RunWith(classOf[Suite])
@Suite.SuiteClasses(Array(
  classOf[ExampleIntegrationTest]
))
class TestsSuite {}

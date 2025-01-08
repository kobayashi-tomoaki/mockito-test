# Examination of ScalaTest + Mockito

```bash
$ sbt test # for Scala 2
[info] MockitoTest:
[info] A mock
[info] - should just mock
[info] A mock
[info] - should stubbing for pattern matching
[info] Run completed in 915 milliseconds.
[info] Total number of tests run: 2
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 2, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.

$ sbt ++3.4.3 test # for Scala 3
[info] MockitoTest:
[info] A mock
[info] - should just mock
[info] A mock
[info] - should stubbing for pattern matching *** FAILED ***
[info]   0 did not equal 100 (HelloSpec.scala:31)
[info] Run completed in 918 milliseconds.
[info] Total number of tests run: 2
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 1, failed 1, canceled 0, ignored 0, pending 0
[info] *** 1 TEST FAILED ***
```

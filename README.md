- See https://github.com/scala/scala3/issues/14691

```sh
# Works:
sbt --sbt-version 1.6.2 ++2.13.14 compile
# Fails:
sbt --sbt-version 1.6.2 ++3.3.3 compile

# Starting with sbt 1.7.0 it also works with Scala 3:
sbt --sbt-version 1.7.0 ++3.3.3 compile
# Check with sbt 1.10.1, works also:
sbt --sbt-version 1.10.1 ++3.3.3 compile
```

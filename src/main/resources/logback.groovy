appender("stdout", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%d [%level] %logger - %msg%n"
  }
}

logger("org.springframework.batch", INFO)
logger("com.groovy", INFO)
root(INFO, ["stdout"])

Spring Batch Job
------------------------------------

* Gradle is used to build the project
* Project structure:

    <proj>
      |
      +- src
          |
          +- main
          |     |
          |     +- groovy
          |     +- resources
          |
          +- test
          |   |
          |   +- groovy
          |   +- resources

* To run static analysis checks (findbugs & codenarc), and all tests run: `gradle build`
* `gradle test` can be used to run tests only
* `gradle check` can be used to run static analysis
* To produce an executable 'fat' jar run: `gradle shadow`

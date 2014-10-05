package com.groovy.springbatch

import org.springframework.batch.core.ExitStatus
import org.springframework.batch.test.JobLauncherTestUtils
import org.springframework.batch.test.StepScopeTestExecutionListener
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.TestExecutionListeners
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener
import spock.lang.Specification

@ContextConfiguration('/test-config.xml')
@TestExecutionListeners([
        DependencyInjectionTestExecutionListener,
        StepScopeTestExecutionListener
])
class PersonJobIntegrationSpec extends Specification {

  @Autowired
  JobLauncherTestUtils jobLauncher

  void 'simple properties injection'() {

    expect:
    jobLauncher != null
  }

  void 'launch job'() {

    when: 'job is run'
    def jobExecution = jobLauncher.launchJob()

    then: 'it completes successfully (execution is synchronous, so we don\'t have to wait for completion)'
    jobExecution.exitStatus == ExitStatus.COMPLETED
  }

}

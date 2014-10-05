package com.groovy.springbatch.batch

import com.groovy.springbatch.domain.Person
import spock.lang.Specification

class PersonItemProcessorSpec extends Specification {

  PersonItemProcessor itemProcessor

  def setup() {
    itemProcessor = new PersonItemProcessor()
  }

  def "processing a person should turn them into a sheep"() {
    expect: 'some sheep with the same id as the person used to create it'
    itemProcessor.process(new Person(id: 37)).id == 37
  }
}

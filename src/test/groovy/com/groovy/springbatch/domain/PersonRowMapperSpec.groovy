package com.groovy.springbatch.domain

import spock.lang.Specification

import java.sql.ResultSet

class PersonRowMapperSpec extends Specification {

  PersonRowMapper mapper

  def setup() {
    mapper = new PersonRowMapper()
  }

  void 'we are able to map result sets to a person'() {
    given: 'a result set'
    ResultSet resultSet = Mock(ResultSet)
    Person expectedPerson = new Person(id: 1)

    when: 'we map our result set to a person'
    Person actualPerson = mapper.mapRow(resultSet, 1)

    then:
    1 * resultSet.getLong('id') >> 1L
    0 * _

    expectedPerson == actualPerson
  }
}

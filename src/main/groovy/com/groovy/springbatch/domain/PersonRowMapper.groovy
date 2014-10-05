package com.groovy.springbatch.domain

import groovy.transform.CompileStatic
import org.springframework.jdbc.core.RowMapper

import java.sql.ResultSet

@CompileStatic
class PersonRowMapper implements RowMapper<Person> {

  @Override
  Person mapRow(ResultSet rs, int rowNum) {
    new Person(id: rs.getLong('id'))
  }
}

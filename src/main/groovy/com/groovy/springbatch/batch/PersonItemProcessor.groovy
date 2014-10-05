package com.groovy.springbatch.batch

import com.groovy.springbatch.domain.Person
import com.groovy.springbatch.domain.Sheep
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.springframework.batch.item.ItemProcessor
import org.springframework.stereotype.Component

@Slf4j
@Component
@CompileStatic
class PersonItemProcessor implements ItemProcessor<Person, Sheep> {

  @Override
  Sheep process(Person item) throws Exception {
    return new Sheep(id: item.id)
  }
}

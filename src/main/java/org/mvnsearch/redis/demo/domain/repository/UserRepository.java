package org.mvnsearch.redis.demo.domain.repository;


import com.redis.om.spring.repository.RedisDocumentRepository;
import org.mvnsearch.redis.demo.domain.model.Person;

public interface UserRepository extends RedisDocumentRepository<Person, String> {
}

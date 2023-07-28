package com.rafaa.activedirectoryservice.repository;

import com.rafaa.activedirectoryservice.model.ActiveDirectory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActiveDirectoryRepository extends MongoRepository<ActiveDirectory,String> {
}

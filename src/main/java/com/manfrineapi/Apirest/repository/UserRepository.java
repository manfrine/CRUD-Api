package com.manfrineapi.Apirest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manfrineapi.Apirest.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}

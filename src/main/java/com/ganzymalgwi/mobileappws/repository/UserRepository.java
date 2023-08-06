package com.ganzymalgwi.mobileappws.repository;

import com.ganzymalgwi.mobileappws.model.enitity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long>{

}

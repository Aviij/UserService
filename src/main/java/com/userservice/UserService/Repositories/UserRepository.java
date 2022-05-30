package com.userservice.UserService.Repositories;

import com.userservice.UserService.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity, String> {

    /* @Query("SELECT ue FROM UserEntity ue WHERE ue.id=? 1")
    UserEntity findUserEntityById(String id);
*/
}

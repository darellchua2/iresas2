package com.gdipsa.iresas2.repo;

import com.gdipsa.iresas2.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends BaseRepository<User, Integer>{
    @Query("Select u from User u where u.username=:username")
    User findByUsername(@Param("username") String username);

    @Query("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);


}

package com.thinkxfactor.zomatoplus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thinkxfactor.zomatoplus.models.User;
public interface UserRepository extends JpaRepository<User,Long> {

}

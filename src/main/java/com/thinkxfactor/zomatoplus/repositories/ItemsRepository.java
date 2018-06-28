package com.thinkxfactor.zomatoplus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.models.Items;
public interface ItemsRepository extends JpaRepository<User, Long> {

	User save(Items items);

}

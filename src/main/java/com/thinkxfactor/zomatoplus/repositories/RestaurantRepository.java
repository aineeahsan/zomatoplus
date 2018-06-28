package com.thinkxfactor.zomatoplus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;


public interface RestaurantRepository extends JpaRepository<User,Long>{

	User save(Restaurant restaurant);

}

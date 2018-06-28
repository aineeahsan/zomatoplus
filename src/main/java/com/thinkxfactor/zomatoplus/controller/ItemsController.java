package com.thinkxfactor.zomatoplus.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repositories.ItemsRepository;
import com.thinkxfactor.zomatoplus.repositories.UserRepository;

@RestController
@RequestMapping("/items")
public class ItemsController {
	@Autowired
private ItemsRepository itemRepository;
@PostMapping("/add")
public User addItems(@RequestBody Items items) {
	User persistedItems=itemRepository.save(items);
			
			return persistedItems;
}
	@GetMapping("/getAll")
	public List<User> getAll(){
		List<User> listofitems=itemRepository.findAll();
		return listofitems;
	}
}

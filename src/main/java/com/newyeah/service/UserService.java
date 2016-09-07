package com.newyeah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.newyeah.entity.Users;
import com.newyeah.mapper.UsersMapper;

@Service
@Transactional
public class UserService {

    @Autowired
    private UsersMapper usersMapper;

    public List<Users> queryUsers(){
    	transaction();
        return usersMapper.selectByExample(null);
    }
    
    public boolean transaction(){
    	Users record = new Users() ;
    	record.setName("liuy4");
    	record.setPwd("liuy4");
    	usersMapper.insert(record) ;
    	usersMapper.insert(record) ;
    	return true ;
    }

}
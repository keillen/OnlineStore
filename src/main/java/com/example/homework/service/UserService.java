package com.example.homework.service;


import com.example.homework.model.User;
import com.example.homework.mapper.UserMapper;
import com.example.homework.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper usermapper;



    public Object Check(String name, String password){
       UserExample userExample =new UserExample();
       userExample.createCriteria()
               .andNameEqualTo(name);
       return usermapper.selectByExample(userExample);
    }
//    public User selectById(Integer id){
//        return usermapper.selectById(id);
//    }
//    public int delectById(Integer id){
//        return usermapper.deleteByPrimaryKey(id);
//    }
//    public String selectByUsername(String username){
//
//    }

    //    public void createOrUpdate(User user){
//        user.setId();
//    }
//    public User selectByName(String name){
////        UserExample userExample =new UserExample();
////        userExample.createCriteria().andNameEqualTo(name);
////        System.out.println("userExample"+userExample);
////        User user  = (User) usermapper.selectByExample(userExample);
//////        return (User) usermapper.selectByExample(userExample);
////        return user;
//    }
    public long checkUser(String name, String password){
        UserExample userExample =new UserExample();
        UserExample.Criteria criteria =userExample.createCriteria();
        criteria.andNameEqualTo(name);
        criteria.andPasswordEqualTo(password);
        return usermapper.countByExample(userExample);
    }


    public long CheckName(User user) {
        String name =user.getName();
        UserExample userExample =new UserExample();
        UserExample.Criteria criteria =userExample.createCriteria();
        criteria.andNameEqualTo(name);
        return usermapper.countByExample(userExample);
        }


    public int insert(User user) {
        return usermapper.insert(user);
    }
}


package com.shop.service.impl;

import com.shop.dao.UserMap;
import com.shop.entity.User;
import com.shop.exception.NameOrPasswordException;
import com.shop.exception.UserNotExistException;
import com.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService {
   /* private static ApplicationContext applicationContext = null;   //提供静态ApplicationContext
    static{
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); //实例化
    }*/
    @Autowired
    private UserMap map;
    @Override
	public void login(String username, String password) 
			throws UserNotExistException,NameOrPasswordException {
       // UserMap map = (UserMap)applicationContext.getBean("userMap");

        List<User> users = map.queryAllPerson(username);
            System.out.println(users);
            if(users.size() == 0){
                System.out.println("11");
                throw new UserNotExistException("用户不存在");
            }

            //3.判断密码是否相等
            for(User u:users){
                if(!password.equals(u.getPassword())){
                    throw new NameOrPasswordException("用户名或密码错误！");
                }
            }
	}

	@Transactional
	@Override
    public void reg(User user) {

    }

    @Override
	public void modifyUser(int id, User user) {

	}

	@Override
	public void modifyUserPassword(int id, String password) {

	}

}

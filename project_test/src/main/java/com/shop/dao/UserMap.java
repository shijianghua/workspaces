package com.shop.dao;

import com.shop.entity.User;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

/**
 * Created by sedrtyug on 2017/2/15.
 */
public class UserMap extends SqlMapClientDaoSupport {
    public UserMap(){}
    //添加操作
    public boolean insertPerson(User user) {
        // TODO Auto-generated method stub
        getSqlMapClientTemplate().insert("insert",user);
        return false;
    }
    // 查找所以用户
    public List<User> queryAllPerson(String name) {
        // TODO Auto-generated method stub
        List<User> list=getSqlMapClientTemplate().queryForList("getUsersByName",name);
        System.out.print(list);
        return list;
    }
}

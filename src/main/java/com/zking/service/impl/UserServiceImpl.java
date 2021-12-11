package com.zking.service.impl;

import com.zking.mapper.UserMapper;
import com.zking.model.User;
import com.zking.service.IUserService;
import com.zking.util.PasswordHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return userMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(User record) {
        //得到前端用户传递的密码创建盐并且加密
        String salt = PasswordHelper.createSalt();
        //加密后的密码
        String pwd = PasswordHelper.createCredentials(record.getPassword(), salt);
        record.setSalt(salt);record.setPassword(pwd);
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer userid) {
        return userMapper.selectByPrimaryKey(userid);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public Set<String> getRoleByuserName(String username) {
        return userMapper.getRoleByuserName(username);
    }

    @Override
    public Set<String> getPermissionByuserName(String username) {
        return userMapper.getPermissionByuserName(username);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}

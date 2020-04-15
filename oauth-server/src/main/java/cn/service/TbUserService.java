package cn.service;

import cn.mapper.TbPermissionMapper;
import cn.mapper.TbUserMapper;
import cn.pojo.TbPermission;
import cn.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserService {
    @Autowired
    private TbUserMapper tbUserMapper;

    public TbUser getUserByUsername(String username) {
        return tbUserMapper.getUserByUsername(username);
    }
}

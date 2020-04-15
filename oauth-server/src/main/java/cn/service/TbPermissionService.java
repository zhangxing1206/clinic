package cn.service;

import cn.mapper.TbPermissionMapper;
import cn.pojo.TbPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbPermissionService {
    @Autowired
    private TbPermissionMapper tbPermissionMapper;

    public List<TbPermission>  getByUserid(Integer id) {
        return tbPermissionMapper.getByUserid(id);
    }

}

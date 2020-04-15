package cn.service;

import cn.dao.CostDao;
import cn.pojo.Cost;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CostServiceImpl implements CostService {
    @Resource
    CostDao costDao;

    public List<Cost> costInfo(@Param("reTypeId") Integer reTypeId) {
        return costDao.costInfo(reTypeId);
    }
}

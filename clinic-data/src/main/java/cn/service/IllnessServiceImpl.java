package cn.service;

import cn.dao.IllnessDao;
import cn.pojo.Illness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IllnessServiceImpl implements IllnessService {
    @Autowired
    private IllnessDao illnessDao;

    public List<Illness> illnessInfo() {
        return illnessDao.illnessInfo();
    }
}

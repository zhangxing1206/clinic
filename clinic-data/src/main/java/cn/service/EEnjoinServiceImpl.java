package cn.service;

import cn.dao.EEnjoinDao;
import cn.pojo.EEnjoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EEnjoinServiceImpl implements EEnjoinService {
    @Autowired
    EEnjoinDao eEnjoinDao;

    public List<EEnjoin> eEnjoinInfo() {
        return eEnjoinDao.eEnjoinInfo();
    }
}

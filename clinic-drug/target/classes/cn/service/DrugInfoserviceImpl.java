package cn.service;

import cn.dao.DrugInfoMapper;
import cn.pojo.Drug;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class DrugInfoserviceImpl implements DrugInfoService {
    @Resource
    DrugInfoMapper drugInfoMapper;

    public List<Drug> getDrugInfo(Integer mType) {
        return drugInfoMapper.getDrugInfo(mType);
    }
}

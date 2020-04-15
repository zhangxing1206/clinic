package cn.service;

import cn.pojo.Drug;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface DrugInfoService {
    public List<Drug> getDrugInfo(@Param("mType") Integer mType);

}

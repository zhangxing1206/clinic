package cn.dao;

import cn.pojo.Drug;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface DrugInfoMapper {
    public List<Drug> getDrugInfo(@Param("mType") Integer mType);
}

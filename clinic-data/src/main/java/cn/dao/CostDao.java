package cn.dao;

import cn.pojo.Cost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CostDao {

    @Select("select * from cost where reTypeId=#{reTypeId}")
    public List<Cost> costInfo(Integer reTypeId);

}

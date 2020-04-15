package cn.dao;

import cn.pojo.Illness;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IllnessDao {
    @Select("select * from illness")
    public List<Illness> illnessInfo();
}

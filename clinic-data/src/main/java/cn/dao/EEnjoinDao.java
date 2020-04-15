package cn.dao;

import cn.pojo.EEnjoin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface EEnjoinDao {
    @Select("select * from eenjoin")
    public List<EEnjoin> eEnjoinInfo();
}

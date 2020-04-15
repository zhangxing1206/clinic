package cn.mapper;

import cn.pojo.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TbUserMapper {
    @Select("select * from `tb_user` where `username` = #{username}")
    public TbUser getUserByUsername(String username);
}

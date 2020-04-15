package cn.dao;


import cn.pojo.RecipeTemplate;
import cn.pojo.TemplateDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RecipeTemplateDao {
    @Select({"<script>select p.*,e.`emName`,r.`rename`" ,
            "from `pretemplate` p,`employee` e,`recipetype` r " ,
            "<where> p.`createPerson`=e.`eid`" ,
            "and p.`temType`=r.`reid`" ,
            "<if test='temType!= null and temType!= \"\"'> and p.`temType`=#{temType}</if>" ,
            "<if test='temPermission!= null and temPermission!= \"\"'> and p.`temPermission`=#{temPermission}</if>" ,
            "</where>",
            "and (p.`temNo` like CONCAT('%',#{temNo},'%') or p.`temName` like CONCAT('%',#{temName},'%'))</script>"})
    public List<RecipeTemplate> getRecipeTemplate(@Param("temType") Integer temType, @Param("temPermission")Integer temPermission, @Param("temNo")String temNo, @Param("temName")String temName);

    @Select("select w.* ,m.`mName`,m.`mBuy`\n" +
            "from `west` w,`medicine` m\n" +
            "where w.`medicineId`=m.id\n" +
            "and m.`mNo`=#{mNo}")
    public TemplateDetails getTemplateDetails(String mNo);


}

package cn.mapper;

import cn.pojo.TbPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TbPermissionMapper {
    @Select("select * from tb_permission where id in \n" +
            "  (select `permission_id` from `tb_role_permission` where `role_id` in \n" +
            "     (select `id` from `tb_role` where id in\n" +
            "        (select `role_id` from `tb_user_role` where `user_id` in\n" +
            "           (select `id` from `tb_user` where `id`=#{id}))))")
    public List<TbPermission>  getByUserid(Integer id);

}

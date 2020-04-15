package cn.utils;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @Description  
 * @Author  Henry
 * @Date 2020-04-02 
 */

@Getter
@Setter
@Data
@Accessors(chain = true)
public class Permission  {


	private Long permissionId;

	private String permissionName;

}

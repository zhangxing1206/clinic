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
public class Template {

	private Long id;

	private String name;

	private String diagnose;

	private String creation_time;

	private Integer permissionId;

	private Integer prescriptionTypeId;

	private String creater;


	private String templateId;

	private Permission permission;

	private Prescriptiontype prescriptiontype;

	/**
	 * 模板说明
	 */
	private String explain;


}

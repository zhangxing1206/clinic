package cn.utils;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description  
 * @Author  Henry
 * @Date 2020-04-04 
 */
@Setter
@Getter
@Data
@Accessors(chain = true)
public class Drug  implements Serializable {

	private Long id;

	/** 药品编号 */
	private String drugcoding;

	/** 药品名称 */
	private String drugname;

	/** 收费类别 */
	private String chargeType;

	/** 规格 */
	private String specification;

	/** 厂家编号 */
	private Long venderId;

	/** 库存 */
	private String repertory;

	/** 价格 */
	private Double price;
	/**
	 * 厂家类
	 */
	private Vender vender;

}

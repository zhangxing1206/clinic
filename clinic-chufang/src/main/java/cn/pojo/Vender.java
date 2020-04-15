package cn.pojo;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * @Description  
 * @Author  Henry
 * @Date 2020-04-04 
 */

@Setter
@Getter
@Data
@Accessors(fluent = true)
public class Vender {

	private Long id;

	private String venderName;

}

package com.entity.view;

import com.entity.ShipinpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 视频评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
@TableName("shipinpingjia")
public class ShipinpingjiaView  extends ShipinpingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShipinpingjiaView(){
	}
 
 	public ShipinpingjiaView(ShipinpingjiaEntity shipinpingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, shipinpingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

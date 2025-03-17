package com.entity.view;

import com.entity.DiscussshipingongxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 视频共享评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
@TableName("discussshipingongxiang")
public class DiscussshipingongxiangView  extends DiscussshipingongxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshipingongxiangView(){
	}
 
 	public DiscussshipingongxiangView(DiscussshipingongxiangEntity discussshipingongxiangEntity){
 	try {
			BeanUtils.copyProperties(this, discussshipingongxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

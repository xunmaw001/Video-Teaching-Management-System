package com.dao;

import com.entity.ShipinpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipinpingjiaVO;
import com.entity.view.ShipinpingjiaView;


/**
 * 视频评价
 * 
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
public interface ShipinpingjiaDao extends BaseMapper<ShipinpingjiaEntity> {
	
	List<ShipinpingjiaVO> selectListVO(@Param("ew") Wrapper<ShipinpingjiaEntity> wrapper);
	
	ShipinpingjiaVO selectVO(@Param("ew") Wrapper<ShipinpingjiaEntity> wrapper);
	
	List<ShipinpingjiaView> selectListView(@Param("ew") Wrapper<ShipinpingjiaEntity> wrapper);

	List<ShipinpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<ShipinpingjiaEntity> wrapper);
	
	ShipinpingjiaView selectView(@Param("ew") Wrapper<ShipinpingjiaEntity> wrapper);
	
}

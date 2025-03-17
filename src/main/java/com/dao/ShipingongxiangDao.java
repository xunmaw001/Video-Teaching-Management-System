package com.dao;

import com.entity.ShipingongxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipingongxiangVO;
import com.entity.view.ShipingongxiangView;


/**
 * 视频共享
 * 
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
public interface ShipingongxiangDao extends BaseMapper<ShipingongxiangEntity> {
	
	List<ShipingongxiangVO> selectListVO(@Param("ew") Wrapper<ShipingongxiangEntity> wrapper);
	
	ShipingongxiangVO selectVO(@Param("ew") Wrapper<ShipingongxiangEntity> wrapper);
	
	List<ShipingongxiangView> selectListView(@Param("ew") Wrapper<ShipingongxiangEntity> wrapper);

	List<ShipingongxiangView> selectListView(Pagination page,@Param("ew") Wrapper<ShipingongxiangEntity> wrapper);
	
	ShipingongxiangView selectView(@Param("ew") Wrapper<ShipingongxiangEntity> wrapper);
	
}

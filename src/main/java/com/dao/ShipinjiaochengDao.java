package com.dao;

import com.entity.ShipinjiaochengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipinjiaochengVO;
import com.entity.view.ShipinjiaochengView;


/**
 * 视频教程
 * 
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
public interface ShipinjiaochengDao extends BaseMapper<ShipinjiaochengEntity> {
	
	List<ShipinjiaochengVO> selectListVO(@Param("ew") Wrapper<ShipinjiaochengEntity> wrapper);
	
	ShipinjiaochengVO selectVO(@Param("ew") Wrapper<ShipinjiaochengEntity> wrapper);
	
	List<ShipinjiaochengView> selectListView(@Param("ew") Wrapper<ShipinjiaochengEntity> wrapper);

	List<ShipinjiaochengView> selectListView(Pagination page,@Param("ew") Wrapper<ShipinjiaochengEntity> wrapper);
	
	ShipinjiaochengView selectView(@Param("ew") Wrapper<ShipinjiaochengEntity> wrapper);
	
}

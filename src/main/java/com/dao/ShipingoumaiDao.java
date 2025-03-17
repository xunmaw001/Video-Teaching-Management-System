package com.dao;

import com.entity.ShipingoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipingoumaiVO;
import com.entity.view.ShipingoumaiView;


/**
 * 视频购买
 * 
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
public interface ShipingoumaiDao extends BaseMapper<ShipingoumaiEntity> {
	
	List<ShipingoumaiVO> selectListVO(@Param("ew") Wrapper<ShipingoumaiEntity> wrapper);
	
	ShipingoumaiVO selectVO(@Param("ew") Wrapper<ShipingoumaiEntity> wrapper);
	
	List<ShipingoumaiView> selectListView(@Param("ew") Wrapper<ShipingoumaiEntity> wrapper);

	List<ShipingoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShipingoumaiEntity> wrapper);
	
	ShipingoumaiView selectView(@Param("ew") Wrapper<ShipingoumaiEntity> wrapper);
	
}

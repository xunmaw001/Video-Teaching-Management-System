package com.dao;

import com.entity.DiscussshipingongxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshipingongxiangVO;
import com.entity.view.DiscussshipingongxiangView;


/**
 * 视频共享评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
public interface DiscussshipingongxiangDao extends BaseMapper<DiscussshipingongxiangEntity> {
	
	List<DiscussshipingongxiangVO> selectListVO(@Param("ew") Wrapper<DiscussshipingongxiangEntity> wrapper);
	
	DiscussshipingongxiangVO selectVO(@Param("ew") Wrapper<DiscussshipingongxiangEntity> wrapper);
	
	List<DiscussshipingongxiangView> selectListView(@Param("ew") Wrapper<DiscussshipingongxiangEntity> wrapper);

	List<DiscussshipingongxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshipingongxiangEntity> wrapper);
	
	DiscussshipingongxiangView selectView(@Param("ew") Wrapper<DiscussshipingongxiangEntity> wrapper);
	
}

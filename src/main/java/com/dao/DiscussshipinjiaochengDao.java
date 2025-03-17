package com.dao;

import com.entity.DiscussshipinjiaochengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshipinjiaochengVO;
import com.entity.view.DiscussshipinjiaochengView;


/**
 * 视频教程评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
public interface DiscussshipinjiaochengDao extends BaseMapper<DiscussshipinjiaochengEntity> {
	
	List<DiscussshipinjiaochengVO> selectListVO(@Param("ew") Wrapper<DiscussshipinjiaochengEntity> wrapper);
	
	DiscussshipinjiaochengVO selectVO(@Param("ew") Wrapper<DiscussshipinjiaochengEntity> wrapper);
	
	List<DiscussshipinjiaochengView> selectListView(@Param("ew") Wrapper<DiscussshipinjiaochengEntity> wrapper);

	List<DiscussshipinjiaochengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshipinjiaochengEntity> wrapper);
	
	DiscussshipinjiaochengView selectView(@Param("ew") Wrapper<DiscussshipinjiaochengEntity> wrapper);
	
}

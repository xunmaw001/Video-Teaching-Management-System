package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshipinjiaochengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshipinjiaochengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshipinjiaochengView;


/**
 * 视频教程评论表
 *
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
public interface DiscussshipinjiaochengService extends IService<DiscussshipinjiaochengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshipinjiaochengVO> selectListVO(Wrapper<DiscussshipinjiaochengEntity> wrapper);
   	
   	DiscussshipinjiaochengVO selectVO(@Param("ew") Wrapper<DiscussshipinjiaochengEntity> wrapper);
   	
   	List<DiscussshipinjiaochengView> selectListView(Wrapper<DiscussshipinjiaochengEntity> wrapper);
   	
   	DiscussshipinjiaochengView selectView(@Param("ew") Wrapper<DiscussshipinjiaochengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshipinjiaochengEntity> wrapper);
   	
}


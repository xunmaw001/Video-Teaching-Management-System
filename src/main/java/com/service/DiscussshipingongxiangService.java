package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshipingongxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshipingongxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshipingongxiangView;


/**
 * 视频共享评论表
 *
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
public interface DiscussshipingongxiangService extends IService<DiscussshipingongxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshipingongxiangVO> selectListVO(Wrapper<DiscussshipingongxiangEntity> wrapper);
   	
   	DiscussshipingongxiangVO selectVO(@Param("ew") Wrapper<DiscussshipingongxiangEntity> wrapper);
   	
   	List<DiscussshipingongxiangView> selectListView(Wrapper<DiscussshipingongxiangEntity> wrapper);
   	
   	DiscussshipingongxiangView selectView(@Param("ew") Wrapper<DiscussshipingongxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshipingongxiangEntity> wrapper);
   	
}


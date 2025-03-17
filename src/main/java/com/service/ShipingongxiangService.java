package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipingongxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipingongxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipingongxiangView;


/**
 * 视频共享
 *
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
public interface ShipingongxiangService extends IService<ShipingongxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipingongxiangVO> selectListVO(Wrapper<ShipingongxiangEntity> wrapper);
   	
   	ShipingongxiangVO selectVO(@Param("ew") Wrapper<ShipingongxiangEntity> wrapper);
   	
   	List<ShipingongxiangView> selectListView(Wrapper<ShipingongxiangEntity> wrapper);
   	
   	ShipingongxiangView selectView(@Param("ew") Wrapper<ShipingongxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipingongxiangEntity> wrapper);
   	
}


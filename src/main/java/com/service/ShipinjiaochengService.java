package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinjiaochengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipinjiaochengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinjiaochengView;


/**
 * 视频教程
 *
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
public interface ShipinjiaochengService extends IService<ShipinjiaochengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipinjiaochengVO> selectListVO(Wrapper<ShipinjiaochengEntity> wrapper);
   	
   	ShipinjiaochengVO selectVO(@Param("ew") Wrapper<ShipinjiaochengEntity> wrapper);
   	
   	List<ShipinjiaochengView> selectListView(Wrapper<ShipinjiaochengEntity> wrapper);
   	
   	ShipinjiaochengView selectView(@Param("ew") Wrapper<ShipinjiaochengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipinjiaochengEntity> wrapper);
   	
}


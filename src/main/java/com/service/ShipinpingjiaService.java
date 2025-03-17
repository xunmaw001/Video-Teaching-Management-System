package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinpingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipinpingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinpingjiaView;


/**
 * 视频评价
 *
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
public interface ShipinpingjiaService extends IService<ShipinpingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipinpingjiaVO> selectListVO(Wrapper<ShipinpingjiaEntity> wrapper);
   	
   	ShipinpingjiaVO selectVO(@Param("ew") Wrapper<ShipinpingjiaEntity> wrapper);
   	
   	List<ShipinpingjiaView> selectListView(Wrapper<ShipinpingjiaEntity> wrapper);
   	
   	ShipinpingjiaView selectView(@Param("ew") Wrapper<ShipinpingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipinpingjiaEntity> wrapper);
   	
}


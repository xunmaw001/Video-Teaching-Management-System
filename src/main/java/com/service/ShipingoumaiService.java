package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipingoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipingoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipingoumaiView;


/**
 * 视频购买
 *
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
public interface ShipingoumaiService extends IService<ShipingoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipingoumaiVO> selectListVO(Wrapper<ShipingoumaiEntity> wrapper);
   	
   	ShipingoumaiVO selectVO(@Param("ew") Wrapper<ShipingoumaiEntity> wrapper);
   	
   	List<ShipingoumaiView> selectListView(Wrapper<ShipingoumaiEntity> wrapper);
   	
   	ShipingoumaiView selectView(@Param("ew") Wrapper<ShipingoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipingoumaiEntity> wrapper);
   	
}


package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShipinpingjiaDao;
import com.entity.ShipinpingjiaEntity;
import com.service.ShipinpingjiaService;
import com.entity.vo.ShipinpingjiaVO;
import com.entity.view.ShipinpingjiaView;

@Service("shipinpingjiaService")
public class ShipinpingjiaServiceImpl extends ServiceImpl<ShipinpingjiaDao, ShipinpingjiaEntity> implements ShipinpingjiaService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipinpingjiaEntity> page = this.selectPage(
                new Query<ShipinpingjiaEntity>(params).getPage(),
                new EntityWrapper<ShipinpingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipinpingjiaEntity> wrapper) {
		  Page<ShipinpingjiaView> page =new Query<ShipinpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipinpingjiaVO> selectListVO(Wrapper<ShipinpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipinpingjiaVO selectVO(Wrapper<ShipinpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipinpingjiaView> selectListView(Wrapper<ShipinpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipinpingjiaView selectView(Wrapper<ShipinpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

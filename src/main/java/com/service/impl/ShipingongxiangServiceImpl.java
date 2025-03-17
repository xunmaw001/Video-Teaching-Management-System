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


import com.dao.ShipingongxiangDao;
import com.entity.ShipingongxiangEntity;
import com.service.ShipingongxiangService;
import com.entity.vo.ShipingongxiangVO;
import com.entity.view.ShipingongxiangView;

@Service("shipingongxiangService")
public class ShipingongxiangServiceImpl extends ServiceImpl<ShipingongxiangDao, ShipingongxiangEntity> implements ShipingongxiangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipingongxiangEntity> page = this.selectPage(
                new Query<ShipingongxiangEntity>(params).getPage(),
                new EntityWrapper<ShipingongxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipingongxiangEntity> wrapper) {
		  Page<ShipingongxiangView> page =new Query<ShipingongxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipingongxiangVO> selectListVO(Wrapper<ShipingongxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipingongxiangVO selectVO(Wrapper<ShipingongxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipingongxiangView> selectListView(Wrapper<ShipingongxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipingongxiangView selectView(Wrapper<ShipingongxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

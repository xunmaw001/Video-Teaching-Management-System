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


import com.dao.ShipinjiaochengDao;
import com.entity.ShipinjiaochengEntity;
import com.service.ShipinjiaochengService;
import com.entity.vo.ShipinjiaochengVO;
import com.entity.view.ShipinjiaochengView;

@Service("shipinjiaochengService")
public class ShipinjiaochengServiceImpl extends ServiceImpl<ShipinjiaochengDao, ShipinjiaochengEntity> implements ShipinjiaochengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipinjiaochengEntity> page = this.selectPage(
                new Query<ShipinjiaochengEntity>(params).getPage(),
                new EntityWrapper<ShipinjiaochengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipinjiaochengEntity> wrapper) {
		  Page<ShipinjiaochengView> page =new Query<ShipinjiaochengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipinjiaochengVO> selectListVO(Wrapper<ShipinjiaochengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipinjiaochengVO selectVO(Wrapper<ShipinjiaochengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipinjiaochengView> selectListView(Wrapper<ShipinjiaochengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipinjiaochengView selectView(Wrapper<ShipinjiaochengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

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


import com.dao.ShipingoumaiDao;
import com.entity.ShipingoumaiEntity;
import com.service.ShipingoumaiService;
import com.entity.vo.ShipingoumaiVO;
import com.entity.view.ShipingoumaiView;

@Service("shipingoumaiService")
public class ShipingoumaiServiceImpl extends ServiceImpl<ShipingoumaiDao, ShipingoumaiEntity> implements ShipingoumaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipingoumaiEntity> page = this.selectPage(
                new Query<ShipingoumaiEntity>(params).getPage(),
                new EntityWrapper<ShipingoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipingoumaiEntity> wrapper) {
		  Page<ShipingoumaiView> page =new Query<ShipingoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipingoumaiVO> selectListVO(Wrapper<ShipingoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipingoumaiVO selectVO(Wrapper<ShipingoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipingoumaiView> selectListView(Wrapper<ShipingoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipingoumaiView selectView(Wrapper<ShipingoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

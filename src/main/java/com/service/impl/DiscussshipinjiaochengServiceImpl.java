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


import com.dao.DiscussshipinjiaochengDao;
import com.entity.DiscussshipinjiaochengEntity;
import com.service.DiscussshipinjiaochengService;
import com.entity.vo.DiscussshipinjiaochengVO;
import com.entity.view.DiscussshipinjiaochengView;

@Service("discussshipinjiaochengService")
public class DiscussshipinjiaochengServiceImpl extends ServiceImpl<DiscussshipinjiaochengDao, DiscussshipinjiaochengEntity> implements DiscussshipinjiaochengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshipinjiaochengEntity> page = this.selectPage(
                new Query<DiscussshipinjiaochengEntity>(params).getPage(),
                new EntityWrapper<DiscussshipinjiaochengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshipinjiaochengEntity> wrapper) {
		  Page<DiscussshipinjiaochengView> page =new Query<DiscussshipinjiaochengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshipinjiaochengVO> selectListVO(Wrapper<DiscussshipinjiaochengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshipinjiaochengVO selectVO(Wrapper<DiscussshipinjiaochengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshipinjiaochengView> selectListView(Wrapper<DiscussshipinjiaochengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshipinjiaochengView selectView(Wrapper<DiscussshipinjiaochengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

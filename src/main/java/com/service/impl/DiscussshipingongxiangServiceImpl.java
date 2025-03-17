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


import com.dao.DiscussshipingongxiangDao;
import com.entity.DiscussshipingongxiangEntity;
import com.service.DiscussshipingongxiangService;
import com.entity.vo.DiscussshipingongxiangVO;
import com.entity.view.DiscussshipingongxiangView;

@Service("discussshipingongxiangService")
public class DiscussshipingongxiangServiceImpl extends ServiceImpl<DiscussshipingongxiangDao, DiscussshipingongxiangEntity> implements DiscussshipingongxiangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshipingongxiangEntity> page = this.selectPage(
                new Query<DiscussshipingongxiangEntity>(params).getPage(),
                new EntityWrapper<DiscussshipingongxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshipingongxiangEntity> wrapper) {
		  Page<DiscussshipingongxiangView> page =new Query<DiscussshipingongxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshipingongxiangVO> selectListVO(Wrapper<DiscussshipingongxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshipingongxiangVO selectVO(Wrapper<DiscussshipingongxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshipingongxiangView> selectListView(Wrapper<DiscussshipingongxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshipingongxiangView selectView(Wrapper<DiscussshipingongxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

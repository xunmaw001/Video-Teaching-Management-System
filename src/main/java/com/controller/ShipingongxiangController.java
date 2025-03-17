package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShipingongxiangEntity;
import com.entity.view.ShipingongxiangView;

import com.service.ShipingongxiangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 视频共享
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
@RestController
@RequestMapping("/shipingongxiang")
public class ShipingongxiangController {
    @Autowired
    private ShipingongxiangService shipingongxiangService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShipingongxiangEntity shipingongxiang, HttpServletRequest request){

        EntityWrapper<ShipingongxiangEntity> ew = new EntityWrapper<ShipingongxiangEntity>();
    	PageUtils page = shipingongxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipingongxiang), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShipingongxiangEntity shipingongxiang, HttpServletRequest request){
        EntityWrapper<ShipingongxiangEntity> ew = new EntityWrapper<ShipingongxiangEntity>();
    	PageUtils page = shipingongxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipingongxiang), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShipingongxiangEntity shipingongxiang){
       	EntityWrapper<ShipingongxiangEntity> ew = new EntityWrapper<ShipingongxiangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shipingongxiang, "shipingongxiang")); 
        return R.ok().put("data", shipingongxiangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShipingongxiangEntity shipingongxiang){
        EntityWrapper< ShipingongxiangEntity> ew = new EntityWrapper< ShipingongxiangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shipingongxiang, "shipingongxiang")); 
		ShipingongxiangView shipingongxiangView =  shipingongxiangService.selectView(ew);
		return R.ok("查询视频共享成功").put("data", shipingongxiangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        ShipingongxiangEntity shipingongxiang = shipingongxiangService.selectById(id);
        return R.ok().put("data", shipingongxiang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        ShipingongxiangEntity shipingongxiang = shipingongxiangService.selectById(id);
        return R.ok().put("data", shipingongxiang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShipingongxiangEntity shipingongxiang, HttpServletRequest request){
    	shipingongxiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipingongxiang);

        shipingongxiangService.insert(shipingongxiang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShipingongxiangEntity shipingongxiang, HttpServletRequest request){
    	shipingongxiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipingongxiang);

        shipingongxiangService.insert(shipingongxiang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShipingongxiangEntity shipingongxiang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shipingongxiang);
        shipingongxiangService.updateById(shipingongxiang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shipingongxiangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShipingongxiangEntity> wrapper = new EntityWrapper<ShipingongxiangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shipingongxiangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}

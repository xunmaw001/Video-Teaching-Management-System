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

import com.entity.ShipingoumaiEntity;
import com.entity.view.ShipingoumaiView;

import com.service.ShipingoumaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 视频购买
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
@RestController
@RequestMapping("/shipingoumai")
public class ShipingoumaiController {
    @Autowired
    private ShipingoumaiService shipingoumaiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShipingoumaiEntity shipingoumai, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shipingoumai.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShipingoumaiEntity> ew = new EntityWrapper<ShipingoumaiEntity>();
    	PageUtils page = shipingoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipingoumai), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShipingoumaiEntity shipingoumai, HttpServletRequest request){
        EntityWrapper<ShipingoumaiEntity> ew = new EntityWrapper<ShipingoumaiEntity>();
    	PageUtils page = shipingoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipingoumai), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShipingoumaiEntity shipingoumai){
       	EntityWrapper<ShipingoumaiEntity> ew = new EntityWrapper<ShipingoumaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shipingoumai, "shipingoumai")); 
        return R.ok().put("data", shipingoumaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShipingoumaiEntity shipingoumai){
        EntityWrapper< ShipingoumaiEntity> ew = new EntityWrapper< ShipingoumaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shipingoumai, "shipingoumai")); 
		ShipingoumaiView shipingoumaiView =  shipingoumaiService.selectView(ew);
		return R.ok("查询视频购买成功").put("data", shipingoumaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        ShipingoumaiEntity shipingoumai = shipingoumaiService.selectById(id);
        return R.ok().put("data", shipingoumai);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        ShipingoumaiEntity shipingoumai = shipingoumaiService.selectById(id);
        return R.ok().put("data", shipingoumai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShipingoumaiEntity shipingoumai, HttpServletRequest request){
    	shipingoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipingoumai);

        shipingoumaiService.insert(shipingoumai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShipingoumaiEntity shipingoumai, HttpServletRequest request){
    	shipingoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipingoumai);

        shipingoumaiService.insert(shipingoumai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShipingoumaiEntity shipingoumai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shipingoumai);
        shipingoumaiService.updateById(shipingoumai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shipingoumaiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShipingoumaiEntity> wrapper = new EntityWrapper<ShipingoumaiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = shipingoumaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}

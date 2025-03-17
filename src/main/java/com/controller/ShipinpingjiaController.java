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

import com.entity.ShipinpingjiaEntity;
import com.entity.view.ShipinpingjiaView;

import com.service.ShipinpingjiaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 视频评价
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-31 20:11:11
 */
@RestController
@RequestMapping("/shipinpingjia")
public class ShipinpingjiaController {
    @Autowired
    private ShipinpingjiaService shipinpingjiaService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShipinpingjiaEntity shipinpingjia, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shipinpingjia.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShipinpingjiaEntity> ew = new EntityWrapper<ShipinpingjiaEntity>();
    	PageUtils page = shipinpingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipinpingjia), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShipinpingjiaEntity shipinpingjia, HttpServletRequest request){
        EntityWrapper<ShipinpingjiaEntity> ew = new EntityWrapper<ShipinpingjiaEntity>();
    	PageUtils page = shipinpingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipinpingjia), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShipinpingjiaEntity shipinpingjia){
       	EntityWrapper<ShipinpingjiaEntity> ew = new EntityWrapper<ShipinpingjiaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shipinpingjia, "shipinpingjia")); 
        return R.ok().put("data", shipinpingjiaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShipinpingjiaEntity shipinpingjia){
        EntityWrapper< ShipinpingjiaEntity> ew = new EntityWrapper< ShipinpingjiaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shipinpingjia, "shipinpingjia")); 
		ShipinpingjiaView shipinpingjiaView =  shipinpingjiaService.selectView(ew);
		return R.ok("查询视频评价成功").put("data", shipinpingjiaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        ShipinpingjiaEntity shipinpingjia = shipinpingjiaService.selectById(id);
        return R.ok().put("data", shipinpingjia);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        ShipinpingjiaEntity shipinpingjia = shipinpingjiaService.selectById(id);
        return R.ok().put("data", shipinpingjia);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShipinpingjiaEntity shipinpingjia, HttpServletRequest request){
    	shipinpingjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipinpingjia);

        shipinpingjiaService.insert(shipinpingjia);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShipinpingjiaEntity shipinpingjia, HttpServletRequest request){
    	shipinpingjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipinpingjia);

        shipinpingjiaService.insert(shipinpingjia);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShipinpingjiaEntity shipinpingjia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shipinpingjia);
        shipinpingjiaService.updateById(shipinpingjia);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shipinpingjiaService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShipinpingjiaEntity> wrapper = new EntityWrapper<ShipinpingjiaEntity>();
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

		int count = shipinpingjiaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
var menus = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"视频分类","menuJump":"列表","tableName":"shipinfenlei"}],"menu":"视频分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"视频教程","menuJump":"列表","tableName":"shipinjiaocheng"}],"menu":"视频教程管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"视频购买","menuJump":"列表","tableName":"shipingoumai"}],"menu":"视频购买管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"视频评价","menuJump":"列表","tableName":"shipinpingjia"}],"menu":"视频评价管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"视频共享","menuJump":"列表","tableName":"shipingongxiang"}],"menu":"视频共享管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"论坛管理","tableName":"luntanguanli"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"lunbotuguanli"},{"buttons":["新增","查看","修改","删除"],"menu":"系统公告","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"客服管理","tableName":"kefuguanli"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"视频教程列表","menuJump":"列表","tableName":"shipinjiaocheng"}],"menu":"视频教程模块"},{"child":[{"buttons":["查看"],"menu":"视频共享列表","menuJump":"列表","tableName":"shipingongxiang"}],"menu":"视频共享模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除","支付","评价"],"menu":"视频购买","menuJump":"列表","tableName":"shipingoumai"}],"menu":"视频购买管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"视频评价","menuJump":"列表","tableName":"shipinpingjia"}],"menu":"视频评价管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"视频共享","menuJump":"列表","tableName":"shipingongxiang"}],"menu":"视频共享管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"视频教程列表","menuJump":"列表","tableName":"shipinjiaocheng"}],"menu":"视频教程模块"},{"child":[{"buttons":["查看"],"menu":"视频共享列表","menuJump":"列表","tableName":"shipingongxiang"}],"menu":"视频共享模块"}],"roleName":"用户","tableName":"yonghu"}];

var hasMessage = '';

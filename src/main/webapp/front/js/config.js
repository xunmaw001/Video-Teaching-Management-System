
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.jsp'
},

{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '视频教程',
	url: './pages/shipinjiaocheng/list.jsp'
}, 
{
	name: '视频共享',
	url: './pages/shipingongxiang/list.jsp'
}, 

{
	name: '论坛信息',
	url: './pages/forum/list.jsp'
}, 
{
	name: '系统公告',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspms8s99/index.jsp";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"视频分类","menuJump":"列表","tableName":"shipinfenlei"}],"menu":"视频分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"视频教程","menuJump":"列表","tableName":"shipinjiaocheng"}],"menu":"视频教程管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"视频购买","menuJump":"列表","tableName":"shipingoumai"}],"menu":"视频购买管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"视频评价","menuJump":"列表","tableName":"shipinpingjia"}],"menu":"视频评价管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"视频共享","menuJump":"列表","tableName":"shipingongxiang"}],"menu":"视频共享管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"论坛管理","tableName":"luntanguanli"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"lunbotuguanli"},{"buttons":["新增","查看","修改","删除"],"menu":"系统公告","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"客服管理","tableName":"kefuguanli"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"视频教程列表","menuJump":"列表","tableName":"shipinjiaocheng"}],"menu":"视频教程模块"},{"child":[{"buttons":["查看"],"menu":"视频共享列表","menuJump":"列表","tableName":"shipingongxiang"}],"menu":"视频共享模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除","支付","评价"],"menu":"视频购买","menuJump":"列表","tableName":"shipingoumai"}],"menu":"视频购买管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"视频评价","menuJump":"列表","tableName":"shipinpingjia"}],"menu":"视频评价管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"视频共享","menuJump":"列表","tableName":"shipingongxiang"}],"menu":"视频共享管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","购买"],"menu":"视频教程列表","menuJump":"列表","tableName":"shipinjiaocheng"}],"menu":"视频教程模块"},{"child":[{"buttons":["查看"],"menu":"视频共享列表","menuJump":"列表","tableName":"shipingongxiang"}],"menu":"视频共享模块"}],"roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var total = {};
$.ajax({
    type: 'GET',
    async: false,
    url: "/data/getAreaMap",
    dataType: "json",
    success: function(res) {
        total = res;
    },
    error: function() {
        console.log("fucking error");
    }
});

//初始化echarts实例
var myChart = echarts.init(document.getElementById('area'));
// 全国省份列表
function randomData() {
    return Math.round(Math.random()*40);
}

var dataMap =[
    {name: '北京',value: total.beijing },{name: '天津',value: total.tianjin},
    {name: '上海',value: total.shanghai},{name: '重庆',value: total.zhongqing},
    {name: '河北',value: total.hebei},{name: '河南',value: total.henan},
    {name: '云南',value: total.yunnan },{name: '辽宁',value: total.liaoning},
    {name: '黑龙江',value: total.heilong },{name: '湖南',value: total.hunan},
    {name: '安徽',value: total.anhui },{name: '山东',value: total.shandong},
    {name: '新疆',value: total.xinjiang},{name: '江苏',value: total.jiangsu},
    {name: '浙江',value: total.zhejiang},{name: '江西',value: total.jiangxi},
    {name: '湖北',value: total.hubei},{name: '广西',value: total.guangxi},
    {name: '甘肃',value: total.gansu},{name: '山西',value: total.山西shanxi },
    {name: '内蒙古',value: total.neimeng},{name: '陕西',value: total.shanxi },
    {name: '吉林',value: total.jilin},{name: '福建',value: total.fujian},
    {name: '贵州',value: total.guizhou},{name: '广东',value: total.guangdong},
    {name: '青海',value: total.qinghai},{name: '西藏',value: total.xizang},
    {name: '四川',value: total.sichuan},{name: '宁夏',value: total.ningxia},
    {name: '海南',value: total.hainan},{name: '台湾',value: total.taiwan},
    {name: '香港',value: total.xianggang},{name: '澳门',value: total.aomen},{name: '南海诸岛',value: 0 }
];
// 需要在页面上直接标记出来的城市

var specialMap = [];
// 对dataMap进行处理，使其可以直接在页面上展示
for (var i = 0; i < specialMap.length; i++) {
    for (var j = 0; j < dataMap.length; j++) {
        if (specialMap[i] == dataMap[j].name) {
            dataMap[j].selected = true;
            break;
        }
    }
}

var option = {
    tooltip: {
        formatter: function (params) {
            var info = '<p style="font-size:18px">' + params.name + params.value +'</p><p style="font-size:14px"></p>'
            return info;
        },
        backgroundColor: "rgba(255,219,67,0.93)",//提示标签背景颜色
        textStyle: { color: "#ff4130" } //提示标签字体颜色
    },
//左侧小导航图标
    visualMap: {
        show : true,
        x: 'left',
        y: 'center',
        splitList: [
            {start:551, end: 1600},{start: 401, end: 550},
            {start: 301, end: 400},{start: 201, end: 300},
            {start: 101, end: 200},{start: 0, end:100},
        ],
        color: ['#f50708', '#ea7006', '#ecef09','#0a3ae2', '#09d2e6', '#78ea10']
    },
    series: [
        {
            name: '中国',
            type: 'map',
            mapType: 'china',

            label: {
                normal: {
                    show: true,//显示省份标签
                },
                emphasis: {
                    show: true,//对应的鼠标悬浮效果
                }
            },

            data: dataMap
        }
    ]
};
//使用制定的配置项和数据显示图表
myChart.setOption(option);
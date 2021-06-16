//广东爱情故事
var chart1 = echarts.init(document.getElementById('guangDong'));

function getData() {
    let wordCloud = {};
    $.ajax({
        type: 'GET',
        url: "/charts/wordCloud",
        //dataType: "json",
        success: function(res) {
            wordCloud = res;
            console.log(res);

            temp = Json.format(res);
            console.log(temp);
        },
        error: function() {
            console.log("fucking error");
        }
    });
    //console.log(wordCloud);
    return wordCloud;
}
var totalData = getData();
console.log(totalData);
var option = {
    backgroundColor: '#0c84b7',
    tooltip: {},
    series: [
        {
            type: 'wordCloud',
            gridSize: 2,
            sizeRange: [12, 50],
            rotationRange: [-45, 0, 45, 90],
            shape: 'pentagon',
            textStyle: {
                normal: {
                    color: function () {
                        return 'rgb(' +
                            Math.round(Math.random() * 255) + ','
                            + Math.round(Math.random() * 255) +','
                            + Math.round(Math.random() * 255) + ')'
                    }
                },
                emphasis: {
                    shadowBlur: 10,
                    shadowColor: '#05073b'
                }
            },
            data:[{
                "name": "特许经营",
                "value": 1
            },
                {
                    "name": "休闲爱好",
                    "value": 1169
                },
                {
                    "name": "收藏",
                    "value": 412
                },
                {
                    "name": "摄影",
                    "value": 393
                },
                {
                    "name": "温泉",
                    "value": 230
                },
                {
                    "name": "博彩彩票",
                    "value": 211
                },
                {
                    "name": "美术",
                    "value": 207
                },
                {
                    "name": "书法",
                    "value": 139
                },
                {
                    "name": "DIY手工",
                    "value": 75
                },
                {
                    "name": "舞蹈",
                    "value": 23
                },
                {
                    "name": "钓鱼",
                    "value": 21
                },
                {
                    "name": "棋牌桌游",
                    "value": 17
                },
                {
                    "name": "KTV",
                    "value": 6
                },
                {
                    "name": "密室",
                    "value": 5
                },
                {
                    "name": "采摘",
                    "value": 4
                },
                {
                    "name": "电玩",
                    "value": 1
                },
                {
                    "name": "真人CS",
                    "value": 1
                },
                {
                    "name": "轰趴",
                    "value": 1
                },
                {
                    "name": "家电数码",
                    "value": 1111
                },
                {
                    "name": "手机",
                    "value": 885
                },
                {
                    "name": "电脑",
                    "value": 543
                },
                {
                    "name": "大家电",
                    "value": 321
                },
                {
                    "name": "家电关注品牌",
                    "value": 253
                },
                {
                    "name": "网络设备",
                    "value": 162
                },
                {
                    "name": "摄影器材",
                    "value": 149
                }]
        }
    ]
};
chart1.setOption(option);
window.onresize = chart1.resize;

//成都
var chart2 = echarts.init(document.getElementById('chengdu'));

var option = {
    backgroundColor: '#0c84b7',
    tooltip: {},
    series: [
        {
            type: 'wordCloud',
            gridSize: 2,
            sizeRange: [12, 50],
            rotationRange: [-45, 0, 45, 90],
            shape: 'pentagon',
            textStyle: {
                normal: {
                    color: function () {
                        return 'rgb(' +
                            Math.round(Math.random() * 255) + ','
                            + Math.round(Math.random() * 255) +','
                            + Math.round(Math.random() * 255) + ')'
                    }
                },
                emphasis: {
                    shadowBlur: 10,
                    shadowColor: '#05073b'
                }
            },
            data: [
                {
                    "name": "特许经营",
                    "value": 1
                },
                {
                    "name": "休闲爱好",
                    "value": 1169
                },
                {
                    "name": "收藏",
                    "value": 412
                },
                {
                    "name": "摄影",
                    "value": 393
                },
                {
                    "name": "温泉",
                    "value": 230
                },
                {
                    "name": "博彩彩票",
                    "value": 211
                },
                {
                    "name": "美术",
                    "value": 207
                },
                {
                    "name": "书法",
                    "value": 139
                },
                {
                    "name": "DIY手工",
                    "value": 75
                },
                {
                    "name": "舞蹈",
                    "value": 23
                },
                {
                    "name": "钓鱼",
                    "value": 21
                },
                {
                    "name": "棋牌桌游",
                    "value": 17
                },
                {
                    "name": "KTV",
                    "value": 6
                },
                {
                    "name": "密室",
                    "value": 5
                },
                {
                    "name": "采摘",
                    "value": 4
                },
                {
                    "name": "电玩",
                    "value": 1
                },
                {
                    "name": "真人CS",
                    "value": 1
                },
                {
                    "name": "轰趴",
                    "value": 1
                },
                {
                    "name": "家电数码",
                    "value": 1111
                },
                {
                    "name": "手机",
                    "value": 885
                },
                {
                    "name": "电脑",
                    "value": 543
                },
                {
                    "name": "大家电",
                    "value": 321
                },
                {
                    "name": "家电关注品牌",
                    "value": 253
                },
                {
                    "name": "网络设备",
                    "value": 162
                },
                {
                    "name": "摄影器材",
                    "value": 149
                },
                {
                    "name": "影音设备",
                    "value": 133
                },
                {
                    "name": "办公数码设备",
                    "value": 113
                },
                {
                    "name": "生活电器",
                    "value": 67
                },
                {
                    "name": "厨房电器",
                    "value": 54
                },
                {
                    "name": "智能设备",
                    "value": 45
                },
                {
                    "name": "个人护理电器",
                    "value": 22
                },
                {
                    "name": "服饰鞋包",
                    "value": 1047
                },
                {
                    "name": "服装",
                    "value": 566
                },
                {
                    "name": "饰品",
                    "value": 289
                },
                {
                    "name": "鞋",
                    "value": 184
                },
                {
                    "name": "箱包",
                    "value": 168
                },
                {
                    "name": "奢侈品",
                    "value": 137
                },
                {
                    "name": "母婴亲子",
                    "value": 1041
                },
                {
                    "name": "孕婴保健",
                    "value": 505
                },
                {
                    "name": "母婴社区",
                    "value": 299
                },
                {
                    "name": "早教",
                    "value": 103
                },
                {
                    "name": "奶粉辅食",
                    "value": 66
                },
                {
                    "name": "童车童床",
                    "value": 41
                },
                {
                    "name": "关注品牌",
                    "value": 271
                },
                {
                    "name": "宝宝玩乐",
                    "value": 30
                },
                {
                    "name": "母婴护理服务",
                    "value": 25
                },
                {
                    "name": "纸尿裤湿巾",
                    "value": 16
                },
                {
                    "name": "妈妈用品",
                    "value": 15
                },
                {
                    "name": "宝宝起名",
                    "value": 12
                },
                {
                    "name": "童装童鞋",
                    "value": 9
                },
                {
                    "name": "胎教",
                    "value": 8
                },
                {
                    "name": "宝宝安全",
                    "value": 1
                },
                {
                    "name": "宝宝洗护用品",
                    "value": 1
                },
                {
                    "name": "软件应用",
                    "value": 1018
                },
                {
                    "name": "系统工具",
                    "value": 896
                },
                {
                    "name": "理财购物",
                    "value": 440
                },
                {
                    "name": "生活实用",
                    "value": 365
                },
                {
                    "name": "影音图像",
                    "value": 256
                },
                {
                    "name": "社交通讯",
                    "value": 214
                },
                {
                    "name": "手机美化",
                    "value": 39
                },
                {
                    "name": "办公学习",
                    "value": 28
                },
                {
                    "name": "应用市场",
                    "value": 23
                },
                {
                    "name": "母婴育儿",
                    "value": 14
                },
                {
                    "name": "游戏",
                    "value": 946
                },
                {
                    "name": "手机游戏",
                    "value": 565
                },
                {
                    "name": "PC游戏",
                    "value": 353
                },
                {
                    "name": "网页游戏",
                    "value": 254
                },
                {
                    "name": "游戏机",
                    "value": 188
                },
                {
                    "name": "模拟辅助",
                    "value": 166
                },
                {
                    "name": "个护美容",
                    "value": 942
                },
                {
                    "name": "护肤品",
                    "value": 177
                },
                {
                    "name": "彩妆",
                    "value": 133
                },
                {
                    "name": "美发",
                    "value": 80
                },
                {
                    "name": "香水",
                    "value": 50
                },
                {
                    "name": "个人护理",
                    "value": 46
                },
                {
                    "name": "美甲",
                    "value": 26
                },
                {
                    "name": "SPA美体",
                    "value": 21
                },
                {
                    "name": "花鸟萌宠",
                    "value": 914
                },
                {
                    "name": "绿植花卉",
                    "value": 311
                },
                {
                    "name": "狗",
                    "value": 257
                },
                {
                    "name": "其他宠物",
                    "value": 131
                },
                {
                    "name": "水族",
                    "value": 125
                },
                {
                    "name": "猫",
                    "value": 122
                },
                {
                    "name": "动物",
                    "value": 81
                },
                {
                    "name": "鸟",
                    "value": 67
                },
                {
                    "name": "宠物用品",
                    "value": 41
                },
                {
                    "name": "宠物服务",
                    "value": 26
                },
                {
                    "name": "书籍阅读",
                    "value": 913
                },
                {
                    "name": "网络小说",
                    "value": 483
                },
                {
                    "name": "关注书籍",
                    "value": 128
                },
                {
                    "name": "文学",
                    "value": 105
                },
                {
                    "name": "报刊杂志",
                    "value": 77
                },
                {
                    "name": "人文社科",
                    "value": 22
                },
                {
                    "name": "建材家居",
                    "value": 907
                },
                {
                    "name": "装修建材",
                    "value": 644
                },
                {
                    "name": "家具",
                    "value": 273
                },
                {
                    "name": "家居风格",
                    "value": 187
                },
                {
                    "name": "家居家装关注品牌",
                    "value": 140
                },
                {
                    "name": "家纺",
                    "value": 107
                },
                {
                    "name": "厨具",
                    "value": 47
                },
                {
                    "name": "灯具",
                    "value": 43
                },
                {
                    "name": "家居饰品",
                    "value": 29
                },
                {
                    "name": "家居日常用品",
                    "value": 10
                },
                {
                    "name": "生活服务",
                    "value": 883
                },
                {
                    "name": "物流配送",
                    "value": 536
                },
                {
                    "name": "家政服务",
                    "value": 108
                },
                {
                    "name": "摄影服务",
                    "value": 49
                },
                {
                    "name": "搬家服务",
                    "value": 38
                },
                {
                    "name": "物业维修",
                    "value": 37
                },
                {
                    "name": "婚庆服务",
                    "value": 24
                },
                {
                    "name": "二手回收",
                    "value": 24
                },
                {
                    "name": "鲜花配送",
                    "value": 3
                },
                {
                    "name": "维修服务",
                    "value": 3
                },
                {
                    "name": "殡葬服务",
                    "value": 1
                },
                {
                    "name": "求职创业",
                    "value": 874
                },
                {
                    "name": "创业",
                    "value": 363
                },
                {
                    "name": "目标职位",
                    "value": 162
                },
                {
                    "name": "目标行业",
                    "value": 50
                },
                {
                    "name": "兼职",
                    "value": 21
                },
                {
                    "name": "期望年薪",
                    "value": 20
                },
                {
                    "name": "实习",
                    "value": 16
                },
                {
                    "name": "雇主类型",
                    "value": 10
                },
                {
                    "name": "星座运势",
                    "value": 789
                },
                {
                    "name": "星座",
                    "value": 316
                },
                {
                    "name": "算命",
                    "value": 303
                },
                {
                    "name": "解梦",
                    "value": 196
                },
                {
                    "name": "风水",
                    "value": 93
                },
                {
                    "name": "面相分析",
                    "value": 47
                },
                {
                    "name": "手相",
                    "value": 32
                },
                {
                    "name": "公益",
                    "value": 90
                }
            ]
        }
    ]
};
chart2.setOption(option);
window.onresize = chart2.resize;


//像我这样的人
var chart3 = echarts.init(document.getElementById('peopleLikeMe'));

var option = {
    backgroundColor: '#0c84b7',
    tooltip: {},
    series: [
        {
            type: 'wordCloud',
            gridSize: 2,
            sizeRange: [12, 50],
            rotationRange: [-45, 0, 45, 90],
            shape: 'pentagon',
            textStyle: {
                normal: {
                    color: function () {
                        return 'rgb(' +
                            Math.round(Math.random() * 255) + ','
                            + Math.round(Math.random() * 255) +','
                            + Math.round(Math.random() * 255) + ')'
                    }
                },
                emphasis: {
                    shadowBlur: 10,
                    shadowColor: '#05073b'
                }
            },
            data: [
                {
                    "name": "特许经营",
                    "value": 1
                },
                {
                    "name": "休闲爱好",
                    "value": 1169
                },
                {
                    "name": "收藏",
                    "value": 412
                },
                {
                    "name": "摄影",
                    "value": 393
                },
                {
                    "name": "温泉",
                    "value": 230
                },
                {
                    "name": "博彩彩票",
                    "value": 211
                },
                {
                    "name": "美术",
                    "value": 207
                },
                {
                    "name": "书法",
                    "value": 139
                },
                {
                    "name": "DIY手工",
                    "value": 75
                },
                {
                    "name": "舞蹈",
                    "value": 23
                },
                {
                    "name": "钓鱼",
                    "value": 21
                },
                {
                    "name": "棋牌桌游",
                    "value": 17
                },
                {
                    "name": "KTV",
                    "value": 6
                },
                {
                    "name": "密室",
                    "value": 5
                },
                {
                    "name": "采摘",
                    "value": 4
                },
                {
                    "name": "电玩",
                    "value": 1
                },
                {
                    "name": "真人CS",
                    "value": 1
                },
                {
                    "name": "轰趴",
                    "value": 1
                },
                {
                    "name": "家电数码",
                    "value": 1111
                },
                {
                    "name": "手机",
                    "value": 885
                },
                {
                    "name": "电脑",
                    "value": 543
                },
                {
                    "name": "大家电",
                    "value": 321
                },
                {
                    "name": "家电关注品牌",
                    "value": 253
                },
                {
                    "name": "网络设备",
                    "value": 162
                },
                {
                    "name": "摄影器材",
                    "value": 149
                },
                {
                    "name": "影音设备",
                    "value": 133
                },
                {
                    "name": "办公数码设备",
                    "value": 113
                },
                {
                    "name": "生活电器",
                    "value": 67
                },
                {
                    "name": "厨房电器",
                    "value": 54
                },
                {
                    "name": "智能设备",
                    "value": 45
                },
                {
                    "name": "个人护理电器",
                    "value": 22
                },
                {
                    "name": "服饰鞋包",
                    "value": 1047
                },
                {
                    "name": "服装",
                    "value": 566
                },
                {
                    "name": "饰品",
                    "value": 289
                },
                {
                    "name": "鞋",
                    "value": 184
                },
                {
                    "name": "箱包",
                    "value": 168
                },
                {
                    "name": "奢侈品",
                    "value": 137
                },
                {
                    "name": "母婴亲子",
                    "value": 1041
                },
                {
                    "name": "孕婴保健",
                    "value": 505
                },
                {
                    "name": "母婴社区",
                    "value": 299
                },
                {
                    "name": "早教",
                    "value": 103
                },
                {
                    "name": "奶粉辅食",
                    "value": 66
                },
                {
                    "name": "童车童床",
                    "value": 41
                },
                {
                    "name": "关注品牌",
                    "value": 271
                },
                {
                    "name": "宝宝玩乐",
                    "value": 30
                },
                {
                    "name": "母婴护理服务",
                    "value": 25
                },
                {
                    "name": "纸尿裤湿巾",
                    "value": 16
                },
                {
                    "name": "妈妈用品",
                    "value": 15
                },
                {
                    "name": "宝宝起名",
                    "value": 12
                },
                {
                    "name": "童装童鞋",
                    "value": 9
                },
                {
                    "name": "胎教",
                    "value": 8
                },
                {
                    "name": "宝宝安全",
                    "value": 1
                },
                {
                    "name": "宝宝洗护用品",
                    "value": 1
                },
                {
                    "name": "软件应用",
                    "value": 1018
                },
                {
                    "name": "系统工具",
                    "value": 896
                },
                {
                    "name": "理财购物",
                    "value": 440
                },
                {
                    "name": "生活实用",
                    "value": 365
                },
                {
                    "name": "影音图像",
                    "value": 256
                },
                {
                    "name": "社交通讯",
                    "value": 214
                },
                {
                    "name": "手机美化",
                    "value": 39
                },
                {
                    "name": "办公学习",
                    "value": 28
                },
                {
                    "name": "应用市场",
                    "value": 23
                },
                {
                    "name": "母婴育儿",
                    "value": 14
                },
                {
                    "name": "游戏",
                    "value": 946
                },
                {
                    "name": "手机游戏",
                    "value": 565
                },
                {
                    "name": "PC游戏",
                    "value": 353
                },
                {
                    "name": "网页游戏",
                    "value": 254
                },
                {
                    "name": "游戏机",
                    "value": 188
                },
                {
                    "name": "模拟辅助",
                    "value": 166
                },
                {
                    "name": "个护美容",
                    "value": 942
                },
                {
                    "name": "护肤品",
                    "value": 177
                },
                {
                    "name": "彩妆",
                    "value": 133
                },
                {
                    "name": "美发",
                    "value": 80
                },
                {
                    "name": "香水",
                    "value": 50
                },
                {
                    "name": "个人护理",
                    "value": 46
                },
                {
                    "name": "美甲",
                    "value": 26
                },
                {
                    "name": "SPA美体",
                    "value": 21
                },
                {
                    "name": "花鸟萌宠",
                    "value": 914
                },
                {
                    "name": "绿植花卉",
                    "value": 311
                },
                {
                    "name": "狗",
                    "value": 257
                },
                {
                    "name": "其他宠物",
                    "value": 131
                },
                {
                    "name": "水族",
                    "value": 125
                },
                {
                    "name": "猫",
                    "value": 122
                },
                {
                    "name": "动物",
                    "value": 81
                },
                {
                    "name": "鸟",
                    "value": 67
                },
                {
                    "name": "宠物用品",
                    "value": 41
                },
                {
                    "name": "宠物服务",
                    "value": 26
                },
                {
                    "name": "书籍阅读",
                    "value": 913
                },
                {
                    "name": "网络小说",
                    "value": 483
                },
                {
                    "name": "关注书籍",
                    "value": 128
                },
                {
                    "name": "文学",
                    "value": 105
                },
                {
                    "name": "报刊杂志",
                    "value": 77
                },
                {
                    "name": "人文社科",
                    "value": 22
                },
                {
                    "name": "建材家居",
                    "value": 907
                },
                {
                    "name": "装修建材",
                    "value": 644
                },
                {
                    "name": "家具",
                    "value": 273
                },
                {
                    "name": "家居风格",
                    "value": 187
                },
                {
                    "name": "家居家装关注品牌",
                    "value": 140
                },
                {
                    "name": "家纺",
                    "value": 107
                },
                {
                    "name": "厨具",
                    "value": 47
                },
                {
                    "name": "灯具",
                    "value": 43
                },
                {
                    "name": "家居饰品",
                    "value": 29
                },
                {
                    "name": "家居日常用品",
                    "value": 10
                },
                {
                    "name": "生活服务",
                    "value": 883
                },
                {
                    "name": "物流配送",
                    "value": 536
                },
                {
                    "name": "家政服务",
                    "value": 108
                },
                {
                    "name": "摄影服务",
                    "value": 49
                },
                {
                    "name": "搬家服务",
                    "value": 38
                },
                {
                    "name": "物业维修",
                    "value": 37
                },
                {
                    "name": "婚庆服务",
                    "value": 24
                },
                {
                    "name": "二手回收",
                    "value": 24
                },
                {
                    "name": "鲜花配送",
                    "value": 3
                },
                {
                    "name": "维修服务",
                    "value": 3
                },
                {
                    "name": "殡葬服务",
                    "value": 1
                },
                {
                    "name": "求职创业",
                    "value": 874
                },
                {
                    "name": "创业",
                    "value": 363
                },
                {
                    "name": "目标职位",
                    "value": 162
                },
                {
                    "name": "目标行业",
                    "value": 50
                },
                {
                    "name": "兼职",
                    "value": 21
                },
                {
                    "name": "期望年薪",
                    "value": 20
                },
                {
                    "name": "实习",
                    "value": 16
                },
                {
                    "name": "雇主类型",
                    "value": 10
                },
                {
                    "name": "星座运势",
                    "value": 789
                },
                {
                    "name": "星座",
                    "value": 316
                },
                {
                    "name": "算命",
                    "value": 303
                },
                {
                    "name": "解梦",
                    "value": 196
                },
                {
                    "name": "风水",
                    "value": 93
                },
                {
                    "name": "面相分析",
                    "value": 47
                },
                {
                    "name": "手相",
                    "value": 32
                },
                {
                    "name": "公益",
                    "value": 90
                }
            ]
        }
    ]
};
chart3.setOption(option);
window.onresize = chart3.resize;

//起风了
var chart4 = echarts.init(document.getElementById('qiFeng'));

var option = {
    backgroundColor: '#0c84b7',
    tooltip: {},
    series: [
        {
            type: 'wordCloud',
            gridSize: 2,
            sizeRange: [12, 50],
            rotationRange: [-45, 0, 45, 90],
            shape: 'pentagon',
            textStyle: {
                normal: {
                    color: function () {
                        return 'rgb(' +
                            Math.round(Math.random() * 255) + ','
                            + Math.round(Math.random() * 255) +','
                            + Math.round(Math.random() * 255) + ')'
                    }
                },
                emphasis: {
                    shadowBlur: 10,
                    shadowColor: '#05073b'
                }
            },
            data: [
                {
                    "name": "特许经营",
                    "value": 1
                },
                {
                    "name": "休闲爱好",
                    "value": 1169
                },
                {
                    "name": "收藏",
                    "value": 412
                },
                {
                    "name": "摄影",
                    "value": 393
                },
                {
                    "name": "温泉",
                    "value": 230
                },
                {
                    "name": "博彩彩票",
                    "value": 211
                },
                {
                    "name": "美术",
                    "value": 207
                },
                {
                    "name": "书法",
                    "value": 139
                },
                {
                    "name": "DIY手工",
                    "value": 75
                },
                {
                    "name": "舞蹈",
                    "value": 23
                },
                {
                    "name": "钓鱼",
                    "value": 21
                },
                {
                    "name": "棋牌桌游",
                    "value": 17
                },
                {
                    "name": "KTV",
                    "value": 6
                },
                {
                    "name": "密室",
                    "value": 5
                },
                {
                    "name": "采摘",
                    "value": 4
                },
                {
                    "name": "电玩",
                    "value": 1
                },
                {
                    "name": "真人CS",
                    "value": 1
                },
                {
                    "name": "轰趴",
                    "value": 1
                },
                {
                    "name": "家电数码",
                    "value": 1111
                },
                {
                    "name": "手机",
                    "value": 885
                },
                {
                    "name": "电脑",
                    "value": 543
                },
                {
                    "name": "大家电",
                    "value": 321
                },
                {
                    "name": "家电关注品牌",
                    "value": 253
                },
                {
                    "name": "网络设备",
                    "value": 162
                },
                {
                    "name": "摄影器材",
                    "value": 149
                },
                {
                    "name": "影音设备",
                    "value": 133
                },
                {
                    "name": "办公数码设备",
                    "value": 113
                },
                {
                    "name": "生活电器",
                    "value": 67
                },
                {
                    "name": "厨房电器",
                    "value": 54
                },
                {
                    "name": "智能设备",
                    "value": 45
                },
                {
                    "name": "个人护理电器",
                    "value": 22
                },
                {
                    "name": "服饰鞋包",
                    "value": 1047
                },
                {
                    "name": "服装",
                    "value": 566
                },
                {
                    "name": "饰品",
                    "value": 289
                },
                {
                    "name": "鞋",
                    "value": 184
                },
                {
                    "name": "箱包",
                    "value": 168
                },
                {
                    "name": "奢侈品",
                    "value": 137
                },
                {
                    "name": "母婴亲子",
                    "value": 1041
                },
                {
                    "name": "孕婴保健",
                    "value": 505
                },
                {
                    "name": "母婴社区",
                    "value": 299
                },
                {
                    "name": "早教",
                    "value": 103
                },
                {
                    "name": "奶粉辅食",
                    "value": 66
                },
                {
                    "name": "童车童床",
                    "value": 41
                },
                {
                    "name": "关注品牌",
                    "value": 271
                },
                {
                    "name": "宝宝玩乐",
                    "value": 30
                },
                {
                    "name": "母婴护理服务",
                    "value": 25
                },
                {
                    "name": "纸尿裤湿巾",
                    "value": 16
                },
                {
                    "name": "妈妈用品",
                    "value": 15
                },
                {
                    "name": "宝宝起名",
                    "value": 12
                },
                {
                    "name": "童装童鞋",
                    "value": 9
                },
                {
                    "name": "胎教",
                    "value": 8
                },
                {
                    "name": "宝宝安全",
                    "value": 1
                },
                {
                    "name": "宝宝洗护用品",
                    "value": 1
                },
                {
                    "name": "软件应用",
                    "value": 1018
                },
                {
                    "name": "系统工具",
                    "value": 896
                },
                {
                    "name": "理财购物",
                    "value": 440
                },
                {
                    "name": "生活实用",
                    "value": 365
                },
                {
                    "name": "影音图像",
                    "value": 256
                },
                {
                    "name": "社交通讯",
                    "value": 214
                },
                {
                    "name": "手机美化",
                    "value": 39
                },
                {
                    "name": "办公学习",
                    "value": 28
                },
                {
                    "name": "应用市场",
                    "value": 23
                },
                {
                    "name": "母婴育儿",
                    "value": 14
                },
                {
                    "name": "游戏",
                    "value": 946
                },
                {
                    "name": "手机游戏",
                    "value": 565
                },
                {
                    "name": "PC游戏",
                    "value": 353
                },
                {
                    "name": "网页游戏",
                    "value": 254
                },
                {
                    "name": "游戏机",
                    "value": 188
                },
                {
                    "name": "模拟辅助",
                    "value": 166
                },
                {
                    "name": "个护美容",
                    "value": 942
                },
                {
                    "name": "护肤品",
                    "value": 177
                },
                {
                    "name": "彩妆",
                    "value": 133
                },
                {
                    "name": "美发",
                    "value": 80
                },
                {
                    "name": "香水",
                    "value": 50
                },
                {
                    "name": "个人护理",
                    "value": 46
                },
                {
                    "name": "美甲",
                    "value": 26
                },
                {
                    "name": "SPA美体",
                    "value": 21
                },
                {
                    "name": "花鸟萌宠",
                    "value": 914
                },
                {
                    "name": "绿植花卉",
                    "value": 311
                },
                {
                    "name": "狗",
                    "value": 257
                },
                {
                    "name": "其他宠物",
                    "value": 131
                },
                {
                    "name": "水族",
                    "value": 125
                },
                {
                    "name": "猫",
                    "value": 122
                },
                {
                    "name": "动物",
                    "value": 81
                },
                {
                    "name": "鸟",
                    "value": 67
                },
                {
                    "name": "宠物用品",
                    "value": 41
                },
                {
                    "name": "宠物服务",
                    "value": 26
                },
                {
                    "name": "书籍阅读",
                    "value": 913
                },
                {
                    "name": "网络小说",
                    "value": 483
                },
                {
                    "name": "关注书籍",
                    "value": 128
                },
                {
                    "name": "文学",
                    "value": 105
                },
                {
                    "name": "报刊杂志",
                    "value": 77
                },
                {
                    "name": "人文社科",
                    "value": 22
                },
                {
                    "name": "建材家居",
                    "value": 907
                },
                {
                    "name": "装修建材",
                    "value": 644
                },
                {
                    "name": "家具",
                    "value": 273
                },
                {
                    "name": "家居风格",
                    "value": 187
                },
                {
                    "name": "家居家装关注品牌",
                    "value": 140
                },
                {
                    "name": "家纺",
                    "value": 107
                },
                {
                    "name": "厨具",
                    "value": 47
                },
                {
                    "name": "灯具",
                    "value": 43
                },
                {
                    "name": "家居饰品",
                    "value": 29
                },
                {
                    "name": "家居日常用品",
                    "value": 10
                },
                {
                    "name": "生活服务",
                    "value": 883
                },
                {
                    "name": "物流配送",
                    "value": 536
                },
                {
                    "name": "家政服务",
                    "value": 108
                },
                {
                    "name": "摄影服务",
                    "value": 49
                },
                {
                    "name": "搬家服务",
                    "value": 38
                },
                {
                    "name": "物业维修",
                    "value": 37
                },
                {
                    "name": "婚庆服务",
                    "value": 24
                },
                {
                    "name": "二手回收",
                    "value": 24
                },
                {
                    "name": "鲜花配送",
                    "value": 3
                },
                {
                    "name": "维修服务",
                    "value": 3
                },
                {
                    "name": "殡葬服务",
                    "value": 1
                },
                {
                    "name": "求职创业",
                    "value": 874
                },
                {
                    "name": "创业",
                    "value": 363
                },
                {
                    "name": "目标职位",
                    "value": 162
                },
                {
                    "name": "目标行业",
                    "value": 50
                },
                {
                    "name": "兼职",
                    "value": 21
                },
                {
                    "name": "期望年薪",
                    "value": 20
                },
                {
                    "name": "实习",
                    "value": 16
                },
                {
                    "name": "雇主类型",
                    "value": 10
                },
                {
                    "name": "星座运势",
                    "value": 789
                },
                {
                    "name": "星座",
                    "value": 316
                },
                {
                    "name": "算命",
                    "value": 303
                },
                {
                    "name": "解梦",
                    "value": 196
                },
                {
                    "name": "风水",
                    "value": 93
                },
                {
                    "name": "面相分析",
                    "value": 47
                },
                {
                    "name": "手相",
                    "value": 32
                },
                {
                    "name": "公益",
                    "value": 90
                }
            ]
        }
    ]
};
chart4.setOption(option);
window.onresize = chart4.resize;
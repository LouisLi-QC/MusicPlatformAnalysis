var total = {};
$.ajax({
    type: 'GET',
    async: false,
    url: "data/getComment",
    dataType: "json",
    success: function(res) {
        total = res;
    },
    error: function() {
        console.log("fucking error");
    }
});

var chartDom = document.getElementById('commentChart');
var myChart = echarts.init(chartDom, 'dark');
var option;


option = {
    title: {
        text: '评论折线图'
    },
    tooltip: {
        trigger: 'axis'
    },
    legend: {
        data: ['广东爱情故事',' 成都', '像我这样的人', '起风了']
        // , '搜索引擎'
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    toolbox: {
        feature: {
            saveAsImage: {}
        }
    },
    xAxis: {
        type: 'category',
        boundaryGap: false,
        data: ['01:00', '02:00', '03:00', '04:00', '05:00', '06:00', '07:00', '08:00', '09:00', '10:00', '11:00', '12:00',
            '13:00', '14:00', '15:00', '16:00', '17:00', '18:00', '19:00', '20:00', '21:00', '22:00', '23:00', '00:00']
    },
    yAxis: {
        type: 'value'
    },
    series: [
        {
            name: '成都',
            type: 'line',
            stack: '总量',
            data: total.chengDu
        },
        {
            name: '广东爱情故事',
            type: 'line',
            stack: '总量',
            data: total.guangDong
        },
        {
            name: '像我这样的人',
            type: 'line',
            stack: '总量',
            data: total.peopleLikeME
        },
        {
            name: '起风了',
            type: 'line',
            stack: '总量',
            data: total.qiFengLe
        }
        // ,
        // {
        //     name: '搜索引擎',
        //     type: 'line',
        //     stack: '总量',
        //     data: [820, 932, 901, 934, 1290, 1330, 1320]
        // }b
    ]
};

option && myChart.setOption(option);
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


setTimeout(function () {

    option = {
        legend: {
            //data: ['广东爱情故事',' 成都', '像我这样的人', '起风了']
            // , '搜索引擎'
        },
        tooltip: {
            trigger: 'axis',
            showContent: true
        },
        dataset: {
            source: [
                ['product','01:00', '02:00', '03:00', '04:00', '05:00', '06:00', '07:00', '08:00', '09:00', '10:00', '11:00', '12:00',
                    '13:00', '14:00', '15:00', '16:00', '17:00', '18:00', '19:00', '20:00', '21:00', '22:00', '23:00', '00:00'],
                total.guangDong,
                total.chengDu,
                total.peopleLikeME,
                total.qiFengLe
            ]
        },
        xAxis: {type: 'category'},
        yAxis: {gridIndex: 0},
        grid: {top: '45%'},
        series: [
            {type: 'line', smooth: true, seriesLayoutBy: 'row', emphasis: {focus: 'series'}},
            {type: 'line', smooth: true, seriesLayoutBy: 'row', emphasis: {focus: 'series'}},
            {type: 'line', smooth: true, seriesLayoutBy: 'row', emphasis: {focus: 'series'}},
            {type: 'line', smooth: true, seriesLayoutBy: 'row', emphasis: {focus: 'series'}},
            {
                type: 'pie',
                id: 'pie',
                radius: '25%',
                center: ['50%', '25%'],
                emphasis: {focus: 'data'},
                label: {
                    formatter: '{b}: {@01:00} ({d}%)'
                },
                encode: {
                    itemName: 'product',
                    value: '01:00',
                    tooltip: '01:00'
                }
            }
        ]
    };

    myChart.on('updateAxisPointer', function (event) {
        var xAxisInfo = event.axesInfo[0];
        if (xAxisInfo) {
            var dimension = xAxisInfo.value + 1;
            myChart.setOption({
                series: {
                    id: 'pie',
                    label: {
                        formatter: '{b}: {@[' + dimension + ']} ({d}%)'
                    },
                    encode: {
                        value: dimension,
                        tooltip: dimension
                    }
                }
            });
        }
    });

    myChart.setOption(option);

});

option && myChart.setOption(option);
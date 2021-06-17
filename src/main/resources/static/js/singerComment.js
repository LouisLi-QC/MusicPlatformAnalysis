
var myChart = echarts.init(document.getElementById('singerCommentTop10'), 'dark');

function getData() {
    var tmpData = {};
    $.ajax({
        type: 'GET',
        async: false,
        url: "/data/getTotalComment",
        dataType: "json",
        success: function(res) {
            tmpData = res;
        },
        error: function() {
            console.log("fucking error");
        }
    });
    console.log(totalData);
    return tmpData;
}
var totalData = getData();

var option = {

    toolbox: {
        feature: {
            dataZoom: {
                yAxisIndex: false
            },
            saveAsImage: {
                pixelRatio: 2
            }
        }
    },
    tooltip: {
        trigger: 'axis',
        axisPointer: {
            type: 'shadow'
        }
    },
    grid: {
        bottom: 90
    },
    dataZoom: [{
        type: 'inside'
    }, {
        type: 'slider'
    }],
    xAxis: {
        data: totalData.singer,
        silent: false,
        splitLine: {
            show: false
        },
        splitArea: {
            show: false
        }
    },
    yAxis: {
        splitArea: {
            show: false
        }
    },
    series: [{
        type: 'bar',
        data: totalData.comment,
        // Set `large` for large data amount
        large: true
    }]
};


option && myChart.setOption(option);

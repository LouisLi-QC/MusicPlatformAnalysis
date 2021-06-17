var chartDom = document.getElementById('songsLikeTop10');
var myChart = echarts.init(chartDom);

function getData() {
    var tmpData = {};
    $.ajax({
        type: 'GET',
        async: false,
        url: "/data/getLikeCount",
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
    tooltip: {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c}"
    },
    toolbox: {
        feature: {
            dataView: {readOnly: false},
            restore: {},
            saveAsImage: {}
        }
    },
    legend: {
        data: ['展现','点击','访问','咨询','订单']
    },

    series: [
        {
            name:'漏斗图',
            type:'funnel',
            left: '10%',
            top: 60,
            //x2: 80,
            bottom: 60,
            width: '80%',
            // height: {totalHeight} - y - y2,
            min: 95000,
            max: 100000,
            minSize: '0%',
            maxSize: '100%',
            sort: 'descending',
            gap: 2,
            label: {
                show: true,
                position: 'inside'
            },
            labelLine: {
                length: 10,
                lineStyle: {
                    width: 1,
                    type: 'solid'
                }
            },
            itemStyle: {
                borderColor: '#fff',
                borderWidth: 1
            },
            emphasis: {
                label: {
                    fontSize: 20
                }
            },
            data: totalData
        }
    ]
};

option && myChart.setOption(option);

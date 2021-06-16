//广东爱情故事
var chart1 = echarts.init(document.getElementById('guangDong'));

function getData() {
    var wordCloud = {};
    $.ajax({
        type: 'GET',
        async: false,
        url: "/charts/wordCloud",
        dataType: "json",
        success: function(res) {
            wordCloud = res;
        },
        error: function() {
            console.log("fucking error");
        }
    });
    return wordCloud;
}
var totalData = getData();
var gd_option;
function randomColor() {
    return 'rgb(' + [
        Math.round(Math.random() * 160),
        Math.round(Math.random() * 160),
        Math.round(Math.random() * 160)
    ].join(',') + ')';
}
gd_option = {
    backgroundColor: '#dc6d9a',
    tooltip: {},
    series: (
        {
            type: 'wordCloud',
            gridSize: 2,
            sizeRange: [12, 50],
            rotationRange: [-45, 0, 45, 90],
            shape: 'pentagon',
            textStyle: {
                normal: {
                    fontFamily: '微软雅黑',
                    color: function () {
                        var colors = ['#fda67e', '#81cacc', '#cca8ba', "#88cc81", "#82a0c5", '#fddb7e', '#735ba1', '#bda29a', '#6e7074', '#546570', '#c4ccd3'];
                        return colors[parseInt(Math.random() * 10)];}
                }
                },
            data: totalData.guangdong
        }
    )
};
chart1.setOption(gd_option);
window.onresize = chart1.resize;

//成都
var chart2 = echarts.init(document.getElementById('chengdu'));

var cd_option = {
    backgroundColor: '#00dbf8',
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
           data:totalData.chengdu
        }
    ]
};
chart2.setOption(cd_option);
window.onresize = chart2.resize;


//像我这样的人
var chart3 = echarts.init(document.getElementById('peopleLikeMe'));

var xw_option = {
    backgroundColor: '#cb6666',
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
            data:totalData.peopleLikeMe
        }
    ]
};
chart3.setOption(xw_option);
window.onresize = chart3.resize;

//起风了
var chart4 = echarts.init(document.getElementById('qiFeng'));

var qfl_option = {
    backgroundColor: '#728df3',
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
                        return 'rgb(' + [
                            Math.round(Math.random() * 160),
                            Math.round(Math.random() * 160),
                            Math.round(Math.random() * 160)
                        ].join(',') + ')';
                    }
                },
                emphasis: {
                     shadowBlur: 10,
                     shadowColor: '#05073b'
                }
            },
            data:totalData.qifengle
        }
    ]
};
chart4.setOption(qfl_option);
window.onresize = chart4.resize;
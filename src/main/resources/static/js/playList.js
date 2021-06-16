var total = {};
$.ajax({
    type: 'GET',
    async: false,
    url: "/charts/playLists",
    dataType: "json",
    success: function(res) {
        total = res;
    },
    error: function() {
        console.log("fucking error");
    }
});

//歌单播放量前十
var chartDom1 = document.getElementById('playNum');
var myChart1 = echarts.init(chartDom1);
var option1;

option1 = {
    xAxis: {
        type: 'category',
        data: total.playNumber.listName
    },
    yAxis: {
        type: 'value'
    },
    series: [{
        data: total.playNumber.playNumber,
        type: 'bar',
        showBackground: true,
        backgroundStyle: {
            color: 'rgba(180, 180, 180, 0.2)'
        }
    }]
};

option1 && myChart1.setOption(option1);

//歌单歌曲数前十
var chartDom2 = document.getElementById('songNum');
var myChart2 = echarts.init(chartDom2);
var option2;

option2 = {
    xAxis: {
        type: 'category',
        data: total.songNumber.listName
    },
    yAxis: {
        type: 'value'
    },
    series: [{
        data: total.songNumber.songNumber,
        type: 'bar',
        showBackground: true,
        backgroundStyle: {
            color: 'rgba(180, 180, 180, 0.2)'
        }
    }]
};

option2 && myChart2.setOption(option2);
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
    dataset: {
        source: [
            ['amount', 'product'],
            [total.playNumber.playNumber[0], total.playNumber.listName[0]],
            [total.playNumber.playNumber[1], total.playNumber.listName[1]],
            [total.playNumber.playNumber[2], total.playNumber.listName[2]],
            [total.playNumber.playNumber[3], total.playNumber.listName[3]],
            [total.playNumber.playNumber[4], total.playNumber.listName[4]],
            [total.playNumber.playNumber[5], total.playNumber.listName[5]],
            [total.playNumber.playNumber[6], total.playNumber.listName[6]],
            [total.playNumber.playNumber[7], total.playNumber.listName[7]],
            [total.playNumber.playNumber[8], total.playNumber.listName[8]],
            [total.playNumber.playNumber[9], total.playNumber.listName[9]]
        ]
    },
    grid: {containLabel: true},
    xAxis: {name: 'amount'},
    yAxis: {type: 'category'},
    visualMap: {
        orient: 'horizontal',
        left: 'center',
        min: 0,
        max: 1000000000,
        text: ['High Score', 'Low Score'],
        // Map the score column to color
        dimension: 0,
        inRange: {
            color: ['#65B581', '#FFCE34', '#FD665F']
        }
    },
    series: [
        {
            type: 'bar',
            encode: {
                // Map the "amount" column to X axis.
                x: 'amount',
                // Map the "product" column to Y axis
                y: 'product'
            }
        }
    ]
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
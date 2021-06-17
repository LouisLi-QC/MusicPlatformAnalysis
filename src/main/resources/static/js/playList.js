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
var myChart1 = echarts.init(chartDom1,'dark');
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
        text: ['高', '低'],
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
var myChart2 = echarts.init(chartDom2,'dark');
var option2;

option2 = {
    dataset: {
        source: [
            [ 'amount', 'product'],
            [ total.songNumber.songNumber[0], total.songNumber.listName[0]],
            [ total.songNumber.songNumber[1], total.songNumber.listName[1]],
            [ total.songNumber.songNumber[2], total.songNumber.listName[2]],
            [ total.songNumber.songNumber[3], total.songNumber.listName[3]],
            [ total.songNumber.songNumber[4], total.songNumber.listName[4]],
            [ total.songNumber.songNumber[5], total.songNumber.listName[5]],
            [ total.songNumber.songNumber[6], total.songNumber.listName[6]],
            [ total.songNumber.songNumber[7], total.songNumber.listName[7]],
            [ total.songNumber.songNumber[8], total.songNumber.listName[8]],
            [ total.songNumber.songNumber[9], total.songNumber.listName[9]]
        ]
    },
    grid: {containLabel: true},
    xAxis: {name: 'amount'},
    yAxis: {type: 'category'},
    visualMap: {
        orient: 'horizontal',
        left: 'center',
        min: 500,
        max: 1000,
        text: ['高', '低'],
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

option2 && myChart2.setOption(option2);
var songSinger = {};
$.ajax({
    type: 'GET',
    async: false,
    url: "charts/SongAndSinger",
    dataType: "json",
    success: function(res) {
        songSinger = res;
    },
    error: function() {
        console.log("fucking error");
    }
});

var songChart = echarts.init(document.getElementById('songChart'), 'dark');
var optionSong;

optionSong = {
    xAxis: {
        type: 'category',
        data: songSinger.songName,
    },
    yAxis: {
        type: 'value'
    },
    series: [{
        data: songSinger.songTimes,
        type: 'bar'
    }]
};

optionSong && songChart.setOption(optionSong);

//分界线

var chartDom = document.getElementById('singerChart');
var singerChart = echarts.init(chartDom, 'dark');
var optionSinger;

optionSinger = {
    xAxis: {
        type: 'category',
        data: songSinger.singerName
    },
    yAxis: {
        type: 'value'
    },
    series: [{
        data: songSinger.singerTimes,
        type: 'bar'
    }]
};

optionSinger && singerChart.setOption(optionSinger);
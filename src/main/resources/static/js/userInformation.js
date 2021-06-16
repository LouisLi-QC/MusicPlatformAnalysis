var total = {};
$.ajax({
    type: 'GET',
    async: false,
    url: "/charts/userInformation",
    dataType: "json",
    success: function(res) {
        total = res;
        console.log(total);
    },
    error: function() {
        console.log("fucking error");
    }
});
console.log(total);
//vip图表
var chartDom1 = document.getElementById('vipChart');
var myChart1 = echarts.init(chartDom1, 'dark');
var option1;
option1 = {
    title: {
        text: '网易云音乐',
        subtext: '用户VIP比例',
        left: 'center'
    },
    tooltip: {
        trigger: 'item'
    },
    legend: {
        orient: 'vertical',
        left: 'left',
    },
    series: [
        {
            name: '访问来源',
            type: 'pie',
            radius: '50%',
            data: [
                {value: total.vip.value, name: "VIP用户"},
                {value: total.normal.value, name: "普通用户"}
            ],
            emphasis: {
                itemStyle: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};

option1 && myChart1.setOption(option1);


//用户性别图表
var chartDom2 = document.getElementById('genderChart');
var myChart2 = echarts.init(chartDom2, 'dark');
var option2;

option2 = {
    title: {
        text: '网易云音乐',
        subtext: '用户性别比例',
        left: 'center'
    },
    tooltip: {
        trigger: 'item'
    },
    legend: {
        orient: 'vertical',
        left: 'left',
    },
    series: [
        {
            name: '访问来源',
            type: 'pie',
            radius: '50%',
            data: [
                {value: total.male.value, name: '男'},
                {value: total.female.value, name: '女'}
            ],
            emphasis: {
                itemStyle: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};

option2 && myChart2.setOption(option2);
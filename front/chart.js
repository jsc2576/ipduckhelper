google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(drawChart);
function drawChart() {

  //연예인 좋아요 그리는 부분
  var data_likes = new google.visualization.DataTable();
  data_likes.addColumn('string','star');
  data_likes.addColumn('number','likes');

  //쿼리를 이용해서 연예인 좋아요 정보 받아옴      
  for(var i=0; i<10; i++)
  {
    var str = 'aaa';
    data_likes.addRow([str, i]);
  }

  var options = {
    title: '연예인 좋아요',
    is3D: true,
  };

  var chart = new google.visualization.PieChart(document.getElementById('star_likes'));
  chart.draw(data_likes, options);
        
  //태그 현황 부분
  var data_tags = new google.visualization.DataTable();
  data_tags.addColumn('string','tags');
  data_tags.addColumn('number','num');
        
  for(var i=0; i<10; i++)
  {
    var str = 'aaa';
    data_tags.addRow([str, i]);
  }

  var options = {
    title: '태그 현황',
    is3D: true,
  };

  var chart = new google.visualization.PieChart(document.getElementById('star_tags'));
  chart.draw(data_tags, options);
}
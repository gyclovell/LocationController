<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script>

  function getCityOptions() {
      var province = $("#provinceSelect").val();
      $.ajax({
          url: "getCityOptions",
          type: "POST",
          data: { province: province },
          dataType: "json",
          success: function(data) {
              
              var citySelect = $("#citySelect");
              citySelect.empty();  
              citySelect.append($("<option>").val("").text("请选择城市"));  
              $.each(data, function(index, option) {
                  citySelect.append($("<option>").val(option).text(option));
              });
              
              $("#districtSelect").empty().append($("<option>").val("").text("请选择区县"));
          }
      });
  }

 
  function getDistrictOptions() {
      var city = $("#citySelect").val();
      $.ajax({
          url: "getDistrictOptions",
          type: "POST",
          data: { city: city },
          dataType: "json",
          success: function(data) {
              
              var districtSelect = $("#districtSelect");
              districtSelect.empty();  
              districtSelect.append($("<option>").val("").text("请选择区县"));  
              $.each(data, function(index, option) {
                  districtSelect.append($("<option>").val(option).text(option));
              });
          }
      });
  }
  </script>
</head>
<body>
  <form>
  
<select id="provinceSelect" onchange="getCityOptions()">
    <option value="">请选择省份</option>
    <option value="内蒙古">内蒙古</option>
    <option value="四川">四川</option>
    <option value="广东">广东</option>
</select>


<select id="citySelect" onchange="getDistrictOptions()">
    <option value="">请选择城市</option>
</select>


<select id="districtSelect">
    <option value="">请选择区县</option>
</select>

  </form>
</body>
</html>
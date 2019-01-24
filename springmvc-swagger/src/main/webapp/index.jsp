<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="/springmvc-swagger/static/js/jquery.min.js"></script>
</head>
<body>
<input type="button" value="aaaaaaa" id="serve">

	<script type="text/javascript">
	$("#serve").click(function(){
			$.ajax({
				url: 'product/getd',
				type: 'get',
				contentType: "application/json; charset=utf-8", 
				data: {'id':1},
				success:function(result){
					if(result){
						alert(11);
					}else{
						alert(1);
					}	
				},
				error:function()
				{
					alert(114);
				}
			});
	})
	</script>
</body>
</html>
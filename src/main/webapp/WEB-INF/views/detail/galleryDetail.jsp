<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
     <!-- jstl은 xml 데이터 처리,조건,반복,국제화,지역화를 처리함
    자바코드를 사용하지않고 로직을 처리한다.-->
    <!-- 사진을 등록할려면 메인홈페이지에서 그림을 저장하고 완료버튼을 눌러야된다.
    반드시 파일이 있어야되며 없으면 취소버튼을 눌러야한다 -->
    	<!--1차 파일경로가 gallery 2차경로가 reg 보내는 방법은 포스트로 보내는데 
    	html을 사용하지 않는다. 그림을 업로드할려면 설명,영상이 필요하다 없는데 null을 업로드하면 허용하지않는다. -->
    	<div id="sectionContainerCenter">
<!-- 사진을 등록하기 텍스트가 없어도 업로드를 할수있으나 그림파일이 비어있을경우는 업로드를 할수없다.
 -->
 <div>
 <!-- form태그는 주로 get방식이나 여기선 포스트방식을사용한다. 파일 -->
 	<form action="" method="post" onsubmit="return chkFrm()">
 	<!-- 함수에다 값을 보내서 체크를 한다. -->
 		<div> 
 		<input type="text"> 
 		<!-- 작품이름 -->
 		</div>
 		<div>
 			<!-- 그림파일  -->
 			<input>
 		</div>
 	</form>
 </div>
</div>
    	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">

</script>
</body>
</html>
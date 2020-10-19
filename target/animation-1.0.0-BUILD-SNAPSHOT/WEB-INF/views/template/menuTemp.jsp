<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!-- jsp생성없이 인터셉터하는 기능 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title}</title>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@500&display=swap" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="/res/css/common.css?dkddaadddkdkdk=1">
<c:forEach items="${css}" var="item">
	<link rel="stylesheet" type="text/css" href="/res/css/${item}.css">
</c:forEach>
</head>
<body>
<div id="container">
		<div id="header">
			<header>
				<!-- 상단부 -->

				<!-- 로고를 클릭하면 메인 페이지로 돌아간다. -->
				<!-- 로고와 서브메뉴를 묶어주는 div 서브메뉴를 늘리는건 고정이 아닌 자바스크립트로 조절한다.-->
				<div id="mainMenu">
					<div id="logo">
						<a href=""> <img alt="" src="">
						</a>mainPage
					</div>

					<!-- 상단메뉴들 미디어쿼리로 햄버거메뉴에다 넣어야됨. -->
					<div id="subMenu">
						<nav>
							<ul>
								<li>
								<!-- 내 계정으로 들어가면 나의 정보가 들어있는 도메인으로 들어온다. --> 
									<a href="">
									내계정</a>
								</li>
								<li>
									<!-- 내가 찜한 정보들을 담은 도메인으로 넘어간다. --> <a href="">내가 찜한것</a>
								</li>
								<!-- 내가 체크한 정보들의 데이터를 팔로잉 목록에다 적는다. -->
								<li><a href="">팔로잉</a></li>
								<li>
									<!-- 나를 팔로한 사람들의 정보를 보여준다. --> <a href="">팔로어</a>
									<div>
										<nav>
											<ul>
												<li></li>
											</ul>
										</nav>
									</div>
								</li>
							</ul>
						</nav>
					</div>
				</div>

				<!-- 검색창 -->
				<div id="search_media">
					<form action="/" method="get" class="">
						<!-- 돋보기 아이콘을 클릭하면 결과 -->
						<div class=""></div>

						<input type="search" name="search" placeholder="검색">
						<!-- 검색한 결과를 새로고침해서 메인 화면에 쏜다. -->
						<!-- 카테고리로 검색결과를 걸러주는 역할이거나 태그에 해당되는 결과를 화면에 쏘는 역할.
하지만 input역할을 하지않는다. -->
						<select>
							<option>1차</option>
							<option>2차</option>
							<option>3차</option>
						</select> <input type="submit" value="검색">
					</form>
				</div>
				<!-- 회원가입,로그인 -->
				<!--미디어쿼리로변할 햄버거메뉴 -->
			</header>
		</div>

		<!-- 내용 -->
		<div id="content">
			<section>
				<!-- 내 계정의 정보들 -->
				<div id="profile_pic"></div>
				<div id="profile_nm"></div>
				<div id="profile_account">
					<div id="profile_img">
						<img alt="" src="">
					</div>
					<div id="profile_account_id"></div>
					<div id="profile_cmt"></div>
					<!-- 장르별 해더 -->
				</div>
				<!-- 타임라인에 따라서 정렬되는 그림들 -->

				<div id="gallery_thumbnail">
					<div>
						<ul>
							<li>정렬될 사진들.
								<div id="gallery_imgboard">
									<figure>
										<!-- 이미지를 클릭하면 해당 디테일로 들어간다. -->
										<a href=""><img alt="" src=""></a>
										<div id="title">
											<figcaption>
											<!-- 설명:입력되면 서버로 전달 -->
												<a href="" onclick=""></a>
											</figcaption>
										</div>
									</figure>
								</div>
							</li>
						</ul>
						<a href=""><img alt="" src=""></a>
					</div>
					<div id="gallery_img">
						<!-- 이름,프로필사진 좋아요,조회수 이미지에다 덮어쓸 래퍼-->
						<div id="gallery_wrapper"></div>
					</div>
					<div>
						좋아요 이모티콘 <img alt="" src="">
					</div>
					<div>조회수</div>
				</div>
				<!-- 좋아요수 -->

				<!-- 올린사람프로필사진 -->
			</section>
		</div>

		<!-- 옆면 -->
		<div id="aside">
			<aside></aside>
		</div>
		<!-- 하단부 -->
		<div id="footer">
			<footer> </footer>
		</div>

	</div>
</body>
</html>
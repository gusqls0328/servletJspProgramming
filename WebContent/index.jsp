<%@ page contentType="text/html;charset=UTF-8"%> 

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			
			body, html {
				height: 100%;
				margin: 0px;
				background-color: gray;
			}
			
			#wrapper {
				width: 100%;
				height: 100%;
				display: flex;
				flex-direction: column;
			}
			
			#header {
				border-bottom: 1px solid black;
				margin-bottom: 10px;
			}
			
			#content {
				min-height: 0; <!-- 일종의 버그 -->
				flex-grow: 1;
				display: flex;
			}
			
			#sideBar {
				width: 250px;
				background-color: #F1948A;
				border-right: 1px solid black;
				padding-right: 10px;
				overflow-y : scroll;
				
			}
			
			#center {
				flex-grow: 1;
				padding: 10px;
			}
			
			#center iframe {
				margin: 0px;
				width: 100%;
				height: 100%;
			}
			
			#center h4 {
				margin-top: 0px;
			}
			
			#footer {
				border-top: 1px solid black;
				margin-top: 10px;
				margin-bottom: 10px;
			}
		</style>
	</head>
	<body>
		<div id="wrapper">
			<div id="header">
				<h3>JavaScriptProgramming</h3>
			</div>
			<div id="content">
				<div id="sideBar">
					<ul>
					
						<li><a href="dispatcher1" target="iframe">서블릿 작성과 URL 매핑</a></li>
						<li><a href="dispatcher2" target="iframe">서블릿 초기화</a></li>
						<li><a href="dispatcher3?name=hong&age=25&tel=123-456-1234" target="iframe">GET 방식으로 요청</a></li><!-- GET방식으로 요청  -->
						<li>
							<form action="dispatcher3" method="get" target="iframe">
								<input type="text" name="name" value="hong"/>
								<input type="number" name="age" value="25"/>
								<input type="tel" name="tel" value="123-456-1234"/>
								<input type="submit" value="GET 방식으로 요청"/>
							</form>
						</li>
						<li>
							<form action="dispatcher3" method="post" target="iframe"> <!-- action은 밑의 input으로 요청하는 것을 뜻한다? -->
								<input type="text" name="name" value="hong"/>
								<input type="number" name="age" value="25"/>
								<input type="tel" name="tel" value="123-456-1234"/>
								<input type="submit" value="POST방식으로 요청"/>
							</form>
						</li>
						<li><a href="dispatcher4" target="iframe">응답 보내기</a></li>
						<li><a href="dispatcher5?name=hongkildong&age=25" target="iframe">요청 파라미터 받기</a></li>
						<li>
							<p>요청 파라미터 전달</p>
							<form action="dispatcher5" method="get" target="iframe">
								<input type="text" name="name" value="hong"/>
								<input type="number" name="age" value="25"/>
								<input type="submit" value="GET 방식으로 요청"/>
							</form>
						</li>
						<li>
							<form action="dispatcher5" method="post" target="iframe"> <!-- action은 밑의 input으로 요청하는 것을 뜻한다? -->
								<input type="text" name="name" value="hong"/> <!-- value가 Parameter 값임, 실제로 사용자가 입력하는 값이 Parameter 값이됨 -->
								<input type="number" name="age" value="25"/>
								<input type="submit" value="POST방식으로 요청"/>
							</form>
						</li>
						<li>
							<p>요청 파라미터 한글 처리</p>
							<form action="dispatcher6" method="get" target="iframe">
								<input type="text" name="title" />
								<input type="text" name="content" />
								<input type="submit" value="GET 방식으로 요청"/>
							</form>
						</li>
						<li>
							<form action="dispatcher6" method="post" target="iframe"> <!-- action은 밑의 input으로 요청하는 것을 뜻한다? -->
								<input type="text" name="title" />
								<input type="text" name="content" />
								<input type="submit" value="POST방식으로 요청"/>
							</form>
						</li>
						<li>
							<p>객체 사용 범위</p>
							<a href="dispatcher7" target="iframe">객체 저정하기</a><br/>
							<a href="dispatcher8" target="iframe">객체 가져오기</a><br/>
						</li>
					</ul>
				</div>
				<div id="center">
					<iframe name= "iframe" src="https://tomcat.apache.org/" frameborder="0"></iframe>
				</div>
			</div>
			<div id="footer">2019. IoT. K.H.B</div>
		</div>
	</body>
</html>
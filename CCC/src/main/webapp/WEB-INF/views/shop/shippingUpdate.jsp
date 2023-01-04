<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- jQuery 라이브러리 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- 부트스트랩에서 제공하고 있는 스타일 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<!-- 부트스트랩에서 제공하고 있는 스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<title>CCC::배송지 수정</title>
<style>
	.addressManageHr{
		height: 2px;
		background-color: gray;
	}
	.packageInfoSection{
		width: 100%;
		height: 200px;
		border: 1px solid lightgray;
	}
	.positionControl{
		margin-top: 20px;
		pmargin-left:50px;
	}
	.positionControl input{
		width: 100%;
		height: 30px;
	}
	.shippingLabel{
		border-bottom: 2px solid lightpink;
	}
	#basicChk{
		width: 20px;
		height: 20px;
		margin: 0 0 0 20px;
		vertical-align: middle;
	}
	.positionControl input{
		border: none;
		background-color: beige;
		margin: auto;
		padding: auto;
	}
	.updateShippingInfo{
		width: 49%;
		height: 40px;
		border: none;
		background-color: lightpink;
	}
	.deleteShippingInfo{
		margin-top: 10px;
		width: 49%;
		height: 40px;
		border: none;
		background-color: lightgray;
	}
	.backShipping{
		width:100%;
		height: 40px;
		border: none;
		background-color: lightblue;
		margin-top: 10px;
	}
</style>
</head>
<body>
	<div class="addressManageOuter container-fluid">
		<br>
		<h4 align="center">배송지 수정</h4>
		<hr class="addressManageHr">
		<br>
		<div class="form-area">
			<form id="updateForm" method="post" action="infoUpdate.sh">
				<div class="packageInfoSection">
					<div class="positionControl">
						<input type="hidden" name="addressNo" value="${ai.addressNo }">
						<label for="receiverName" class="shippingLabel">받는 사람 이름 : </label>
						<input type="text" id="receiverName" placeholder="받는 사람 이름을 입력해 주세요." name="receiverName" value="${ai.receiverName }" required><br>
						<label for="addressName" class="shippingLabel">받는 곳 : </label>
						<input type="text" id="addressName" placeholder="받는 곳 이름" name="addressName" value="${ai.addressName }" required><br>
						<label for="address" class="shippingLabel">받는 곳 주소 : </label>
						<input type="text" id="address" placeholder="받는 곳 주소" name="address" value="${ai.address}" required><br>
						<label for="addressDetail" class="shippingLabel">받는 곳 상세 주소 : </label>
						<input type="text" id="addressDetail" placeholder="받는 곳 상세 주소" name="addressDetail" value="${ai.addressDetail}" required><br>
						<label for="zipCode" class="shippingLabel">우편번호 : </label>
						<input type="text" id="zipCode" placeholder="우편번호를 입력해 주세요." name="zipCode" value="${ai.zipCode}" required><br>
						<label for="phone" class="shippingLabel">받는 곳 전화번호 : </label>
						<input type="text" id="phone" placeholder="ex)010-0000-0000" name="phone" value="${ai.phone}" required><br>
						<label for="comment" class="shippingLabel">배송 메세지 : </label>
						<input type="text" id="comment" placeholder="배송메세지를 입력해 주세요." name="comment" value="${ai.comment}"><br>
						<label for="basicChk">기본 배송지로  선택</label>
<%-- 						<c:choose> --%>
<%-- 							<c:when test="${ai.status eq 'Y'}"> --%>
								<input type="checkbox" id="basicChk" name="basicChk" checked><br>
<%-- 							</c:when> --%>
<%-- 							<c:otherwise> --%>
<!-- 								<input type="checkbox" id="basicChk" name="basicChk"><br> -->
<%-- 							</c:otherwise> --%>
<%-- 						</c:choose> --%>
						<button type="submit" class="updateShippingInfo">수정</button>
						<button type="button" class="deleteShippingInfo">삭제</button>
						<button type="button" class="backShipping">뒤로가기</button>
					</div>
				</div>
			</form>
		</div>
	</div><br>
	<script>
		$(".backShipping").click(function(){
			location.href="shipping.go";
		});
		$(".deleteShippingInfo").click(function(){
			
			location.href="deleteAddressInfo.sh?addressNo=${ai.addressNo }";
		});
	</script>
</body>
</html>
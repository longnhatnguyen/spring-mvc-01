<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	    <%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Building-edit</title>
<!-- bootstrap & fontawesome -->

<link href="<c:url value='/template/assets/css/bootstrap.min.css'/>" rel="stylesheet" type="text/css">

<link href="<c:url value='/template/assets/font-awesome/4.2.0/css/font-awesome.min.css'/>" rel="stylesheet" type="text/css">

<!-- page specific plugin styles -->

<!-- text fonts -->

<link href="<c:url value='/template/assets/fonts/fonts.googleapis.com.css'/>" rel="stylesheet" type="text/css">
<!-- ace styles -->

	<link href="<c:url value='/template/assets/css/ace.min.css'/>" rel="stylesheet" type="text/css" class="ace-main-stylesheet" id="main-ace-style">
<script 
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script src="<c:url value='/template/assets/js/ace-extra.min.js'/>"></script>
</head>
<body class="no-skin">
	<%@ include file="/common/admin/header.jsp" %>
	<dec:body/>
	<%@ include file="/common/admin/footer.jsp" %>
	
	
	<script type="text/javascript">
		window.jQuery || document.write("<script src="<c:url value='/template/assets/js/jquery.min.js'/>">" + "<" + "/script>");
	</script>
	<script type="text/javascript">
		if ('ontouchstart' in document.documentElement) document.write("<script src="<c:url value='/template/assets/js/jquery.mobile.custom.min.js'/>">" + "<" +  "/script>");
	</script>
	
	<script src="<c:url value='/template/assets/js/bootstrap.min.js'/>"></script>
	<script src="<c:url value='/template/assets/js/jquery.bootstrap-duallistbox.min.js'/>"></script>
	
	<script src="<c:url value='/template/assets/js/jquery.raty.min.js'/>"></script>
	<script src="<c:url value='/template/assets/js/select2.min.js'/>"></script>
	<script src="<c:url value='/template/assets/js/typeahead.jquery.min.js'/>"></script>	
	<script src="<c:url value='/template/assets/js/bootstrap-multiselect.min.js'/>"></script>
		<script type="text/javascript">
		
		
		jQuery(function ($) {
			//////////////////
			$('.multiselect').multiselect({
				enableFiltering: true,
				buttonClass: 'btn btn-white btn-primary',
				templates: {
					button: '<button type="button" class="multiselect dropdown-toggle" data-toggle="dropdown"></button>',
					ul: '<ul class="multiselect-container dropdown-menu"></ul>',
					filter: '<li class="multiselect-item filter"><div class="input-group"><span class="input-group-addon"><i class="fa fa-search"></i></span><input class="form-control multiselect-search" type="text"></div></li>',
					filterClearBtn: '<span class="input-group-btn"><button class="btn btn-default btn-white btn-grey multiselect-clear-filter" type="button"><i class="fa fa-times-circle red2"></i></button></span>',
					li: '<li><a href="javascript:void(0);"><label></label></a></li>',
					divider: '<li class="multiselect-item divider"></li>',
					liGroup: '<li class="multiselect-item group"><label class="multiselect-group"></label></li>'
				}
			});
		})
	</script>
</body>
</html>
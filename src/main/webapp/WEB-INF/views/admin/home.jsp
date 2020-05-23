<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Home Page</title>

</head>

<body>


	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try { ace.settings.check('main-container', 'fixed') } catch (e) { }
		</script>

		<div id="sidebar" class="sidebar                  responsive">
			<script type="text/javascript">
				try { ace.settings.check('sidebar', 'fixed') } catch (e) { }
			</script>

			<div class="sidebar-shortcuts" id="sidebar-shortcuts" style="">
				<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large" style="padding-left: 14px;">
					<button class="btn btn-success">
						<i class="ace-icon fa fa-signal"></i>
					</button>

					<button class="btn btn-info">
						<i class="ace-icon fa fa-pencil"></i>
					</button>

					<button class="btn btn-warning">
						<i class="ace-icon fa fa-users"></i>
					</button>

					<button class="btn btn-danger">
						<i class="ace-icon fa fa-cogs"></i>
					</button>
				</div>

				<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
					<span class="btn btn-success"></span>

					<span class="btn btn-info"></span>

					<span class="btn btn-warning"></span>

					<span class="btn btn-danger"></span>
				</div>
			</div><!-- /.sidebar-shortcuts -->

			<ul class="nav nav-list">
				<!-- <li class="active">
						<a href="index.html">
							<i class="menu-icon fa fa-tachometer"></i>
							<span class="menu-text"> Dashboard </span>
						</a>

						<b class="arrow"></b>
					</li> -->

				<li class="">
					<a href="#" class="dropdown-toggle" style="padding-left: 20px;">
						<i class="menu-icon fa fa-desktop"></i>
						<span class="menu-text">
							UI &amp; Elements
						</span>

						<b class="arrow fa fa-angle-down"></b>
					</a>

					<b class="arrow"></b>

					<ul class="submenu">
						<li class="">
							<a href="typography.html">
								<i class="menu-icon fa fa-caret-right"></i>
								Typography
							</a>

							<b class="arrow"></b>
						</li>
					</ul>
				</li>
			</ul><!-- /.nav-list -->

			<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
				<i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left"
					data-icon2="ace-icon fa fa-angle-double-right"></i>
			</div>

			<script type="text/javascript">
				try { ace.settings.check('sidebar', 'collapsed') } catch (e) { }
			</script>
		</div>

		<div class="main-content">
			<div class="main-content-inner">
				<div class="breadcrumbs" id="breadcrumbs">
					<script type="text/javascript">
						try { ace.settings.check('breadcrumbs', 'fixed') } catch (e) { }
					</script>

					<ul class="breadcrumb">
						<li>
							<i class="ace-icon fa fa-home home-icon"></i>
							<a href="#">Home</a>
						</li>
						<li class="active">Dashboard</li>
					</ul><!-- /.breadcrumb -->
				</div>

				<div class="page-content">
					<div class="ace-settings-container" id="ace-settings-container"></div>
				</div><!-- /.ace-settings-container -->

				<div class="page-header">
					<h1>
						Dashboard
						<small>
							<i class="ace-icon fa fa-angle-double-right"></i>
							overview &amp; stats
						</small>
					</h1>
				</div><!-- /.page-header -->

				<div class="row">
					<div class="col-xs-11 " style="margin-left: 30px;">
						<!-- PAGE CONTENT BEGINS -->

						<div class="widget-box">
							<div class="widget-header">
								<h4 class="widget-title">Text Area</h4>
								<div class="widget-toolbar">
									<a href="#" data-action="collapse">
										<i class="ace-icon fa fa-chevron-up"></i>
									</a>
								</div>
							</div>
							<div class="widget-body">
								<div class="widget-main">
									<div class="row">
										<div class="col-xs-6">
											<div>
												<label for="name"> Tên tòa nhà </label>
												<input type="text" id="name" class="form-control" />
											</div>
										</div>
										<div class="col-xs-6" style="margin-bottom: 20px;">
											<div>
												<label for="buildingArea"> Diện tích sàn</label>
												<input type="number" id="buildingArea" class="form-control" />
											</div>
										</div>
										<div class="form-group col-xs-4">
											<label class="control-label" for="food">Quận hiện có</label>

											<div class="">
												<select id="food" class="multiselect" multiple="">
													<option value="cheese">Cheese</option>
													<option value="tomatoes">Tomatoes</option>
													<option value="mozarella">Mozzarella</option>
													<option value="mushrooms">Mushrooms</option>
													<option value="pepperoni">Pepperoni</option>
												</select>
											</div>
										</div>
										<div class="col-xs-4">
											<div>
												<label for="nameward"> Phường </label>
												<input type="text" id="nameward" class="form-control" />
											</div>
										</div>
										<div class="col-xs-4" style="margin-bottom: 20px;">
											<div>
												<label for="namestreet"> Đường</label>
												<input type="text" id="namestreet" class="form-control" />
											</div>
										</div>
										<div class="col-xs-4">
											<div>
												<label for="numberofbasements"> Số tầng hầm</label>
												<input type="number" id="numberofbasements" class="form-control" />
											</div>
										</div>
										<div class="col-xs-4">
											<div>
												<label for="direction"> Hướng</label>
												<input type="text" id="direction" class="form-control" />
											</div>
										</div>
										<div class="col-xs-4" style="margin-bottom: 20px;">
											<div>
												<label for="class">Hạng</label>
												<input type="text" id="class" class="form-control" />
											</div>
										</div>
										<div class="col-xs-3">
											<div>
												<label for="dientichtu"> Diện tích từ</label>
												<input type="number" id="dientichtu" class="form-control" />
											</div>
										</div>
										<div class="col-xs-3">
											<div>
												<label for="dientichden"> Diện tích đến</label>
												<input type="number" id="dientichden" class="form-control" />
											</div>
										</div>
										<div class="col-xs-3">
											<div>
												<label for="giathuetu"> Giá thuê từ</label>
												<input type="number" id="giathuetu" class="form-control" />
											</div>
										</div>
										<div class="col-xs-3 " style="margin-bottom: 20px;">
											<div>
												<label for="giathueden"> Giá thuê đến</label>
												<input type="number" id="giathueden" class="form-control" />
											</div>
										</div>
										<div class="col-xs-4">
											<div>
												<label for="namemanager"> Tên quản lý</label>
												<input type="text" id="namemanager" class="form-control" />
											</div>
										</div>
										<div class="col-xs-4">
											<div>
												<label for="numbermanager">Điện thoại quản lý</label>
												<input type="number" id="numbermanager" class="form-control" />
											</div>
										</div>
										<div class="form-group col-xs-4">
											<label class="control-label" for="food">Nhân viên phụ trách</label>

											<div class="">
												<select id="food" class="multiselect" multiple="">
													<option value="cheese">Cheese</option>
													<option value="tomatoes">Tomatoes</option>
													<option value="mozarella">Mozzarella</option>
													<option value="mushrooms">Mushrooms</option>
													<option value="pepperoni">Pepperoni</option>
												</select>
											</div>
										</div>
										<div class="col-xs-12" style="margin-bottom: 20px;">
											<form>
												<label class="checkbox-inline">
													<input type="checkbox" value="">Tầng trệt
												</label>
												<label class="checkbox-inline">
													<input type="checkbox" value="">Nguyên căn
												</label>
												<label class="checkbox-inline">
													<input type="checkbox" value="">Nội thất
												</label>
											</form>
										</div>
										<div class="col-xs-12">
											<button type="button" class="btn btn-sm btn-success">
												Tìm kiếm
												<i class="ace-icon fa fa-arrow-right icon-on-right bigger-110"></i>
											</button>
										</div>

									</div>
								</div>
							</div>
						</div>
						<!-- PAGE CONTENT ENDS -->
						<!-- PAGE CONTENT ENDS -->
					</div><!-- /.col -->
				</div><!-- /.row -->

				<div class="row">
					<div class="col-xs-11 " style="margin-left: 29px ; margin-top: 10px;">
						<div class="pull-right" style="margin-bottom: 5px;">
							<button class="btn btn-white btn-info" data-toggle="tooltip" title="Thêm tòa nhà">
								<i class="fa fa-plus-circle" aria-hidden="true"></i>
							</button>
							<button class="btn btn-white btn-info" data-toggle="tooltip" title="Xóa tòa nhà">
								<i class="fa fa-trash" aria-hidden="true"></i>
							</button>

						</div>
						<table id="simple-table" class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
									<th>Tên sản phẩm</th>
									<th>Địa chỉ</th>
									<th>Tên quản lý</th>
									<th>Số điện thoại</th>
									<th>Diện tích sàn</th>
									<th>Giá thuê</th>
									<th>Phí dịch vụ</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>abc</td>
									<td>abc</td>
									<td>abc</td>
									<td>abc</td>
									<td>abc</td>
									<td>abc</td>
									<td><button class="btn btn-xs btn-info" data-toggle="tooltip"
											title="Giao tòa nhà cho nhân viên quản lý" onclick="assimentBuilding()">
											<i class="ace-icon fa fa-pencil bigger-120"></i>
										</button></td>

								</tr>
								<tr>
									<td>abc</td>
									<td>abc</td>
									<td>abc</td>
									<td>abc</td>
									<td>abc</td>
									<td>abc</td>
									<td><button class="btn btn-xs btn-info" data-toggle="tooltip"
											title="Giao tòa nhà cho nhân viên quản lý" onclick="assimentBuilding()">
											<i class="ace-icon fa fa-pencil bigger-120"></i>
										</button></td>

								</tr>
							</tbody>
						</table>

					</div>

				</div>

			</div><!-- /.page-content -->
		</div>
	</div><!-- /.main-content -->
</div>

	<!-- /.main-container -->


</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed')
			} catch (e) {
			}
		</script>

		<div id="sidebar" class="sidebar                  responsive">
			<script type="text/javascript">
				try {
					ace.settings.check('sidebar', 'fixed')
				} catch (e) {
				}
			</script>

			<div class="sidebar-shortcuts" id="sidebar-shortcuts" style="">
				<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large"
					style="padding-left: 14px;">
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
					<span class="btn btn-success"></span> <span class="btn btn-info"></span>

					<span class="btn btn-warning"></span> <span class="btn btn-danger"></span>
				</div>
			</div>
			<!-- /.sidebar-shortcuts -->

			<ul class="nav nav-list">

				<li class=""><a href="#" class="dropdown-toggle"
					style="padding-left: 20px;"> <i class="menu-icon fa fa-desktop"></i>
						<span class="menu-text"> UI &amp; Elements </span> <b
						class="arrow fa fa-angle-down"></b>
				</a> <b class="arrow"></b>

					<ul class="submenu">
						<li class=""><a href="typography.html"> <i
								class="menu-icon fa fa-caret-right"></i> Typography
						</a> <b class="arrow"></b></li>
					</ul></li>
			</ul>
			<!-- /.nav-list -->

			<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
				<i class="ace-icon fa fa-angle-double-left"
					data-icon1="ace-icon fa fa-angle-double-left"
					data-icon2="ace-icon fa fa-angle-double-right"></i>
			</div>

			<script type="text/javascript">
				try {
					ace.settings.check('sidebar', 'collapsed')
				} catch (e) {
				}
			</script>
		</div>

		<div class="main-content">
			<div class="main-content-inner">
				<div class="breadcrumbs" id="breadcrumbs">
					<script type="text/javascript">
						try {
							ace.settings.check('breadcrumbs', 'fixed')
						} catch (e) {
						}
					</script>

					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Home</a>
						</li>
						<li class="active">Dashboard</li>
					</ul>
					<!-- /.breadcrumb -->
				</div>

				<div class="page-content">
					<div class="ace-settings-container" id="ace-settings-container"></div>
				</div>
				<!-- /.ace-settings-container -->

				<div class="page-header">
					<h1>
						Dashboard <small> <i
							class="ace-icon fa fa-angle-double-right"></i> overview &amp;
							stats
						</small>
					</h1>
				</div>
				<!-- /.page-header -->

				<div class="row">
					<div class="col-xs-11 " style="margin-left: 30px;">
						<!-- PAGE CONTENT BEGINS -->
						<div class="widget-body">
							<div class="widget-main">
								<div class="row">
									<div class="form-group">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-1"> Tên sản phẩm</label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-1" placeholder="Tower"
												class="form-control" />
										</div>
										<label class="col-sm-12"
											style="margin-top: 20px; margin-bottom: 20px;"> Người
											quản lý sản phẩm </label>
									</div>

									<div class="form-group col-xs-12">
										<label class="control-label" for="food">Quận</label>
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
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-2"> Quận </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-2" placeholder="Quận 1"
												class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-3"> Phường </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-3" placeholder="Phường"
												class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-4"> Đường </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-4" placeholder="Đường"
												class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-5"> Kết cấu </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-5" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-6"> Sô tầng hầm </label>
										<div class="col-sm-9">
											<input type="number" id="form-field-1-6" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-7"> Diện tích sàn </label>
										<div class="col-sm-9">
											<input type="number" id="form-field-1-7" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-8"> Hướng </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-8" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-9"> Hạng </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-9" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-1.1"> Diện tích thuê </label>
										<div class="col-sm-9">
											<input type="number" id="form-field-1-1.1"
												class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-1.2"> Mô tả diện tích </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-1.2" class="form-control"
												style="padding-bottom: 150px;" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-1.3"> Giá thuê </label>
										<div class="col-sm-9">
											<input type="number" id="form-field-1-1.3"
												class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-1.4"> Mô tả giá </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-1.4" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-1.5"> Phí dịch vụ </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-1.5" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-1.6"> Phí ô tô </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-1.6" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-1.7"> Phí mô tô </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-1.7" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-1.8"> Phí ngoài giờ </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-1.8" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-1.9"> Tiền diện </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-1.9" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-2.1">Đặt cọc</label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-2.1" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-2.2"> Thanh toán </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-2.2" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-2.3">Thời hạn thuê </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-2.3" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-2.4"> Thời gian trang trí</label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-2.4" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-2.5"> Tên quản lý </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-2.5" class="form-control" />
										</div>
									</div>
									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-2.6"> Số điện thoại quản lý </label>
										<div class="col-sm-9">
											<input type="number" id="form-field-1-2.6"
												class="form-control" />
										</div>
									</div>

									<div class="form-group col-xs-12">
										<label class="col-sm-1 control-label no-padding-right"
											for="form-field-1-2.7"> Phí mô giới </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-1-2.7" class="form-control" />
										</div>
									</div>

									<div class="col-xs-12" style="margin-bottom: 20px;">
										<label class="col-sm-3 "> Loại sản phẩm </label>
										<form>
											<label class="checkbox-inline"> <input
												type="checkbox" value="">Tầng trệt
											</label> <label class="checkbox-inline"> <input
												type="checkbox" value="">Nguyên căn
											</label> <label class="checkbox-inline"> <input
												type="checkbox" value="">Nội thất
											</label>
										</form>
									</div>
									<!-- <div class="col-xs-12">
											<button type="button" class="btn btn-sm btn-success">
												Tìm kiếm
												<i class="ace-icon fa fa-arrow-right icon-on-right bigger-110"></i>
											</button>
										</div> -->

								</div>
							</div>
						</div>
					</div>
					<!-- PAGE CONTENT ENDS -->
					<!-- PAGE CONTENT ENDS -->
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->

		</div>

	</div>
</body>
</html>
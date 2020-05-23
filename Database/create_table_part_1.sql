CREATE TABLE role( -- quản lý hay nhân viên
    id bigint NOT NULL PRIMARY KEY auto_increment,
    name VARCHAR(255) NOT NULL,
    code VARCHAR(255) NOT NULL,
    createddate datetime NULL,
    modifieddate datetime NULL,
    createdby VARCHAR(255) NULL,
    modifiedby VARCHAR(255) NULL
);


CREATE TABLE user( -- tạo bảng người dùng, nó sẽ thông với bảng role qua 1 bảng phụ để biết đc user là nhân viên hay quản lý 
    id bigint NOT NULL PRIMARY KEY auto_increment,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    fullname VARCHAR(255) NULL,
    phone VARCHAR(255) NULL,
    email VARCHAR(255) NULL,
    status int NOT NULL,
    createddate datetime NULL,
    modifieddate datetime NULL,
    createdby VARCHAR(255) NULL,
    modifiedby VARCHAR(255) NULL
);

-- vì là quan hệ n-n nên cần 1 bảng phụ, lấy 2 khóa ngoại là 1 khóa chính của role, 1 khóa chính của user
CREATE TABLE user_role(
	id bigint NOT NULL PRIMARY KEY auto_increment,
	roleid bigint NOT NULL,
    userid bigint NOT NULL,
    createddate datetime NULL,
    modifieddate datetime NULL,
    createdby VARCHAR(255) NULL,
    modifiedby VARCHAR(255) NULL
);

-- user n - n role
ALTER TABLE user_role ADD CONSTRAINT fk_user_role FOREIGN KEY (userid) REFERENCES user(id);
ALTER TABLE user_role ADD CONSTRAINT fk_role_user FOREIGN KEY (roleid) REFERENCES role(id);
CREATE TABLE customer(
    id bigint NOT NULL PRIMARY KEY auto_increment, -- tạo bảng khách hàng
    fullname VARCHAR(255) NULL,
    phone VARCHAR(255) NULL,
    email VARCHAR(255) NULL,
    createddate datetime NULL,
    modifieddate datetime NULL,
    createdby VARCHAR(255) NULL,
    modifiedby VARCHAR(255) NULL
);

CREATE TABLE building( -- tòa nhà, thông tin tòa nhà
    id bigint NOT NULL PRIMARY KEY auto_increment,
    name VARCHAR(255) NOT NULL,
    street VARCHAR(255) NULL, 
	ward VARCHAR(255) NULL,
	district VARCHAR(255) NULL,
    structure VARCHAR(255) NULL, -- kết cấu
    numberofbasement int NULL, -- đánh số
    floorarea int NULL, -- tầng trệt
	direction VARCHAR(255) NULL,
    level VARCHAR(255) NULL,
    rentprice int NOT NULL, -- gía thuê
	rentpricedescription TEXT NULL, -- tiền thuê nhà
	servicefee VARCHAR(255) NULL,
	carfee VARCHAR(255) NULL,
	motofee VARCHAR(255) NULL,
    overtimefee VARCHAR(255) NULL,  -- quá mức
	waterfee VARCHAR(255) NULL,
	electricityfee VARCHAR(255) NULL,
	deposit VARCHAR(255) NULL, -- tiền gửi
	payment VARCHAR(255) NULL, -- thanh toán
	renttime VARCHAR(255) NULL, -- thời gian thuê
	decorationtime VARCHAR(255) NULL, -- trang trí
    brokeragetee DECIMAL(13, 2) NULL, -- ng mô giới
    type VARCHAR(255) NULL,
    note VARCHAR(255) NULL,
    linkofbuilding VARCHAR(255) NULL, -- liên kết xây dựng
    map VARCHAR(255) NULL,
    avatar VARCHAR(255) NULL,
    managername VARCHAR(255) NULL,
    managerphone VARCHAR(255) NULL, 
    createddate datetime NULL,
    modifieddate datetime NULL,
    createdby VARCHAR(255) NULL,
    modifiedby VARCHAR(255) NULL
);
-- building 1 - n rentarea ( diện tích thuê )
CREATE TABLE rentarea(
	id bigint NOT NULL PRIMARY KEY auto_increment,
    value int NULL,
    buildingid bigint NOT NULL,
	createddate datetime NULL,
    modifieddate datetime NULL,
    createdby VARCHAR(255) NULL,
    modifiedby VARCHAR(255) NULL
);
ALTER TABLE rentarea ADD CONSTRAINT rentarea_building FOREIGN KEY (buildingid) REFERENCES building(id);

-- user n - n building
CREATE TABLE assignmentbuilding( -- quản lý tòa nhà
    id bigint NOT NULL PRIMARY KEY auto_increment,
    staffid bigint NOT NULL,
    buildingid bigint NOT NULL,
    createddate datetime NULL,
    modifieddate datetime NULL,
    createdby VARCHAR(255) NULL,
    modifiedby VARCHAR(255) NULL
);

ALTER TABLE assignmentbuilding ADD CONSTRAINT fk_user_building FOREIGN KEY (staffid) REFERENCES user(id);
ALTER TABLE assignmentbuilding ADD CONSTRAINT fk_building_user FOREIGN KEY (buildingid) REFERENCES building(id);


CREATE TABLE transaction( -- loại giao dịch, dẫn đi xem....
	id bigint NOT NULL PRIMARY KEY auto_increment,
	code VARCHAR(255) NULL,
	note VARCHAR(255) NULL,
	customerid bigint NOT NULL,
	createddate datetime NULL,
    modifieddate datetime NULL,
    createdby VARCHAR(255) NULL,
    modifiedby VARCHAR(255) NULL
);

-- customer 1 - n transaction
ALTER TABLE transaction ADD CONSTRAINT fk_customer_transaction FOREIGN KEY (customerid) REFERENCES customer(id);
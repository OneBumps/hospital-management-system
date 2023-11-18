# 数据库名称为 hospital_management_system
# 账号密码都是 root




use hospital_management_system;
-- 创建管理员表
create table management
(
    id          bigint unsigned auto_increment comment '主键'
        primary key,
    name        varchar(255) null comment '病人姓名',
    grade       int          null comment '级别',
    description varchar(255) null comment '级别描述',
    is_open     tinyint      null comment '是否启用 0: 不启用  1: 启用'
) comment '管理员表';
-- 创建医生表
create table doctor
(
    id              bigint unsigned auto_increment comment '主键'
        primary key,
    doctor_number   varchar(255)     null comment '医生编号',
    name            varchar(255)     null comment '医生姓名',
    gender          tinyint          null comment '医生性别 0:男 1:女',
    age             tinyint unsigned null comment '医生年龄',
    phone           varchar(255)     null comment '医生电话',
    employment_date date             null comment '医生入职日期',
    salary          int              null comment '工资',
    notes           varchar(255)     null comment '备注',
    department_id   int              null comment '部门id'
) comment '医生表';
-- 创建部门表
create table department
(
    id              int auto_increment comment 'id'
        primary key,
    department_num  varchar(100) null comment '部门编号',
    department_name varchar(100) null comment '部门名称',
    location        varchar(100) null comment '部门位置',
    phone_number    varchar(15)  null comment '部门电话',
    email           varchar(100) null comment '电子邮箱',
    opening_hours   varchar(50)  null comment '值班时间'
) comment '部门表';
-- 创建医疗器材表
create table instrument
(
    id               varchar(20)  comment '编号' primary key,
    name             varchar(20) comment '仪器名字',
    price            double  comment '仪器价格',
    model            varchar(20) comment '仪器材料',
    year             int comment '使用年限'
) comment '医疗器材表';
-- 创建病人表
create table patient
(
    id          bigint auto_increment
        primary key,
    name        varchar(255) charset utf8 null,
    time        date                      null,
    office      varchar(255) charset utf8 null,
    conditions  varchar(255) charset utf8 null,
    doctor_num  varchar(255) charset utf8 null,
    room        varchar(255) charset utf8 null,
    bed         varchar(255) charset utf8 null,
    doctor_name varchar(255) charset utf8 null
) comment '病人表';
-- 创建message个人信息表
create table message
(
    id        bigint auto_increment
        primary key,
    name      varchar(255) null comment '名字',
    allergic  varchar(255) null comment '过敏史',
    state     varchar(255) null comment '状态',
    age       tinyint      null comment '年龄',
    married   tinyint      null comment '婚姻状况',
    phone_num varchar(255) null comment '手机号',
    sex       tinyint      null comment '性别',
    id_num    varchar(255) null comment '身份证'
) comment '个人信息表';
-- 创建state病人状态表
create table state
(
    id         bigint auto_increment
        primary key,
    now        varchar(255) null comment '目前状态',
    live       varchar(255) null comment '生活方式',
    medication varchar(255) null comment '服药服从性',
    un_effect  tinyint      null comment '不良反应',
    sleep      varchar(255) null comment '睡眠',
    name       varchar(255) null comment '姓名'
) comment '病人状态表';
-- 创建病床表
create table bed
(
    id          int auto_increment
        primary key,
    bed_number  varchar(255) charset utf8 null comment '病床号',
    room_number varchar(255) charset utf8 null comment '房间号',
    bed_state   varchar(255) charset utf8 null comment '病床状态',
    put_date    date                      null comment '操作时间'
) comment '病床表';
-- 创建病房表
create table room
(
    id          int auto_increment
        primary key,
    room_number varchar(255) charset utf8 null comment '病房号',
    room_name   varchar(255) charset utf8 null comment '病房名',
    build_name  varchar(255) charset utf8 null comment '所属大楼',
    floor       varchar(255) charset utf8 null comment '所属楼层',
    room_state  int                       null comment '病房状态',
    notes       varchar(255) charset utf8 null comment '备注',
    put_date    date                      null comment '操作时间'
) comment '病房表';
-- 药品表
CREATE TABLE medicine
(
	id INT PRIMARY KEY AUTO_INCREMENT  COMMENT 'id',
	drug_name VARCHAR(100) NULL COMMENT '药品名称',
	brand VARCHAR(100) NULL COMMENT '品牌',
	prescription ENUM('是', '否') NULL COMMENT '处方药',
	usage_method VARCHAR(255) NULL COMMENT '使用方法',
	drug_date DATE NULL COMMENT '有效日期'
);


-- 数据插入
INSERT INTO `department` (`id`, `department_num`, `department_name`, `location`, `phone_number`, `email`, `opening_hours`) VALUES (1, 'x1', '呼吸科', '5楼', '123456', '33646@qq.com', '15：00-18：00');
INSERT INTO `department` (`id`, `department_num`, `department_name`, `location`, `phone_number`, `email`, `opening_hours`) VALUES (2, 'x2', '外科', '2楼', '234567', '23526@qq.com', '8:00-22:00');
INSERT INTO `department` (`id`, `department_num`, `department_name`, `location`, `phone_number`, `email`, `opening_hours`) VALUES (3, 'x3', '药房', '1楼', '456798', '33646@qq.com', '0：00-24：00');
INSERT INTO `department` (`id`, `department_num`, `department_name`, `location`, `phone_number`, `email`, `opening_hours`) VALUES (4, 'x4', '内科', '1楼', '987654', '3120210971242@dsa', '0:00-24:00');
INSERT INTO `department` (`id`, `department_num`, `department_name`, `location`, `phone_number`, `email`, `opening_hours`) VALUES (30, 'x5', '妇产科', '3楼', '5341935', '336@qq.com', '0：00-24：00');
INSERT INTO `department` (`id`, `department_num`, `department_name`, `location`, `phone_number`, `email`, `opening_hours`) VALUES (31, 'x6', '儿科', '2栋3楼', '12345618', '336462@qq.com', '8：00-23：00');
INSERT INTO `department` (`id`, `department_num`, `department_name`, `location`, `phone_number`, `email`, `opening_hours`) VALUES (32, 'x7', '五官科', '1栋4楼', '6652132', '254135@qq.com', '8：00-21：00');
INSERT INTO `department` (`id`, `department_num`, `department_name`, `location`, `phone_number`, `email`, `opening_hours`) VALUES (33, 'x8', '急诊科', '1栋2楼', '861356', '23523294@qq.com', '0：00-24：00');
INSERT INTO `department` (`id`, `department_num`, `department_name`, `location`, `phone_number`, `email`, `opening_hours`) VALUES (34, 'x9', '麻醉科', '1栋3楼', '1546289', '31202812@qq.com', '12：00-23：00');
INSERT INTO `department` (`id`, `department_num`, `department_name`, `location`, `phone_number`, `email`, `opening_hours`) VALUES (35, 'x10', '中医科', '2栋3楼', '1526423', '65613811@qq.com', '5：30-21：00');
INSERT INTO `department` (`id`, `department_num`, `department_name`, `location`, `phone_number`, `email`, `opening_hours`) VALUES (36, 'x11', '医学影像科', '2栋3楼', '65132451', '319103@qq.com', '6:00-18:00');
INSERT INTO `department` (`id`, `department_num`, `department_name`, `location`, `phone_number`, `email`, `opening_hours`) VALUES (37, 'x12', '皮肤性科', '三栋5楼', '1597133', 'sdfmldi@dsl.com', '6：30-15：00');

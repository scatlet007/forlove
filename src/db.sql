create database db_phoneshop;

user db_phoneshop;

create table t_person(
userid char(32) primary key,
username varchar(50) not null,
password varchar(50) not null,
email varchar(50) not null
);

create table t_brand(
brandid char(32) primary key,
brandname varchar(50) not null,
parentid char(32) null,
constraint brand_brand foreign key(parentid) references t_brand(brandid) on delete cascade
);

create table t_phone(
phoneid char(32) primary key,
phonename varchar(50) not null,
title varchar(100) not null,
price float not null,
brandid char(32) not null,
constraint phone_brand foreign key(brandid) references t_brand(brandid) on delete cascade
);

create table t_screen(
screenid char(32) primary key,
screenType varchar(50) not null,
resolution varchar(100) not null,
size float not null,
PPI varchar(20) not null,
texture varchar(20) not null,
color varchar(20) not null,
phoneid char(32) not null,
constraint screen_phone foreign key(phoneid) references t_phone(phoneid) on delete cascade
);

create table t_internet(
internetid char(32) primary key,
SIM varchar(10) not null,
WLAN varchar(50) not null,
GPS varchar(50) not null,
share varchar(100) not null,
phoneid char(32) not null,
constraint internet_phone foreign key(phoneid) references t_phone(phoneid) on delete cascade
);

create table t_netitem(
netid char(32) primary key,
nettype varchar(50) not null,
support varchar(50) not null,
internetid char(32) not null,
constraint netitem_internet foreign key(internetid) references t_internet(internetid) on delete cascade
);
create table t_DIY(
systemid char(32) primary key,
name varchar(30) null,
core int null,
usertable varchar(30) null,
CPUType varchar(20) not null,
CPUHz varchar(20) not null,
GPUType varchar(20) null,
RAM int not null,
ROM int not null,
isextend int not null,
extend int not null,
phoneid char(32) not null,
constraint DIY_phone foreign key(phoneid) references t_phone(phoneid) on delete cascade
);

create table t_camera(
cameraid char(32) primary key,
type varchar(20) not null,
pre varchar(20) null,
last varchar(20) null,
phoneid char(32) not null,
constraint camera_phone foreign key(phoneid) references t_phone(phoneid) on delete cascade
);

create table t_support(
supportid char(32) primary key,
sound varchar(100) not null,
video varchar(100) not null,
picture varchar(100) not null,
smarty varchar(200) not null,
business varchar(200) not null,
sellingpoint varchar(200) not null,
phoneid char(32) not null,
constraint support_phone foreign key(phoneid) references t_phone(phoneid) on delete cascade
);

create table t_image(
imageid char(32) primary key,
imagename varchar(50) not null,
imgurl varchar(100) not null,
suffix varchar(10) not null,
phoneid char(32) not null,
constraint image_phone foreign key(phoneid) references t_phone(phoneid) on delete cascade
);

create table t_comment(
commentid char(32) primary key,
content varchar(1000) not null,
precomment char(32) null,
userid char(32) not null,
phoneid char(32) not null,
constraint comment_comment foreign key(precomment) references t_comment(commentid) on delete cascade,
constraint comment_person foreign key(userid) references t_person(userid) on delete cascade,
constraint comment_phone foreign key(phoneid) references t_phone(phoneid) on delete cascade
);

create table t_caritem(
caritemid char(32) primary key,
quantity int not null,
phoneid char(32) not null,
userid char(32) not null,
orders int not null,
constraint caritem_phone foreign key(phoneid) references t_phone(phoneid) on delete cascade,
constraint caritem_person foreign key(userid) references t_person(userid) on delete cascade
);

create table t_order(
orderid char(32) primary key,
ordertime char(19) not null,
total float not null,
status varchar(20) not null,
address varchar(1000) not null,
userid char(32) not null,
constraint order_person foreign key(userid) references t_person(userid) on delete cascade
);

create table t_orderitem(
orderitemid char(32) primary key,
quantity int not null,
subtotal float not null,
phoneid char(32) not null,
ptitle varchar(200) not null,
price float not null,
image varchar(100) not null,
orderid varchar(32) not null,
constraint orderitem_phone foreign key(phoneid) references t_phone(phoneid) on delete cascade,
constraint orderitem_order foreign key(orderid) references t_order(orderid) on delete cascade
);

create table t_manager(
adminid char(32) primary key,
adminname varchar(50) not null,
password varchar(50) not null
);

create table t_adminorder(
orderid char(32) primary key,
ordertime char(19) not null,
total float not null,
address varchar(1000) not null,
adminid char(32) not null,
constraint adminoder_manager foreign key(adminid) references t_manager(adminid) on delete cascade
);

create table t_adminorderitem(
orderid char(32) primary key,
quantity int not null,
subtotal float not null,
phoneid char(32) not null,
ptitle varchar(200) not null,
price float not null,
image varchar(100) not null,
adminorderid char(32) not null,
describtion varchar(200) not null,
constraint adminorderitem_phone foreign key(phoneid) references t_phone(phoneid) on delete cascade,
constraint adminorderitem_adminorder foreign key(adminorderid) references t_adminorder(orderid) on delete cascade
);

create table t_collectionTag(
tagid char(32) primary key,
tagname varchar(50) not null,
userid char(32) not null,
constraint collectionTag_person foreign key(userid) references t_person(userid) on delete cascade
);

create table t_collection(
collectionid char(32) primary key,
phoneid char(32) not null,
userid char(32) not null,
tag char(32) null,
constraint collection_phone foreign key(phoneid) references t_phone(phoneid) on delete cascade,
constraint collection_person foreign key(userid) references t_person(userid) on delete cascade,
constraint collection_collectionTag foreign key(tag) references t_collectionTag(tagid) on delete cascade
);




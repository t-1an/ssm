# ssm
简单ssm框架

mysql:

create table user
(
 id int(11) not null auto_increment,
 name varchar(20) not null,
 nickname varchar(20) default null,
 sex char(1) default null,
 birthday datetime default null ,
 primary key(id)
)
engine=innodb auto_increment=2, default charset=utf8;

insert into user value (2,'张三','法外狂魔','男',now());

select * from user;

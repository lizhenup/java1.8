CREATE database java20_20191211;
use java20_20191211;
create table students (
     name varchar(20),
	 gender varchar(3) comment "性别，男、女保密",
	 age int,
	 height double comment "身高，单位是厘米",
	 weight double comment "体重，单位是公斤"
);
孙悟空，今年18岁，性别男，身高1米6，体重30公斤
唐三藏，今年6岁，性别保密，身高70cm，体重30公斤
INSERT INTO students (name, gender, age, height, weight) VALUES
("孙悟空","男",18,160,30),
("唐三藏","保密",6,70,60),
("猪八戒","女",34,185,200),
("观世音菩萨","保密",500,170,50),
("沙悟净","男",50,180,70);
SELECT * FROM students;
UPDATE students SET weight = 100 WHERE name = '猪八戒';
select name, age from students where age = 18;
select name, age from students where age <= 18;
select name, height, weight, (height/weight) 系数 from students where (height/weight) >= 2.1;
SELECT name, age FROM students ORDER BY age DESC LIMIT 1;
SELECT name, age FROM students  LIMIT 1;
SELECT name, age FROM students ORDER BY age DESC LIMIT 2,3;
SELECT name, age FROM students ORDER BY age DESC LIMIT 1 OFFSET 2;
UPDATE students SET gender = "女" WHERE name = '孙悟空';
UPDATE students SET age = age + 1;
delete from students where name = "观世音菩萨";
create table teachers (
     name varchar(20) unique,
	 gender varchar(3) not null default "保密" comment "性别，男、女保密",
	 age int not null default 0,
	 height double not null default 0 comment "身高，单位是厘米",
	 weight double not null  default 0 comment "体重，单位是公斤"
);	
insert into teachers (name) value (null);
insert into teachers (name) value ("lalalala");
create table slavers (
     id int primary key auto_increment,
     name varchar(20) unique,
	 gender varchar(3) not null default "保密" comment "性别，男、女保密",
	 age int not null default 0,
	 height double not null default 0 comment "身高，单位是厘米",
	 weight double not null  default 0 comment "体重，单位是公斤"
);	
insert into slavers (name) value ("lalalala");
insert into slavers (name) value ("lalala");
SELECT * FROM slavers;

create table users (
id int not null primary key AUTO_INCREMENT,
nickname varchar(50) not null,
password varchar(20) not null
);

desc fruitjanissary.users;
SET SQL_SAFE_UPDATES = 0;
insert into fruitjanissary.users (nickname,password) values ("Jelly123","1234");
select * from fruitjanissary.users;
ALTER TABLE users AUTO_INCREMENT = 1;
delete from fruitjanissary.users where nickname = "Jelly123";
update fruitjanissary.users set password="1234" where nickname = "TheLegend27";
select * from fruitjanissary.users where nickname = "TheLegend27" and password = "madamada";

delete from fruitdb.board;

select * from fruitjanissary.players;

create table players (
id int not null primary key AUTO_INCREMENT,
userid int not null,
name varchar(50) not null,
surname varchar(50) not null,
email varchar(50) not null,
birthdate date null default '2000-01-01',
foreign key (userid) references users(id)
);







create table scores (
id int not null primary key AUTO_INCREMENT,
userid int not null,
score int not null,
pDate date not null, #yıl-ay-gün
duration int not null,
foreign key (userid) references users(id)
);




INSERT INTO orders ( userid, timestamp) 
SELECT o.userid , o.timestamp FROM users u INNER JOIN orders o ON  o.userid = u.id;

select u.id,u.nickname,p.email from users u inner join players p on u.id = p.userid;





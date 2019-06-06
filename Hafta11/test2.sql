use fruitdb;
create table player (
id int primary key not null auto_increment,
nickname varchar(50) not null,
password varchar(50) not null,
name varchar(35) not null,
surname varchar(35) not null,
email varchar(50) not null
);
create table board(
id int not null primary key auto_increment,
playerid int not null,
score int not null,
pDate date not null,
duration int not null,
foreign key (playerid) references player(id)
);
select * from player where nickname = nick or email;
select * from fruitdb.player;
insert into player values(null,"Jelly","123456","Göksel","Küçükşahin","a@gmail.com");
select id, nickname, name, surname from fruitdb.player where id = 3;
use fruitdb;
select p.nickname,p.email,b.score,b.pDate,b.duration from fruitdb.board b inner join fruitdb.player p on p.id = b.playerid where p.id= 3 order by b.score desc limit 15; #get score table
select p.nickname, b.score, b.pDate, b.duration from fruitdb.board b inner join fruitdb.player p on p.id = b.playerid order by b.score desc limit 15;
select p.id, p.nickname, b.score, b.pDate, b.duration from fruitdb.board b inner join fruitdb.player p on p.id = b.playerid order by b.score desc limit 15;
select p.nickname, b.duration from fruitdb.board b inner join fruitdb.player p on p.id = b.playerid where p.id = 3;
use fruitjanissary;

select playerid, sum(duration) as total from fruitdb.board where playerid = 3;

select playerid, sum(duration) as total from fruitdb.board where playerid = 6;

select playerid, sum(board.score) as total from fruitdb.board where playerid = 6;

insert into fruitdb.board values(null,6,123456,"2019-05-11",123456);
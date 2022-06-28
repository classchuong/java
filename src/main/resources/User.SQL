create database baithi;
use baithi ;
create table User (
id int primary key auto_increment ,
fullname varchar (200) not null ,
email varchar(200) unique not null ,
password varchar(100) not null ,
role enum ('Employee','Manager') default 'Employee' ,
ProjectId int default 0  ,
ExpInYear tinyint default 0 ,
ProSkill varchar(100)
) ;

insert into User (id, fullname, email, password, ProSkill) values (1, 'Katee McGuigan', 'kmcguigan0@google.it', 'QVJM29', 'Performing Arts');
insert into User (id, fullname, email, password, ProSkill) values (2, 'Rebekah McKee', 'rmckee1@sciencedirect.com', 'w3Z61wUd', 'Zephyr');
insert into User (id, fullname, email, password, ProSkill) values (3, 'Vicki Cripps', 'vcripps2@istockphoto.com', 'LwsC4LupcE', 'Single Family Homes');
insert into User (id, fullname, email, password, ProSkill) values (4, 'Hildegarde Lamasna', 'hlamasna3@merriam-webster.com', 'W3RSQ5Xxx49H', 'Sleep Disorders');
insert into User (id, fullname, email, password, ProSkill) values (5, 'Leesa Hurle', 'lhurle4@opera.com', 'z6qUTxrG', 'Lyricist');
insert into User (id, fullname, email, password, ProSkill) values (6, 'Bartholemy Brake', 'bbrake5@simplemachines.org', 'tD2kGxm1m', 'Nickel');
insert into User (id, fullname, email, password, ProSkill) values (7, 'Trisha Menpes', 'tmenpes6@vkontakte.ru', 'M3SUHh8', 'QA Engineering');
insert into User (id, fullname, email, password, ProSkill) values (8, 'Kris Soane', 'ksoane7@geocities.com', 'G5RgBYprQ0f', 'EBSD');
insert into User (id, fullname, email, password, ProSkill) values (9, 'Fabio Keymar', 'fkeymar8@digg.com', 'c9kJO3', 'TFS');
insert into User (id, fullname, email, password, ProSkill) values (10, 'Adelaide Tombleson', 'atombleson9@bizjournals.com', 'RHN4e5Qxw9O', 'WCF Services');
insert into User (id, fullname, email, password, ProSkill) values (11, 'Cheslie Norquoy', 'cnorquoya@diigo.com', 'czB6B2PNA7', 'IFR');
insert into User (id, fullname, email, password, ProSkill) values (12, 'Cheslie Heyns', 'cheynsb@google.es', 'Dn59VJnjGV', 'PMBOK');
insert into User (id, fullname, email, password, ProSkill) values (13, 'Tobi Simounet', 'tsimounetc@mail.ru', '9gdeYE', 'GS1');
insert into User (id, fullname, email, password, ProSkill) values (14, 'Bail Priver', 'bpriverd@walmart.com', 'bwTyWu0vq', 'Aerodynamics');
insert into User (id, fullname, email, password, ProSkill) values (15, 'Benedikt Shelper', 'bshelpere@sfgate.com', '9y7f3AwB', 'Student Financial Aid');
insert into User (id, fullname, email, password, ProSkill) values (16, 'Zitella Reimer', 'zreimerf@nasa.gov', 'KUsUjgxa4uX', 'Athletics');
insert into User (id, fullname, email, password, ProSkill) values (17, 'Felipa Morland', 'fmorlandg@si.edu', 'rFF10eW5HJ', 'OAT');
update User set role = 'Manager' , ExpInYear = 1 where id = 1;
update User set role = 'Manager' , ExpInYear = 2 where id = 2;
update User set role = 'Manager' , ExpInYear = 4 where id = 3;
update User set role = 'Manager' , ExpInYear = 5 where id = 11;
update User set role = 'Manager' , ExpInYear = 11 where id = 4;
update User set role = 'Manager' , ExpInYear = 12 where id = 5;
update User set role = 'Manager' , ExpInYear = 14 where id = 15;
update User set role = 'Manager' , ExpInYear = 4 where id = 6;
update User set role = 'Manager' , ExpInYear = 5 where id = 7;

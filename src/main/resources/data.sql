insert into Blogger (age,name) VALUES (21, 'Gyula');
insert into Blogger (age,name) VALUES (26, 'Krisz');
insert into STORY (title,content,posted,blogger_id) values ('Teszt cím','Teszt tartalom', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Gyula') );
insert into STORY (title,content,posted,blogger_id) values ('Teszt2 cím','Teszt2 tartalom2', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Gyula') );
insert into STORY (title,content,posted,blogger_id) values ('Krisz cím','Krisz tartalom', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Krisz') );
insert into STORY (title,content,posted,blogger_id) values ('Krisz2 cím','Krisz2 tartalom2', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Krisz') );
insert into STORY (title,content,posted,blogger_id) values ('szia','Szia tartalom2', CURRENT_DATE(), (select id FROM BLOGGER where name = 'Krisz') );
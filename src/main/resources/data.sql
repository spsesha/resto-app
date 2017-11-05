insert into item (name,price,category) values ('chicken','11.90','main');
insert into item (name,price,category) values ('lamb','12.90','main');
insert into item (name,price,category) values ('beef','13.90','main');
insert into item (name,price,category) values ('fish','14.90','main');
insert into item (name,price,category) values ('squid','16.90','main');
insert into item (name,price,category) values ('satay','10.90','Starter');
insert into item (name,price,category) values ('spring rolls','7.50','Starter'); 

insert into customer (first_name,last_name,email_address,address,country,state,phone_number) values ('Shankara','Narayanan','shankaranarayanan.m.s@gmail.com','82 Dixon Street Te Aro Wellington','New Zealand','Wellington','0212616071');

insert into table_info (id,people_count) values (1,5);
insert into table_info (id,people_count) values (2,2);

insert into restaurant (name,address,phone,email_address,active,total_users) values ('papasatay','22 Allen Street','0215657987','papasatay@gmail.com','1','4');

insert into order_info(date) values (now());

insert into order_details(id,table_id,item_id,item_quandity) values (1,1,1,2);




insert into Location(ID, NAME ) values(1, 'Budapest, Hungary');
insert into Location(ID, NAME) values(2, 'Owerri, Nigeria');
insert into Location(ID, NAME) values(3, 'Califonia, USA');

insert into User(ID, FIRST_NAME, LAST_NAME, EMAIL, LOCATION_ID) values(1, 'Kindson', 'Munonye', 'kany@gmail.com', 1);
insert into User(ID, FIRST_NAME, LAST_NAME, EMAIL, LOCATION_ID) values(2, 'Jeffrey', 'Yuba', 'yuba@gmail.com', 2);
insert into User(ID, FIRST_NAME, LAST_NAME, EMAIL, LOCATION_ID) values(3, 'Solace', 'Okeke', 'solace@gmail.com', 3);

insert into Post(ID, POST_DATE, DETAILS, USER_ID) values(1, CURRENT_TIMESTAMP(), 'Very good post', 1);
insert into Post(ID, POST_DATE, DETAILS, USER_ID) values(2, CURRENT_TIMESTAMP(), 'A rainy day', 2);
insert into Post(ID, POST_DATE, DETAILS, USER_ID) values(3, CURRENT_TIMESTAMP(), 'nice tutorials', 3);
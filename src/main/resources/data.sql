insert into Voter(email,phone,birthDate,citizenUS,city,firstName,lastName,gender,streetAddress1,streetAddress2) values ('user1@google.com', '11111111','01/01/2000',true,'DaLian','Jordan','Michael','male', 'address1','address2');
insert into Voter(email,phone,birthDate,citizenUS,city,firstName,lastName,gender,streetAddress1,streetAddress2) values ('user2@google.com', '11111111','02/02/2000',true,'DaLian','Iverson','Allen','male', 'address1','address2');
insert into Voter(email,phone,birthDate,citizenUS,city,firstName,lastName,gender,streetAddress1,streetAddress2) values ('user3@google.com', '33333333','03/03/2000',true,'DaLian','Kobe','Bryant','male', 'address1','address2');

insert into Authentication(email, password) values ('Jordan@google.com', '11111111');
insert into Authentication(email, password) values ('Iverson@google.com', '22222222');
insert into Authentication(email, password) values ('Kobe@google.com', '33333333');

insert into Achievement(email, achievementName, unlock, unlockDate) values ('Jordan@google.com', 'Login First Time', 'Y', '02/12/2001');
insert into Achievement(email, achievementName, unlock, unlockDate) values ('Jordan@google.com', 'Register First Time', 'Y', '03/12/2001');
insert into Achievement(email, achievementName, unlock, unlockDate) values ('Jordan@google.com', 'Vote First Time', 'Y', '03/12/2001');
insert into Achievement(email, achievementName, unlock, unlockDate) values ('Jordan@google.com', 'Vote For 3 Years', 'Y', '03/12/2010');
insert into Achievement(email, achievementName, unlock, unlockDate) values ('Iverson@google.com', 'Login First Time', 'Y', '02/01/2001');
insert into Achievement(email, achievementName, unlock, unlockDate) values ('Iverson@google.com', 'Register First Time', 'Y', '03/12/2004');
insert into Achievement(email, achievementName, unlock, unlockDate) values ('Kobe@google.com', 'Login First Time', 'Y', '02/12/2001');
insert into Achievement(email, achievementName, unlock, unlockDate) values ('Kobe@google.com', 'Register First Time', 'Y', '03/12/2001');
insert into Achievement(email, achievementName, unlock, unlockDate) values ('Kobe@google.com', 'Vote First Time', 'Y', '06/07/2005');
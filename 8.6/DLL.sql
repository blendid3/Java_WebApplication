create table Customers
(
   id                  varchar(20) primary key,
   name                 varchar(50) not null,
   password             varchar(20) not null,
   address              varchar(100),
   phone                varchar(20),
   birthday             bigint
);

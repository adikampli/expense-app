create table order_items (order_id integer not null, product_id integer not null) engine=MyISAM
create table orders (order_id integer not null auto_increment, order_date date, total float, store_id integer, primary key (order_id)) engine=MyISAM
create table product (product_id integer not null auto_increment, name varchar(255), price float, store_store_id integer, primary key (product_id)) engine=MyISAM
create table store (store_id integer not null auto_increment, name varchar(255), primary key (store_id)) engine=MyISAM
alter table order_items add constraint UK_3fea23hxar30bx7m7h8ed25n9 unique (product_id)
alter table order_items add constraint FKlf6f9q956mt144wiv6p1yko16 foreign key (product_id) references product (product_id)
alter table order_items add constraint FKbioxgbv59vetrxe0ejfubep1w foreign key (order_id) references orders (order_id)
alter table orders add constraint FK5n14sr4mswfdtaoiwj7rkt0mw foreign key (store_id) references store (store_id)
alter table product add constraint FKsk5k5c76o146li987tqt3esbw foreign key (store_store_id) references store (store_id)

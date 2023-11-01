CREATE DATABASE chicken_store_application;
USE chicken_store_application;


INSERT INTO roles(name, description)
VALUES ('ROLE_MANAGER', 'Quản lý'),
       ('ROLE_SALE', 'Nhân viên kinh doanh'),
       ('ROLE_HR', 'Nhân viên nhân sự'),
       ('ROLE_WAREHOUSE', 'Nhân viên thủ kho');


INSERT INTO users(activated, address, avatar, email, fullname, password, phone, username, role_id)
VALUES (true, 'sai gon', 'logo-admin.png', 'admin@gmail.com', 'ADMIN', '$2a$10$mI9cSwiHFXTnYqFpC8xgrOP8VTIela7tAUzvblDUVW1/oNYqT.0wO', '0123456789', 'admin', 1);

INSERT INTO users(activated, address, avatar, email, fullname, password, phone, username, role_id)
VALUES (true, 'sai gon', '112275.jpg', 'user1@gmail.com', 'user1', '$2a$10$mI9cSwiHFXTnYqFpC8xgrOP8VTIela7tAUzvblDUVW1/oNYqT.0wO', '0123456768', 'user1', 2);

INSERT INTO users(activated, address, avatar, email, fullname, password, phone, username, role_id)
VALUES (true, 'sai gon', 'anime-avatar-chibi-cute_031456807.jpg', 'user2@gmail.com', 'user2', '$2a$10$mI9cSwiHFXTnYqFpC8xgrOP8VTIela7tAUzvblDUVW1/oNYqT.0wO', '0123456789', 'user2', 3);

INSERT INTO users(activated, address, avatar, email, fullname, password, phone, username, role_id)
VALUES (true, 'sai gon', 'avatar-cute-meo-con-than-chet-700x695.jpg', 'user3@gmail.com', 'user3', '$2a$10$mI9cSwiHFXTnYqFpC8xgrOP8VTIela7tAUzvblDUVW1/oNYqT.0wO', '0123456789', 'user3', 4);



INSERT INTO categories(activated, name)
VALUES (true, 'Gà 45kg'),
       (true, 'Gà 50kg '),
       (true, 'Gà mới xổ lồng'),
       (true, 'Gà già dai');


INSERT INTO products(activated, avatar, description, name, price, quantity, category_id)
VALUES (true, 'panda01.jpg', 'Gà', 'Gà', 150000, 10, 1),
       (true, 'panda01.jpg', 'Gà', 'Gà', 150000, 10, 1),
       (true, 'panda01.jpg', 'Gà', 'Gà', 150000, 10, 1),
       (true, 'panda01.jpg', 'Gà', 'Gà', 150000, 10, 1),
       (true, 'panda01.jpg', 'Gà', 'Gà', 150000, 10, 1),
       (true, 'panda01.jpg', 'Gà', 'Gà', 150000, 10, 1),
       (true, 'panda01.jpg', 'Gà', 'Gà', 150000, 10, 1),
       (true, 'panda01.jpg', 'Gà', 'Gà', 150000, 10, 1)
;


INSERT INTO products(activated, avatar, description, name, price, quantity, category_id)
VALUES (true, 'panda02.jpg', 'Gà', 'Gà', 340000, 22, 2),
       (true, 'panda02.jpg', 'Gà', 'Gà', 340000, 22, 2),
       (true, 'panda02.jpg', 'Gà', 'Gà', 340000, 22, 2),
       (true, 'panda02.jpg', 'Gà', 'Gà', 340000, 22, 2),
       (true, 'panda02.jpg', 'Gà', 'Gà', 340000, 22, 2),
       (true, 'panda02.jpg', 'Gà', 'Gà', 340000, 22, 2),
       (true, 'panda02.jpg', 'Gà', 'Gà', 340000, 22, 2)
;


INSERT INTO products(activated, avatar, description, name, price, quantity, category_id)
VALUES (true, 'panda03.jpg', 'Gà', 'Gà', 35000, 12, 3),
       (true, 'panda03.jpg', 'Gà', 'Gà', 35000, 12, 3),
       (true, 'panda03.jpg', 'Gà', 'Gà', 35000, 12, 3),
       (true, 'panda03.jpg', 'Gà', 'Gà', 35000, 12, 3),
       (true, 'panda03.jpg', 'Gà', 'Gà', 35000, 12, 3),
       (true, 'panda03.jpg', 'Gà', 'Gà', 35000, 12, 3),
       (true, 'panda03.jpg', 'Gà', 'Gà', 35000, 12, 3)
;


INSERT INTO products(activated, avatar, description, name, price, quantity, category_id)
VALUES (true, 'panda04.jpg', 'Gà', 'Gà', 100000, 4, 4),
       (true, 'panda04.jpg', 'Gà', 'Gà', 100000, 4, 4),
       (true, 'panda04.jpg', 'Gà', 'Gà', 100000, 4, 4),
       (true, 'panda04.jpg', 'Gà', 'Gà', 100000, 4, 4),
       (true, 'panda04.jpg', 'Gà', 'Gà', 100000, 4, 4),
       (true, 'panda04.jpg', 'Gà', 'Gà', 100000, 4, 4),
       (true, 'panda04.jpg', 'Gà', 'Gà', 100000, 4, 4)
;

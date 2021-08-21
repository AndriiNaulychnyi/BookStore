--DROP TABLE users;
--DROP TABLE books;

CREATE TABLE IF NOT EXISTS users (
    id int NOT NULL,
    user_name varchar (100),
    surname varchar (100),
    email varchar (100),
    basket  varchar (255)
);

CREATE TABLE IF NOT EXISTS books (
    id int NOT NULL,
    book_name varchar (100),
    year_of_publication int,
    price int
);
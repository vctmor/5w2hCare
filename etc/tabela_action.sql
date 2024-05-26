CREATE DATABASE db5w2h;
USE db5w2h;

create table action (
	ri int primary key auto_increment,    
    nameAction VARCHAR(100) NOT NULL,
    urgency INT NOT NULL,
    who VARCHAR(100) NOT NULL,
    how TEXT,
    justification TEXT,
    budget DOUBLE,
    start DATE,
    end DATE,
    status INT,
    description TEXT,
    whereAction TEXT
);
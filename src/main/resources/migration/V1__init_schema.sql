create table if not exists employee
(
    emp_id int auto_increment
    primary key,
    emp_name varchar(255) null,
    salary double null,
    dept_name varchar(255) null
    );
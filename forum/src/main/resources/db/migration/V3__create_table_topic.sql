create table topic (
    id bigint not null primary key,
    title varchar(50),
    message varchar(100) not null,
    created_at datetime not null,
    course_id bigint not null,
    author_id bigint not null,
    foreign key (course_id) references course(id),
    foreign key (author_id) references author(id)
);

insert into topic values (1, 'Duvida na configuração do Projeto', 'Como resolvo isso?', '2023-03-07', 1, 1);
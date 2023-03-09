create table answer(
    id bigint not null primary key,
    mensagem varchar(300) not null,
    data_criacao datetime not null,
    topic_id bigint not null,
    author_id bigint not null,
    solucao boolean not null,
    foreign key(topic_id) references topic(id),
    foreign key(author_id) references author(id)
);
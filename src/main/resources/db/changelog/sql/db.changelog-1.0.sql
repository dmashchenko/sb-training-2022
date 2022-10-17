--liquibase formatted sql

--changeset dmashchenko:init


create table conference
(
    id                serial primary key,
    name              varchar(255) not null unique,
    category          varchar(255) not null,
    date              timestamp    not null,
    participant_count int          not null
);

create type talk_type as enum ('talk', 'masterclass', 'workshop');

create table talk
(
    id            serial primary key,
    name          varchar(255) not null unique,
    description   varchar(255) not null,
    speaker_name  varchar(255) not null,
    type          talk_type    not null,
    conference_id int          not null,
    constraint talk_conference_fk foreign key (conference_id) references conference (id)
);


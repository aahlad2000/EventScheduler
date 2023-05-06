create table if not exists `event` (
    event_id        bigint          primary key,
    event_name      varchar(255)    not null,
    event_status    varchar(255)    not null,
    created_on      timestamp       not null,
    scheduled_time  timestamp       not null
)
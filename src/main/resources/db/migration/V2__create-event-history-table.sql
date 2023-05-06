create table if not exists `event_history` (
    record_id       bigint          primary key,
    event_id        bigint          not null,
    event_name      varchar(255)    not null,
    event_status    varchar(255)    not null,
    created_on      timestamp       not null,
    scheduled_time  timestamp       not null,
    recorded_time   timestamp       not null,
    message         varchar(600)    not null
)
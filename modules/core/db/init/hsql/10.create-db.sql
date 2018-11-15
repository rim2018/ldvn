-- begin LDVN_DZ
create table LDVN_DZ (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    CLIENT integer not null,
    --
    SENDER varchar(255),
    --
    primary key (ID)
)^
-- end LDVN_DZ
-- begin LDVN_UB
create table LDVN_UB (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    CLIENT integer not null,
    --
    NUMMER integer not null,
    BETRAG decimal(19, 2),
    --
    primary key (ID)
)^
-- end LDVN_UB

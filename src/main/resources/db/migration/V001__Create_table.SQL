CREATE TABLE IF NOT EXISTS users
(
    id         BIGINT PRIMARY KEY,
    username   VARCHAR(50) UNIQUE  NOT NULL,
    email      VARCHAR(100) UNIQUE NOT NULL,
    password   VARCHAR(255)        NOT NULL,
    full_name  VARCHAR(100),
    phone      VARCHAR(20),
    city       VARCHAR(100),
    gender     VARCHAR(1),
    age        INTEGER,
    created_at TIMESTAMP DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS trips
(
    id              BIGINT PRIMARY KEY,
    driver_id       BIGINT       NOT NULL REFERENCES users (id) ON DELETE CASCADE,
    origin          VARCHAR(150) NOT NULL,
    destination     VARCHAR(150) NOT NULL,
    departure_date  DATE         NOT NULL,
    available_seats INTEGER      NOT NULL CHECK (available_seats >= 0),
    price           DECIMAL(8, 2),
    description     TEXT,
    acc_status      INTEGER,
    created_at      TIMESTAMP DEFAULT NOW()
);

CREATE TABLE trip_requests
(
    id           BIGINT PRIMARY KEY,
    trip_id      BIGINT      NOT NULL REFERENCES trips (id) ON DELETE CASCADE,
    passenger_id BIGINT      NOT NULL REFERENCES users (id) ON DELETE CASCADE,
    status       VARCHAR(20) NOT NULL DEFAULT 'pending', -- pending, accepted, rejected
    requested_at TIMESTAMP            DEFAULT NOW()
);

CREATE TABLE messages
(
    id           BIGINT PRIMARY KEY,
    trip_id      BIGINT NOT NULL REFERENCES trips (id) ON DELETE CASCADE,
    sender_id    BIGINT NOT NULL REFERENCES users (id) ON DELETE CASCADE,
    recipient_id BIGINT NOT NULL REFERENCES users (id) ON DELETE CASCADE,
    chat_id      BIGINT NOT NULL,
    message      TEXT   NOT NULL,
    sent_at      TIMESTAMP DEFAULT NOW()
);

CREATE TABLE reviews
(
    id               BIGINT PRIMARY KEY,
    reviewed_user_id BIGINT   NOT NULL REFERENCES users (id) ON DELETE CASCADE,
    reviewer_id      BIGINT   NOT NULL REFERENCES users (id) ON DELETE CASCADE,
    rating           SMALLINT NOT NULL CHECK (rating >= 1 AND rating <= 5),
    comment          TEXT,
    created_at       TIMESTAMP DEFAULT NOW()
);
create sequence "users_seq"
    maxvalue 99999999;
create sequence "trips_seq"
    maxvalue 99999999;
create sequence "trip_requests_seq"
    maxvalue 99999999;
create sequence "messages_seq"
    maxvalue 999999999;
create sequence "reviews_seq"
    maxvalue 99999999;

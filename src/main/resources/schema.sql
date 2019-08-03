create table user_info(
                                username varchar(25),
                                password varchar(25),
                                role varchar(5),
                                PRIMARY KEY (username));
create table theater(
                    theater_id serial,
                    theatre_name varchar(255),
                    PRIMARY KEY (theater_id));
create table movie(
                    movie_id serial,
                    movie_name varchar(255),
                    PRIMARY KEY (movie_id));
create table show_timings(
                    show_id serial,
                    movie_id number,
                    theater_id number,
                    tickets_available number,
                    show_time DATETIME,
                    PRIMARY KEY (show_id),
                    FOREIGN KEY (movie_id) REFERENCES movie(movie_id),
                    FOREIGN KEY (theater_id) REFERENCES theater(theater_id));

create table bookings(
                    booking_no serial,
                    username varchar(25),
                    no_of_tickets number,
                    show_id number,
                    PRIMARY KEY (booking_no),
                    FOREIGN KEY (show_id) REFERENCES show_timings(show_id),
                    FOREIGN KEY (username) REFERENCES user_info(username));










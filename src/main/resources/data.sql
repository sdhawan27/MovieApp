
insert into theater(theater_id,theatre_name) values (1,'Theater1');

insert into movie(movie_id,movie_name) values (1, 'movie');

insert into show_timings(show_id,movie_id,theater_id,tickets_available,show_time) values (1, 1, 1, 90, '2019-08-31 9:00:00' );

insert into bookings(booking_no,username,no_of_tickets,show_id) values (1,'user', 5, 1 );
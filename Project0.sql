CREATE TABLE platform(
id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
publisher_id varchar NOT NULL UNIQUE,
release_year varchar NOT NULL,
platform_name varchar NOT NULL UNIQUE
);


DROP TABLE platform;



INSERT INTO platform (publisher_id, release_year, platform_name)
VALUES ('01007F40132', '2022', 'Mobile');

SELECT *
FROM platform;



CREATE TABLE publishing(
id uuid DEFAULT gen_random_uuid(),
game_id int NOT NULL UNIQUE,
publisher_id varchar NOT NULL
);
DROP TABLE publishing;

ALTER TABLE publishing 
RENAME COLUMN publisher_id TO game_publisher_id;

INSERT INTO publishing (game_id, game_publisher_id)
VALUES ('215', '01007F40132' );

DELETE FROM publishing 
WHERE game_id = '21559';

SELECT *
FROM publishing;

CREATE TABLE game(
id uuid PRIMARY KEY DEFAULT gen_random_uuid(), 
genre_id varchar NOT NULL UNIQUE,
game_name varchar NOT NULL UNIQUE
);

INSERT INTO game (genre_id, game_name)
VALUES ('STY1533', 'Dodgers Mania!');

SELECT *
FROM game;

CREATE TABLE genre(
id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
genre_name varchar NOT NULL
);



INSERT INTO genre(genre_name)
VALUES ('Strategy/Trivia');

SELECT *
FROM genre;

SAVEPOINT;


SELECT *
FROM platform p
INNER JOIN publishing pu 
ON p.publisher_id = pu.game_publisher_id






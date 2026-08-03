-- 1. The first example shows the goal scored by a player with the last name 'Bender'.
-- Modify it to show the matchid and player name for all goals scored by Germany.
-- Lọc các bàn thắng của đội Đức (teamid = 'GER')
USE euro2012;

SELECT g.matchid, g.player
FROM goal AS g
WHERE g.teamid = 'GER';

-- 2. From the previous query you can see that Lars Bender scored in game 1012.
-- Show id, stadium, team1, team2 for just game 1012.
-- Lấy thông tin trận đấu có id = 1012

SELECT gm.id, gm.stadium, gm.team1, gm.team2
FROM game AS gm
JOIN goal AS gl ON gm.id = gl.matchid
WHERE gm.id = 1012;

-- 3. Combine the two tables using JOIN.
-- Show player, teamid, stadium and mdate for every German goal.
-- Nối bảng game + goal để lấy đủ thông tin

SELECT gl.player, gl.teamid, gm.stadium, gm.mdate
FROM goal gl
JOIN game gm ON gm.id = gl.matchid
WHERE gl.teamid = 'GER';

-- 4. Show the team1, team2 and player for every goal scored by player named 'Mario%'
-- Lọc tên cầu thủ bắt đầu bằng Mario

SELECT gm.team1, gm.team2, gl.player
FROM game gm
JOIN goal gl ON gm.id = gl.matchid
WHERE gl.player LIKE 'Mario%';

-- 5. Join goal with eteam.
-- Show player, teamid, coach, gtime for goals scored in first 10 minutes.
-- gtime <= 10

SELECT gl.player, gl.teamid, et.coach, gl.gtime
FROM goal gl
JOIN eteam et ON gl.teamid = et.id
WHERE gl.gtime <= 10;

-- 6. List match dates and team name where 'Fernando Santos' was coach of team1.
-- JOIN game với eteam qua team1

SELECT gm.mdate, et.teamname
FROM game gm
JOIN eteam et ON gm.team1 = et.id
WHERE et.coach = 'Fernando Santos';

-- 7. List player for every goal scored in stadium 'National Stadium, Warsaw'
-- lọc theo stadium

SELECT gl.player
FROM goal gl
JOIN game gm ON gm.id = gl.matchid
WHERE gm.stadium = 'National Stadium, Warsaw';

-- 8. Show players who scored against Germany
-- trận có GER nhưng người ghi bàn không phải GER

SELECT DISTINCT gl.player
FROM goal gl
JOIN game gm ON gm.id = gl.matchid
WHERE (gm.team1 = 'GER' OR gm.team2 = 'GER')
AND gl.teamid <> 'GER';


-- 9. Show teamname and total number of goals scored
-- GROUP BY để đếm số bàn

SELECT et.teamname, COUNT(*) AS total_goals
FROM eteam et
JOIN goal gl ON et.id = gl.teamid
GROUP BY et.teamname;

-- 10. Show stadium and number of goals in each stadium
-- đếm theo sân

SELECT gm.stadium, COUNT(*) AS number_of_goals
FROM game gm
JOIN goal gl ON gm.id = gl.matchid
GROUP BY gm.stadium;

-- 11. For every match involving 'POL', show matchid, date and total goals
-- lọc trận có POL

SELECT gm.id, gm.mdate, COUNT(*) AS total_goals
FROM game gm
JOIN goal gl ON gm.id = gl.matchid
WHERE gm.team1 = 'POL' OR gm.team2 = 'POL'
GROUP BY gm.id, gm.mdate;

-- 12. For every match where 'GER' scored, show matchid, date and goals scored
-- chỉ đếm bàn của GER

SELECT gm.id, gm.mdate, COUNT(*) AS goals_by_ger
FROM game gm
JOIN goal gl ON gm.id = gl.matchid
WHERE gl.teamid = 'GER'
GROUP BY gm.id, gm.mdate;

-- 13. Show match result with goals scored by each team
-- dùng CASE WHEN để tính tỷ số

SELECT 
  gm.mdate,
  gm.team1,
  SUM(CASE WHEN gl.teamid = gm.team1 THEN 1 ELSE 0 END) AS score1,
  gm.team2,
  SUM(CASE WHEN gl.teamid = gm.team2 THEN 1 ELSE 0 END) AS score2
FROM game gm
LEFT JOIN goal gl ON gm.id = gl.matchid
GROUP BY gm.id, gm.mdate, gm.team1, gm.team2;

-- ================= QUIZ =================

-- 1. Find the stadium where player 'Dimitris Salpingidis' scored
-- JOIN game + goal

SELECT gm.stadium
FROM game gm
JOIN goal gl ON gm.id = gl.matchid
WHERE gl.player = 'Dimitris Salpingidis';


-- 2. Columns usable after JOIN goal + eteam
-- matchid, teamid, player, gtime, id, teamname, coach


-- 3. Show players, their team and goals scored against Greece (GRE)
-- đối đầu GRE nhưng không phải GRE

SELECT gl.player, gl.teamid, COUNT(*) AS goals
FROM goal gl
JOIN game gm ON gm.id = gl.matchid
WHERE (gm.team1 = 'GRE' OR gm.team2 = 'GRE')
AND gl.teamid <> 'GRE'
GROUP BY gl.player, gl.teamid;

-- 4. Result of DISTINCT
-- loại bỏ trùng lặp

SELECT DISTINCT gl.teamid, gm.mdate
FROM goal gl
JOIN game gm ON gm.id = gl.matchid
WHERE gm.mdate = '9 June 2012';

-- 5. Players scored against POL in National Stadium, Warsaw

SELECT DISTINCT gl.player, gl.teamid
FROM goal gl
JOIN game gm ON gm.id = gl.matchid
WHERE gm.stadium = 'National Stadium, Warsaw'
AND (gm.team1 = 'POL' OR gm.team2 = 'POL')
AND gl.teamid <> 'POL';

-- 6. Players in Wroclaw but not against Italy

SELECT gl.player, gl.teamid, gl.gtime
FROM goal gl
JOIN game gm ON gm.id = gl.matchid
WHERE gm.stadium = 'Stadion Miejski (Wroclaw)'
AND (
    (gl.teamid = gm.team1 AND gm.team2 <> 'ITA')
    OR
    (gl.teamid = gm.team2 AND gm.team1 <> 'ITA')
);


-- 7. Teams with total goals < 3

SELECT et.teamname, COUNT(*) AS total_goals
FROM eteam et
JOIN goal gl ON et.id = gl.teamid
GROUP BY et.teamname
HAVING COUNT(*) < 3;
select player_id,min(to_char(event_date,'YYYY-MM-DD'))as first_login from Activity group by player_id order by player_id;

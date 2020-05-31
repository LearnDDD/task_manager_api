USE task_manager;
CREATE TABLE IF NOT EXISTS task (
  id int(10) AUTO_INCREMENT NOT NULL,
  title varchar(64) NOT NULL,
  details varchar(256),
  task_type_id int(10),
  parent_task_id int(10),
  PRIMARY KEY (id)
);
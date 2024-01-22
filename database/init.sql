SET CHARACTER SET utf8mb4;
CREATE TABLE books (
    id BIGINT PRIMARY KEY NOT NULL COMMENT 'ID',
    name VARCHAR(50) COMMENT '名称',
    type VARCHAR(50) COMMENT 'タイプ'
  ) COMMENT = '本';
INSERT INTO books (id, name, type) VALUES (1, 'Java入門', 'IT');

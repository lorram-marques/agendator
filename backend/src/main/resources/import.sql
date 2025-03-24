INSERT INTO tb_user (number, email, password) VALUES (1, 'username', '$2a$12$Pc4R2iK8qHSzvRn3ljcH/OG1y23.U/AUOTTIgc66ueSvk664ErCNm');

INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('placeholder');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
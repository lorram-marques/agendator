INSERT INTO tb_user (number, email, password) VALUES (1, 'username', '$2a$12$M3qMhTXZhY6L3pUeRdY5SujIQxym1fKQ0B8STBjysvPyoK.YNBS3a');

INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
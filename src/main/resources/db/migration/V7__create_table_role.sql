CREATE TABLE role
(
    `id`   BIGINT      NOT NULL AUTO_INCREMENT,
    `nome` VARCHAR(50) NOT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `role`(`id`, `nome`)
values (1, 'LEITURA_ESCRITA');
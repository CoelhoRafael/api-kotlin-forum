CREATE TABLE usuario_role
(
    `id`         BIGINT NOT NULL AUTO_INCREMENT,
    `usuario_id` BIGINT NOT NULL,
    `role_id`    BIGINT NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`usuario_id`) references `usuario` (`id`),
    FOREIGN KEY (`role_id`) references `role` (`id`)
);

INSERT INTO usuario_role(`id`, `usuario_id`, `role_id`)
VALUES(1, 1, 1)
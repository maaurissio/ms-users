
-- ROLES

INSERT INTO roles (id, nombre, descripcion, activo, creadoEn, actualizadoEn) VALUES
(gen_random_uuid(), 'ADMIN', 'Administrador del sistema', true, now(), now()),
(gen_random_uuid(), 'CLIENTE', 'Cliente del sistema', true, now(), now()),
(gen_random_uuid(), 'VENDEDOR', 'Encargado de ventas', true, now(), now()),
(gen_random_uuid(), 'SOPORTE', 'Soporte técnico', true, now(), now()),
(gen_random_uuid(), 'GERENTE', 'Gerente general', true, now(), now()),
(gen_random_uuid(), 'LOGISTICA', 'Área logística', true, now(), now()),
(gen_random_uuid(), 'RRHH', 'Recursos humanos', true, now(), now()),
(gen_random_uuid(), 'CONTABILIDAD', 'Finanzas', true, now(), now()),
(gen_random_uuid(), 'OPERADOR', 'Operador sistema', true, now(), now()),
(gen_random_uuid(), 'SUPERVISOR', 'Supervisor', true, now(), now());

-- USUARIOS

INSERT INTO usuarios (id, rut, dv, nombre, apellido, email, passwordHash, estado, creadoEn, actualizadoEn) VALUES
(gen_random_uuid(), '11111111', '1', 'Juan', 'Perez', 'juan@test.cl', '123', 'ACTIVO', now(), now()),
(gen_random_uuid(), '22222222', '2', 'Maria', 'Lopez', 'maria@test.cl', '123', 'ACTIVO', now(), now()),
(gen_random_uuid(), '33333333', '3', 'Pedro', 'Gomez', 'pedro@test.cl', '123', 'ACTIVO', now(), now()),
(gen_random_uuid(), '44444444', '4', 'Ana', 'Torres', 'ana@test.cl', '123', 'ACTIVO', now(), now()),
(gen_random_uuid(), '55555555', '5', 'Luis', 'Diaz', 'luis@test.cl', '123', 'ACTIVO', now(), now()),
(gen_random_uuid(), '66666666', '6', 'Carla', 'Rojas', 'carla@test.cl', '123', 'ACTIVO', now(), now()),
(gen_random_uuid(), '77777777', '7', 'Diego', 'Morales', 'diego@test.cl', '123', 'ACTIVO', now(), now()),
(gen_random_uuid(), '88888888', '8', 'Sofia', 'Vargas', 'sofia@test.cl', '123', 'ACTIVO', now(), now()),
(gen_random_uuid(), '99999999', '9', 'Pablo', 'Reyes', 'pablo@test.cl', '123', 'ACTIVO', now(), now()),
(gen_random_uuid(), '10101010', 'K', 'Lucia', 'Mendez', 'lucia@test.cl', '123', 'ACTIVO', now(), now());

-- SUCURSALES

INSERT INTO sucursales (id, nombre, direccion, activo, creadoEn, actualizadoEn) VALUES
(gen_random_uuid(), 'Sucursal Norte', 'Av Norte 123', true, now(), now()),
(gen_random_uuid(), 'Sucursal Sur', 'Av Sur 456', true, now(), now()),
(gen_random_uuid(), 'Sucursal Este', 'Av Este 789', true, now(), now()),
(gen_random_uuid(), 'Sucursal Oeste', 'Av Oeste 321', true, now(), now()),
(gen_random_uuid(), 'Sucursal Centro', 'Av Centro 654', true, now(), now()),
(gen_random_uuid(), 'Sucursal Maipu', 'Av Maipu 111', true, now(), now()),
(gen_random_uuid(), 'Sucursal Puente Alto', 'Av PA 222', true, now(), now()),
(gen_random_uuid(), 'Sucursal La Florida', 'Av LF 333', true, now(), now()),
(gen_random_uuid(), 'Sucursal Ñuñoa', 'Av Ñuñoa 444', true, now(), now()),
(gen_random_uuid(), 'Sucursal Providencia', 'Av Prov 555', true, now(), now());

-- USUARIO_ROLES (relaciones)

INSERT INTO usuario_roles (id, usuario_id, rol_id, asignadoEn, activo)
SELECT gen_random_uuid(), u.id, r.id, now(), true
FROM usuarios u, roles r
LIMIT 10;

-- USUARIO_SUCURSALES (relaciones)

INSERT INTO usuario_sucursales (id, usuario_id, sucursal_id, asignadoEn, activo)
SELECT gen_random_uuid(), u.id, s.id, now(), true
FROM usuarios u, sucursales s
LIMIT 10;
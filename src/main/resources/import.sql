-- Insertar Regiones (Chile)
INSERT INTO Region (id, nombre) VALUES (1, 'Arica y Parinacota');
INSERT INTO Region (id, nombre) VALUES (2, 'Tarapacá');
INSERT INTO Region (id, nombre) VALUES (3, 'Antofagasta');
INSERT INTO Region (id, nombre) VALUES (4, 'Atacama');
INSERT INTO Region (id, nombre) VALUES (5, 'Coquimbo');
INSERT INTO Region (id, nombre) VALUES (6, 'Valparaíso');
INSERT INTO Region (id, nombre) VALUES (7, 'Metropolitana de Santiago');
INSERT INTO Region (id, nombre) VALUES (8, 'Libertador General Bernardo O''Higgins');
INSERT INTO Region (id, nombre) VALUES (9, 'Maule');
INSERT INTO Region (id, nombre) VALUES (10, 'Ñuble');
INSERT INTO Region (id, nombre) VALUES (11, 'Biobío');
INSERT INTO Region (id, nombre) VALUES (12, 'La Araucanía');
INSERT INTO Region (id, nombre) VALUES (13, 'Los Ríos');
INSERT INTO Region (id, nombre) VALUES (14, 'Los Lagos');
INSERT INTO Region (id, nombre) VALUES (15, 'Aysén del General Carlos Ibáñez del Campo');
INSERT INTO Region (id, nombre) VALUES (16, 'Magallanes y de la Antártica Chilena');

-- Insertar Ciudades/Comunas por Región
-- Región 1: Arica y Parinacota
INSERT INTO Ciudad (id, nombre, region_id) VALUES (1, 'Arica', 1);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (2, 'Camarones', 1);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (3, 'Putre', 1);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (4, 'General Lagos', 1);

-- Región 2: Tarapacá
INSERT INTO Ciudad (id, nombre, region_id) VALUES (5, 'Iquique', 2);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (6, 'Alto Hospicio', 2);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (7, 'Pozo Almonte', 2);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (8, 'Camiña', 2);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (9, 'Colchane', 2);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (10, 'Huara', 2);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (11, 'Pica', 2);

-- Región 3: Antofagasta
INSERT INTO Ciudad (id, nombre, region_id) VALUES (12, 'Antofagasta', 3);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (13, 'Mejillones', 3);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (14, 'Sierra Gorda', 3);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (15, 'Taltal', 3);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (16, 'Calama', 3);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (17, 'Ollagüe', 3);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (18, 'San Pedro de Atacama', 3);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (19, 'Tocopilla', 3);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (20, 'María Elena', 3);

-- Región 4: Atacama
INSERT INTO Ciudad (id, nombre, region_id) VALUES (21, 'Copiapó', 4);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (22, 'Caldera', 4);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (23, 'Tierra Amarilla', 4);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (24, 'Chañaral', 4);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (25, 'Diego de Almagro', 4);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (26, 'Vallenar', 4);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (27, 'Alto del Carmen', 4);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (28, 'Freirina', 4);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (29, 'Huasco', 4);

-- Región 5: Coquimbo
INSERT INTO Ciudad (id, nombre, region_id) VALUES (30, 'La Serena', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (31, 'Coquimbo', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (32, 'Andacollo', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (33, 'La Higuera', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (34, 'Paihuano', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (35, 'Vicuña', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (36, 'Illapel', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (37, 'Canela', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (38, 'Los Vilos', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (39, 'Salamanca', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (40, 'Ovalle', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (41, 'Combarbalá', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (42, 'Monte Patria', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (43, 'Punitaqui', 5);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (44, 'Río Hurtado', 5);

-- Región 6: Valparaíso
INSERT INTO Ciudad (id, nombre, region_id) VALUES (45, 'Valparaíso', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (46, 'Casablanca', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (47, 'Concón', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (48, 'Juan Fernández', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (49, 'Puchuncaví', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (50, 'Quintero', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (51, 'Viña del Mar', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (52, 'Algarrobo', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (53, 'Cartagena', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (54, 'El Quisco', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (55, 'El Tabo', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (56, 'San Antonio', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (57, 'Santo Domingo', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (58, 'Calle Larga', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (59, 'Los Andes', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (60, 'Rinconada', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (61, 'San Esteban', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (62, 'La Ligua', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (63, 'Cabildo', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (64, 'Papudo', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (65, 'Petorca', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (66, 'Zapallar', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (67, 'Hijuelas', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (68, 'La Calera', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (69, 'La Cruz', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (70, 'Limache', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (71, 'Nogales', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (72, 'Olmué', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (73, 'Quillota', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (74, 'Quilpué', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (75, 'Villa Alemana', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (76, 'Isla de Pascua', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (77, 'San Felipe', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (78, 'Catemu', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (79, 'Llaillay', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (80, 'Panquehue', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (81, 'Putaendo', 6);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (82, 'Santa María', 6);

-- Región 7: Metropolitana de Santiago
INSERT INTO Ciudad (id, nombre, region_id) VALUES (83, 'Cerrillos', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (84, 'Cerro Navia', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (85, 'Conchalí', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (86, 'El Bosque', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (87, 'Estación Central', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (88, 'Huechuraba', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (89, 'Independencia', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (90, 'La Cisterna', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (91, 'La Florida', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (92, 'La Granja', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (93, 'La Pintana', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (94, 'La Reina', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (95, 'Las Condes', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (96, 'Lo Barnechea', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (97, 'Lo Espejo', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (98, 'Lo Prado', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (99, 'Macul', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (100, 'Maipú', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (101, 'Ñuñoa', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (102, 'Pedro Aguirre Cerda', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (103, 'Peñalolén', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (104, 'Providencia', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (105, 'Pudahuel', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (106, 'Quilicura', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (107, 'Quinta Normal', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (108, 'Recoleta', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (109, 'Renca', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (110, 'San Joaquín', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (111, 'San Miguel', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (112, 'San Ramón', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (113, 'Santiago', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (114, 'Vitacura', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (115, 'Puente Alto', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (116, 'Pirque', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (117, 'San José de Maipo', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (118, 'Colina', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (119, 'Lampa', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (120, 'Tiltil', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (121, 'San Bernardo', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (122, 'Buin', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (123, 'Calera de Tango', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (124, 'Paine', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (125, 'Melipilla', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (126, 'Alhué', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (127, 'Curacaví', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (128, 'María Pinto', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (129, 'San Pedro', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (130, 'Talagante', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (131, 'El Monte', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (132, 'Isla de Maipo', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (133, 'Padre Hurtado', 7);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (134, 'Peñaflor', 7);

-- Región 8: Libertador General Bernardo O'Higgins
INSERT INTO Ciudad (id, nombre, region_id) VALUES (135, 'Rancagua', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (136, 'Codegua', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (137, 'Coinco', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (138, 'Coltauco', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (139, 'Doñihue', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (140, 'Graneros', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (141, 'Las Cabras', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (142, 'Machalí', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (143, 'Malloa', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (144, 'Mostazal', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (145, 'Olivar', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (146, 'Peumo', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (147, 'Pichidegua', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (148, 'Quinta de Tilcoco', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (149, 'Rengo', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (150, 'Requínoa', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (151, 'San Vicente', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (152, 'Pichilemu', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (153, 'La Estrella', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (154, 'Litueche', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (155, 'Marchigüe', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (156, 'Navidad', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (157, 'Paredones', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (158, 'San Fernando', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (159, 'Chimbarongo', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (160, 'Lolol', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (161, 'Nancagua', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (162, 'Palmilla', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (163, 'Peralillo', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (164, 'Placilla', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (165, 'Pumanque', 8);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (166, 'Santa Cruz', 8);

-- Región 9: Maule
INSERT INTO Ciudad (id, nombre, region_id) VALUES (167, 'Talca', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (168, 'Constitución', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (169, 'Curepto', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (170, 'Empedrado', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (171, 'Maule', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (172, 'Pelarco', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (173, 'Pencahue', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (174, 'Río Claro', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (175, 'San Clemente', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (176, 'San Rafael', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (177, 'Cauquenes', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (178, 'Chanco', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (179, 'Pelluhue', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (180, 'Curicó', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (181, 'Hualañé', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (182, 'Licantén', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (183, 'Molina', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (184, 'Rauco', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (185, 'Romeral', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (186, 'Sagrada Familia', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (187, 'Teno', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (188, 'Vichuquén', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (189, 'Linares', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (190, 'Colbún', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (191, 'Longaví', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (192, 'Parral', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (193, 'Retiro', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (194, 'San Javier', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (195, 'Villa Alegre', 9);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (196, 'Yerbas Buenas', 9);

-- Región 10: Ñuble
INSERT INTO Ciudad (id, nombre, region_id) VALUES (197, 'Chillán', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (198, 'Bulnes', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (199, 'Chillán Viejo', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (200, 'El Carmen', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (201, 'Pemuco', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (202, 'Pinto', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (203, 'Quillón', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (204, 'San Ignacio', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (205, 'Yungay', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (206, 'Cobquecura', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (207, 'Coelemu', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (208, 'Ninhue', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (209, 'Portezuelo', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (210, 'Quirihue', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (211, 'Ránquil', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (212, 'Trehuaco', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (213, 'San Carlos', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (214, 'Coihueco', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (215, 'Ñiquén', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (216, 'San Fabián', 10);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (217, 'San Nicolás', 10);

-- Región 11: Biobío
INSERT INTO Ciudad (id, nombre, region_id) VALUES (218, 'Concepción', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (219, 'Coronel', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (220, 'Chiguayante', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (221, 'Florida', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (222, 'Hualqui', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (223, 'Lota', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (224, 'Penco', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (225, 'San Pedro de la Paz', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (226, 'Santa Juana', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (227, 'Talcahuano', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (228, 'Tomé', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (229, 'Hualpén', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (230, 'Lebu', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (231, 'Arauco', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (232, 'Cañete', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (233, 'Contulmo', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (234, 'Curanilahue', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (235, 'Los Álamos', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (236, 'Tirúa', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (237, 'Los Ángeles', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (238, 'Antuco', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (239, 'Cabrero', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (240, 'Laja', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (241, 'Mulchén', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (242, 'Nacimiento', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (243, 'Negrete', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (244, 'Quilaco', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (245, 'Quilleco', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (246, 'San Rosendo', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (247, 'Santa Bárbara', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (248, 'Tucapel', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (249, 'Yumbel', 11);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (250, 'Alto Biobío', 11);

-- Región 12: La Araucanía
INSERT INTO Ciudad (id, nombre, region_id) VALUES (251, 'Temuco', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (252, 'Carahue', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (253, 'Cunco', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (254, 'Curarrehue', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (255, 'Freire', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (256, 'Galvarino', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (257, 'Gorbea', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (258, 'Lautaro', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (259, 'Loncoche', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (260, 'Melipeuco', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (261, 'Nueva Imperial', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (262, 'Padre Las Casas', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (263, 'Perquenco', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (264, 'Pitrufquén', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (265, 'Pucón', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (266, 'Saavedra', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (267, 'Teodoro Schmidt', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (268, 'Toltén', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (269, 'Vilcún', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (270, 'Villarrica', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (271, 'Cholchol', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (272, 'Angol', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (273, 'Collipulli', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (274, 'Curacautín', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (275, 'Ercilla', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (276, 'Lonquimay', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (277, 'Los Sauces', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (278, 'Lumaco', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (279, 'Purén', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (280, 'Renaico', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (281, 'Traiguén', 12);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (282, 'Victoria', 12);

-- Región 13: Los Ríos
INSERT INTO Ciudad (id, nombre, region_id) VALUES (283, 'Valdivia', 13);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (284, 'Corral', 13);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (285, 'Lanco', 13);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (286, 'Los Lagos', 13);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (287, 'Máfil', 13);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (288, 'Mariquina', 13);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (289, 'Paillaco', 13);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (290, 'Panguipulli', 13);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (291, 'La Unión', 13);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (292, 'Futrono', 13);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (293, 'Lago Ranco', 13);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (294, 'Río Bueno', 13);

-- Región 14: Los Lagos
INSERT INTO Ciudad (id, nombre, region_id) VALUES (295, 'Puerto Montt', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (296, 'Calbuco', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (297, 'Cochamó', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (298, 'Fresia', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (299, 'Frutillar', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (300, 'Los Muermos', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (301, 'Llanquihue', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (302, 'Maullín', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (303, 'Puerto Varas', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (304, 'Castro', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (305, 'Ancud', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (306, 'Chonchi', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (307, 'Curaco de Vélez', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (308, 'Dalcahue', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (309, 'Puqueldón', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (310, 'Queilén', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (311, 'Quellón', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (312, 'Quemchi', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (313, 'Quinchao', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (314, 'Osorno', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (315, 'Puerto Octay', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (316, 'Purranque', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (317, 'Puyehue', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (318, 'Río Negro', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (319, 'San Juan de la Costa', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (320, 'San Pablo', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (321, 'Chaitén', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (322, 'Futaleufú', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (323, 'Hualaihué', 14);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (324, 'Palena', 14);

-- Región 15: Aysén del General Carlos Ibáñez del Campo
INSERT INTO Ciudad (id, nombre, region_id) VALUES (325, 'Coyhaique', 15);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (326, 'Lago Verde', 15);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (327, 'Aysén', 15);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (328, 'Cisnes', 15);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (329, 'Guaitecas', 15);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (330, 'Cochrane', 15);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (331, 'O''Higgins', 15);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (332, 'Tortel', 15);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (333, 'Chile Chico', 15);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (334, 'Río Ibáñez', 15);

-- Región 16: Magallanes y de la Antártica Chilena
INSERT INTO Ciudad (id, nombre, region_id) VALUES (335, 'Punta Arenas', 16);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (336, 'Laguna Blanca', 16);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (337, 'Río Verde', 16);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (338, 'San Gregorio', 16);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (339, 'Cabo de Hornos', 16);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (340, 'Antártica', 16);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (341, 'Porvenir', 16);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (342, 'Primavera', 16);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (343, 'Timaukel', 16);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (344, 'Natales', 16);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (345, 'Torres del Paine', 16);
INSERT INTO Ciudad (id, nombre, region_id) VALUES (346, 'Chépica', 8);

-- Insertar Usuarios de prueba
INSERT INTO usuarios (rut, dv, nombre, apellido, email, rol, activo, sucursal_id, ciudad_id)
VALUES ('17654321', 'K', 'Mauricio', 'Gajardo', 'mauricio.gajardo@cordillera.cl', 'GERENTE', true, 1, 113);

INSERT INTO usuarios (rut, dv, nombre, apellido, email, rol, activo, sucursal_id, ciudad_id)
VALUES ('18543210', '9', 'Vicente', 'Muñoz', 'vicente.munoz@cordillera.cl', 'OPERADOR', true, 1, 113);

INSERT INTO usuarios (rut, dv, nombre, apellido, email, rol, activo, sucursal_id, ciudad_id)
VALUES ('19432109', '8', 'Vicente', 'Colicheo', 'vicente.colicheo@cordillera.cl', 'OPERADOR', true, 2, 45);

INSERT INTO usuarios (rut, dv, nombre, apellido, email, rol, activo, sucursal_id, ciudad_id)
VALUES ('20345678', '7', 'Camila', 'Rojas', 'camila.rojas@cliente.cl', 'CLIENTE', true, null, 113);

INSERT INTO usuarios (rut, dv, nombre, apellido, email, rol, activo, sucursal_id, ciudad_id)
VALUES ('21456789', '6', 'Diego', 'Soto', 'diego.soto@cliente.cl', 'CLIENTE', true, null, 45);

INSERT INTO usuarios (rut, dv, nombre, apellido, email, rol, activo, sucursal_id, ciudad_id)
VALUES ('22567890', '5', 'Valentina', 'Pérez', 'valentina.perez@cliente.cl', 'CLIENTE', true, null, 295);

INSERT INTO usuarios (rut, dv, nombre, apellido, email, rol, activo, sucursal_id, ciudad_id)
VALUES ('23678901', '4', 'Tomás', 'Araya', 'tomas.araya@cliente.cl', 'CLIENTE', true, null, 251);

INSERT INTO usuarios (rut, dv, nombre, apellido, email, rol, activo, sucursal_id, ciudad_id)
VALUES ('24789012', '3', 'Fernanda', 'Mella', 'fernanda.mella@cliente.cl', 'CLIENTE', true, null, 335);

-- Reiniciar los contadores de ID para que no choquen con futuros inserts manuales
-- SELECT setval('region_id_seq', (SELECT MAX(id) FROM Region));
-- SELECT setval('ciudad_id_seq', (SELECT MAX(id) FROM Ciudad));
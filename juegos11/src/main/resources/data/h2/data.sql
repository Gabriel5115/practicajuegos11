INSERT INTO FABRICANTES (CODIGO, NOMBRE) VALUES 
('1000', 'NINTENDO'),
('1001', 'BETHESDA'),
('1002', 'CAPCOM'),
('1003', 'BLIZZARD'),
('1004', 'SQUARE ENIX'),
('1005', 'UBISOFT'),
('1006', 'SONY');

INSERT INTO JUEGOS (CODIGO, CODIGO_FABRICANTE, TITULO, FECHA_ALTA, PRECIO ,DESCATALOGADO, TIPO_JUEGO) VALUES 
('10', '1006', 'Horizon Zero Dawn', '2017-02-28', 25.0, true, 'EXPLORACION'),
('11', '1000', 'Mario Kart', '2006-02-05', 25.0, true, 'CARRERAS'),
('12', '1005', 'Assassins Creed II', '2017-12-28', 25.0, true, 'PELEA'),
('13', '1006', 'Horizon Zero Dawn', '2017-02-28', 25.0, true, 'EXPLORACION'),
('14', '1001', 'Horizon Zero Dawn', '2017-07-28', 25.0, true, 'EXPLORACION'),
('15', '1005', 'Assassins Creed Origins', '2019-05-02', 25.0, true, 'PELEA'),
('16', '1006', 'Horizon Zero Dawn', '2017-02-08', 25.0, true, 'EXPLORACION'),
('17', '1002', 'Horizon Zero Dawn', '2017-11-18', 25.0, true, 'EXPLORACION'),
('18', '1006', 'God of War', '2018-04-20', 25.0, false, 'EXPLORACION'),
('19', '1000', 'Mario Kart 8', '2020-03-18', 25.0, true, 'CARRERAS'),
('20', '1006', 'Horizon Zero Dawn', '2017-04-28', 25.0, true, 'EXPLORACION');


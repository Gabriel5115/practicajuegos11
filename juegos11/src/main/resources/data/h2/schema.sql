CREATE TABLE FABRICANTES (
	
	CODIGO					VARCHAR(200)			NOT NULL,
	NOMBRE					VARCHAR(200)			,

	
	PRIMARY KEY(CODIGO)

); 
 
CREATE TABLE JUEGOS (


	CODIGO					VARCHAR(200)			NOT NULL,
	CODIGO_FABRICANTE		VARCHAR(200)			NOT NULL,
	TITULO					VARCHAR(200)			,
	FECHA_ALTA				DATE					,
	PRECIO					DOUBLE					,					
	DESCATALOGADO			BOOLEAN					,
	TIPO_JUEGO				VARCHAR(200)			,
	
	
	PRIMARY KEY(CODIGO),
	FOREIGN KEY(CODIGO_FABRICANTE) REFERENCES FABRICANTES(CODIGO)
	

);


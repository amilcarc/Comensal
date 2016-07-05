CREATE TABLE menu
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	menuType             VARCHAR(20) NULL,
	detalle              VARCHAR(30) NULL,
	PRIMARY KEY (id)
);



CREATE TABLE proveedor
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	ruc                  CHAR(11) NULL,
	enterpriceName       VARCHAR(30) NULL,
	adress               VARCHAR(40) NULL,
	phone                VARCHAR(16) NULL,
	estado               VARCHAR(20) NULL,
	PRIMARY KEY (id)
);



CREATE TABLE producto
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	descripcionProducto  VARCHAR(30) NULL,
	tipoProducto         VARCHAR(30) NULL,
	unidadMedida         VARCHAR(20) NULL,
	estado               VARCHAR(20) NULL,
	comentario           VARCHAR(40) NULL,
	proveedorId          BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_25 (proveedorId) REFERENCES proveedor (id)
);



CREATE TABLE ingrediente
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	comentario           VARCHAR(30) NULL,
	cantidad             DECIMAL(4,4) NULL,
	menuId               BIGINT NULL,
	productoId           BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_22 (menuId) REFERENCES menu (id),
	FOREIGN KEY R_23 (productoId) REFERENCES producto (id)
);



CREATE TABLE Person
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	NAME                 VARCHAR(50) NULL,
	lastName             VARCHAR(50) NULL,
	lastNameM            VARCHAR(50) NULL,
	typeDocument         VARCHAR(50) NULL,
	address              VARCHAR(50) NULL,
	phone                VARCHAR(16) NULL,
	statusPerson         VARCHAR(20) NULL,
	numDocument          VARCHAR(11) NULL,
	PRIMARY KEY (id)
);



CREATE TABLE userSystem
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	userName             VARCHAR(50) NULL,
	PASSWORD             VARCHAR(50) NULL,
	statusUser           VARCHAR(20) NULL,
	createdIni           DATE NULL,
	createdEnd           DATE NULL,
	personId             BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_2 (personId) REFERENCES Person (id)
);



CREATE TABLE role
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	description          VARCHAR(50) NULL,
	urlRole              VARCHAR(30) NULL,
	PRIMARY KEY (id)
);



CREATE TABLE userRole
(
	userSystemId         BIGINT NOT NULL,
	roleId               BIGINT NOT NULL,
	PRIMARY KEY (userSystemId,roleId),
	FOREIGN KEY R_4 (userSystemId) REFERENCES userSystem (id),
	FOREIGN KEY R_6 (roleId) REFERENCES role (id)
);



CREATE TABLE comensal
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	typeComensal         VARCHAR(20) NULL,
	statusComensal       VARCHAR(20) NULL,
	codeStudent          VARCHAR(12) NULL,
	foto                 VARCHAR(20) NULL,
	personId             BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_19 (personId) REFERENCES Person (id)
);



CREATE TABLE estadoCuenta
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	credito              DECIMAL(5,5) NULL,
	glosa                CHAR(18) NULL,
	debido               CHAR(20) NULL,
	fecha                TIMESTAMP NULL,
	comensalId           BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_20 (comensalId) REFERENCES comensal (id)
);



CREATE TABLE almacen
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	cantidad             DECIMAL(5,5) NULL,
	createdBy            VARCHAR(20) NULL,
	dateCreated          TIMESTAMP NULL,
	dateLastUpdated      TIMESTAMP NULL,
	lastUpdatedBy        TIMESTAMP NULL,
	productoId           BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_24 (productoId) REFERENCES producto (id)
);



CREATE TABLE horarioComensal
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	nameDay              VARCHAR(10) NULL,
	horaIni              TIME NULL,
	horaFin              TIME NULL,
	comensalId           BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_10 (comensalId) REFERENCES comensal (id)
);



CREATE TABLE AREA
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	descripcion          VARCHAR(50) NULL,
	raiz                 VARCHAR(20) NULL,
	estado               VARCHAR(20) NULL,
	PRIMARY KEY (id)
);



CREATE TABLE reserva
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	reservaType          VARCHAR(20) NULL,
	tipoConsumo          VARCHAR(20) NULL,
	motivo               VARCHAR(50) NULL,
	comentario           VARCHAR(50) NULL,
	fechaReserva         TIMESTAMP NULL,
	estado               VARCHAR(20) NULL,
	comensalId           BIGINT NULL,
	areaId               BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_7 (comensalId) REFERENCES comensal (id),
	FOREIGN KEY R_21 (areaId) REFERENCES AREA (id)
);



CREATE TABLE consumo
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	fechaConsumo         TIMESTAMP NULL,
	tipoConsumo          VARCHAR(20) NULL,
	reservaId            BIGINT NULL,
	comensalId           BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_9 (reservaId) REFERENCES reserva (id),
	FOREIGN KEY R_17 (comensalId) REFERENCES comensal (id)
);



CREATE TABLE baseType
(
	typeCode             VARCHAR(20) NOT NULL,
	typeCategory         VARCHAR(20) NULL,
	description          VARCHAR(100) NULL,
	attribute1           VARCHAR(20) NULL,
	orderBy              INTEGER NULL,
	PRIMARY KEY (typeCode)
);

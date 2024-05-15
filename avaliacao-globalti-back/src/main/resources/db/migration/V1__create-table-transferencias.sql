CREATE TABLE TRANSFERENCIAS (
		ID BIGINT NOT NULL AUTO_INCREMENT,
        CONTA_ORIGEM VARCHAR(10) NOT NULL,
        CONTA_DESTINO VARCHAR(10) NOT NULL,
        VALOR_TRANSFERENCIA DECIMAL(38, 2) NOT NULL,
        VALOR_TAXA DECIMAL(38, 2) NOT NULL,
        DATA_TRANSFERENCIA DATE NOT NULL,
        DATA_AGENDAMENTO DATE NOT NULL,
        STATUS VARCHAR(12) NOT NULL,

        PRIMARY KEY(ID)
)
CREATE TABLE disciplinas (
  idDisciplina SERIAL PRIMARY KEY,
  nomeDisciplina VARCHAR(50) NOT NULL,
  notaDisciplina INT NOT NULL
);

INSERT INTO disciplinas (nomeDisciplina,notaDisciplina) VALUES ('GESTAO',5),('PAS2',5),('BD2',2),('PAS2',2),('PAS2',3),('S.O',7),('PAS2',10),('BD2',7),('GESTAO',5),('PAS1',3);
INSERT INTO disciplinas (nomeDisciplina,notaDisciplina) VALUES ('IP',9),('IP',7),('IP',4),('CALC',1),('PAS2',4),('S.O',7),('IP',8),('S.O',9),('PAS1',10),('BD2',8);
INSERT INTO disciplinas (nomeDisciplina,notaDisciplina) VALUES ('BD2',9),('IP',7),('PAS1',5),('BD2',6),('PAS2',3),('PAS1',10),('CALC',2),('PAS2',10),('BD2',10),('S.O',6);
INSERT INTO disciplinas (nomeDisciplina,notaDisciplina) VALUES ('PAS1',7),('BD1',6),('CALC',4),('PAS2',1),('BD1',4),('BD1',2),('PAS2',9),('CALC',4),('BD2',3),('CALC',4);
INSERT INTO disciplinas (nomeDisciplina,notaDisciplina) VALUES ('BD1',7),('S.O',4),('IP',5),('PAS2',5),('BD2',6),('IP',3),('BD2',5),('BD2',2),('S.O',7),('BD2',10);
INSERT INTO disciplinas (nomeDisciplina,notaDisciplina) VALUES ('IP',8),('GESTAO',6),('GESTAO',7),('BD2',10),('S.O',1),('PAS1',9),('PAS1',9),('IP',6),('BD1',7),('S.O',4);
INSERT INTO disciplinas (nomeDisciplina,notaDisciplina) VALUES ('GESTAO',4),('S.O',7),('S.O',2),('GESTAO',5),('GESTAO',8),('BD2',5),('PAS2',2),('PAS2',4),('GESTAO',7),('S.O',2);
INSERT INTO disciplinas (nomeDisciplina,notaDisciplina) VALUES ('GESTAO',5),('IP',8),('GER. PROJETO',9),('GER. PROJETO',9),('CALC',9),('IP',5),('S.O',9),('PAS2',1),('BD2',2),('IP',10);
INSERT INTO disciplinas (nomeDisciplina,notaDisciplina) VALUES ('IP',5),('PAS2',3),('BD1',9),('S.O',7),('GER. PROJETO',3),('BD1',1),('BD1',1),('GESTAO',2),('IP',5),('IP',8);
INSERT INTO disciplinas (nomeDisciplina,notaDisciplina) VALUES ('PAS1',3),('PAS2',6),('IP',1),('IP',5),('BD1',1),('BD2',4),('PAS1',3),('PAS2',2),('S.O',6),('BD1',6);
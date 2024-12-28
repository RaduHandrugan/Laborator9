CREATE TABLE IF NOT EXISTS masini
(
    numar_inmatriculare VARCHAR(20) PRIMARY KEY,
    marca VARCHAR(50),
    an_fabricatie INT,
    culoare VARCHAR(20),
    kilometri INT
);

INSERT INTO masini (numar_inmatriculare, marca, an_fabricatie, culoare, kilometri) VALUES
('B123ABC', 'BMW', 2015, 'Albastru', 95000),
('TM23DEF', 'Audi', 2017, 'Negru', 75000),
('DJ45GHI', 'Mercedes', 2020, 'Alb', 30000),
('GJ456JKL', 'Tesla', 2018, 'Gri', 120000),
('CS54MNO', 'Toyota', 2016, 'Rosu', 450000);

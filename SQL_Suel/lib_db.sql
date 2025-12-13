SELECT * FROM library.books;
INSERT INTO library.books (title, author, amount) VALUES
('Абай Жолы', 'Мухтар Ауэзов', 10),
('Десять негритят', 'Агата Кристи', 15),
('Мастер и Маргарита', 'Михаил Булгаков', 30),
('Цветы для Элджернона', 'Дэниел Киз', 12),
('Кобзарь', 'Тарас Шевченко', 8);


UPDATE library.books
SET amount = 25
WHERE title = 'Десять негритят';


UPDATE library.books
SET author = 'М. Ауэзов'
WHERE title = 'Абай Жолы';

DELETE FROM library.books
WHERE title = 'Кобзарь';
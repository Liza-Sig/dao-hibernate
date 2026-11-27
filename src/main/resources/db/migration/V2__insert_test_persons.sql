INSERT INTO PERSONS (name, surname, age, phone_number, city_of_living) VALUES
    ('Ivan',  'Ivanov',  50, '+7-900-111-22-33', 'Moscow'),
    ('Petr',  'Petrov',  25, '+7-900-444-55-66', 'Moscow'),
    ('Anna',  'Sidorova',28, '+7-900-777-88-99', 'Saint Petersburg'),
    ('Alexey','Smirnov', 31, '+7-900-123-45-67', 'Tyapse'),
    ('Olga',  'Kuznetsova', 35, '+7-900-765-43-21', 'Sochi')
ON CONFLICT (name, surname, age) DO NOTHING;
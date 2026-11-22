# DAO Hibernate

Приложение для работы с базой данных PostgreSQL с использованием Spring Boot и Hibernate.

## Используемые технологии

- Java
- Spring Boot
- Spring Data JPA / Hibernate
- PostgreSQL
- Maven

## Реализовано

- Сущность `Person` для таблицы `PERSONS`.
- Составной первичный ключ из полей `name`, `surname`, `age`.
- DAO-слой `PersonRepository` с внедрением `EntityManager`.
- Метод `getPersonsByCity(String city)` для поиска людей по городу.
- REST endpoint для получения списка людей по городу.

## Запуск

Перед запуском необходимо настроить переменные окружения:

- `DB_USERNAME` — имя пользователя PostgreSQL.
- `DB_PASSWORD` — пароль PostgreSQL.

В файле `application.properties` указаны настройки подключения к базе данных.

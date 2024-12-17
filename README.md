## Сборка и запуск

В текущей директории выполняем команду:

```shell
docker compose up -d
```

Образы соберутся и контейнеры запустятся

## Конфигурация

Настройка сервиса backend производится в файле API/backend/backend.env.
Можно указать:  

server.port - порт сервиса. При смене необходимо прокинуть новые порты.  

spring.security.oauth2.resourceserver.jwt.jwk-set-uri - адрес JWKS Keycloak для валидации JWT.  

## PKCE

Для React приложения PKCE включен через initOptions.

Для настройки в Keycloak переходим в настройки клиента reports-api - Advanced - Advanced Settings и выбираем 'S256' в Proof Key for Code Exchange Code Challenge Method. 
В запросах начнет использоваться code_verifier.
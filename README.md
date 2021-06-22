# DioEveris
Criando um API com Spring boot para o bootcamp da Everis na DIO

Países API
Requirements
Git
Java 8
Docker
IntelliJ Community
DataBase
Postgres
Postgres Docker Hub
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
Populate
data
cd ~/workspace/sql-paises-estados-cidades/PostgreSQL

docker run -it --rm --net=host -v {PWD}:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql


psql -h localhost -U postgres_user_city cities

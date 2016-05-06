# Spring

Simple primer mashing Spring, Hibernate, Postgres

## Dependencies manager
maven 3.2.5

## how to build
```bash
$ cd <project_path>
$ mvn clean package
```

## How to deploy by jetty
Copy the file hibernatepostgres.war in the jetty webapps folder.

## How to test
Go to the url http://localhost:8080/hibernatepostgres/user/mario/rossi by browser

## Credentials
user/password (USER ROLE)
admin/password (ADMIN ROLE)

### Output

```
{"id":1,"login":"firstuser"}
```

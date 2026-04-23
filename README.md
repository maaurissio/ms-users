# MS-Users

Microservicio encargado de la gestión de usuarios dentro del sistema.  
Permite crear, consultar y actualizar usuarios, además de manejar su estado (activo/inactivo).

---

## Tecnologías

- Java 21  
- Quarkus  
- PostgreSQL  
- Docker & Docker Compose  
- Maven  

---

## Cómo ejecutar el proyecto

### Opción 1: Todo con Docker (recomendado)

```bash
./mvnw clean package -DskipTests
docker compose up --build
```

Levanta:
- Backend (ms-users)
- Base de datos (PostgreSQL)

### Opción 2: Desarrollo (backend local + DB en Docker)

```bash
docker compose up -d
./mvnw quarkus:dev
```

Permite trabajar con hot reload

---

## Acceso a la API

**Swagger UI**  
http://localhost:8082/q/swagger-ui

---

## Endpoints principales

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/usuarios` | Listar usuarios activos |
| POST | `/usuarios` | Crear usuario |
| GET | `/usuarios/{id}` | Buscar usuario por ID |
| GET | `/usuarios/buscar?nombre=` | Buscar por nombre |
| PUT | `/usuarios/{id}/activar` | Activar usuario |
| PUT | `/usuarios/{id}/desactivar` | Desactivar usuario |

---

## Base de datos

**Motor:** PostgreSQL  
**Nombre BD:** db_users

**Conexión dentro de Docker**
```
jdbc:postgresql://db-users:5432/db_users
```

**Conexión local**
```
jdbc:postgresql://localhost:5432/db_users
```

---

## Comandos útiles

```bash
docker compose up -d       # Levantar servicios
docker compose down        # Detener servicios
docker ps                  # Ver contenedores
docker logs pg-cordillera  # Ver logs de la BD
```

---

## Estructura del proyecto

```
src/
 ├── entity/
 ├── repository/
 ├── service/
 ├── resource/
 └── enums/
```

---

## Notas importantes

- Si falla Docker, asegúrate de haber generado el build:
  ```bash
  ./mvnw clean package -DskipTests
  ```

- No mezclar configuraciones de conexión:
  - `localhost` → ejecución local
  - `db-users` → ejecución en Docker

---

## Ejemplo de JSON para crear usuario

```json
{
  "rut": "12345678",
  "dv": "9",
  "nombre": "Vicente",
  "apellido": "Muñoz",
  "email": "vicente@test.cl",
  "passwordHash": "123456"
}
```
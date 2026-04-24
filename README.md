#  MS-Users

Microservicio encargado de la gestión de usuarios dentro del sistema.  
Permite crear, consultar y actualizar usuarios, además de manejar su estado (activo/inactivo), asignar roles y sucursales.

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

## Entidades Principales

### Usuario
Representa un usuario del sistema. Contiene información de autenticación y datos personales.

**Campos:**
- `id` (UUID) - Identificador único
- `rut` (String) - Número de documento único
- `dv` (String) - Dígito verificador
- `nombre` (String) - Nombre del usuario
- `apellido` (String) - Apellido del usuario
- `email` (String) - Email único
- `passwordHash` (String) - Contraseña hasheada
- `estado` (Enum) - ACTIVO/INACTIVO
- `creadoEn` (LocalDateTime) - Fecha de creación
- `actualizadoEn` (LocalDateTime) - Fecha de última actualización

### Rol
Define los roles disponibles en el sistema que pueden ser asignados a usuarios.

**Campos:**
- `id` (UUID) - Identificador único
- `nombre` (String) - Nombre único del rol (ej: ADMIN, USER)
- `descripcion` (String) - Descripción del rol
- `activo` (Boolean) - Indica si el rol está activo
- `creadoEn` (LocalDateTime) - Fecha de creación
- `actualizadoEn` (LocalDateTime) - Fecha de última actualización

### Sucursal
Representa una sucursal u oficina del negocio.

**Campos:**
- `id` (UUID) - Identificador único
- `nombre` (String) - Nombre único de la sucursal
- `direccion` (String) - Dirección física
- `activo` (Boolean) - Indica si la sucursal está activa
- `creadoEn` (LocalDateTime) - Fecha de creación
- `actualizadoEn` (LocalDateTime) - Fecha de última actualización

### UsuarioRol
Relación muchos-a-muchos entre usuarios y roles.

**Campos:**
- `id` (UUID) - Identificador único
- `usuario` (FK) - Referencia al usuario
- `rol` (FK) - Referencia al rol
- `asignadoEn` (LocalDateTime) - Fecha de asignación

### UsuarioSucursal
Relación muchos-a-muchos entre usuarios y sucursales.

**Campos:**
- `id` (UUID) - Identificador único
- `usuario` (FK) - Referencia al usuario
- `sucursal` (FK) - Referencia a la sucursal
- `asignadoEn` (LocalDateTime) - Fecha de asignación
- `activo` (Boolean) - Indica si la asignación está activa

---

## Endpoints por Recurso

### Usuarios

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/usuarios` | Listar usuarios activos |
| POST | `/usuarios` | Crear usuario |
| GET | `/usuarios/{id}` | Buscar usuario por ID |
| GET | `/usuarios/buscar?nombre=` | Buscar usuarios por nombre |
| PUT | `/usuarios/{id}` | Actualizar usuario |
| PUT | `/usuarios/{id}/activar` | Activar usuario |
| PUT | `/usuarios/{id}/desactivar` | Desactivar usuario |
| DELETE | `/usuarios/{id}` | Eliminar usuario |

### Roles

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/roles` | Listar roles activos |
| POST | `/roles` | Crear rol |
| GET | `/roles/{id}` | Buscar rol por ID |
| PUT | `/roles/{id}` | Actualizar rol |
| DELETE | `/roles/{id}` | Eliminar rol |

### Sucursales

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/sucursales` | Listar sucursales activas |
| POST | `/sucursales` | Crear sucursal |
| GET | `/sucursales/{id}` | Buscar sucursal por ID |
| PUT | `/sucursales/{id}` | Actualizar sucursal |
| DELETE | `/sucursales/{id}` | Eliminar sucursal |

### Usuario Roles

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/usuario-roles` | Listar asignaciones usuario-rol |
| POST | `/usuario-roles` | Asignar rol a usuario |
| GET | `/usuario-roles/{id}` | Buscar asignación por ID |
| DELETE | `/usuario-roles/{id}` | Remover rol de usuario |

### Usuario Sucursales

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/usuario-sucursales` | Listar asignaciones usuario-sucursal |
| POST | `/usuario-sucursales` | Asignar sucursal a usuario |
| GET | `/usuario-sucursales/{id}` | Buscar asignación por ID |
| DELETE | `/usuario-sucursales/{id}` | Remover sucursal de usuario |

---

## 📝 Ejemplos JSON

### Crear Usuario
```json
{
  "rut": "12345678",
  "dv": "9",
  "nombre": "Vicente",
  "apellido": "Muñoz",
  "email": "vicente@test.cl",
  "passwordHash": "hashed_password_123"
}
```

### Respuesta Usuario
```json
{
  "id": "550e8400-e29b-41d4-a716-446655440000",
  "rut": "12345678",
  "dv": "9",
  "nombre": "Vicente",
  "apellido": "Muñoz",
  "email": "vicente@test.cl",
  "estado": "ACTIVO",
  "creadoEn": "2026-04-24T10:30:00",
  "actualizadoEn": "2026-04-24T10:30:00"
}
```

### Crear Rol
```json
{
  "nombre": "ADMIN",
  "descripcion": "Administrador del sistema con acceso completo",
  "activo": true
}
```

### Respuesta Rol
```json
{
  "id": "550e8400-e29b-41d4-a716-446655440001",
  "nombre": "ADMIN",
  "descripcion": "Administrador del sistema con acceso completo",
  "activo": true,
  "creadoEn": "2026-04-24T10:30:00",
  "actualizadoEn": "2026-04-24T10:30:00"
}
```

### Crear Sucursal
```json
{
  "nombre": "Sucursal Centro",
  "direccion": "Av. Providencia 123, Santiago",
  "activo": true
}
```

### Respuesta Sucursal
```json
{
  "id": "550e8400-e29b-41d4-a716-446655440002",
  "nombre": "Sucursal Centro",
  "direccion": "Av. Providencia 123, Santiago",
  "activo": true,
  "creadoEn": "2026-04-24T10:30:00",
  "actualizadoEn": "2026-04-24T10:30:00"
}
```

### Asignar Rol a Usuario
```json
{
  "usuarioId": "550e8400-e29b-41d4-a716-446655440000",
  "rolId": "550e8400-e29b-41d4-a716-446655440001"
}
```

### Asignar Sucursal a Usuario
```json
{
  "usuarioId": "550e8400-e29b-41d4-a716-446655440000",
  "sucursalId": "550e8400-e29b-41d4-a716-446655440002",
  "activo": true
}
```

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
docker logs pg-users       # Ver logs de la BD
docker compose logs -f     # Ver logs en tiempo real
```

---

## Estructura del proyecto

```
src/
 ├── entity/
 │   ├── Usuario.java
 │   ├── Rol.java
 │   ├── Sucursal.java
 │   ├── UsuarioRol.java
 │   └── UsuarioSucursal.java
 ├── enums/
 │   └── EstadoUsuario.java
 ├── repository/
 │   ├── UsuarioRepository.java
 │   ├── RolRepository.java
 │   ├── SucursalRepository.java
 │   ├── UsuarioRolRepository.java
 │   └── UsuarioSucursalRepository.java
 ├── resource/
 │   ├── UsuarioResource.java
 │   ├── RolResource.java
 │   ├── SucursalResource.java
 │   ├── UsuarioRolResource.java
 │   └── UsuarioSucursalResource.java
 └── service/
     ├── UsuarioService.java
     ├── RolService.java
     ├── SucursalService.java
     ├── UsuarioRolService.java
     └── UsuarioSucursalService.java
```

---

## Relaciones entre Entidades

```
┌─────────────┐         ┌──────────────┐         ┌────────────┐
│   Usuario   │◄────────│ UsuarioRol   │────────►│    Rol     │
└─────────────┘         └──────────────┘         └────────────┘
      │                        
      │                  
      ▼                  
┌──────────────┐         ┌────────────┐
│UsuarioSurc. │────────►│ Sucursal   │
└──────────────┘         └────────────┘

- Usuario tiene muchos Roles (M:M vía UsuarioRol)
- Usuario tiene muchas Sucursales (M:M vía UsuarioSucursal)
- Rol puede estar asignado a muchos Usuarios (M:M vía UsuarioRol)
- Sucursal puede tener muchos Usuarios (M:M vía UsuarioSucursal)
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

- Todos los IDs son UUID, generados automáticamente
- Los campos `creadoEn` y `actualizadoEn` se asignan automáticamente
- Los estados se manejan con la enumeración `EstadoUsuario`
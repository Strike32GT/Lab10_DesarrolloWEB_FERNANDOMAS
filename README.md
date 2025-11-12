# PRJ_CRUD_SPRING_BOOT

👨‍💻 by Fernando Mas

---

## 🧭 Descripción
Aplicación web de ejemplo con Spring Boot que implementa un CRUD MVC usando Thymeleaf, JPA/Hibernate y base de datos H2 en memoria. Incluye generación de PDF/XLSX y seguridad básica con Spring Security.

## 🚀 Cómo ejecutar
1. Requisitos: Java 21 y Maven.
2. Compilar y ejecutar:
   - Maven: `mvn spring-boot:run` (desde `LABORATORIO10-APP-WEB`)
3. La app corre en: `http://localhost:8086`

## 🔐 Credenciales de la aplicación
- Usuario: `tecsup`
- Contraseña: `1234`

## 🗄️ Base de datos (H2)
- Tipo: H2 en memoria
- JDBC URL: `jdbc:h2:mem:escueladb`
- Usuario DB: `tecsup`
- Password DB: `1234`
- Consola H2: `http://localhost:8086/h2-console`
  - Driver: `org.h2.Driver`
  - Nota: La consola H2 está habilitada y sin login adicional en la ruta `/h2-console/**`.

## 🧭 Cómo ingresar al programa
1. Abre `http://localhost:8086`.
2. Inicia sesión con `tecsup` / `1234`.
3. Navega por el menú para acceder a las funcionalidades (listar, crear, editar, eliminar, exportar, etc.).

## 📋 Ejemplo: ir a listar
- Ruta típica: `/listar` (o a través del menú principal).
- Si la ruta está protegida, te pedirá login (usa `tecsup`/`1234`).

## 🧩 Tecnologías y temas tocados
- Spring Boot 3 (Java 21)
- Spring MVC + Thymeleaf (vistas)
- Spring Data JPA (Hibernate)
- H2 Database (memoria)
- Spring Security (config básica; H2 Console permitida)
- OpenPDF (PDF)
- Apache POI (Excel XLSX)

## ⚙️ Configuración relevante
- Puerto de la app: `8086`
- Archivo de propiedades: `LABORATORIO10-APP-WEB/src/main/resources/application.properties`
- Seguridad: `LABORATORIO10-APP-WEB/src/main/java/com/tecsup/demo/config/SecurityConfig.java`

## 🧑‍💻 Autor
- 👨‍💻 by Fernando Mas

---

Si deseas añadir capturas o pasos adicionales (por ejemplo, URLs exactas de controladores), indícalo para extender este README.

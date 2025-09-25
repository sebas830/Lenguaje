# 🛠️ Taller: Internacionalización (i18n) y Localización (l10n) en Spring Boot

## 📄 Descripción
En este taller se trabaja el concepto de **internacionalización (i18n)** y **localización (l10n)** en aplicaciones.
- **i18n**: preparar la aplicación para soportar múltiples idiomas y formatos.
- **l10n**: aplicar un idioma o cultura específica en la interfaz de usuario.

Ejemplo real:
- **i18n (Netflix)**: la plataforma está diseñada para soportar distintos idiomas, subtítulos y doblajes.
- **l10n (Netflix)**: dependiendo de la región, la interfaz, subtítulos y menús se adaptan (ej. español en Colombia, francés en Francia).

---

## Actividades del Taller

1. **Explicación teórica**
    - Diferencia entre i18n y l10n.
    - Ejemplos reales (Netflix, Amazon, Moodle).
    - Esquema simple del flujo:
      ```
      Aplicación Internacionalizada → Localización por región/idioma → Interfaz final al usuario
      ```

2. **Configuración del proyecto en Spring Boot**
    - Archivos de mensajes:
        - `messages.properties`
        - `messages_es.properties`

   Ejemplo de contenido:
   ```properties
   # messages.properties (por defecto inglés)
   greeting=Welcome
   error=An error occurred

   # messages_es.properties (español)
   greeting=Bienvenido
   error=Ocurrió un error
   ```

3. **Cambio de idioma en la aplicación**
    - Español: [http://localhost:8080/?lang=es](http://localhost:8080/?lang=es)
    - Inglés: [http://localhost:8080/?lang=en](http://localhost:8080/?lang=en)

   **Resultado esperado en pantalla:**
    - `Bienvenido` / `Welcome`
    - `Ocurrió un error` / `An error occurred`

4. **Formulario internacionalizado**
    - Campos traducidos:
        - Usuario → User
        - Contraseña → Password
        - Correo → Email

   Ejemplo de rutas:
    - [http://localhost:8080/register?lang=es](http://localhost:8080/register?lang=es)
    - [http://localhost:8080/register?lang=en](http://localhost:8080/register?lang=en)

---

## 🚀 Objetivo
Que el estudiante entienda cómo preparar una aplicación para múltiples idiomas (**i18n**) y cómo mostrar contenido localizado según la cultura del usuario (**l10n**), aplicando estos conceptos en **Spring Boot** con archivos de propiedades y parámetros en la URL.


## 📜 Licencia

Se permite solo para uso educativo. No puede ser vendido; sin embargo, puede ser usado externamente y modificado.

<a name="autores"></a>

## 👥 Autor

📧 **sebasramirez830@gmail.com**  
🐙 GitHub: [@sebas830](https://github.com/sebas830)
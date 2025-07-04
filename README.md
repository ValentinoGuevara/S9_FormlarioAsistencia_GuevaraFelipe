# 🪷 Confirmación Desfile San Pedrito - EPISI UNS

**Desarrollado por:** Valentino Guevara  
**Correo:** [202114033@uns.edu.pe](mailto:202114033@uns.edu.pe)  
**GitHub:** [ValentinoGuevara](https://github.com/ValentinoGuevara)  
**Curso:** Aplicaciones Móviles – Semana 7 y 8  

<div align="center">
  <img src="screenshots3/imagen1.jpg" width="85%" alt="Portada del proyecto">
</div>

---

## 📋 Descripción General

Aplicación Android desarrollada en Kotlin para registrar la asistencia de estudiantes y docentes al **Desfile de San Pedrito 2025**, organizado por la **Escuela Profesional de Ingeniería de Sistemas e Informática (EPISI)** de la **Universidad Nacional del Santa**.

La app incluye un formulario con campos validados, selección de tipo de usuario, y navegación hacia un **WebView** informativo sobre la festividad tradicional de San Pedrito en Chimbote.

---

## 🛠️ Tecnologías Utilizadas

| Tecnología         | Propósito                                    |
|--------------------|----------------------------------------------|
| Kotlin             | Lenguaje de programación principal           |
| Android Studio     | Entorno de desarrollo                       |
| Material Design    | Componentes modernos y adaptativos           |
| WebView            | Visualización de contenido externo (web)     |
| Drawable Resources | Personalización con íconos e imágenes        |

---

## ✨ Funcionalidades

- Registro de datos: nombres, apellidos, código, DNI, teléfono y correo.
- Selección de **tipo de usuario**: Alumno o Docente.
- Switch para **confirmar asistencia**.
- **Menú de navegación** para acceder al formulario o a la web de San Pedrito.
- Visualización de la **página oficial** de la festividad a través de WebView.
- Diseño atractivo con Material Design.

---

## 📱 Capturas de Pantalla

<div align="center">
  <table>
    <tr>
      <td><img src="screenshots3/imagen1.jpg" width="200" alt="Imagen 1"></td>
      <td><img src="screenshots3/imagen2.jpg" width="200" alt="Imagen 2"></td>
      <td><img src="screenshots3/imagen3.jpg" width="200" alt="Imagen 3"></td>
    </tr>
    <tr>
      <td><img src="screenshots3/imagen4.jpg" width="200" alt="Imagen 4"></td>
      <td><img src="screenshots3/imagen5.jpg" width="200" alt="Imagen 5"></td>
      <td><img src="screenshots3/imagen6.jpg" width="200" alt="Imagen 6"></td>
    </tr>
    <tr>
      <td><img src="screenshots3/imagen7.jpg" width="200" alt="Imagen 7"></td>
      <td><img src="screenshots3/imagen8.jpg" width="200" alt="Imagen 8"></td>
    </tr>
  </table>
  <p>Capturas reales del formulario y navegación web en acción</p>
</div>

---

## 🧭 Cómo Usar la App

1. Abre la aplicación.
2. Completa tus datos personales en el formulario.
3. Selecciona si eres **Alumno** o **Docente**.
4. Activa el switch de asistencia para confirmar tu participación.
5. Pulsa el botón **Confirmar Asistencia**.
6. Accede al menú y visita la sección **Fiesta San Pedrito**.
7. Visualiza la información cultural directamente en el WebView.

---

## 🏗️ Estructura del Proyecto

FormularioSanPedrito/
├── java/com/example/formulariosanpedrito/
│ ├── MainActivity.kt
│ ├── WebViewActivity.kt
│ └── MenuActivity.kt
├── res/
│ ├── layout/
│ │ ├── activity_main.xml
│ │ ├── activity_webview.xml
│ │ └── activity_menu.xml
│ ├── drawable/
│ │ ├── ic_sanpedrito.xml
│ │ └── fondo_banner.jpg
│ └── values/
│ ├── colors.xml
│ ├── strings.xml
│ └── themes.xml
├── AndroidManifest.xml
└── README.md

yaml
Copiar
Editar

---

## 🔮 Mejoras Futuras

- Validación automática de campos vacíos.
- Confirmación por Snackbar.
- Conexión a Firebase para guardar confirmaciones.
- Exportación de lista de asistentes a Excel/PDF.
- Adaptación al modo oscuro.

---

## 📚 Licencia

© 2025 - Valentino Guevara
Prohibido el uso comercial sin autorización expresa.

php-template
Copiar
Editar

---

<div align="center">
  <img src="screenshots3/app_demo.gif" width="300" alt="Demo animada">
  <p>¡Explora el código y contribuye!</p>
  <a href="https://github.com/ValentinoGuevara/S8_FormularioSanPedrito">
    <img src="https://img.shields.io/badge/VER_EN_GITHUB-181717?style=for-the-badge&logo=github">
  </a>
</div>

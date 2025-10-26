# Repositorio de Prácticas Java

Este repositorio contiene **dos proyectos independientes en Java**, cada uno enfocado en distintos temas de programación orientada a objetos e interfaces.

---

## 📌 Proyecto 1: Interfaces y Excepciones en Java

📂 Carpeta: `src/interfaces`

Este proyecto tiene como objetivo practicar el uso de **interfaces, herencia, polimorfismo y manejo de excepciones** en Java.

### Contenido principal
- **Ave.java**
- **Dispositivo.java**
- **EnviadorDeMensaje.java**
- **PalomaMensajera.java**
- **PartidoDelBuenCodigo.java**
- **Persona.java**
- **Principal.java**
- **TelefonoMovil.java**

### Consignas de Rectificación
- Confirmar que las interfaces solo definan métodos abstractos.  
- Verificar que las clases que implementan interfaces sobrescriban todos los métodos.  
- Revisar consistencia en nombres de interfaces y clases.  
- Mejorar herencia entre `Ave` y `PalomaMensajera`.  
- Implementar manejo de **excepciones personalizadas**.  
- Usar `@Override` y mejorar visibilidad (`private`, `public`).  
- Agregar comentarios o JavaDoc.  

### Ejecución del Proyecto
1. Clonar el repositorio:  
   ```bash
   git clone https://github.com/LauraPelayes/InterfacesExcepciones.git
   ```
2. Abrir en un IDE como NetBeans, Eclipse o IntelliJ.  
3. Compilar y ejecutar la clase:  
   ```bash
   Principal.java
   ```

---

## 📌 Proyecto 2: Buenas Prácticas con Interfaces

📂 Carpeta: `buenas-practicas`

Este proyecto es una segunda versión mejorada, con mensajes más claros y aplicación de **buenas prácticas de programación** en el uso de interfaces.

### Contenido principal
- **Persona.java**
- **Telefono.java**
- **Correo.java**
- **Paloma.java**
- **Principal.java**

### Mejoras aplicadas
- Mensajes de salida más claros y consistentes.  
- Nombres de variables y clases más representativos.  
- Uso de comentarios explicativos en cada clase.  
- Separación clara de responsabilidades.  

### Ejecución del Proyecto
1. Ingresar a la carpeta `buenas-practicas`.  
2. Compilar los archivos desde la terminal:  
   ```bash
   javac src/*.java
   ```
3. Ejecutar la clase principal:  
   ```bash
   java src.Principal
   ```

---

## 📂 Estructura del Repositorio

```
├── buenas-practicas/         # Proyecto 2: Buenas Prácticas
│   └── src/
│       ├── Persona.java
│       ├── Telefono.java
│       ├── Correo.java
│       ├── Paloma.java
│       └── Principal.java
│
├── src/interfaces/           # Proyecto 1: Interfaces y Excepciones
│   ├── Ave.java
│   ├── Dispositivo.java
│   ├── EnviadorDeMensaje.java
│   ├── PalomaMensajera.java
│   ├── PartidoDelBuenCodigo.java
│   ├── Persona.java
│   ├── Principal.java
│   └── TelefonoMovil.java
│
├── build/                    # Archivos generados por NetBeans
├── nbproject/                # Configuración de NetBeans
├── interfaces-java.png       # Diagrama
├── interfaces-java.uxf       # UML en formato editable
├── build.xml
├── manifest.mf
└── README.md                 # Este archivo
```

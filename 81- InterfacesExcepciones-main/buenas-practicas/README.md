# Ejercicios de Java Orientados a Objetos

Este repositorio contiene un ejercicio de programación en Java diseñado para ilustrar y practicar los fundamentos de la **Programación Orientada a Objetos (POO)**.  
Nos enfocamos en conceptos clave como **interfaces, herencia y polimorfismo**.

---

## 1. Sistema de Envío de Mensajes

Este ejercicio simula cómo diferentes entidades (una persona, un teléfono móvil y una paloma mensajera) pueden enviar mensajes.  
El objetivo principal es demostrar cómo las **interfaces** permiten unificar comportamientos en objetos de distinta naturaleza.

### Conceptos de POO Aplicados

#### Interfaces
- `EnviadorDeMensaje`: define un contrato para cualquier clase que pueda enviar mensajes.
- Las clases `Persona`, `Telefono` y `PalomaMensajera` implementan esta interfaz.

#### Herencia
- `Dispositivo`: clase base con comportamiento común (`encender`), extendida por `Telefono`.
- `Ave`: clase base con comportamiento común (`volar`), extendida por `PalomaMensajera`.

#### Polimorfismo
- La clase `BuenasPracticas` mantiene una lista de tipo `EnviadorDeMensaje`.  
  Gracias al polimorfismo, en esta lista pueden convivir distintos tipos (`Persona`, `Telefono`, `PalomaMensajera`), todos tratados de forma uniforme.

---

### Estructura del Código

```java
// Interfaz
public interface EnviadorDeMensaje {
    public abstract void enviarMensaje(String mensaje);
}

// Clase base
public class Dispositivo {
    public void encender() {
        System.out.print("Proceso de encendido...");
    }
}

// Clase base
public class Ave {
    public void volar() {
        System.out.println("Estoy volando");
    }
}

// Clase concreta que implementa la interfaz
public class Persona implements EnviadorDeMensaje {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("He hecho este código " + mensaje);
    }
}

// Clase concreta que hereda de Dispositivo e implementa la interfaz
public class Telefono extends Dispositivo implements EnviadorDeMensaje {
    public void llamar() {
        System.out.println("Llamando...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        encender();
        System.out.println(" Enviando un mensaje de WhatsApp que dice: " + mensaje);
    }
}

// Clase concreta que hereda de Ave e implementa la interfaz
public class PalomaMensajera extends Ave implements EnviadorDeMensaje {
    public void volarRapido() {
        System.out.print("Volando rápidamente...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        volarRapido();
        System.out.println(" Tirando un papelito que dice: " + mensaje);
    }
}

// Clase que utiliza polimorfismo
import java.util.ArrayList;

public class BuenasPracticas {
    private ArrayList<EnviadorDeMensaje> mensajeros;

    public BuenasPracticas() {
        mensajeros = new ArrayList<>();
    }

    public void agregarMensajero(EnviadorDeMensaje mensajero) {
        this.mensajeros.add(mensajero);
    }

    public void hacerCampania() {
        for (EnviadorDeMensaje mensajero : mensajeros) {
            mensajero.enviarMensaje("Implementando interfaces");
        }
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        BuenasPracticas b = new BuenasPracticas();

        b.agregarMensajero(new PalomaMensajera());
        b.agregarMensajero(new Telefono());
        b.agregarMensajero(new PalomaMensajera());
        b.agregarMensajero(new Persona());
        b.agregarMensajero(new Telefono());
        b.agregarMensajero(new PalomaMensajera());
        b.agregarMensajero(new Telefono());

        b.hacerCampania();
    }
}
```

---

### Ejemplo de Ejecución

```
He hecho este código Implementando interfaces
Proceso de encendido... Enviando un mensaje de WhatsApp que dice: Implementando interfaces
Volando rápidamente... Tirando un papelito que dice: Implementando interfaces
He hecho este código Implementando interfaces
Proceso de encendido... Enviando un mensaje de WhatsApp que dice: Implementando interfaces
Volando rápidamente... Tirando un papelito que dice: Implementando interfaces
Proceso de encendido... Enviando un mensaje de WhatsApp que dice: Implementando interfaces
```

---

### Cómo Ejecutar

1. Asegúrate de que todos los archivos `.java` estén en el mismo directorio (`src/`).
2. Compila las clases desde la terminal:
   ```bash
   javac *.java
   ```
3. Ejecuta la clase principal:
   ```bash
   java Main
   ```

---

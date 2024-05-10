# Proyecto de Interfaz
Este proyecto consiste en una interfaz gráfica en Java para mostrar una lista de nombres con imágenes asociadas y un campo de texto.

### Requisitos
- Java Development Kit (JDK)
- IDE Java (como IntelliJ IDEA, Eclipse, NetBeans)

### Estructura del Proyecto
- proyect.java: Contiene la clase principal que crea y muestra la interfaz.
- media/: Carpeta que contiene las imágenes utilizadas en la interfaz.

### Descripción de la Interfaz
La interfaz consta de dos secciones principales:

- **Panel Izquierdo**

**Wilson Mesa: ** Muestra una imagen asociada a un nombre. En este caso, la imagen es de un logotipo representado por la letra "H".

**Jeremy Santiana:** Similar al anterior, muestra una imagen de un hombre.

**Camila Ochoa: ** Muestra una imagen asociada a un nombre de mujer.

**Pedro Ramirez:** Muestra una imagen asociada a un nombre de hombre.

- **Panel Derecho**

**ListView (JList): ** Muestra una lista de elementos, en este caso, una lista vacía con tres elementos. Esta lista podría actualizarse dinámicamente según la lógica de tu aplicación.

**TextField (JTextField): ** Un campo de texto en el que puedes escribir. Este campo de texto tiene una anchura predefinida de 70 y una altura de 50 píxeles.
Ambos paneles están organizados en un BorderLayout, donde el panel izquierdo se encuentra en la posición oeste (WEST) y el panel derecho en la posición este (EAST).

- Además, se utilizan varios FlowLayouts para organizar los componentes dentro de cada panel, alineando los elementos a la izquierda (FlowLayout.LEFT). También se utiliza BoxLayout en el panel principal (miPanel) para alinear verticalmente los componentes.

##Ejecución 

El programa creará una ventana con la interfaz gráfica que muestra las imágenes y nombres en el panel izquierdo, y un campo de texto y una lista vacía en el panel derecho. Puedes interactuar con la interfaz escribiendo en el campo de texto y explorando cómo se ve la lista en el panel derecho.

![image](https://github.com/JeremySantiana/DeberPAG/assets/169096282/875d11d5-82ea-4c5b-8b10-0de16597e22a)

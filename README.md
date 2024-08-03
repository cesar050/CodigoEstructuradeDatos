# Documentacion EstructuradeDatos

## Vista de la interfaz 
![image](https://github.com/cesar050/CodigoEstructuradeDatos/assets/145623077/6efa3db1-c163-4be8-a370-e5178bf4bebf)
### Vista de un arbol añadiendo sus nodos
![image](https://github.com/cesar050/CodigoEstructuradeDatos/assets/145623077/79b83231-d41a-456e-a490-2541ab7358c4)
### Vista del recorrido PreOrden
![image](https://github.com/cesar050/CodigoEstructuradeDatos/assets/145623077/3574b7e2-93ef-4a6a-b652-bcc4b88879d3)
# ArbolBinario
## Metodos
- getAltura: Este metodo se encarga de devolver la latura del árbol
- setAltura: Este método se encarga de establecer la altura que tendrá el árbol.
- getNodoRaiz: Este método debe devolver el nodo raíz del árbol.
- setNodoRaiz: Este método establece el nodo raíz que pertenece al árbol.
- agregarNodo: Este método se encarga de agregar un nodo con el valor que se especifica al árbol, para realizar estodo utiliza la variable valor de tipo entero.
- borrarNodo: Este método se encarga de eliminar un nodo en la posición que se especifique.
- limpiar: Este método elimina cada uno de los nodos que tenga el árbol.
- recorrerPreOrden: Este método realiza un recorrido como su nombre lo dice en preorden del árbol y devuelve una lista de valores.
- recorrerPostOrden: Este método realiza un recorrido como su nombre lo dice en postorden del árbol y devuelve una lista de valores.
- recorridoInOrden: Este método realiza un recorrido como su nombre lo dice en inorden del árbol y devuelve una lista de valores.
- reconstruirBalanceados: Este método es el encargado de reconstruir el árbol de manera balanceada a partir de una lista de valores.
## Métodos Privados 
- preOrden: es un método auxiliar que se utiliza para el recorrido en preorden.
- inOrden: es un método auxiliar que se utiliza para el recorrido en inorden.
- postOrden: es un método auxiliar que se utiliza para el recorrido en postorden.
- construirBalanceado: es un método auxiliar que se utiliza para reconstruir el árbol de manera balanceada.

# ArbolSimple
Esta clase hereda de ArbolBinario, por lo que dispone de todo los métodos y propiedades de esta clase, además de que puede añadir e implementar funcionalidades como la de eliminarPorValor.
## Metodos
- eliminarPorValor: Este método elimina un nodo del árbol que contiene el valor especificado.

# EstructuraDeDato
Esta clase define la interfaz para cualquier tipo de estructura de datos que herede de ella. 
## Metodos
- agregarNodo: Es un método abstracto el cual es utilizado para agregar un nodo con el dato especificado.
- insertarNodo: Es un método abstracto que se usa para insertar un nodo con el dato especificado en la posición indicada.
- recorrer: Es un método abstracto que como su nombre lo dice se utiliza para recorrer la estructura de datos.
- borrarNodo: Es un método abstracto que se utiliza para borrar un nodo en la posición especificada.
- limpiar: Es un método abstracto que se usa para limpiar la estructura de datos.
- modificarNodo: Es un método abstracto que se encarga de modificar un nodo en la posición indicada.
- ordenar: Es un método abstracto encargado de ordenar la estructura de datos.
- buscarPorDato: Método abstracto que se usa para buscar un nodo por su dato.
- getNombre: Este método devuelve el nombre de la estructura de datos.
- setNombre: Este método establece el nombre de la estructura de datos.

# Nodo
## Constructores
- Nodo: Este constructor inicializa el nodo con un valor entero especificado.
## Metodos
- mostrarValor: Este método miestra el valor del nodo en la salida estándar.
- getValor: Este método devuelve el valor del nodo.
- setValor: Este método establece el valor del nodo.

# nodoArbol
La clase nodoArbol extiende la clase Nodo, añadiendo referencias a los nodos hijos izquierdo y derecho, permitiendo la creación de un árbol binario. 
## Constructor
- NodoArbol: Este constructor inicializa el nodo con un valor entero especificado.
## Metodos
- getNodoIzquierdo: Este método devuelve el nodo hijo izquierdo.
- setNodoIzquierdo: Este método establece el nodo hijo izquierdo.
- getNodoDerecho: Este método devuelve el nodo hijo derecho.
- setNodoDerecho: Este método establece el nodo hijo derecho.
- insertarNodo: Este método inserta un nodo con el valor especificado en el árbol binario, respetando la propiedad de orden del árbol binario de búsqueda.
- delete: Este método elimina un nodo con el valor especificado en el árbol binario. Si el nodo a liminar es encontrado, se devuelve null.

# VistaArbol
Esta clase será la encargada de representar de manera grafica un árbol binario.
## Constructores
- VistaArbol: Este constructor inicializa el panel con el árbol binario especificado.
## Metodos
- setArbol: Este método establece el árbol binario a representar y repinta el panel.
- paintComponent: Este método sobre escribe el método paintComponent para dibujar el árbol binario en el panel.
- dibujarNodo: Este método se encarga de dibujar un nodo del árbol binario y sus hijos. Este método utiliza recursión para dibujar todos los nodos del árbol.

# MainArbol
## Metodos y Componentes
- main: Este es el método principal que inicia la aplicación.
- iniciar: Este método inicializa la GUI y configura el árbol binario y los componentes gráficos.
  - Crea un JFrame para la venta principal.
  - Configura un VistaArbol para visualizar al árbol binario
  - Añade varios botones y campos de texto para poder controlar las operaciones del árbol.
  - Añade los listeners para manerjar las acciones de los botones.
- addButton.addActionListener: Listener para el botón "Añadir Nodo". El cual agrega un nodo al árbol y actualiza la visualización.
- deleteButton.addActionListener: Listener para el botón "Eliminar Nodo". El cual elimina un nodo del árbol y actualiza la visualización.
- preOrderButton.addActionListener: Listener para el botón "Recorrido PreOrden". El cual realiza un recorrido en preorden y reconstruye el árbol balanceado.
- inOrderButton.addActionListener: Listener para el botón "Recorrido InOrden". El cual realiza un recorrido en inorden y reconstruye el árbol balanceado.
- postOrderButton.addActionListener: Listener para el botón "Recorrido PostOrden". El cual realiza un recorrido en postorden y reconstruye el árbol balanceado.
- resetButton.addActionListener: Listener para el botón "Volver Árbol Base". El cual reinicia el árbol a su estado inicial.
- disableRecorridoButtons: Este método desactiva los botones de recorrido para evitar múltiples ejecuciones.
- enableRecorridoButtons: Este método activa los botones de recorrido.
- 
DIAGRAMA UML
![image](https://github.com/user-attachments/assets/0591c965-b15f-4953-88f6-6298d5b2518d)


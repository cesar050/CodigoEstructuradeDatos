# CodigoEstructuradeDatos
## Integrantes 
- César Ramos
- César López
- Santiago Jimenez
- Wagner Balcazar
# Diagrama de clases 
![image](https://github.com/cesar050/CodigoEstructuradeDatos/assets/145623077/fe768750-875f-4742-baa4-462b42768bfe)

## Ejecucion del codigo de arbol
![image](https://github.com/cesar050/CodigoEstructuradeDatos/assets/145623077/4b38a7bc-a25c-4745-8b7a-66a690b723c4)

### Ejecucion de ejemplo de listas
![image](https://github.com/cesar050/CodigoEstructuradeDatos/assets/145623077/a51df63f-1d57-4ccd-837d-dbd5b1d793bf)

### Ejecucion de ejemplo de grafo simple no dirigido
![image](https://github.com/cesar050/CodigoEstructuradeDatos/assets/145623077/ab6c08c4-23f9-4141-8cc9-9791d2a76409)

# Interfaz Estructura 
Esta interfaz se usará para definir un contrato para las estructuras de datos que permitan la adición de valores, en este caso será utilizada para agregar valores a los arboles binarios, listas y grafos.
## Métodos
- Método Agregar: Será utilizado en las estructuras de datos para agregar un valor. Para utilizar este método se necesita un parámetro cuyo nombre es “valor”, de tipo entero.


# Clase Árbol 
Esta clase es una representación de un árbol binario, en la que se utiliza la interfaz “Estructura”. Esta clase permite la inserción de valores en el árbol y la realización de recorridos en preorden, inorden y postorden.
	## Constructores
 Constructor que inicializa el árbol con un valor inicial. Crea la raíz del árbol con el valor especificado 
## Métodos 
-	Método Agregar: Este método es utilizado para agregar valores al árbol. Para funcionar necesita el parámetro de valor, el cual será agregado al árbol.
-	Método inOrden: Como lo dice su nombre este método realiza un recorrido en inorden del árbol.
-	Método postOrden: Como lo dice su nombre este método realiza un recorrido en postorden del árbol.
-	Método preOrden: Como lo dice su nombre este método realiza un recorrido en preorden del árbol. 


# Clase ArbolAVL
 En esta clase se representa un árbol AVL, la cual es una versión del árbol binario que agrega funcionalidades de balanceo para mantener el árbol equilibrado, después de recibir valores. 
## Métodos 
- Método Agregar: Este método es utilizado con el fin de agregar valores al árbol y si es necesario balancearlo.
- Método balancear: Este método es utilizado para balancear el subárbol con la raíz dada.
- Método BalancearNodo: Este método se lo utiliza para balancear un nodo en específico teniendo en cuenta su factor de balance.
- Método obtenerAltura: Este método se lo utiliza con la finalidad de obtener la altura de un nodo.
- Método obtenerBalanceFactor: Este método obtiene el factor de balance de un nodo.
- Método rotacionDerecha: Como dice su nombre este método realiza un rotación hacia la derecha sobre un nodo.
- Método rotacionIzquierda: Al igual que el anterior método este método realiza una rotación sobre un nodo, pero en este caso en la dirección izquierda.
- Método imprimirArbol: Este método imprime el árbol con el factor de balance.
- Método imprimirArbol: Este es un método auxiliar para imprimir el árbol.


# Clase ArbolRojoNegro
Esta clase extiende la clase Árbol y proporciona la estructura para un árbol Rojo-Negro
## Constructor 
- Constructor ArbolRojoNegro: Es utilizado para crear un árbol Rojo-Negro con un valor inicial.


# Clase ArbolSimple
Clase que representa un árbol binario simple
## Constructor 
- Constructor ArbolSimple: Es utilizado para crear un árbol simple con un valor inicial.


# Clase Arista
Clase que representa la arista de un grafo. Para el correcto funcionamiento de la clase arista se necesita dos atributos, uno que represente el vértice de origen de la arista(origen) y otro para el vértice de destino de la arista(destino)
## Constructor 
- Constructor Arista: Se utiliza para la creación de una arista entre dos vértices


## Métodos 
- Método getOrigen: Es utilizado para obtener el vertice de origen de la arista
- Método getDestino: Es utilizado para obtener el vertice de destino de la arista


# Clase GrafoSimpleNoDirigido
Es una clase que representa el grafo simple no dirigido. Para su correcto funcionamiento necesita de dos atributos, uno para la lista de vértices en el grafo(vertices) y otro para la lista de aristas que conectan los vértices(aristas)
## Constructor 
- Constructor GrafoSimpleNoDirigido: Se utiliza para crear un nuevo grafo simple no dirigido


## Métodos 
- Método agregarVertice: Agrega un nuevo vértice al grafo en caso de que no exista.
- Método agregarAristas:  Agrega una nueva arista entre dos vértices en caso de que ambos existan en el grafo.
- Método obtenerVertices: Retorna la lista de todos los vértices que existan en el grafo.
- Método obtenerAristas: Retorna la lista de todas las aristas que existan en el grafo.
- Método eliminarVertices: Eliminar un vertice del grafo, incluido con todas las aristas que se relacionan con el mismo.
- Método eliminarAristas: Eliminar una arista en específico.


# Interfaz Lista
Esta interfaz define operaciones que deben realizar los distintos tipos de listas para su correcto funcionamiento 
## Métodos
- Método agregar: Se encarga de agregar un nuevo valor al final de la lista
- Método obtener: Para funcionar este método utiliza el parámetro de “index”, el cual se utiliza para retornar el valor del elemento en la posición especificada por index en la lista. Además, lanza una excepción en el caso de que el índice se encuentre fuera del rango valido.
- Método eliminar:  Para funcionar este método utiliza el parámetro de “index”, el cual se utiliza para eliminar el valor del elemento en la posición especificada por index en la lista.


# Clase listaCircular
En esta clase se implementa la interfaz Lista y representa una lista circular mediante nodos enlazados, los cuales están definidos por la clase interna NodoLista.
## Métodos
- Método agregar: Se encarga de agregar un nuevo valor al final de la lista circular.
- Método obtener: Para funcionar este método utiliza el parámetro de “index”, el cual se utiliza para retornar el valor del elemento en la posición especificada por index en la lista circular. Además, lanza una excepción en el caso de que el índice se encuentre fuera del rango valido.
- Método eliminar:  Para funcionar este método utiliza el parámetro de “index”, el cual se utiliza para eliminar el valor del elemento en la posición especificada por index en la lista circular.


# Clase NodoLista	
## Constructor 
Se utiliza para inicializar el nodo con un valor dado
## Métodos 
- Métodos getValor y getSiguiente: Son utilizados para obtener el valor almacenado en el nodo y el siguiente nodo en la lista.
- Método setSiguiente: Nos permite establecer cuál será el siguiente nodo.


# Clase ListaCircularDoble
En esta clase se implementa la interfaz Lista y representa una lista circular doble mediante nodos enlazados, los cuales están definidos por la clase interna NodoLista.
## Métodos
- Método agregar: Se encarga de agregar un nuevo valor al final de la lista circular doble.
- Método obtener: Para funcionar este método utiliza el parámetro de “index”, el cual se utiliza para retornar el valor del elemento en la posición especificada por index en la lista circular doble. Además, lanza una excepción en el caso de que el índice se encuentre fuera del rango valido.
- Método eliminar:  Para funcionar este método utiliza el parámetro de “index”, el cual se utiliza para eliminar el valor del elemento en la posición especificada por index en la lista circular doble.


# Clase NodoLista	
## Constructor 
Se utiliza para inicializar el nodo con un valor dado
## Métodos 
- Métodos getValor, getSiguiente y getAnterior: Son utilizados para obtener el valor almacenado en el nodo, el siguiente nodo y el anterior en la lista.
- Método setSiguiente, setAnterior: Nos permite establecer cuál será el siguiente nodo y el nodo anterior en la lista.


 # Clase ListaDobleEnlazada
 En esta clase se implementa la interfaz Lista y representa una lista doble enlazada mediante nodos enlazados, los cuales están definidos por la clase interna NodoLista.
 ## Métodos
 - Método agregar: Se encarga de agregar un nuevo valor al final de la lista doble enlazada.
 - Método obtener: Para funcionar este método utiliza el parámetro de “index”, el cual se utiliza para retornar el valor del elemento en la posición especificada por index en la lista doble enlazada. Además, lanza una excepción en el caso de que el índice se encuentre fuera del rango valido.
 - Método eliminar:  Para funcionar este método utiliza el parámetro de “index”, el cual se utiliza para eliminar el valor del elemento en la posición especificada por index en la lista doble enlazada.


# Clase NodoLista
## Constructor 
Se utiliza para inicializar el nodo con un valor dado
## Métodos 
- Métodos getValor, getSiguiente y getAnterior: Son utilizados para obtener el valor almacenado en el nodo, el siguiente nodo y el anterior en la lista.
- Método setSiguiente, setAnterior: Nos permite establecer cuál será el siguiente nodo y el nodo anterior en la lista.


# Clase ListaEnlazada
En esta clase se implementa la interfaz Lista y representa una lista enlazada mediante nodos enlazados, los cuales están definidos por la clase interna NodoLista.
## Métodos
- Método agregar: Se encarga de agregar un nuevo valor al final de la lista enlazada.
- Método obtener: Para funcionar este método utiliza el parámetro de “index”, el cual se utiliza para retornar el valor del elemento en la posición especificada por index en la lista enlazada. Además, lanza una excepción en el caso de que el índice se encuentre fuera del rango valido.
- Método eliminar:  Para funcionar este método utiliza el parámetro de “index”, el cual se utiliza para eliminar el valor del elemento en la posición especificada por index en la lista enlazada.


# Clase NodoLista	
## Constructor 
Se utiliza para inicializar el nodo con un valor dado
## Métodos 
- Métodos getValor y getSiguiente: Son utilizados para obtener el valor almacenado en el nodo y el siguiente nodo en la lista.
- Método setSiguiente: Nos permite establecer cuál será el siguiente nodo.


# Clase Nodo
Esta clase representa un nodo dentro de un árbol binario, el cual contiene un valor entero, y puede tener referencias sus nodos hijos. 
## Constructores 
- Constructor Nodo: Este constructor inicializa un nodo con el valor que se especifica.
## Métodos
- Método getValor: Este método retorna el valor almacenado en el nodo.
- Método getIzquierda y getDerecha: Retorna el nodo almacenado en el hijo izquierdo y derecho.
- Método setIzquierda y setDerecha: Establece el nodo en el hijo izquierdo y derecho.
- Método agregar: Este método agrega nuevos valores al árbol binario.
- Método inOrden: Este método es utilizado para realizar un recorrido inOrden del árbol binario.
- Método preOrden: Este método es utilizado para realizar un recorrido preOrden del árbol binario.
- Método PostOrden: Este método es utilizado para realizar un recorrido postOrden del árbol binario.

# Actualizacion de documentacion 

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

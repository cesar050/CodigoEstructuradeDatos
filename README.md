# CodigoEstructuradeDatos
## Integrantes 
- César Ramos
- César López
- Santiago Jimenez 
# Diagrama de clases 
![image](https://github.com/cesar050/CodigoEstructuradeDatos/assets/145623077/fe768750-875f-4742-baa4-462b42768bfe)

## Ejecucion del codigo
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

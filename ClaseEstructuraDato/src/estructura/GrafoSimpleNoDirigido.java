package estructura;

import java.util.ArrayList;
import java.util.List;

public class GrafoSimpleNoDirigido {
    private List<Integer> vertices;
    private List<Arista> aristas;


    public GrafoSimpleNoDirigido() {
        this.vertices = new ArrayList<>();
        this.aristas = new ArrayList<>();
    }

    public void agregarVertice(int vertice) {
        if (!vertices.contains(vertice)) {
            vertices.add(vertice);
        }
    }

    public void agregarArista(int origen, int destino) {
        if (vertices.contains(origen) && vertices.contains(destino)) {
            Arista arista = new Arista(origen, destino);
            aristas.add(arista);
        }
    }

    public List<Integer> obtenerVertices() {
        return vertices;
    }

    public List<Arista> obtenerAristas() {
        return aristas;
    }

    public boolean eliminarVertice(int vertice) {
        if (vertices.contains(vertice)) {
            vertices.remove((Integer) vertice);
            aristas.removeIf(arista -> arista.getOrigen() == vertice || arista.getDestino() == vertice);
            return true;
        }
        return false;
    }

    public boolean eliminarArista(int origen, int destino) {
        for (Arista arista : aristas) {
            if (arista.getOrigen() == origen && arista.getDestino() == destino) {
                aristas.remove(arista);
                return true;
            }
        }
        return false;
    }
}

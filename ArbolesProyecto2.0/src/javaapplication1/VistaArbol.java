/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Cesarin
 */
public class VistaArbol extends JPanel {

    private ArbolBinario arbol;
    private int radio = 15;
    private int verticalSeparation = 35;
    private Color lineColor = Color.BLACK;
    private float lineThickness = 4.0f;
    private Deque<NodoArbol> recorridoActual;  // Almacena el recorrido actual para pintarlo
    private Timer timer;
    private int currentAnimationFrame;

    public VistaArbol(ArbolBinario arbol) {
        this.arbol = arbol;
        this.recorridoActual = new ArrayDeque<>();
        this.timer = new Timer(1000, null);  // Timer inicializado sin ActionListener
        this.currentAnimationFrame = 0;
        
        timer.addActionListener(e -> {
            if (!recorridoActual.isEmpty()) {
                arbol.setNodoMarcado(recorridoActual.peek());  // Marcar el primer nodo del recorrido
                repaint();
                recorridoActual.poll();  // Sacar el nodo marcado de la cola
            } else {
                timer.stop();  // Detener el temporizador cuando el recorrido ha terminado
            }
        });
    }

    public void setArbol(ArbolBinario arbol) {
        this.arbol = arbol;
        repaint();
    }

    public void setRecorrido(List<Integer> recorrido) {
        recorridoActual.clear();
        for (int valor : recorrido) {
            NodoArbol nodo = arbol.buscarNodo(valor);
            if (nodo != null) {
                recorridoActual.offer(nodo);
            }
        }
        currentAnimationFrame = 0;  // Reiniciar el contador de fotogramas
        if (!recorridoActual.isEmpty()) {
            timer.start();  // Iniciar el temporizador para la animación del recorrido
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        dibujarNodo(g, arbol.getNodoRaiz(), getWidth() / 2, 30, getWidth() / 4);
    }

    private void dibujarNodo(Graphics g, NodoArbol nodo, int x, int y, int hSeparation) {
        if (nodo == null) {
            return;
        }

        Graphics2D g2d = (Graphics2D) g;
        
        // Cambiar color según el estado del nodo (marcado o no)
        if (arbol.getNodoMarcado() == nodo) {
            g2d.setColor(Color.BLUE);  // Color para el nodo marcado
        } else if (nodo == arbol.getNodoRaiz()) {
            g2d.setColor(Color.RED);  // Color para la raíz
        } else {
            g2d.setColor(Color.YELLOW);  // Color para los nodos hijos
        }
        
        g2d.fillOval(x - radio, y - radio, 2 * radio, 2 * radio);

        g2d.setColor(Color.BLACK);
        String valorStr = Integer.toString(nodo.getValor());
        FontMetrics fm = g2d.getFontMetrics();
        int textWidth = fm.stringWidth(valorStr);
        g2d.drawString(valorStr, x - textWidth / 2, y + fm.getAscent() / 2 - 2);

        g2d.setColor(lineColor);
        g2d.setStroke(new BasicStroke(lineThickness));

        if (nodo.getNodoIzquierdo() != null) {
            int nuevoX = x - hSeparation;
            g2d.drawLine(x - radio, y + radio, x - hSeparation + radio, y + verticalSeparation - radio);
            dibujarNodo(g, nodo.getNodoIzquierdo(), x - hSeparation, y + verticalSeparation, hSeparation / 2);
        }

        if (nodo.getNodoDerecho() != null) {
            int nuevoX = x + hSeparation;
            g2d.drawLine(x + radio, y + radio, x + hSeparation - radio, y + verticalSeparation - radio);
            dibujarNodo(g, nodo.getNodoDerecho(), x + hSeparation, y + verticalSeparation, hSeparation / 2);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class MainArbol {

    private ArbolBinario arbol;
    private List<Integer> baseTreeValues = new ArrayList<>();
    private JButton preOrderButton;
    private JButton inOrderButton;
    private JButton postOrderButton;
    private VistaArbol panel;
    private JTextArea recorridoTextArea;
    private Deque<NodoArbol> recorridoAnimacion; // Cola para la animación del recorrido
    private static final int ANIM_DELAY_MS = 1000; // Retraso en milisegundos entre animaciones

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainArbol().iniciar();
            }
        });
    }

    public void iniciar() {
        arbol = new ArbolBinario();
        recorridoAnimacion = new ArrayDeque<>();

        JFrame frame = new JFrame("Árbol Binario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        panel = new VistaArbol(arbol);
        frame.add(panel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        JTextField valorField = new JTextField(5);
        JTextField valorEliminarField = new JTextField(5);
        JButton addButton = new JButton("Añadir Nodo");
        JButton deleteButton = new JButton("Eliminar Nodo");
        preOrderButton = new JButton("Recorrido PreOrden");
        inOrderButton = new JButton("Recorrido InOrden");
        postOrderButton = new JButton("Recorrido PostOrden");

        recorridoTextArea = new JTextArea(5, 30);
        recorridoTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(recorridoTextArea);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int valor = Integer.parseInt(valorField.getText());
                    if (arbol.buscarNodo(valor) != null) {
                        JOptionPane.showMessageDialog(frame, "¡Alto ahí tilín! Este nodo ya existe.",
                                "Nodo Existente", JOptionPane.WARNING_MESSAGE);
                    } else {
                        arbol.agregarNodo(valor);
                        baseTreeValues.add(valor); // Guardar el valor agregado en la lista base
                        valorField.setText("");
                        panel.repaint();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor ingresa un valor numérico válido.",
                            "Error de Entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = Integer.parseInt(valorEliminarField.getText());
                arbol.borrarNodo(valor);
                baseTreeValues.remove((Integer) valor); // Remover el valor de la lista base
                valorEliminarField.setText("");
                panel.repaint();
            }
        });

        preOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Integer> recorrido = arbol.recorrerPreOrden();
                iniciarAnimacion(recorrido, "PreOrden");
            }
        });

        inOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Integer> recorrido = arbol.recorrerInOrden();
                iniciarAnimacion(recorrido, "InOrden");
            }
        });

        postOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Integer> recorrido = arbol.recorrerPostOrden();
                iniciarAnimacion(recorrido, "PostOrden");
            }
        });

        controlPanel.add(new JLabel("Valor:"));
        controlPanel.add(valorField);
        controlPanel.add(addButton);
        controlPanel.add(new JLabel("Eliminar Valor:"));
        controlPanel.add(valorEliminarField);
        controlPanel.add(deleteButton);
        controlPanel.add(preOrderButton);
        controlPanel.add(inOrderButton);
        controlPanel.add(postOrderButton);
        controlPanel.add(scrollPane); // el JTextArea
        frame.add(controlPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void iniciarAnimacion(List<Integer> recorrido, String tipoRecorrido) {
        recorridoAnimacion.clear();
        actualizarRecorridoTextArea(tipoRecorrido, recorrido);

        for (int valor : recorrido) {
            NodoArbol nodo = arbol.buscarNodo(valor);
            if (nodo != null) {
                recorridoAnimacion.add(nodo);
            }
        }

        animarRecorrido();
    }

    private void animarRecorrido() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                preOrderButton.setEnabled(false);
                inOrderButton.setEnabled(false);
                postOrderButton.setEnabled(false);

                while (!recorridoAnimacion.isEmpty()) {
                    NodoArbol nodo = recorridoAnimacion.poll();
                    arbol.setNodoMarcado(nodo);
                    panel.repaint();
                    try {
                        Thread.sleep(ANIM_DELAY_MS);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }

                arbol.setNodoMarcado(null);
                preOrderButton.setEnabled(true);
                inOrderButton.setEnabled(true);
                postOrderButton.setEnabled(true);
            }
        }).start();
    }

    private void actualizarRecorridoTextArea(String tipoRecorrido, List<Integer> recorrido) {
        StringBuilder sb = new StringBuilder();
        sb.append("Recorrido ").append(tipoRecorrido).append(": ");
        for (int valor : recorrido) {
            sb.append(valor).append(" ");
        }
        recorridoTextArea.setText(sb.toString());
    }
}

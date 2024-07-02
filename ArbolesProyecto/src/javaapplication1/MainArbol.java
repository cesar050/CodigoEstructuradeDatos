/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Cesarin
 */
public class MainArbol {

    private ArbolBinario arbol;
    private List<Integer> baseTreeValues = new ArrayList<>();
    private JButton preOrderButton;
    private JButton inOrderButton;
    private JButton postOrderButton;
    private VistaArbol panel;

    public static void main(String[] args) {
        new MainArbol().iniciar();
    }

    public void iniciar() {
        arbol = new ArbolBinario();

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
        JButton resetButton = new JButton("Volver Árbol Base");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = Integer.parseInt(valorField.getText());
                arbol.agregarNodo(valor);
                baseTreeValues.add(valor);  // Guardar el valor agregado en la lista base
                valorField.setText("");
                panel.repaint();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = Integer.parseInt(valorEliminarField.getText());
                arbol.borrarNodo(valor);
                baseTreeValues.remove((Integer) valor);  // Remover el valor de la lista base
                valorEliminarField.setText("");
                panel.repaint();
            }
        });

        preOrderButton.addActionListener(new ActionListener() {
            private boolean executed = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!executed) {
                    List<Integer> recorrido = arbol.recorrerPreOrden();
                    arbol.reconstruirBalanceado(recorrido);
                    panel.repaint();
                    executed = true;
                    disableRecorridoButtons();
                }
            }
        });

        inOrderButton.addActionListener(new ActionListener() {
            private boolean executed = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!executed) {
                    List<Integer> recorrido = arbol.recorrerInOrden();
                    arbol.reconstruirBalanceado(recorrido);
                    panel.repaint();
                    executed = true;
                    disableRecorridoButtons();
                }
            }
        });

        postOrderButton.addActionListener(new ActionListener() {
            private boolean executed = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!executed) {
                    List<Integer> recorrido = arbol.recorrerPostOrden();
                    arbol.reconstruirBalanceado(recorrido);
                    panel.repaint();
                    executed = true;
                    disableRecorridoButtons();
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arbol = new ArbolBinario();
                for (int valor : baseTreeValues) {
                    arbol.agregarNodo(valor);
                }
                panel.setArbol(arbol);
                panel.repaint();
                enableRecorridoButtons();
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
        controlPanel.add(resetButton);
        frame.add(controlPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void disableRecorridoButtons() {
        preOrderButton.setEnabled(false);
        inOrderButton.setEnabled(false);
        postOrderButton.setEnabled(false);
    }

    private void enableRecorridoButtons() {
        preOrderButton.setEnabled(true);
        inOrderButton.setEnabled(true);
        postOrderButton.setEnabled(true);
    }
}

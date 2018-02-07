import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ventana extends JFrame {
    JLabel etiqueta;
    JTextField campo;
    JButton jugar;

    JDialog dia;


    public Ventana() {
        super.setTitle("Juego de numeros");
        etiqueta = new JLabel("Dime un #: ");
        campo = new JTextField(5);
        jugar = new JButton("Jugar");

        dia = new JDialog(this);
        dia.setSize(480, 480);

        setLayout(new FlowLayout());
        setSize(640, 480);

        add(etiqueta);
        add(campo);
        add(jugar);
        jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar1(campo.getText());
                //jugar();
            }
        });

        setVisible(true);
    }

    private void jugar() {
        JLabel etiqueta2 = new JLabel();
        JLabel imagen = new JLabel(new ImageIcon(getClass().getResource("insecto.jpg")));
        String valor = campo.getText();
        int num = Integer.parseInt(valor);
        num++;
        etiqueta2.setText("Mi numero es" + num + "te gane ...");
        dia.setLayout(new BorderLayout());
        dia.add(etiqueta2, BorderLayout.NORTH);
        dia.add(imagen, BorderLayout.CENTER);
        dia.setVisible(true);
    }

    private void jugar1(String valor) {
        String resultado;
        JLabel etiqueta;
        JLabel imagen, imagen2;
        int num = 0;
        JLabel labelresultado;

        dia.setLayout(new BorderLayout());
        imagen = new JLabel(new ImageIcon(getClass().getResource("error.jpg")));
        imagen2 = new JLabel(new ImageIcon(getClass().getResource("insecto.jpg")));
        etiqueta = new JLabel("");
        if (valor.equals("")) {

            dia.remove(etiqueta);
            dia.remove(imagen2);

            etiqueta.setText("no mames...");
            dia.add(etiqueta, BorderLayout.NORTH);
            dia.add(imagen, BorderLayout.CENTER);
        } else {
            dia.setSize(500, 500);
            num = Integer.parseInt(valor);
            dia.remove(etiqueta);
            dia.remove(imagen);

            etiqueta.setText("Mi numero es" + (++num) + "te gane ...");
            dia.add(etiqueta, BorderLayout.SOUTH);
            dia.add(imagen2, BorderLayout.CENTER);
        }
        dia.setVisible(true);
    }

    private boolean existeNumero(String texto) {
        boolean resultado = false;
        for (int indice = 0; indice < texto.length(); indice++) {
            if (esDigito(texto.charAt(indice)))
                resultado = true;
        }
        return true;
    }

    private boolean esDigito(Character caracter) {
        boolean res = false;
        switch (caracter) {
            case '1':
                res = true;
                break;
            case '2':
                res = true;
                break;
            case '3':
                res = true;
                break;
            case '4':
                res = true;
                break;
            case '5':
                res = true;
                break;
            case '6':
                res = true;
                break;
            case '7':
                res = true;
                break;
            case '8':
                res = true;
                break;
            case '9':
                res = true;
                break;
            case '0':
                res = true;
                break;
        }
        return res;
    }
}

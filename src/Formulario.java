import javax.swing.*;
public class Formulario extends JFrame{
    public Formulario() {
        setLayout(null);
    }

    public static void main(String[] ar) {
        Formulario formulario=new Formulario();
        formulario.setBounds(50,50,1024,800);
        formulario.setVisible(true);
        formulario.setResizable(false);
    }
}
package interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class proyect extends JFrame {
    private JTextField textField;
    private JList<String> listView;
    private JScrollPane scrollPane;
    
    public proyect () {
        super("interfaz");
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(2,1));
        
        JPanel miPanel = new JPanel();
        miPanel.setLayout(new BoxLayout(miPanel, BoxLayout.Y_AXIS)); // Alinea verticalmente
        miPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10)); // Espacio alrededor del panel principal

        // Crea el primer panel
        JPanel leftPanel1 = new JPanel();
        leftPanel1.setLayout(new FlowLayout(FlowLayout.LEFT)); // Alinea el contenido a la izquierda
        JLabel iconLabel1 = new JLabel(new ImageIcon("media/H.png"));
        iconLabel1.setPreferredSize(new Dimension(90, 90));
        JLabel nameLabel1 = new JLabel("WILSON MESA");
        leftPanel1.add(iconLabel1);
        leftPanel1.add(nameLabel1);
        miPanel.add(leftPanel1); // Agrega al panel
        
        // Crea el segundo panel
        JPanel leftPanel2 = new JPanel();
        leftPanel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel iconLabel2 = new JLabel(new ImageIcon("media/HOMBRE.jpg"));
        iconLabel2.setPreferredSize(new Dimension(90, 90));
        JLabel nameLabel2 = new JLabel("JEREMY SANTIANA");
        leftPanel2.add(iconLabel2);
        leftPanel2.add(nameLabel2);
        miPanel.add(leftPanel2);

        // Crea el tercer panel
        JPanel leftPanel3 = new JPanel();
        leftPanel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel iconLabel3 = new JLabel(new ImageIcon("media/CH.png"));
        iconLabel3.setPreferredSize(new Dimension(90, 90));
        JLabel nameLabel3 = new JLabel("CAMILA OCHOA");
        leftPanel3.add(iconLabel3);
        leftPanel3.add(nameLabel3);
        miPanel.add(leftPanel3);

        // Crea el cuarto panel
        JPanel leftPanel4 = new JPanel();
        leftPanel4.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel iconLabel4 = new JLabel(new ImageIcon("media/V.png"));
        iconLabel4.setPreferredSize(new Dimension(90, 90));
        JLabel nameLabel4 = new JLabel("PEDRO RAMIREZ");
        leftPanel4.add(iconLabel4);
        leftPanel4.add(nameLabel4);
        miPanel.add(leftPanel4);
        
        // Crea el panel derecho
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout()); // Usa BorderLayout para el listview y el textfield
        
        // Crea el listview (JList)
        JList<String> listView = new JList<>(new String[]{"", "", ""});
        listView.setPreferredSize(new Dimension(400, 52)); // Tamaño preferido para el listview
        JScrollPane scrollPane = new JScrollPane(listView); // Para tener barras de desplazamiento si es necesario

        // Crea el textfield (JTextField)
        JTextField textField = new JTextField(20);
        textField.setPreferredSize(new Dimension(70, 50));// Tamaño preferido para el textfield

        // Añade el listview al panel derecho y el textfield al borde inferior
        rightPanel.add(scrollPane, BorderLayout.CENTER);
        rightPanel.add(textField, BorderLayout.SOUTH);
        //para colocar espacio en el borde 
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 20));

        // Agrega el panel principal y el panel derecho al marco
        this.add(miPanel, BorderLayout.WEST); // Panel con las etiquetas a la izquierda
        this.add(rightPanel, BorderLayout.EAST); // Panel con el listview y el textfield a la derecha
    }

    public static void main(String[] args) {
        proyect proyect = new proyect();
        proyect.setVisible(true);
    }
}


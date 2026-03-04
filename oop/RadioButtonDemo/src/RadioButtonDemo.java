 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    private JRadioButton bird, cat, dog, rabbit, pig;
    private JLabel imageLabel;

    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create radio buttons
        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        // Group them
        ButtonGroup group = new ButtonGroup();
        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

        // Panel for radio buttons
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(5, 1));
        leftPanel.add(bird);
        leftPanel.add(cat);
        leftPanel.add(dog);
        leftPanel.add(rabbit);
        leftPanel.add(pig);

        // Image label
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add listeners
        bird.addActionListener(this);
        cat.addActionListener(this);
        dog.addActionListener(this);
        rabbit.addActionListener(this);
        pig.addActionListener(this);

        add(leftPanel, BorderLayout.WEST);
        add(imageLabel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedPet = "";

        if (bird.isSelected()) {
            selectedPet = "Bird";
            imageLabel.setIcon(new ImageIcon("images/bird.webp"));
        } else if (cat.isSelected()) {
            selectedPet = "Cat";
            imageLabel.setIcon(new ImageIcon("images/cat.webp"));
        } else if (dog.isSelected()) {
            selectedPet = "Dog";
            imageLabel.setIcon(new ImageIcon("images/dog.avif"));
        } else if (rabbit.isSelected()) {
            selectedPet = "Rabbit";
            imageLabel.setIcon(new ImageIcon("images/rabbit"));
        } else if (pig.isSelected()) {
            selectedPet = "Pig";
            imageLabel.setIcon(new ImageIcon("images/pig.webp"));
        }

        JOptionPane.showMessageDialog(this,
                selectedPet + " selected!",
                "Selection",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RadioButtonDemo().setVisible(true);
        });
    }
}

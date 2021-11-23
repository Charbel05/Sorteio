package sorteio;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class Frame extends JFrame{
    
    private final JButton sort;
    private JLabel display;
    
    public Frame(){
        super("Sorteio");
        
        sort = new JButton("Sortear");
        add(sort, BorderLayout.SOUTH);
        
        sort.addActionListener((e) -> {
            JOptionPane.showMessageDialog(Frame.this, String.format("Número sorteado: %d", nRand()));
        });
       
        display = new JLabel("       ");
        add(display);
    }
    
    int nRand(){
        Random random = new Random();
        int n = random.nextInt(100);
        return n;
    }
}

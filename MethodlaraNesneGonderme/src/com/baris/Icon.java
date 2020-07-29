package com.baris;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Icon extends JFrame implements ActionListener
{
    private JButton JBUTTON;
    private JPanel Jpanel;
    private JPanel formpanel;
    private JButton button1;

    public Icon(){
        setLayout(new BorderLayout());
        setTitle("Calculator");
        setSize(600, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        formpanel.setBorder(new EmptyBorder(0, 0, 0, 0));
        setVisible(true);
        add(formpanel);
        button1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {
                    System.out.println("fdsfsdfsdfsd");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("dfsfsdfsdfs");
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JBUTTON.addActionListener(this);
        add(formpanel);
    }

    public static void main(String[] args)
    {
        Icon  myform = new Icon();
    }

}

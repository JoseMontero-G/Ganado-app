/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agrovacas;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import com.mycompany.views.Ganados;
import com.mycompany.views.MainC;
import com.mycompany.views.Salud;
import com.mycompany.views.UpGanado;
import com.mycompany.views.UpVacunas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author lalom
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        initStyles();
        setDate();
        initcontent();
    }
    
    //Inicialiar estilos de FlatLaf
    private void initStyles()
    {
        Slogan.putClientProperty( "FlatLaf.styleClass", "h2" );
        Slogan.setForeground(Color.black);
        Info.putClientProperty ("FlatLaf.styleClass", "h2");
        Info.setForeground(Color.white);
        date.putClientProperty ("FlatLaf.styleClass", "h1");
        date.setForeground(Color.white);
        Title.putClientProperty ("FlatLaf.styleClass", "h1");
        Title.setForeground(Color.white);
        Main.putClientProperty("FlatLaf.styleClass", "h2");
        Main.setForeground(Color.white);
        List.putClientProperty("FlatLaf.styleClass", "h2");
        List.setForeground(Color.white);
        ListH.putClientProperty("FlatLaf.styleClass", "h2");
        ListH.setForeground(Color.white);
    }           
    
    
    
    private void initcontent(){
       ShowJPanel (new MainC());     
    }
    
    public static void ShowJPanel(JPanel pl){
        Content.removeAll();
       Content.setLayout(new BorderLayout()); // Esto es clave si no está ya
       Content.add(pl, BorderLayout.CENTER);
       Content.revalidate();
       Content.repaint(); 
    }
//Poner la Fecha actual
    private void setDate (){
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale ("es", "Es");
        date.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ImageLog = new javax.swing.JLabel();
        List = new javax.swing.JButton();
        Main = new javax.swing.JButton();
        ListH = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        Info = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        Slogan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 770));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setPreferredSize(new java.awt.Dimension(1040, 640));

        Menu.setBackground(new java.awt.Color(0, 128, 0));

        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Agrovacas");

        ImageLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaca (2).png"))); // NOI18N
        ImageLog.setText("jLabel2");

        List.setBackground(new java.awt.Color(0, 163, 0));
        List.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaca (1).png"))); // NOI18N
        List.setText("Ganado");
        List.setBorder(null);
        List.setBorderPainted(false);
        List.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        List.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListActionPerformed(evt);
            }
        });

        Main.setBackground(new java.awt.Color(0, 163, 0));
        Main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casa.png"))); // NOI18N
        Main.setText("Principal");
        Main.setBorder(null);
        Main.setBorderPainted(false);
        Main.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Main.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Main.setIconTextGap(10);
        Main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainActionPerformed(evt);
            }
        });

        ListH.setBackground(new java.awt.Color(0, 163, 0));
        ListH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cruz-medica.png"))); // NOI18N
        ListH.setText("Salud");
        ListH.setBorder(null);
        ListH.setBorderPainted(false);
        ListH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListH.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ListH.setIconTextGap(10);
        ListH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImageLog, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(List, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ImageLog, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(List, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Header.setBackground(new java.awt.Color(0, 172, 72));

        Info.setText("Administracion/ Ganado");

        date.setText("Hoy es {dayname} {day} de {month} del {year}");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        Slogan.setText("Siempre Agronomos!");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Slogan, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Slogan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 1126, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainActionPerformed
        ShowJPanel(new MainC());
    }//GEN-LAST:event_MainActionPerformed

    private void ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListActionPerformed
        ShowJPanel(new Ganados());
    }//GEN-LAST:event_ListActionPerformed

    private void ListHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListHActionPerformed
        ShowJPanel(new Salud());
    }//GEN-LAST:event_ListHActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLightFlatIJTheme.setup();
        UIManager.put( "Button.arc", 999 );

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private static javax.swing.JPanel Content;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel ImageLog;
    private javax.swing.JLabel Info;
    private javax.swing.JButton List;
    private javax.swing.JButton ListH;
    private javax.swing.JButton Main;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Slogan;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel date;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

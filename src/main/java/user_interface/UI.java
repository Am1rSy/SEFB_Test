package user_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UI extends JPanel {
    private JButton doctor_btn;
    private  JButton admin_btn;
    private JPanel main_panel;
    private JPanel disp_panel;
    private ArrayList<patient> patients;
    public UI(ArrayList<patient> patients){
        this.patients = patients;

        doctor_btn = new JButton("Doctor");
        admin_btn = new JButton("Admin");

        this.main_panel = new JPanel();
        main_panel.setLayout(new GridLayout(3, 1));

        this.disp_panel= new JPanel();


        doctor_btn.addActionListener(new ActionListener() { // call addActionListener method from the JButton class and overwrite it
            public void actionPerformed(ActionEvent e) {
                disp_panel.add(new doctorUI(patients));
            }
        });
        admin_btn.addActionListener(new ActionListener() { // call addActionListener method from the JButton class and overwrite it
            public void actionPerformed(ActionEvent e) {
                disp_panel.add(new adminUI(patients));
            }
        });
        main_panel.add(admin_btn);
        main_panel.add(doctor_btn);
        main_panel.add(disp_panel);







    }

    public JPanel getMain_panel() {
        return main_panel;
    }
    public JPanel getDisp_panel(){
        return disp_panel;
    }
}

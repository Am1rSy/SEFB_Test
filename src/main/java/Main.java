import investigation.bpInvestigation;
import investigation.mriInvestigation;
import user_interface.UI;
import user_interface.patient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    static GraphicsConfiguration gc;	// Contains this computer’s graphics configuration
    public static void main(String[] args) {
        JFrame frame= new JFrame(gc);	// Create a new JFrame
        frame.setSize(1000,500);
        ArrayList<patient> patients = new ArrayList<>();

        // Initialise Patients info
        patient pat1 = new patient("Daphne Von Oram", "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg", 62);
        patient pat2 = new patient("Sebastian Compton", "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg", 31);

        // Add medical investigation info on user_interface.patient
        pat1.setMri(new mriInvestigation("https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2, LocalDate.of(2023,11,28)));
        pat1.setBP(new bpInvestigation(150, 70, LocalDate.of(2023, 9, 15), "ST"));

        pat2.setMri(new mriInvestigation("https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4, LocalDate.of(2023, 11, 19)));
        pat2.setBP(new bpInvestigation(150,80, LocalDate.of(2023, 11, 20), "VST"));

        // Add patients into list
        patients.add(pat1);
        patients.add(pat2);



        UI ui = new UI(patients);
        frame.getContentPane().add(ui.getMain_panel());
        frame.setVisible(true);

//        frame.setJMenuBar(buttonPanel.getMainMenu());
        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }


}
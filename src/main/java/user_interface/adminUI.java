package user_interface;

import investigation.bpInvestigation;
import investigation.mriInvestigation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class adminUI extends JPanel{
    private ArrayList<patient> patients;


    public adminUI(ArrayList<patient> patients){
        this.patients = patients;
        setLayout(new GridLayout(2, 1));

        for(patient p:patients) {
            mriInvestigation mri_info = p.getMri().get(0);
            bpInvestigation bp_info = p.getBp().get(0);
            JLabel patient_info = new JLabel();
            patient_info.setText("<html>Patient: " + p.getName() + "; MRI: "+mri_info.getTesla()+" Tesla, Date: " + mri_info.getld() + "; BP: " + bp_info.getMeasurement_term() + ", "+ bp_info.getld()+"</html>");
            add(patient_info);

        }




    }


}

package user_interface;

import investigation.bpInvestigation;
import investigation.mriInvestigation;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;


// Create the view for doctor
public class doctorUI extends JPanel{
    private ArrayList<patient> patients;
//    private JLabel label;
//    private URL imageURL;
//    private mriInvestigation mri_info;
//    private bpInvestigation bp_info;

    public doctorUI(ArrayList<patient> patients){
        this.patients = patients;
        setLayout(new GridLayout(2, 5));


        for(patient p:patients) {
            JLabel image = new JLabel();
            URL imageURL = null;
            mriInvestigation mri_info = p.getMri().get(0);
            bpInvestigation bp_info = p.getBp().get(0);
            try {
                imageURL = new URL(p.getUrl());
            } catch (MalformedURLException e) {
                System.out.println(e.getMessage());
            }
            assert imageURL != null;
            ImageIcon thisImageIcon = new ImageIcon(imageURL);
            image.setIcon(thisImageIcon);
            add(image);

            JLabel info = new JLabel();
            info.setText("<html>Name:  " + p.getName() + "<br> Age: "+p.getAge()+"</html>");
            add(info);

            JLabel mri_image = new JLabel();
            URL mri_imageURL = null;
            try {
                mri_imageURL = new URL(mri_info.getMri_url());
            } catch (MalformedURLException e) {
                System.out.println(e.getMessage());
            }
            assert mri_imageURL != null;
            ImageIcon mriImageIcon = new ImageIcon(mri_imageURL);
            mri_image.setIcon(mriImageIcon);
            add(mri_image);

            JLabel bp_disp = new JLabel();
            bp_disp.setText("<html>Blood Pressure:<br> "+ bp_info.getSystolic() + " over "+ bp_info.getDiastolic()+"</html>");
            add(bp_disp);
        }




    }


}

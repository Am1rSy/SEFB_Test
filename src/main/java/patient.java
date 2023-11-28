import investigation.*;

import java.util.ArrayList;

public class patient {
    private String name;
    private String url;
    private int age;
    private ArrayList<mriInvestigation> mri;
    private ArrayList<bpInvestigation> bp;

    // Initialise patient class
    public patient(String name, String url, int age) {
        this.name = name;
        this.url = url;
        this.age = age;
    }

    // Set all the medical info
    public void setMri(mriInvestigation mri_info) {
        mri.add(mri_info);
    }

    public void setBP(bpInvestigation bp_info){
        bp.add(bp_info);
    }

    public String getUrl() {
        return url;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<mriInvestigation> getMri() {
        return mri;
    }

    public ArrayList<bpInvestigation> getBp() {
        return bp;
    }

    public String getName() {
        return name;
    }
}

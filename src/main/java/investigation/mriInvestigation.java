package investigation;

import java.time.LocalDate;

public class mriInvestigation extends medicalInvestigation{
    private String mri_url;
    private int tesla;

    public mriInvestigation(String mri_url, int tesla, LocalDate ld) {
        super(ld);
        this.mri_url = mri_url;
        this.tesla = tesla;
    }

    public String getMri_url() {
        return mri_url;
    }

    public int getTesla() {
        return tesla;
    }

    @Override
    public String getld() {
        return ld.toString();
    }
}

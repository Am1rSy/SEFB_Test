package investigation;

import java.time.LocalDate;

public class bpInvestigation extends medicalInvestigation{
    private int systolic;
    private int diastolic;
    private String measurement_term;

    public bpInvestigation( int systolic, int diastolic,LocalDate ld, String measurement_term) {
        super(ld);
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.measurement_term = measurement_term;
    }

    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public String getMeasurement_term() {
        return measurement_term;
    }
    public String getld(){
        return ld.toString();
    }
}

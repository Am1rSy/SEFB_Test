package investigation;

import java.time.LocalDate;

public abstract class medicalInvestigation {
    protected LocalDate ld;

    public medicalInvestigation(LocalDate ld){
        this.ld = ld;
    }
    public abstract LocalDate  getld();
}

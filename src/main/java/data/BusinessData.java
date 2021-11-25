package data;

import java.util.Arrays;
import java.util.List;

public class BusinessData {

    public static List<String> getExceptedAppNames(){

        return Arrays.asList("Find Patient Record", "Active Visits", "Awaiting Admission","Register a patient"
        ,"Capture Vitals", "Appointment Scheduling","Register a patient","Reports","Data Management","Configure Metadata"
        ,"System Administration");
    }
}

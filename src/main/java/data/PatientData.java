package data;

import org.testng.annotations.DataProvider;

public class PatientData {

    @DataProvider(name="patientInfo")
    public Object[][] getPatientInfo(){
        return new Object[][]{
                {"David","Hunt","Male","15","June","1997","2200 E Devon","2254443322","Doctor","Kushal"},
                {"Sorin","Kind","Male","20","June","1990","3300 E Devon","2244567743","Supervisor","Priyanka"},
                {"Sameer","Jain","Male","19","June","1995","225 Wacker Driver","4444443322","Parent","Gopal"},
                {"Marcus","Mind","Male","18","July","1987","1123 E Though","2254441111","Sibling","Patel"},
                {"Jennifer","Test","Female","15","June","1993","88 E randolf","2258883322","Doctor","Kushal"}
        };
    }
}

package ru.job4j.profession;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfessionTest {
    @Test
    public void whenSetProfDoctor(){
        Doctor doctor = new Doctor();
        doctor.name = "Doc";
        doctor.professional = "Dantist";
        Patient patient = new Patient();
        patient.name = "Sir";
        String expectName = "Doc";
        String expectProfessional = "Dantist";
        assertThat(doctor.name, is(expectName));
        assertThat(doctor.professional, is(expectProfessional));
    }

}

package gitChallenge31.GitChallenge31;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalcul {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1996, 8, 18);
        int years = Period.between(birthDate, today).getYears();

        System.out.println(today);
        System.out.println(birthDate);
        System.out.println(years);
    }
}

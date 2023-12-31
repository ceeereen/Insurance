package service;

import java.math.BigDecimal;
import java.util.Date;

import model.Accident;

public class AccidentService {

    /* private Date accidentDate;
    private String description;
    private BigDecimal damagePrice;
    private int failureRate; */

    public Accident creAccident(Date accidentDate, String description, BigDecimal damagePrice, int failureRate){
        Accident accident = new Accident();

        accident.setAccidentDate(accidentDate);
        accident.setDescription(description);
        accident.setDamagePrice(damagePrice);
        accident.setFailureRate(failureRate);

        return accident;
    }
    
}

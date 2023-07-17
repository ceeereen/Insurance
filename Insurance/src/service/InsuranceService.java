package service;

import model.Insurance;

public class InsuranceService {

    /*private InsuranceTypeEnum insuranceTypeEnum;
    private String name; */

    public Insurance createInsurance(InsuranceTypeEnum insuranceTypeEnum,String name ){
        Insurance insurance = new Insurance();

        insurance.setInsuranceTypeEnum(insuranceTypeEnum);
        insurance.setName(name);
       
        return insurance
    }
    
}

package service;

import java.math.BigDecimal;
import java.util.ArrayList;

import model.BankAccount;
import model.Customer;
import model.Insurance;
import model.InsuranceCompany;
import model.PaymentMovement;

public class InsuranceCompanyService {


    public InsuranceCompany createInsuranceCompany(String name,String taxOffice,String taxNumber, String address,BigDecimal commission){

        InsuranceCompany insuranceCompany = new InsuranceCompany();

        insuranceCompany.setName(name);
        insuranceCompany.setTaxOffice(taxOffice);
        insuranceCompany.setTaxNumber(taxNumber);
        insuranceCompany.setAddress(address);
        insuranceCompany.setCommission(commission);

        return insuranceCompany;
    }

     public void addBankAccountToInsuranceCompany(InsuranceCompany insuranceCompany, BankAccount bankAccount){
        if(insuranceCompany.getBankAccountList()!=null) {
            insuranceCompany.getBankAccountList().add(bankAccount);
        }else {
            ArrayList<BankAccount> bankAccountList = new ArrayList<>();
            bankAccountList.add(bankAccount);
            insuranceCompany.setBankAccountList(bankAccountList);
        }
    }

    public void addInsuranceToInsuranceCompany(InsuranceCompany insuranceCompany, Insurance insurance){
        if(insuranceCompany.getInsuranceList()!=null) {
            insuranceCompany.getInsuranceList().add(insurance);
        }else {
            ArrayList<Insurance> insuranceList = new ArrayList<>();
            insuranceList.add(insurance);
            insuranceCompany.setInsuranceList(insuranceList);
        }
    }

    public void addPaymentMovementToInsuranceCompany(InsuranceCompany insuranceCompany, PaymentMovement paymentMovement){
        if(insuranceCompany.getPaymentMovementList()!=null) {
            insuranceCompany.getPaymentMovementList().add(paymentMovement);
        }else {
            ArrayList<PaymentMovement> paymentMovementList = new ArrayList<>();
            paymentMovementList.add(paymentMovement);
            insuranceCompany.setPaymentMovementList(paymentMovementList);
        }
    }
    
    
}

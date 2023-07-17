package service;

import model.Agency;
import model.BankAccount;
import model.Customer;
import model.CustomerTypeEnum;
import model.InsuranceRequest;
import model.PaymentMovement;
import model.Policy;
import model.Vehicle;

import java.util.ArrayList;

/*private String name;
    private ArrayList<PaymentMovement> paymentMovementList;
    private ArrayList<Vehicle> vehicleList; */

public class CustomerService {
    public Customer createCustomer(String name, CustomerTypeEnum customerTypeEnum){
        Customer customer = new  Customer();
        customer.setName(name);
        customer.setCustomerTypeEnum(customerTypeEnum);

        return customer;
    }

    public void addBankAccountToCustomer(Customer customer, BankAccount bankAccount){
        if(customer.getBankAccountList()!=null) {
            customer.getBankAccountList().add(bankAccount);
        }else {
            ArrayList<BankAccount> bankAccountList = new ArrayList<>();
            bankAccountList.add(bankAccount);
            customer.setBankAccountList(bankAccountList);
        }
    }

    public void addInsuranceRequestToCustomer(Customer customer, InsuranceRequest insuranceRequest){
        if(customer.getInsuranceRequestList()!=null) {
            customer.getInsuranceRequestList().add(insuranceRequest);
        }else {
            ArrayList<InsuranceRequest> insuranceRequestList = new ArrayList<>();
            insuranceRequestList.add(insuranceRequest);
            customer.setInsuranceRequestList(insuranceRequestList);
        }
    }

    public void addPolicyToCustomer(Customer customer, Policy policy){
        if(customer.getPolicyList()!=null) {
            customer.getPolicyList().add(policy);
        }else {
            ArrayList<Policy> policyList  = new ArrayList<>();
            policyList.add(policy);
            customer.setPolicyList(policyList);
        }
    }

    public void addVehicleToCustomer(Customer customer, Vehicle vehicle){
        if(customer.getVehicleList()!=null) {
            customer.getVehicleList().add(vehicle);
        }else {
            ArrayList<Vehicle> vehicleList = new ArrayList<>();
            vehicleList.add(vehicle);
            customer.setVehicleList(vehicleList);
        }
    }

     public void addPaymentMovementtoAgency(Customer customer, PaymentMovement paymentMovement){
        if(customer.getPaymentMovementList()!=null){
            customer.getPaymentMovementList();
        }else{
            ArrayList<PaymentMovement> paymentMovementList = new ArrayList<>();
            paymentMovementList.add(paymentMovement);
            customer.setPaymentMovementList(paymentMovementList);
        }
    }


}

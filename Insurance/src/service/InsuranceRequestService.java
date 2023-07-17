package service;

import java.util.ArrayList;

import model.BankAccount;
import model.InsuranceCompany;
import model.InsuranceRequest;
import model.Policy;
import model.Proposal;
import model.Vehicle;

public class InsuranceRequestService {
    /*private ArrayList<Proposal> proposalList;
    private Vehicle vehicle;
    private Policy policy; */

    public InsuranceRequest InsuranceRequestService(Vehicle vehicle, Policy policy){
        InsuranceRequest insuranceRequest = new InsuranceRequest();
        insuranceRequest.setVehicle(vehicle);
        insuranceRequest.setPolicy(policy);
        return insuranceRequest;
    }

    public void addProposalToInsuranceRequest(InsuranceRequest insuranceRequest, Proposal proposal){
        if(insuranceRequest.getProposalList()!=null) {
            insuranceRequest.getProposalList().add(proposal);
        }else {
            ArrayList<Proposal> proposalList = new ArrayList<>();
            proposalList.add(proposal);
            insuranceRequest.setProposalList(proposalList);
        }
    }

}

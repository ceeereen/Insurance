package service;

import java.math.BigDecimal;
import java.sql.Date;

import model.InsuranceCompany;
import model.Proposal;
import model.Vehicle;

public class ProposalService {

    /*   private InsuranceCompany company;
    private Vehicle vehicle;
    private BigDecimal offerPrice;
    private Date startDate;
    private Date endDate;
    private Date expireDate;
    private boolean isApproved;
    private BigDecimal discountPrice; */

    public Proposal createProposal(InsuranceCompany company, Vehicle vehicle, BigDecimal offerPrice, Date startDate, Date endDate, Date expireDate,
                                    boolean isApproved, BigDecimal discountPrice){


        Proposal proposal = new Proposal();

        proposal.setCompany(company);
        proposal.setVehicle(vehicle);
        proposal.setOfferPrice(offerPrice);
        proposal.setStartDate(startDate);
        proposal.setEndDate(endDate);
        proposal.setExpireDate(expireDate);
        proposal.setApproved(isApproved);
        proposal.setDiscountPrice(discountPrice);

        return proposal;
    }
    
}

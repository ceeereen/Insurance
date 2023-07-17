package service;

import java.util.ArrayList;

import model.Accident;
import model.ColorTypeEnum;
import model.InsuranceRequest;
import model.Proposal;
import model.Vehicle;

public class VehicleService {
    /*  private String brand;
    private String model;
    private String plate;
    private String chassisNumber;
    private int modelYear;
    private ArrayList<Accident> accidentList;
    private ColorTypeEnum color; */

    public Vehicle creatVehicle(String brand, String model, String plate, String chassisNumber, int modelYear,  ColorTypeEnum color){
        Vehicle vehicle = new Vehicle();

        vehicle.setBrand(brand);
        vehicle.setModel(model);
        vehicle.setPlate(plate);
        vehicle.setChassisNumber(chassisNumber);
        vehicle.setModelYear(modelYear);
        vehicle.setColor(color);

        return vehicle;
    }

    public void addAccidentToVehicle(Vehicle vehicle, Accident accident){
        if(vehicle.getAccidentList()!=null) {
            vehicle.getAccidentList().add(accident);
        }else {
            ArrayList<Accident> accidentList = new ArrayList<>();
            accidentList.add(accident);
            vehicle.setAccidentList(accidentList);
        }
    }

    
}

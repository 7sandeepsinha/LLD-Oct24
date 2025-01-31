package projects.ParkingLot.model;

import projects.ParkingLot.model.constant.ParkingGateType;

public class ParkingGate {
    private int id;
    private String gateNumber;
    private ParkingGateType gateType;
    private Operator operator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public ParkingGateType getGateType() {
        return gateType;
    }

    public void setGateType(ParkingGateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}

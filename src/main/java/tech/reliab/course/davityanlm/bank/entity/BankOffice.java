package tech.reliab.course.davityanlm.bank.entity;

import tech.reliab.course.davityanlm.bank.service.impl.BankOfficeService;
import tech.reliab.course.davityanlm.bank.service.impl.operations.BankOfficeServiceOperations;

public class BankOffice implements BankOfficeServiceOperations {
    private Integer id;
    protected String name;
    protected String address;
    private Boolean activityStatus;
    private Boolean mayToLocateAtmStatus;
    private Integer atmQty;
    private Boolean mayToCreditStatus;
    private Boolean cashingOutStatus;
    private Boolean cashingInStatus;
    private Integer moneyQtyInOffice;
    private Integer rent;


    public BankOffice(Bank bank, String name, String address) {
        bank.setOfficeQty(bank.getOfficeQty() + 1);
        setId(bank.getOfficeQty());
        setName(name);
        setAddress(address);
        setActivityStatus(false);
        setMayToLocateAtmStatus(false);
        setAtmQty(0);
        setMayToCreditStatus(false);
        setCashingOutStatus(false);
        setCashingInStatus(false);
        setMoneyQtyInOffice(0);
        setRent(0);
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public Boolean getActivityStatus(){
        return this.activityStatus;
    }

    public Boolean getMayToLocateAtmStatus(){
        return this.mayToLocateAtmStatus;
    }

    public Integer getAtmQty(){
        return this.atmQty;
    }

    public Boolean getMayToCreditStatus(){
        return this.mayToCreditStatus;
    }

    public Boolean getCashingOutStatus(){
        return this.cashingOutStatus;
    }

    public Boolean getCashingInStatus(){
        return this.cashingInStatus;
    }

    public Integer getMoneyQtyInOffice(){
        return this.moneyQtyInOffice;
    }

    public Integer getRent(){
        return this.rent;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setActivityStatus(Boolean status) {
        this.activityStatus = status;
    }

    public void setMayToLocateAtmStatus(Boolean status) {
        this.mayToLocateAtmStatus = status;
    }

    public void setAtmQty(Integer atmQty){
        this.atmQty = atmQty;
    }

    public void setMayToCreditStatus(Boolean status) {
        this.mayToCreditStatus = status;
    }

    public void setCashingOutStatus(Boolean status) {
        this.cashingOutStatus = status;
    }

    public void setCashingInStatus(Boolean status) {
        this.cashingInStatus = status;
    }

    public void setMoneyQtyInOffice(Integer moneyQty) {
        this.moneyQtyInOffice = moneyQty;
    }

    public void setRent(Integer rentPrice) {
        this.rent = rentPrice;
    }
}

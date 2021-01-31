package com.wood.demo.models.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reports")
public class Report extends BaseEntity{

    private Long number;
    private Date date;
    private String department;
    private Contract contract;
    private Contragent contragent;
    private ContractType contractType;
    private WoodType woodType;
    private Sortiment sortiment;
    private VolumeType volumeType;
    private Double price;
    private Double volume;

    public Report() {
    }

    @Column(name = "number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @ManyToOne
    @JoinColumn(name = "contract_id")
    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @ManyToOne
    @JoinColumn(name = "contragent_id")
    public Contragent getContragent() {
        return contragent;
    }

    public void setContragent(Contragent contragent) {
        this.contragent = contragent;
    }

    @ManyToOne
    @JoinColumn(name = "contact_type_id")
    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    @ManyToOne
    @JoinColumn(name = "wood_type_id")
    public WoodType getWoodType() {
        return woodType;
    }

    public void setWoodType(WoodType woodType) {
        this.woodType = woodType;
    }

    @ManyToOne
    @JoinColumn(name = "sortiment_id")
    public Sortiment getSortiment() {
        return sortiment;
    }

    public void setSortiment(Sortiment sortiment) {
        this.sortiment = sortiment;
    }

    @ManyToOne
    @JoinColumn(name = "volume_type_id")
    public VolumeType getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType;
    }

    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Column(name = "volume")
    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}

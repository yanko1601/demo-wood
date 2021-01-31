package com.wood.demo.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "contracts")
public class Contract extends BaseEntity{

    private String department;
    private Contragent contragent;
    private WoodType woodtype;
    private Sortiment sortiment;
    private VolumeType volumeType;
    private ContractType contractType;
    private Double price;
    private Double volume;

    public Contract() {
    }

    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
    @JoinColumn(name = "wood_type_id")
    public WoodType getWoodtype() {
        return woodtype;
    }

    public void setWoodtype(WoodType woodtype) {
        this.woodtype = woodtype;
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
    @JoinColumn(name = "volme_type_id")
    public VolumeType getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType;
    }

    @ManyToOne
    @JoinColumn(name = "contract_type_id")
    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
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

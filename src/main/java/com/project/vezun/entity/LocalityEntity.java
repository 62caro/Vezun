package com.project.vezun.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "coord_cities_belarus")
public class LocalityEntity {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String obl;

    @Column
    private String raion;

    @Column
    private String sovet;

    @Column
    private String tip;

    @Column
    private String latitude;

    @Column
    private String longitude;

    @Column
    private String dms_lat;

    @Column
    private String dms_long;

    @Column
    private String mgrs;

    public LocalityEntity() {}

    public LocalityEntity(Long id, String name, String obl, String raion, String sovet, String tip, String latitude, String longitude, String dms_lat, String dms_long, String mgrs) {
        this.id = id;
        this.name = name;
        this.obl = obl;
        this.raion = raion;
        this.sovet = sovet;
        this.tip = tip;
        this.latitude = latitude;
        this.longitude = longitude;
        this.dms_lat = dms_lat;
        this.dms_long = dms_long;
        this.mgrs = mgrs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObl() {
        return obl;
    }

    public void setObl(String obl) {
        this.obl = obl;
    }

    public String getRaion() {
        return raion;
    }

    public void setRaion(String raion) {
        this.raion = raion;
    }

    public String getSovet() {
        return sovet;
    }

    public void setSovet(String sovet) {
        this.sovet = sovet;
    }

    public String gettip() {
        return tip;
    }

    public void settip(String tip) {
        this.tip = tip;
    }

    public String getlatitude() {
        return latitude;
    }

    public void setlatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getlongitude() {
        return longitude;
    }

    public void setlongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDms_lat() {
        return dms_lat;
    }

    public void setDms_lat(String dms_lat) {
        this.dms_lat = dms_lat;
    }

    public String getDms_long() {
        return dms_long;
    }

    public void setDms_long(String dms_long) {
        this.dms_long = dms_long;
    }

    public String getMgrs() {
        return mgrs;
    }

    public void setMgrs(String mgrs) {
        this.mgrs = mgrs;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LocalityEntity that = (LocalityEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(obl, that.obl) && Objects.equals(raion, that.raion) && Objects.equals(sovet, that.sovet) && Objects.equals(tip, that.tip) && Objects.equals(latitude, that.latitude) && Objects.equals(longitude, that.longitude) && Objects.equals(dms_lat, that.dms_lat) && Objects.equals(dms_long, that.dms_long) && Objects.equals(mgrs, that.mgrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, obl, raion, sovet, tip, latitude, longitude, dms_lat, dms_long, mgrs);
    }

    @Override
    public String toString() {
        return "LocalityEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", obl='" + obl + '\'' +
                ", raion='" + raion + '\'' +
                ", sovet='" + sovet + '\'' +
                ", tip='" + tip + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", dms_lat='" + dms_lat + '\'' +
                ", dms_long='" + dms_long + '\'' +
                ", mgrs='" + mgrs + '\'' +
                '}';
    }
}

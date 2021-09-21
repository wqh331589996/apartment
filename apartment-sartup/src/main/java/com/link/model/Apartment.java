package com.link.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "apratment")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    /**区域*/
    @Column(name = "area", length = 50)
    private String area;

    /**单元*/
    @Column(name="unit", length = 10)
    private String unit;

    /**楼号*/
    @Column(name = "building_no", length = 10)
    private String buildingNo;

    /**楼层*/
    @Column(name = "floor", length = 10)
    private String floor;

    /**房间号*/
    @Column(name = "room_no", length = 10)
    private String roomNo;

    /**价格*/
    @Column(name = "price", length = 10)
    private  Double price;
}

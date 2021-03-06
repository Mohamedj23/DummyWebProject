/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eventhub.common.model.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Ibrahim Yousre (ib.yousre@gmail.com)
 */
@Entity
@Table(name = "hall")
@XmlRootElement
public class Hall extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "floor",length=45)
    private String floor;
    @Column(name = "building",length=45)
    private String building;
    @Basic(optional = false)
    @Column(name = "name",length=30)
    private String name;
    @Column(name = "capacity")
    private Integer capacity;
    @JoinColumn(name = "event", referencedColumnName = "uuid")
    @ManyToOne(optional = false)
    private Event event;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hall")
    private List<SessionInHall> sessionInHalls;

    public Hall() {
    }

    public Hall(UUID uuid) {
        super(uuid);
    }

    public Hall(UUID uuid, String name) {
        super(uuid);
        this.name = name;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public List<SessionInHall> getSessionInHalls() {
        return sessionInHalls;
    }

    public void setSessionInHalls(List<SessionInHall> sessionInHalls) {
        this.sessionInHalls = sessionInHalls;
    }
}

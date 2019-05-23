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
@Table(name = "organization")
@XmlRootElement
public class Organization extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name",length=45)
    private String name;
    @Column(name = "description",length=500)
    private String description;
    @Lob
    @Column(name = "logo")
    private byte[] logo;
    @OneToMany(mappedBy = "organization")
    private List<SystemUser> systemUsers;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organization")
    private List<Event> events;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organization")
    private List<Vip> vips;

    public Organization() {
    }

    public Organization(UUID uuid) {
        super(uuid);
    }

    public Organization(UUID uuid, String name) {
        super(uuid);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public List<SystemUser> getSystemUsers() {
        return systemUsers;
    }

    public void setSystemUsers(List<SystemUser> systemUsers) {
        this.systemUsers = systemUsers;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Vip> getVips() {
        return vips;
    }

    public void setVips(List<Vip> vips) {
        this.vips = vips;
    }
}

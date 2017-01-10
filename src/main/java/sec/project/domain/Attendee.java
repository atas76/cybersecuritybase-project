/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sec.project.domain;

/**
 *
 * @author andreas
 */
public class Attendee {
    
    private String name;
    private String address;
    
    public Attendee() {
        this.name = "Some Attendee";
        this.address = "Some Address";
    }
    
    public Attendee(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getAddress() {
        return this.address;
    }
}

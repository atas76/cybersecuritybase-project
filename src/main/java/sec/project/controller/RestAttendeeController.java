/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sec.project.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sec.project.domain.Attendee;
import sec.project.domain.Signup;
import sec.project.repository.SignupRepository;

/**
 *
 * @author andreas
 */
@RestController
@RequestMapping("/attendeesAPI")
public class RestAttendeeController {
    
    @Autowired
    private SignupRepository signupRepository;
    
    private List<Attendee> attendees;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Attendee> list() {
        
        List<Signup> signupDetails = signupRepository.findAll();
        
        attendees = new ArrayList<>();
        
        signupDetails.forEach((signup) -> {
            attendees.add(new Attendee(signup.getName(), signup.getAddress()));
        });
        
        // System.out.println("Attendees number: " + attendees.size());
        
        return this.attendees;
    }
}

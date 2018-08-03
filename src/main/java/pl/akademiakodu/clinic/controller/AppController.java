package pl.akademiakodu.clinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.clinic.Doctor;
import pl.akademiakodu.clinic.Patient;
import pl.akademiakodu.clinic.Visit;
import pl.akademiakodu.clinic.dao.DoctorDao;
import pl.akademiakodu.clinic.dao.PatientDao;
import pl.akademiakodu.clinic.dao.VisitDao;

@Controller
public class AppController {

    @Autowired
    private DoctorDao doctorDao;

    @Autowired
    private PatientDao patientDao;

    @Autowired
    private VisitDao visitDao;


    @GetMapping("/")
    public String add(ModelMap modelMap){
        modelMap.put("doctor", new Doctor());
        modelMap.put("patient", new Patient());
        modelMap.put("visit", new Visit());
        return "add";
    }
//
//    @GetMapping("/")
//    public String add2(ModelMap modelMap) {
//        modelMap.put("patient", new Patient());
//        return "add";
//    }
//
//    @GetMapping("/")
//    public String add3(ModelMap modelMap) {
//        modelMap.put("visit", new Visit());
//        return "add";
//    }

    @PostMapping("/add")
    public String addDoctor(@ModelAttribute Doctor doctor){
        doctorDao.save(doctor);
        return "redirect:/";
    }

    @PostMapping("/add1")
    public String addPatient(@ModelAttribute Patient patient){
        patientDao.save(patient);
        return "redirect:/";
    }

    @PostMapping("/success")
    public String addVisit (@ModelAttribute Visit visit){
        visitDao.save(visit);
        return "success";
    }

}

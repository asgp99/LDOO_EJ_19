/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
/**
 *
 * @author Sergio Gzz
 */
public class ControladorAlumno {
     @RequestMapping(value = "/Alumno", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("Alumno", "command", new Alumno());
   }
   
   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb")Alumno alumno, 
   ModelMap model) {
      model.addAttribute("name", alumno.getName());
      model.addAttribute("age", alumno.getAge());
      model.addAttribute("id", alumno.getId());
      
      return "result";
   } 
}

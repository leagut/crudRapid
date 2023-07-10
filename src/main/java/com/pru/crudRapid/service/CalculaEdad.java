package com.pru.crudRapid.service;

import com.pru.crudRapid.entity.Student;

public class CalculaEdad {

    public String calculalo(Student student){
        String respuesta ;
        if(student.getEdad()>=18){
            respuesta = "mayor";
        }else  respuesta = "menor";
        return respuesta;
    }




}

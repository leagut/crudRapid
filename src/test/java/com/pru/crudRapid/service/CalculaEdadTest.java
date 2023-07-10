package com.pru.crudRapid.service;

import com.pru.crudRapid.entity.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculaEdadTest {

    @Test
    void calculalo() {
        //configuracion de la prueba
        Student ss = new Student(1l,"leandro",32,"gutierrez","correo@corre.com");
        CalculaEdad calculator = new CalculaEdad();

        //se ejecuta comportamiento a testear
        String quees = calculator.calculalo(ss);

        //comprobaciones aserciones
        System.out.println(quees);
        System.out.println(quees);
        assertTrue(quees=="mayor");
        assertEquals(quees,"mayor");

    }
}
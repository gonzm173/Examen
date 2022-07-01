/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Examen.service;

import com.Examen.entity.Concierto;
import com.Examen.repository.ConciertoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aurelio
 */
@Service
public class ConciertoService implements IConciertoService{

    @Autowired
    private ConciertoRepository conciertoRepository;
    
    @Override
    public List<Concierto> getAllConcierto() {
        return (List<Concierto>)conciertoRepository.findAll();
    }

    @Override
    public Concierto getConciertoById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveConcierto(Concierto concierto) {
        conciertoRepository.save(concierto);
    }

    @Override
    public void delete(long id) {
        conciertoRepository.deleteById(id);
    }

    @Override
    public Optional<Concierto> listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  

    
}

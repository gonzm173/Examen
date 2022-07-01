/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Examen.service;

import com.Examen.entity.Concierto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Aurelio
 */
public interface IConciertoService {
    public List<Concierto> getAllConcierto();
    public Concierto getConciertoById (long id);
    public Optional <Concierto> listarId(int id);
    public void saveConcierto(Concierto concierto);
    public void delete (long id);
    
}

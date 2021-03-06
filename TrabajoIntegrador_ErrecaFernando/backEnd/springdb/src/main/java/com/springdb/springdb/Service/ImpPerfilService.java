package com.springdb.springdb.Service;

import com.springdb.springdb.Entity.Perfil;
import com.springdb.springdb.Interface.IPerfilService;
import com.springdb.springdb.Repository.IPerfilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPerfilService implements IPerfilService{

    @Autowired IPerfilRepository iperfilRepository;
    
    @Override
    public List<Perfil> getPerfil() {
       
        List<Perfil> perfil = iperfilRepository.findAll();
        return perfil;
       
    }

    @Override
    public void savePerfil(Perfil perfil) {
        iperfilRepository.save(perfil);
    }

    @Override
    public void deletePerfil(Long id) {
        iperfilRepository.deleteById(id);
    }

    @Override
    public Perfil findPerfil(Long id) {
       Perfil perfil = iperfilRepository.findById(id).orElse(null);
       return perfil;
       
    }

    @Override
    public List<Perfil> getPerfil(long l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

package com.springdb.springdb.Interface;

import com.springdb.springdb.Entity.Perfil;
import java.util.List;

public interface IPerfilService {
  
    public List<Perfil> getPerfil();
    
    public void savePerfil(Perfil perfil);
    
    public void deletePerfil(Long id);
    
    public Perfil findPerfil(Long id);

    public List<Perfil> getPerfil(long l);
}

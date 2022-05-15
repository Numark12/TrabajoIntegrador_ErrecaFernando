package com.springdb.springdb.Controller;

import com.springdb.springdb.Entity.Perfil;
import com.springdb.springdb.Interface.IPerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerfilController {

    @Autowired
    IPerfilService iperfilService;

    @GetMapping("perfil/traer")
    public List<Perfil> getPerfil() {
        return iperfilService.getPerfil();
    }

    @PostMapping("perfil/crear")
    public String createPerfil(@RequestBody Perfil perfil) {
        iperfilService.savePerfil(perfil);
        return "nuevo perfil creado con éxito";
    }

    @DeleteMapping("perfil/borrar/{id}")
    public String deletePerfil(@PathVariable Long id) {
        iperfilService.deletePerfil(id);
        return "perfil eliminado correctamente";
    }

    @PutMapping("perfil/editar/{id}")
    public Perfil editPerfil(@PathVariable Long id, 
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("img") String nuevoImg){
        Perfil perfil = iperfilService.findPerfil(id);
        perfil.setNombre(nuevoNombre);
        perfil.setApellido(nuevoApellido);
        perfil.setImg(nuevoImg);
        
        iperfilService.savePerfil(perfil);
        return perfil;
    }
}

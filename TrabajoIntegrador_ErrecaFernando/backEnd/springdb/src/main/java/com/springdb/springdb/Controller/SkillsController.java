
package com.springdb.springdb.Controller;

import com.springdb.springdb.Entity.Skills;
import com.springdb.springdb.Interface.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SkillsController {
    
    @Autowired
    ISkillsService iskillsService;

    @GetMapping("skills/traer")
    public List<Skills> getSkills() {
        return iskillsService.getSkills();
    }

    @PostMapping("skills/crear")
    public String createSkill(@RequestBody Skills skills) {
        iskillsService.saveSkill(skills);
        return "nuevo skill creado con éxito";
    }

    @DeleteMapping("skills/borrar/{id}")
    public String deleteSkill(@PathVariable Long id) {
        iskillsService.deleteSkill(id);
        return "skill eliminado correctamente";
    }

    @PutMapping("skills/editar/{id}")
    public Skills editSkills(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("porc") int nuevoPorc) {
        Skills skills = iskillsService.findSkill(id);
        skills.setNombre(nuevoNombre);
        skills.setPorc(nuevoPorc);

        iskillsService.saveSkill(skills);
        return skills;
    }

    @GetMapping("skills/traer/s1")
    public Skills findSkill() {
        return iskillsService.findSkill((long) 1);
    }
}
  
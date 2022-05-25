
package com.springdb.springdb.Service;

import com.springdb.springdb.Entity.Skills;
import com.springdb.springdb.Interface.ISkillsService;
import com.springdb.springdb.Repository.ISkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpSkillsService implements ISkillsService{

    @Autowired ISkillsRepository iskillsRepository;
    
    @Override
    public List<Skills> getSkills() {
       
        List<Skills> skills = iskillsRepository.findAll();
        return skills;
       
    }

    @Override
    public void saveSkill(Skills skills) {
        iskillsRepository.save(skills);
    }

    @Override
    public void deleteSkill(Long id) {
        iskillsRepository.deleteById(id);
    }

    @Override
    public Skills findSkill(Long id) {
       Skills skills = iskillsRepository.findById(id).orElse(null);
       return skills;
       
    }

    @Override
    public List<Skills> getSkills(long l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

      
}

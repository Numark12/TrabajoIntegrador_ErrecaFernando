package com.springdb.springdb.Interface;

import com.springdb.springdb.Entity.Skills;
import java.util.List;

public interface ISkillsService {

    public List<Skills> getSkills();

    public void saveSkill(Skills skills);

    public void deleteSkill(Long id);

    public Skills findSkill(Long id);

    public List<Skills> getSkills(long l);
}

import { Component, OnInit } from '@angular/core';
import { skills } from 'src/app/model/skills.model';
import { SkillsService } from 'src/app/service/skills.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {
  skills: skills = new skills("", 0)
  constructor(public skillsService: SkillsService) { }

  ngOnInit(): void {
    this.skillsService.getSkills().subscribe(data => {this.skills = data})

  }

}

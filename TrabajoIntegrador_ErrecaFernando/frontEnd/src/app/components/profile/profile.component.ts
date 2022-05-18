import { Component, OnInit } from '@angular/core';
import { perfil } from 'src/app/model/perfil.model';
import { PerfilService } from 'src/app/service/perfil.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  perfil: perfil = new perfil("", "", "")
  constructor(public perfilService: PerfilService) { }

  ngOnInit(): void {

    this.perfilService.getPerfil().subscribe(data => {this.perfil = data})
  }

}

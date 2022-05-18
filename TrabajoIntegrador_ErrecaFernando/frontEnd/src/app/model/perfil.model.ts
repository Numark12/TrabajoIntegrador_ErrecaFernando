// import * as internal from 'stream';

export class perfil {
  id?: number;
  nombre: String;
  apellido: String;
  img: String;

  constructor(nombre: String, apellido: String, img: String) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.img = img;
  }
}

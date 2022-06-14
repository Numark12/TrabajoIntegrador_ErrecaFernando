// import * as internal from 'stream';

export class skills {
  id?: number;
  nombre: String;
  porc: number;

  constructor(nombre: String, porc: number) {
    this.nombre = nombre;
    this.porc = porc;
  }
}

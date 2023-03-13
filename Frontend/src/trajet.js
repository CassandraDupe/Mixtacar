export default class trajet {
    constructor(id, circuit, utilisateur, nbPlace) {
      this.id = id;
      this._circuit = circuit;
      this._utilisateur = utilisateur;
      this._nbPlace = nbPlace;
    }
}
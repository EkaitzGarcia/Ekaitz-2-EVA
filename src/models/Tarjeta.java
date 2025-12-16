package models;

public class Tarjeta {
	private String cod, nom, dep;
	private int lvlAcces;
	
	//Getters y Setters
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getLvlAcces() {
		return lvlAcces;
	}
	public void setLvlAcces(int lvlAcces) {
		this.lvlAcces = lvlAcces;
	}
	
	public Tarjeta(String cod, String nom, String dep, int lvlAcces) {
		this.cod = cod;
		this.nom = nom;
		this.dep = dep;
		this.lvlAcces = lvlAcces;
	}
	
	@Override
	public String toString() {
		return "Tarjeta -> Código: "+ cod + ", Nombre: " + nom + ", Departamento: " + dep + ", Nivel de Acceso: " + lvlAcces;
	}
	
}

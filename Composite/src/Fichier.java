
class Fichier implements Element {
	
	
	private Long size;


	public Fichier(Long size) {
	this.size = size;

	}


	public String getType() {
	return "txt";
	}

	public Long getTaille() {
	return this.size;
	}

	



}
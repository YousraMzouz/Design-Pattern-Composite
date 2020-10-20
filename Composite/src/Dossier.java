class Dossier implements Element {
private Long size;


public Dossier(Long size) {
this.size = size;

}


public String getType() {
return "txt";
}

public Long getTaille() {
return this.size;
}


}
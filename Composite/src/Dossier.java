import java.util.ArrayList;

class Dossier implements Element {
	
	
	
ArrayList<Element> files = new ArrayList<Element>();


public Dossier(long l) {
	// TODO Auto-generated constructor stub
	super();
}

public String getType() {

return "Fichier";

}

public void addFile(Element file) {

files.add(file);

}

public Long getTaille() {

Long size = 0L;

for (Element file : files) {

size = size + file.getTaille();

}

return size;

}

}
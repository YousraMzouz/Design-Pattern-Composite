import java.awt.List;
import java.util.ArrayList;

class Fichier implements Element {
ArrayList<Element> files = new ArrayList<Element>();


public Fichier(long l) {
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
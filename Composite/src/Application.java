class Application {

	public static void main(String[] args) {
		Dossier child1 = new Dossier(100L);
		Dossier child2 = new Dossier(200L);

		Fichier root= new Fichier(100L);
		root.addFile(child1);
		root.addFile(child2);

		System.out.println(child1.getTaille());      // output : 100
		System.out.println(root.getTaille());    // output : 300
	}
}
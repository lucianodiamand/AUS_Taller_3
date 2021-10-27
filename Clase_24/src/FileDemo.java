import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f1 = new File(".", "hola.txt");
		if (!f1.exists()) {
//			f1.createNewFile();
		}
		
		System.out.println(f1.getAbsolutePath());
		
		File[] roots = File.listRoots(); // "/"
		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i]);
		}

        System.out.println(f1.canExecute() + " " + f1.canRead() + " " + f1.canWrite());
        
        f1.delete();
        
        System.out.println(f1.getName());
        
        System.out.println(f1.getParent());
        
        System.out.println(f1.getPath());
        
        File root = File.listRoots()[0];
        System.out.println(root.getTotalSpace() + " " + root.getUsableSpace() + " " + root.getFreeSpace());
        
        File f2 = new File(".");
        File[] archivos = f2.listFiles();
        for (int i = 0; i < archivos.length; i++) {
			System.out.println(archivos[i] + " " + (archivos[i].isFile() ? "archivo" : "directorio"));
		}
        
        System.out.println("-------------------------------------------");
        
        File[] archivos2 = f2.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.startsWith(".");
			}
		});
        for (int i = 0; i < archivos2.length; i++) {
			System.out.println(archivos2[i] + " " + (archivos2[i].isFile() ? "archivo" : "directorio"));
		}
        
        System.out.println(f1.toURI());
	}

}

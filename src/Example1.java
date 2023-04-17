import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {
    public static void main(String[] args) {
       // Path path =paths.get("a","b,","c.java");
       // System.out.println(path);



        Path path = Paths.get("a/b/c/../..");
        System.out.println("fileName::"+path.getFileName());
        System.out.println("fileSystem::"+path.getFileSystem());
        System.out.println("normal path::"+path.normalize());
        System.out.println("root::"+path.normalize());

    }
}

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
@SuppressWarnings (value="unchecked")
public class SerializarEstudantes {

    static String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        SerializarEstudantes.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        Path path = Paths.get("/tmp/" + nomeArquivo);
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(String.valueOf(path))))) {
            oos.writeObject(estudantes);
        } catch (Exception e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        Path path = Paths.get("/tmp/" + nomeArquivo);

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(String.valueOf(path))))) {
            return (List<Estudante>) ois.readObject();

        } catch (Exception e) {
            System.out.println("Nao foi possivel desserializar");
        }
        return null;
    }
}
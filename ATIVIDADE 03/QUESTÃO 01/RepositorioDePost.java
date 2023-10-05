public class RepositorioDePost() {
    private String filePath;

    public String RepositorioDePost(String filePath) {
        this.filePath = filePath;
    }

    public void saveToFile() {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("ID: " + id + "\n");
            writer.write("Texto: " + texto + "\n");
            writer.write("Autor: " + autor.getNome() + "\n");
            writer.write("Data: " + data + "\n");
            writer.write("Quantidade de Likes: " + quantidadeDeLikes + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
public class Post {
    private int id;
    private String texto;
    private Autor autor;
    private Date data;
    private int quantidadeDeLikes;
    private String filePath; // Caminho do arquivo - responsabilidade extra

    public Post(int id, String texto, Autor autor, Date data, String filePath) {
        this.id = id;
        this.texto = texto;
        this.autor = autor;
        this.data = new Date(data.getTime());
        this.quantidadeDeLikes = 0;
    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public Autor getAutor() {
        return autor;
    }

    public Date getData() {
        return new Date(data.getTime());
    }

    public int getQuantidadeDeLikes() {
        return quantidadeDeLikes;
    }
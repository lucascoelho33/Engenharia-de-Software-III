enum Status {
    DRAFT,
    PUBLISHED,
    DELETED
}

public class Post {
    private int id;
    private String text;
    private String status;
}

Post(int id, String text, String status) {
    this.id = id;
    this.text = text;
    this.status = status;
}

Status getStatus() {
    return this.status
}

public function valida() {
    if (this.getStatus() == Status.DRAFT){
        throw new RuntimeException("A post must have at least one character")
    } else {
        throw new RuntimeException("Only drafts can be posted")
    }
}

public void publish() {
    this.valida();

    System.out.println("Successfully published text")
}

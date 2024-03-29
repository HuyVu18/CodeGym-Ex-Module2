package shoppe.entity;

public class Category {
    private String id;
    private String name;
    private String img;

    public Category() {

    }

    public Category(String id, String name, String img) {
        this.id = id;
        this.name = name;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Category {" +
                "id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", img = '" + img + '\'' +
                '}';
    }
}

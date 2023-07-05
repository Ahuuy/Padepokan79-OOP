package BAB5;

public class Categories {
    // menggunakan access modiefer private pada field atau atribute
    private int id;
    private String name;
    private boolean expensive;

    public Categories(int id, String name, boolean expensive) {
        super();
        this.id = id;
        this.name = name;
        this.expensive = expensive;
    }

    public Categories() {
        super();
    }

    // contoh getter dan setter tipe data boolean

    //getter
    public boolean isExpensive() {
        return this.expensive;
    }
    //setter
    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }

    // untuk tipe data object
    // getter
    public String getName() {
        return this.name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    // untuk tipe data primitif (int)
    // Getter
    public int getId() {
        return this.id;
    }    
    
    // Setter 
    public void setId(int id) {
        this.id = id;
    }


}

package j36_Map.j36_MapTasks;

public class Kartvizit {


    String name;
    String email;
    String adress;
    Integer telefon;
    int id =100;

    public Kartvizit(String name, String email, String adress, Integer telefon, int id) {
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.telefon = telefon;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Kartvizit{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                ", telefon=" + telefon +
                ", id=" + id +
                '}';
    }
}

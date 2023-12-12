package esteban.g.doodleapp;

public class EntidadGCKE {
    private String  name;
    private String  passwors;


    public EntidadGCKE(String name, String passwors) {
        this.name = name;
        this.passwors = passwors;
    }

    public EntidadGCKE() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswors() {
        return passwors;
    }

    public void setPasswors(String passwors) {
        this.passwors = passwors;
    }
}

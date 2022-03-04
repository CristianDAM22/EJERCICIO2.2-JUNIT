package Colegio;

public class Colegio {

    private String nombre;
    private float asignatura1;
    private float asignatura2;
    private float asignatura3;

    public Colegio(float asignatura1, float asignatura2, float asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public float calculoMedia() {

        float notaTotal = asignatura1 + asignatura2 + asignatura3;
        float media = notaTotal / 3;
        return media;
    }

    public boolean derechoBeca() {
        boolean matricula = false;
        if (calculoMedia() > 5) {
            if ((asignatura1 >= 5 && asignatura2 >= 5 && asignatura3 >= 5)) {
                matricula = true;
            }
        }
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public float getAsignatura1() {
        return asignatura1;
    }

    public float getAsignatura2() {
        return asignatura2;
    }

    public float getAsignatura3() {
        return asignatura3;
    }

}

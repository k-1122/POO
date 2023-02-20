public class Matricula {
    public double nota;
    Alumne alumno;
    Modulo modul;

    public Matricula(double nota, Alumne alumno, Modulo modul) {
        this.nota = nota;
        this.alumno = new Alumne();
        this.modul = new Modulo();
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumne getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumne alumno) {
        this.alumno = alumno;
    }

    public Modulo getModul() {
        return modul;
    }

    public void setModul(Modulo modul) {
        this.modul = modul;
    }
}

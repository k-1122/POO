import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    ArrayList<Modulo> moduls = new ArrayList<Modulo>();
    ArrayList<Alumne> alumne = new ArrayList<Alumne>();

    public Test(ArrayList<Modulo> moduls, ArrayList<Alumne> alumne) {
        this.moduls = moduls;
        this.alumne = alumne;
    }

    public ArrayList<Modulo> getModuls() {
        return moduls;
    }

    public void setModuls(ArrayList<Modulo> moduls) {
        this.moduls = moduls;
    }

    public ArrayList<Alumne> getAlumne() {
        return alumne;
    }

    public void setAlumne(ArrayList<Alumne> alumne) {
        this.alumne = alumne;
    }

    public void guardaModulosAlumno(Alumne a, ArrayList<Modulo> moduls){
        alumne.add(a);
        moduls.addAll(moduls);
    }
    public void imprimeAlumnos(ArrayList<Alumne> alumne){
        for (Alumne a:alumne) {
            System.out.print(a +" / ");
        }
    }

    public static void main(String[] args) {
//se crea un arraylist de alumnos donde se guardaran los alumnos, debo pensar como relacionarlos
//podria ser por el indice
        Test t = new Test(new ArrayList<Modulo>(), new ArrayList<Alumne>());
        Test t1 = new Test(new ArrayList<Modulo>(),  new ArrayList<Alumne>());
        ArrayList<Alumne> alumnes = new ArrayList<Alumne>();
        ArrayList<Modulo> moduls1 = new ArrayList<Modulo>();

        Alumne alumno1 = new Alumne("karol","marin", 24, "y2399023z");
        Modulo modul1= new Modulo();
        modul1.setNom("m3");
        Matricula matricula1 = new Matricula(9.89, alumno1, modul1);
        t.setAlumne(alumnes);
        alumnes.add(alumno1);
        t.setModuls(moduls1);
        moduls1.add(new Modulo("M3"));
        moduls1.add(new Modulo("M2"));
        moduls1.add(new Modulo("M4"));
        //System.out.println(t.getModuls());

        Alumne alumno2 = new Alumne("rain", "briso", 23, "u394303e");
        Modulo modul2= new Modulo();
        alumnes.add(alumno2);
        t1.setAlumne(alumnes);
        modul1.setNom("m2");
        Matricula matricula2 = new Matricula(9.87, alumno2, modul2);

        ArrayList<Modulo> moduls2 = new ArrayList<Modulo>();

        t1.setModuls(moduls2);
        moduls2.add(new Modulo("M3"));
        moduls2.add(new Modulo("M2"));
        moduls2.add(new Modulo("M4"));
        t1.guardaModulosAlumno(alumno2,moduls2);
        //System.out.println(t1.getModuls());
        t1.imprimeAlumnos(alumnes);
        System.out.println(alumnes.size());
    }




}

package model;

import java.util.List;


public class Patienten implements HasID {

    private Integer id;
    private String name;
    private int age;
    private String diagnose;
    List<Medikamente> orederdMedikamente;

    /**
     *
     * @param id
     * @param name
     * @param age
     * @param diagnose
     */
    public Patienten(Integer id, String name, int age, String diagnose, List<Medikamente> orederdMedikamente) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.diagnose=diagnose;
        this.orederdMedikamente = orederdMedikamente;

    }

    @Override
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnose(){return diagnose;}

    public void setDiagnose(String diagnose){this.diagnose=diagnose;}

    public List<Medikamente> getOrederdMedikamente() {
        return orederdMedikamente;
    }

    public void setOrederdMedikamente(List<Medikamente> orederdProducts) {
        this.orederdMedikamente = orederdMedikamente;
    }

//    @Override
//    public String toString() {
//        return "Kunde "+ id + " " + name + " " + ort + " " + orederdProducts;
//    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echostops;

/**
 *
 * @author cgcv
 */
public class Member extends Person {

    private String MemberID; // Se implementará un aleatorio alfanumerico para setear un ID unica a cada uno de los miembros
    private int[] actual_units; //esto es lo que el miembro irá a depositar.
    private int[] history_units; //este es el record del miembro, se guardan todos los depositos que ha hecho desde el principio

    public Member(String name, String last_name, int ID, String phone, int age, boolean gender) {
        super(name, last_name, ID, phone, age, gender);
    }

    public Member(String MemberID, String name, String last_name, int ID, String phone, int age, boolean gender) {
        super(name, last_name, ID, phone, age, gender);
        this.MemberID = MemberID;
        actual_units = new int[4];
        history_units = new int[4];
    }

    public String getMemberID() {
        return MemberID;
    }

    public void setMemberID(String MemberID) {
        this.MemberID = MemberID;
    }

    public int[] getActual_units() {
        return actual_units;
    }

    public void setActual_units(int[] actual_units) {
        this.actual_units = actual_units;
    }

    public int[] getHistory_units() {
        return history_units;
    }

    public void setHistory_units(int[] history_units) {
        this.history_units = history_units;
    }

    @Override
    public String toString() { // Representacion del toString para ver ordenadamente a los miembros en las listas
        return super.getName() + " " + super.getLast_name() + " " + MemberID;
    }

}

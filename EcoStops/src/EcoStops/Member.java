/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcoStops;

/**
 *
 * @author cgcv
 */
public class Member extends Person {

    private String MemberID;
    private int[] actual_units;
    private int[] history_units;

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
    public String toString() {
        return super.getName() + " " + super.getLast_name() + " " + MemberID;
    }

}

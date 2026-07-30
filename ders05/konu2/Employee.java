package ders05.konu2;
/*
* Bu sinifin constructor'i yazilacak
* */
public class Employee extends Person {
    double salary;

    @Override
    public String toString(){
        return String.format("tc:%s name:%s salary:%s",
                this.tc, this.firstName, this.salary);
    }
}

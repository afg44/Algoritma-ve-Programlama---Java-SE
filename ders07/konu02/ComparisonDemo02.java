package ders07.konu02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparisonDemo02 {
    public static void main(String[] args){
//        Comparator<Student> com=(i, j) -> i.age > j.age?1:-1;
        Comparator<Student> com=(Student i, Student j) -> {
            return i.age > j.age?1:-1;
        };

        List<Student> studs= new ArrayList<Student>();
        studs.add(new Student(21,"Hakan", 3.0));
        studs.add(new Student(12,"Cemile", 2.0));
        studs.add(new Student(18,"Lale", 3.5));
        studs.add(new Student(20,"Kerim", 2.75));

        System.out.println("** Once **");
        for(Student s:studs)
            System.out.println(s);

        System.out.println("** Sonra **");
        Collections.sort(studs, com);
        for(Student s: studs)
            System.out.println(s);

        System.out.println("** Yeniden siralayalim **");
        // compareTo Kullanilarak yapilan siralama
        Collections.sort(studs);
        for(Student s: studs)
            System.out.println(s);
    }
}

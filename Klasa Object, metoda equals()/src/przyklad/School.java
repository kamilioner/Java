package przyklad;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski");
        Student student2 = new Student("Jan", "Kowalski");
        System.out.println("student1 == student2:");
        System.out.println(student1 == student2);
        System.out.println("student1.equals(student2):");
        System.out.println(student1.equals(student2));
        
        Uczen uczen1 = new Uczen("Jan", "Kowalski");
        Uczen uczen2 = new Uczen("Jan", "Kowalski");
        System.out.println("uczen1 == uczen2:");
        System.out.println(uczen1 == uczen2);
        System.out.println("uczen1.equals(uczen2):");
        System.out.println(uczen1.equals(uczen2));
        
        
        Student[] students = new Student[3];
        students[0] = new Student("Jan", "Kowalski");
        students[1] = new Student("Maria", "Zawi³a");
        students[2] = new Student("Koral", "Gol");
         
        for(int i=0; i<students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
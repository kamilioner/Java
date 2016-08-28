package przyklad;

public class Uczen {
    String firstName;
    String lastName;
 
    public Uczen(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }
 
    @Override
    public boolean equals(Object obj) {
        // sprawdzenie równoœci fizycznej za pomoc¹ ==
        if (this == obj)
            return true;
        // sprawdzamy, czy nie null
        if (obj == null)
            return false;
 
        // sprawdzamy, czy przekazany argument jest typu Student
        if (!(obj instanceof Uczen))
            return false;
        //rzutowanie na odpowiedni typ
        Uczen s = (Uczen) obj;
         
        // sprawdzenie kolejnych pól klasy, uwa¿aj¹c na wartoœci null
        if(this.firstName == s.firstName && this.lastName == s.lastName)
            return true;
        if(this.firstName != null)
            if(!this.firstName.equals(s.firstName))
                return false;
        if (this.lastName != null)
            if(!this.lastName.equals(s.lastName))
                return false;
        //jeœli dojdziemy do tego miejsca to obiekty s¹ równe
        return true;
    }
    

}
package exemplaryConcerns;

public class Person implements Comparable<Person> {
    
    private String name;
    private String surname;
    private int age;
    
    public String getName() { return name; }
    
    public void setName(String name) { this.name = name; }
    
    public String getSurname() { return surname; }
    
    public void setSurname(String surname) { this.surname = surname; }
    
    public int getAge() { return age; }
    
    public void setAge(int age) { this.age = age; }
    
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        
        Person person = (Person) o;
        
        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return surname != null ? surname.equals(person.surname) : person.surname == null;
    }
    
    @Override
    public int hashCode(){
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
    
    @Override
    public int compareTo(Person o){
        return Integer.compare(getAge(), o.getAge());
    }
    
    @Override
    public String toString(){
        return "Person{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", age='" + age +
               '}';
    }
}

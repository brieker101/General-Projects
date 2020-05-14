import java.util.Scanner;
public class Person implements Comparable
{
    private String name;
    private Scanner in = new Scanner(System.in);

    public Person(String n)
    {
        name = n;
    }

    public String getName(){
        return this.name;
    }

    public void starter(){
        Person[] a = new Person[10];
        Person helper1 = new Person("0000000000");
        Person helper2 = new Person("0");
        for(int i = 0;i<10;i++){
            System.out.println("Please enter a name: ");
            a[i] = new Person(in.nextLine());
            //Sorry about this
        }
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i].getName() + " ");
        }
        //Looking for the biggest and smallest names
        for(int i = 0; i<a.length;i++){
            for(int j = 0; j<a.length;j++){
                if(helper1.compareTo(a[j])>0){
                    helper1 = a[j];

                }
            }
        }
        for(int i = 0; i<a.length;i++){
            for(int j = 0; j<a.length;j++){
                if(helper2.compareTo(a[j])<0){
                    helper2 = a[j];

                }
            }
        }
        System.out.println();
        System.out.println(helper1.getName());
        System.out.println(helper2.getName());
    }

    public int compareTo(Object obj){
        if(this.getName().length()>((Person)obj).getName().length()){return 1;}
        else if(this.getName().length()<((Person)obj).getName().length()){return -1;}
        return 0;
    }
}

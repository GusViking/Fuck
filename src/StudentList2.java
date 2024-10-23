import java.io.*;
import java.util.ArrayList;

public class StudentList2 {
    public static void main(String[] arg) throws IOException
    {
        FileReader fil = new FileReader("src//StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<Student> list=new ArrayList<>();

        String linje = ind.readLine();
        while (linje != null)
        {
            String[] bidder = linje.split(",");     // opdel i bidder efter ,
            Student s=new Student();
            s.name=bidder[1];
            s.surName=bidder[2];
            s.sNo=bidder[0].substring(0,8);
            list.add(s);
            linje = ind.readLine();
        }
        list.sort(null);
        for (Student e:list){
            System.out.println(e);
        }
        save(list);
    }

    static void save(ArrayList<Student> l) throws IOException {
        FileWriter fil = new FileWriter("src//StudentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (Student s:l){
            ud.println(s);
        }
        ud.close();
    }
}

class Student implements Comparable<Student> {
    String name;
    String surName;
    String sNo;

    public String toString(){
        return sNo+": "+name+" "+surName;
    }

    @Override
    public int compareTo(Student o) {
        return sNo.compareTo(o.sNo);
    }
}

import java.util.*;

class Stud_det {
    int m[] = new int[8];
    int c[] = new int[8];
    int p[] = new int[8];
    int g, sum;
    String name, usn;
    double sgpa;
    Scanner s = new Scanner(System.in);
    void getdetails() 
   {
        System.out.println("My name is archie");
        System.out.println("My usn is 1BM23CS049");
        System.out.println("Enter name:");
        name = s.next();
        System.out.println("Enter usn:");
        usn = s.next();
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter marks of subject:"+(i+1));
            m[i] = s.nextInt();
            System.out.println("Enter credits for subject:"+(i+1));
            c[i] = s.nextInt();
        }
    }

    void gradepoint() {
        for (int i = 0; i < 8; i++) {
            if (m[i] >= 90 && m[i] <= 100)
                p[i] = 10;
            else if (m[i] >= 80 && m[i] < 90)
                p[i] = 9;
            else if (m[i] >= 70 && m[i] < 80)
                p[i] = 8;
            else if (m[i] >= 60 && m[i] < 70)
                p[i] = 7;
            else if (m[i] >= 50 && m[i] < 60)
                p[i] = 6;
            else if (m[i] >= 40 && m[i] < 50)
                p[i] = 5;
            else
                p[i] = 0;
        }
    }

    void calculate() {
        for (int i = 0; i < 8; i++) {
            g += c[i] * p[i];
        }
        for (int i = 0; i < 8; i++) {
            sum += c[i];
        }
        sgpa = g / sum;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("USN:" + usn);
        System.out.println("SGPA=:" + sgpa);
    }
}

class student {
 public static void main(String a[]){
  Stud_det s1[]=new Stud_det[3];
  for(int i=0;i<3;i++)
  {
    s1[i]=new Stud_det();
  }
  for(int i=0;i<3;i++)
  {
   System.out.println("Enter details of student:"+(i+1));
   s1[i].getdetails();
  }
  for(int i=0;i<3;i++)
  {
   s1[i].gradepoint();
   s1[i].calculate();
  }
  for(int i=0;i<3;i++)
  {
   System.out.println("Student-"+(i+1));
   s1[i].display();
  }
 }
}


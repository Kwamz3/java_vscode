class Student {
    
    String name;
    int age;
    String sport;
}

public class L24_array_of_objects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Charles";
        s1.age = 18;
        s1.sport = "Fooball";

        Student s2 = new Student();
        s2.name = "Fred";
        s2.age = 25;
        s2.sport = "Volleyball";

        Student s3 = new Student();
        s3.name = "Marvin";
        s3.age = 17;
        s3.sport = "Fooball";

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        // printing in this array will look like this
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].name + " : " + student[i].age);
        }

        // int nums[] = new int[4];

        // nums[0] = 5;
        // nums[1] = 9;
        // nums[2] = 6;
        // nums[3] = 2;

        // for (int i = 0; i < nums.length; i++) {
        //     System.out.print(nums[i] + " ");
        // }
    }
}

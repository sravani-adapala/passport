public class Age {

        public int getage(int year){

        //  int birthyear=2002;
        int currentyear=2024;
        int age=currentyear-year;

        return age;

    }

        public static void main(String[] args) {
        Age age=new Age();
        System.out.println(age.getage(2002));

    }

    }


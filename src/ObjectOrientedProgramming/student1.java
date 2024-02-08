class student1 {
    int i = 20;// Instance Variable
    String j = "Alphabet";
    void run(){
        int j = 30; // Local variable
        System.out.println(i+" is running through "+j);
    }
    public static void main(String []args){
        student1 st = new student1();
        System.out.println(st.i);
        System.out.println(st.j);
        st.run();
    }
}
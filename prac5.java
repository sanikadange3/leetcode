class prac5 {
    String name;
    int age;

  
    prac5(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        prac5 s1 = new prac5("ABC", 20);
        s1.display();
    }
}
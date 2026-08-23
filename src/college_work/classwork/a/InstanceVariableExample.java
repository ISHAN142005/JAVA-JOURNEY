package college_work.classwork.a;

class InstanceVariableExample {
    public String name;

    public InstanceVariableExample() {
        this.name = "OTS Training";
    }

    public static void main(String[] args) {
        InstanceVariableExample objectname = new InstanceVariableExample();
        System.out.println("Name is: " + objectname.name);
    }
}

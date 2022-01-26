public class Test {
    public static void main(String[] args) {
        //an instance PC Object is created by using it's constructors.
        PC pc1 = new PC("Dell", "Intel", "SSD", 500);

        pc1.Display();
        pc1.setPrice(400);
        System.out.println();
        pc1.Display();

    }
}

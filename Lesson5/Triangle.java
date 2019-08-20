public class Triangle {

    public String isTriangle(int a, int b, int c) {
        if (a + b > c && b + c > a && c + a > b) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public void myMethod() {
        System.out.println("Something");
    }

}
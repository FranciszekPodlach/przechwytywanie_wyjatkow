public class main {
        public static void main(String[] args) {
            exception_generator generator = new exception_generator();

            try {
                generator.generateNullPointerException();
            } catch (NullPointerException e) {
                System.out.println("Został przechwycony wyjątek NullPointerException!");
                e.printStackTrace();
                System.out.println(e.toString());
            }
        }
    }

package OutputException2;

public class Bank {
    public static void main(String[] args) throws AgeException {
        try {
            try {
                try {
                    Client Tanya = new Client("Tanya", -56);
                    if (Tanya.age < 0) //{
                        throw new AgeException("Oops");
                    // }
                } catch (Exception e) {
                    throw new AgeException1("Неверное значение");
                }
            } catch (Exception e) {
                throw new AgeException("Возраст не может быть меньше значения:0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


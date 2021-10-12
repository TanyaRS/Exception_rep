package OutputException;

public class Banks {
    public static void main(String[] args) throws AgeException2 {


                try {
                    Account Tanya = new Account("Tanya", -56);
                    if (Tanya.ages < 0)
                       throw new AgeException2("Ошибка");
                } catch (AgeException2 e) {
                    System.out.println("Неверное значение(Возраст не может быть меньше 0)");

                }

            }

        }




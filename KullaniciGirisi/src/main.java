import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password, userName, newPasswordChecker, newPassword;

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız!");
        } else{
            System.out.println("Bilgileriniz Yanlış !");
            System.out.print("Şifreni Sıfırla Yes/No: ");
            newPasswordChecker = input.nextLine();
            while(true){
                if(newPasswordChecker.equals("yes")){
                    System.out.print("Yeni parolanızı girin: ");
                    newPassword = input.nextLine();

                    if(newPassword.equals(password) || newPassword.equals("java123")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                        break;
                    }
                }
            }


        }
    }
}

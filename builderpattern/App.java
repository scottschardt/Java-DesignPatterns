public class App{
    public static void main(String args[]){
        User websiteUser = new User.Builder("Scott", "scott159")
            .setFirstName("Bill").build();
        System.out.print(websiteUser);
        System.out.println(websiteUser.getUserName());
        System.out.println(websiteUser.getFirstname());
    }
}
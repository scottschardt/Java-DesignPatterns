public class User {
    private String username;
    private String email;
    private String firstname;

    private User(Builder builder){
        this.username = builder.username;
        this.email = builder.email;
        this.firstname = builder.firstname;
    }

    public static class Builder {
        private String username;
        private String email;
        private String firstname;
        public Builder(String username, String email){
            this.username = username;
            this.email = email;
        }

        public Builder setFirstName(String name){
            this.firstname = name;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public String getUserName(){
        return this.username;
    }
    public String getFirstname(){
        return this.firstname;
    }

}
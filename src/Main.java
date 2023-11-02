public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport("ysmayilov","Rayim","fghjkl","M","KG","04.04.1971",1235);
        passport.surname="Ysmailov";
        passport.name="Raiym";
        passport.middlenames="Ysmailovich";
        passport.getSurname="M";
        passport.Respublic="Kyrgyz Respublic";

        passport.age="04.04.1971";
        passport.Id=18777213;
        System.out.println(passport.surname+"\n"+passport.name+"\n"+passport.middlenames+"\n"+passport.getSurname+"\n"+passport.Respublic+"\n"+
                passport.age+"\n"+passport.Id+"\n");
    }

}
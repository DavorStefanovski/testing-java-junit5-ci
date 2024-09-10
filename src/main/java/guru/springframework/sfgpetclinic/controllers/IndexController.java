package guru.springframework.sfgpetclinic.controllers;

public class IndexController {

    public String index(){
        return "Index";
    }

    public String oopsHandler() {
        throw new ValueNotFoundException();
    }
}

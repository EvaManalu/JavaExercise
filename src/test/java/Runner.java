package TestSuite;
import com.intuit.karate.junit5.Karate;
class Runner {
//    @Karate.Test
//    public Karate runGet(){
//        return Karate.run("Pet/pet").relativeTo((getClass()));
//    }
//
//    @Karate.Test
//    public Karate runGetStore(){
//        return Karate.run("Pet/store").relativeTo((getClass()));
//    }

    @Karate.Test
    public Karate runGetUser(){
        return Karate.run("Pet/user").relativeTo((getClass()));
    }
}
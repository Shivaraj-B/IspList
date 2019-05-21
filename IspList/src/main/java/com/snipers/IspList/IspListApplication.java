package com.snipers.IspList;

import com.snipers.IspList.Repository.IspDetailsRepository;
import com.snipers.IspList.model.IspDAO;
import com.snipers.IspList.model.PlansDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IspListApplication implements CommandLineRunner
{

    @Autowired
    IspDetailsRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(IspListApplication.class, args);
    }


    public void deleteAll() {
        System.out.println("Deleting all records..");
        repository.deleteAll();
    }

    public void addSampleData() {
        System.out.println("Adding sample data");
        /*repository.save(new IspDAO("101", "Airtel", 650, 4, 100, 987678888, "airtel@gmail.com","Airtel, connecting people!"));
        repository.save(new IspDAO("102","ACT", 600, 3, 90, 987673338, "act@gmail.com", "We ACT upon excellence!"));
        repository.save(new IspDAO("103","Jio Fibernet", 700, 5, 120, 987676666,"jio@gmail.com","Jio Jee bhar ke!"));*/
       /* repository.save(new IspDAO( "Airtel", 650, 4, 100, 987678888, "airtel@gmail.com","Airtel, connecting people!"));
        repository.save(new IspDAO("ACT", 600, 3, 90, 987673338, "act@gmail.com", "We ACT upon excellence!"));
        repository.save(new IspDAO("Jio Fibernet", 700, 5, 120, 987676666,"jio@gmail.com","Jio Jee bhar ke!"));*/
    }

    @Override
    public void run(String... args) throws Exception {
        /*deleteAll();// Delete the ISP details
        addSampleData();// Add ISP sample data*/
        //addPlanData();// Add ISP sample data
    }

    /*private void addPlanData()
    {
        System.out.println("Adding Plans data");

       *//* repository.save(new PlansDAO("201","Basic Plan", 20, 100, 600));
        repository.save(new PlansDAO("202","Advanced Plan", 50, 200, 650));
        repository.save(new PlansDAO("203","Ultra Plan", 100, 500, 700));*//*

        repository.save(new PlansDAO("Basic Plan", 20, 100, 600));
        repository.save(new PlansDAO("Advanced Plan", 50, 200, 650));
        repository.save(new PlansDAO("Ultra Plan", 100, 500, 700));
    }
*/

    /*@Autowired
    UserRepository repository;

    @Autowired
    SnipersRepository snipRepo;


    public static void main(String[] args) {
        SpringApplication.run(IspListApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        deleteAll();
        addSampleData();
        listAll();
        addDataToSnipers();
    }

    private void addDataToSnipers()
    {
        snipRepo.save(new Snipers("Jack", "New York", "hbbies"));
    }

    public void deleteAll() {
        System.out.println("Deleting all records..");
        repository.deleteAll();
    }

    public void addSampleData() {
        System.out.println("Adding sample data");
        repository.save(new Users("Jack Bauer", "New York", 11111d));
        repository.save(new Users("Harvey Spectre", "London", 22222d));
        repository.save(new Users("Mike Ross", "New Jersey", 333333d));
        repository.save(new Users("Louise Litt", "Kathmandu", 44444d));
    }

    public void listAll() {
        System.out.println("Listing sample data");
        repository.findAll().forEach(u -> System.out.println(u.getName()));
    }
*/
}

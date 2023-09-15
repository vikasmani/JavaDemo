package org.java8.exp;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByJobTitle {

   public List<Employee> getEmplist(){

       List<Employee> empList = new ArrayList<>();
       empList.add(new Employee(01,"Name01", "JobTitle001", 10000, null));
       empList.add(new Employee(1, "Name1", "JobTitle1",10000, null));
       empList.add(new Employee(2, "Name2", "JobTitle2", 11000, null));
       empList.add(new Employee(3, "Name3", "JobTitle3", 12000, null));
       empList.add(new Employee(4, "Name4", "JobTitle4", 14000, null));

       return empList;
   }

   public Map<String, List<Employee>> groupByJobTitle(List<Employee> empList){

       Map<String, List<Employee>> collect = empList.stream()
                                                    .filter(e->e.getSalary()>10000)
                                                    .collect(Collectors.groupingBy(Employee::getName));
       return collect;
   }

   public static void main(String args []){

       GroupByJobTitle groupByJobTitle = new GroupByJobTitle();
       List<Employee> emplist = groupByJobTitle.getEmplist();

       //emplist.stream().forEach(System.out::println);
       System.out.println("=================================================================");
       System.out.println("");
       Map<String, List<Employee>> stringListMap = groupByJobTitle.groupByJobTitle(emplist);

       stringListMap.forEach((k, v)-> System.out.println("key :"+k + " , Value: "+v));
   }


}

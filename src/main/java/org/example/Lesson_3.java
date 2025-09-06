package org.example;


public class Lesson_3 {
      //1
        Random random = new Random();
        Integer age = random.nextInt(100);
        if (age < 18) {
            System.out.println("Доступ запрещен");
        } else if (age >= 18 && age <= 60) {
            System.out.println("Доступ разрешен");
        } else
            System.out.println("Вы в зоне риска");

        List<Integer> tenNumbers = new ArrayList<>() {};
        int counter=1;
        while( counter<=10){
            tenNumbers.add(counter);
            counter++;
        }
        //2
        int numbers=1;
        while (numbers<=10){
            System.out.println(numbers);
            numbers++;
        }
        //3
        int limit=10;
        while (limit>0){
            System.out.println(limit);
            limit--;
        }
        //4
        int result=0;
        int i =0;
        while(i<tenNumbers.size()){
            result+=tenNumbers.get(i);
            i++;
        }
        System.out.println(result);

    }
}
